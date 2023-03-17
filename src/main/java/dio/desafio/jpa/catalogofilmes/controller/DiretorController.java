package dio.desafio.jpa.catalogofilmes.controller;

import dio.desafio.jpa.catalogofilmes.entity.Diretor;
import dio.desafio.jpa.catalogofilmes.entity.form.DiretorForm;
import dio.desafio.jpa.catalogofilmes.service.DiretorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/diretor")
public class DiretorController {

    @Autowired
    private DiretorServiceImpl service;

    @PostMapping
    public Diretor create(@Valid @RequestBody DiretorForm form) {
        return service.create(form);
    }

    @PutMapping
    public Diretor update(@RequestParam(value = "id") Long id, @Valid @RequestBody DiretorForm form) {
        return service.update(id, form);
    }

    @GetMapping("/search")
    public Diretor findById(@RequestParam(value = "id", required = false) Long id) {
        return service.get(id);
    }

    @GetMapping
    public List<Diretor> getAll() {
       return service.getAll();
    }

    @DeleteMapping
    public void deleteById(@RequestParam(value = "id") Long id) {
        service.delete(id);
    }
}

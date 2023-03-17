package dio.desafio.jpa.catalogofilmes.controller;

import dio.desafio.jpa.catalogofilmes.entity.Filme;
import dio.desafio.jpa.catalogofilmes.entity.Produtora;
import dio.desafio.jpa.catalogofilmes.entity.form.FilmeForm;
import dio.desafio.jpa.catalogofilmes.entity.form.ProdutoraForm;
import dio.desafio.jpa.catalogofilmes.service.FilmeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
    private FilmeServiceImpl service;

    @PostMapping
    public Filme create(@Valid @RequestBody FilmeForm form) {
        return service.create(form);
    }

    @PutMapping
    public Filme update(@RequestParam(value = "id") Long id, @Valid @RequestBody FilmeForm form) {
        return service.update(id, form);
    }

    @GetMapping("/search")
    public Filme findById(@RequestParam(value = "id", required = false) Long id) {
        return service.get(id);
    }

    @GetMapping
    public List<Filme> getAll() {
        return service.getAll();
    }

    @DeleteMapping
    public void deleteById(@RequestParam(value = "id") Long id) {
        service.delete(id);
    }
}

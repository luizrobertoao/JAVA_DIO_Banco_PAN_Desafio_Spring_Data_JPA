package dio.desafio.jpa.catalogofilmes.controller;

import dio.desafio.jpa.catalogofilmes.entity.Diretor;
import dio.desafio.jpa.catalogofilmes.entity.Produtora;
import dio.desafio.jpa.catalogofilmes.entity.form.DiretorForm;
import dio.desafio.jpa.catalogofilmes.entity.form.ProdutoraForm;
import dio.desafio.jpa.catalogofilmes.service.DiretorServiceImpl;
import dio.desafio.jpa.catalogofilmes.service.ProdutoraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produtora")
public class ProdutoraController {

    @Autowired
    private ProdutoraServiceImpl service;

    @PostMapping
    public Produtora create(@Valid @RequestBody ProdutoraForm form) {
        return service.create(form);
    }

    @PutMapping
    public Produtora update(@RequestParam(value = "id") Long id, @Valid @RequestBody ProdutoraForm form) {
        return service.update(id, form);
    }

    @GetMapping("/search")
    public Produtora findById(@RequestParam(value = "id", required = false) Long id) {
        return service.get(id);
    }

    @GetMapping
    public List<Produtora> getAll() {
        return service.getAll();
    }

    @DeleteMapping
    public void deleteById(@RequestParam(value = "id") Long id) {
        service.delete(id);
    }
}

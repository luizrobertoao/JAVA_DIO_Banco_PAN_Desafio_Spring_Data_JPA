package dio.desafio.jpa.catalogofilmes.service;

import dio.desafio.jpa.catalogofilmes.entity.Filme;
import dio.desafio.jpa.catalogofilmes.entity.form.FilmeForm;

import java.util.List;

public interface IFIlmeService {

    Filme create(FilmeForm form);

    Filme get(Long id);

    List<Filme> getAll(String genero);

    Filme update(Long id, FilmeForm form);

    void delete(Long id);
}

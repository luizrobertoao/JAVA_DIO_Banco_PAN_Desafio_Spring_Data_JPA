package dio.desafio.jpa.catalogofilmes.service;

import dio.desafio.jpa.catalogofilmes.entity.Diretor;
import dio.desafio.jpa.catalogofilmes.entity.form.DiretorForm;

import java.util.List;

public interface IDiretorService {

    Diretor create(DiretorForm form);

    Diretor get(Long id);

    List<Diretor> getAll();

    Diretor update(Long id, DiretorForm form);

    void delete(Long id);
}

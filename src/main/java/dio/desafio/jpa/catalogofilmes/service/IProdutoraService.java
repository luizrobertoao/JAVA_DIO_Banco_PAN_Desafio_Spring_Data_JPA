package dio.desafio.jpa.catalogofilmes.service;

import dio.desafio.jpa.catalogofilmes.entity.Produtora;
import dio.desafio.jpa.catalogofilmes.entity.form.ProdutoraForm;

import java.util.List;

public interface IProdutoraService {

    Produtora create(ProdutoraForm form);

    Produtora get(Long id);

    List<Produtora> getAll();

    Produtora update(Long id, ProdutoraForm form);

    void delete(Long id);
}

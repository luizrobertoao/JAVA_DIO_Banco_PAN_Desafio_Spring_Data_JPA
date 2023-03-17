package dio.desafio.jpa.catalogofilmes.service;

import dio.desafio.jpa.catalogofilmes.entity.Produtora;
import dio.desafio.jpa.catalogofilmes.entity.form.ProdutoraForm;
import dio.desafio.jpa.catalogofilmes.repository.ProdutoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoraServiceImpl implements IProdutoraService{

    @Autowired
    private ProdutoraRepository repository;

    @Override
    public Produtora create(ProdutoraForm form) {

        Produtora produtora = new Produtora();
        produtora.setNome(form.getNome());

        return repository.save(produtora);
    }

    @Override
    public Produtora get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Produtora> getAll() {
        return repository.findAll();
    }

    @Override
    public Produtora update(Long id, ProdutoraForm form) {

        Produtora produtora = repository.findById(id).get();
        produtora.setNome(form.getNome());

        return repository.save(produtora);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

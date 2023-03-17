package dio.desafio.jpa.catalogofilmes.service;

import dio.desafio.jpa.catalogofilmes.entity.Diretor;
import dio.desafio.jpa.catalogofilmes.entity.form.DiretorForm;
import dio.desafio.jpa.catalogofilmes.repository.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretorServiceImpl implements IDiretorService{

    @Autowired
    private DiretorRepository repository;

    @Override
    public Diretor create(DiretorForm form) {
        Diretor diretor = new Diretor();
        diretor.setNome(form.getNome());
        diretor.setNacionalidade(form.getNacionalidade());
        repository.save(diretor);
        return diretor;
    }

    @Override
    public Diretor get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Diretor> getAll() {
        return repository.findAll();
    }

    @Override
    public Diretor update(Long id, DiretorForm form) {
        Diretor diretor = repository.findById(id).get();
        diretor.setNome(form.getNome());
        diretor.setNacionalidade(form.getNacionalidade());

        return repository.save(diretor);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

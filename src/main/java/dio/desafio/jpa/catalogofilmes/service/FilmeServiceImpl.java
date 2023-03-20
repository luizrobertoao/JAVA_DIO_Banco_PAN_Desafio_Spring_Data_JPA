package dio.desafio.jpa.catalogofilmes.service;

import dio.desafio.jpa.catalogofilmes.entity.Filme;
import dio.desafio.jpa.catalogofilmes.entity.form.FilmeForm;
import dio.desafio.jpa.catalogofilmes.repository.DiretorRepository;
import dio.desafio.jpa.catalogofilmes.repository.FilmeRepository;
import dio.desafio.jpa.catalogofilmes.repository.ProdutoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeServiceImpl implements IFIlmeService{

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private DiretorRepository diretorRepository;

    @Autowired
    private ProdutoraRepository produtoraRepository;

    @Override
    public Filme create(FilmeForm form) {
        Filme filme = new Filme();
        filme.setNome(form.getNome());
        filme.setGenero(form.getGenero());
        filme.setDiretor(diretorRepository.findById(form.getDiretorId()).get());
        filme.setProdutora(produtoraRepository.findById(form.getProdutoraId()).get());

        return filmeRepository.save(filme);
    }

    @Override
    public Filme get(Long id) {
        return filmeRepository.findById(id).get();
    }

    @Override
    public List<Filme> getAll(String genero) {
        if (genero == null) {
            return filmeRepository.findAll();
        } else {
            return filmeRepository.findByGenero(genero);
        }
    }

    @Override
    public Filme update(Long id, FilmeForm form) {
        Filme filme = filmeRepository.findById(id).get();
        filme.setNome(form.getNome());
        filme.setGenero(form.getGenero());
        filme.setDiretor(diretorRepository.findById(form.getDiretorId()).get());
        filme.setProdutora(produtoraRepository.findById(form.getProdutoraId()).get());

        return filmeRepository.save(filme);
    }

    @Override
    public void delete(Long id) {
        filmeRepository.deleteById(id);
    }

    public List<Filme> findByDirector(String nomeDiretor) {
        return filmeRepository.findByDiretorNome(nomeDiretor);
    }
}

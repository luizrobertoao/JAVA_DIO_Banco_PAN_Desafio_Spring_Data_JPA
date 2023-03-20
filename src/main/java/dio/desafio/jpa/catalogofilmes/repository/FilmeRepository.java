package dio.desafio.jpa.catalogofilmes.repository;

import dio.desafio.jpa.catalogofilmes.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
    List<Filme> findByGenero(String genero);

    List<Filme> findByDiretorNome(String nomeDiretor);
}

package dio.desafio.jpa.catalogofilmes.repository;

import dio.desafio.jpa.catalogofilmes.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

//    List<Filme> findByGeneroContaining(String genero);
    @Query(value = "SELECT * FROM tb_filmes f WHERE f.genero ILIKE %:genero%", nativeQuery = true)
    List<Filme> filterByGenero(String genero);

//    List<Filme> findByDiretorNome(String nomeDiretor);
//    List<Filme> findByDiretorNomeContains(String nomeDiretor);
    @Query(value = "SELECT * FROM tb_filmes f INNER JOIN tb_diretores d ON f.diretor_id = d.id WHERE d.nome ILIKE %:nomeDiretor%", nativeQuery = true)
    List<Filme> filterByNomeDiretor(String nomeDiretor);
}

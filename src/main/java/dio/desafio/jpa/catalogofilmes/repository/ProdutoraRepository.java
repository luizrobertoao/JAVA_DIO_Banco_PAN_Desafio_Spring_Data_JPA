package dio.desafio.jpa.catalogofilmes.repository;

import dio.desafio.jpa.catalogofilmes.entity.Produtora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoraRepository extends JpaRepository<Produtora, Long> {
}

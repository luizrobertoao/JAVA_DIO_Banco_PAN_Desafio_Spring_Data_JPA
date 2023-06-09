package dio.desafio.jpa.catalogofilmes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String genero;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "diretor_id")
    private Diretor diretor;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "produtora_id")
    private Produtora produtora;
}

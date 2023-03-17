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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diretor_id")
    private Diretor diretor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "produtora_id")
    private Produtora produtora;
}

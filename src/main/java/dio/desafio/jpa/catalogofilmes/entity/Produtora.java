package dio.desafio.jpa.catalogofilmes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_produtoras")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produtora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Filme> filmes = new ArrayList<>();
}

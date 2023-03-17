package dio.desafio.jpa.catalogofilmes.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoraForm {

    @NotEmpty(message = "O campo nome não pode ser nulo.")
    @Size(min = 1, max = 50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres.")
    private String nome;

}

package dio.desafio.jpa.catalogofilmes.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmeForm {

    @NotEmpty(message = "O campo nome não pode ser nulo.")
    @Size(min = 1, max = 50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "O campo genero não pode ser nulo.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres.")
    private String genero;

    @NotNull(message = "Este campo não pode ser nulo.")
    @Positive(message = "O Id do aluno não pode ser negativo.")
    private Long diretorId;

    @NotNull(message = "Este campo não pode ser nulo.")
    @Positive(message = "O Id do aluno não pode ser negativo.")
    private Long produtoraId;
}

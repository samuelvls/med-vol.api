package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank(message = "Nome é obrigatório") String nome,
        @NotBlank(message = "Email é obrigatório") @Email(message = "Formato de email inválido") String email,
        @NotBlank(message = "Telefone é obrigatório") String telefone,
        @NotBlank(message = "CPF é obrigatório") @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}", message = "Formato de CPF inválido") String cpf,
        @NotNull(message = "Endereço é obrigatório") @Valid DadosEndereco endereco
) {
}

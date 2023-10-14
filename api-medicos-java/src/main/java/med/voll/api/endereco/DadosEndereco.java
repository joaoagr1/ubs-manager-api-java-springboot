package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


public record DadosEndereco(

        String logradouro,

        String bairro,

        @Pattern(regexp = "\\d{8}")
        String cep,

        String cidade,

        String uf,
        String complemento,
        String numero) {




}
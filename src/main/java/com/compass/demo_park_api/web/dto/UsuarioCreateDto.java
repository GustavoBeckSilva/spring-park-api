package com.compass.demo_park_api.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class UsuarioCreateDto {

	@NotBlank // Anotação mais completa do que NotNull e NotEmpty
	@Email(message = "formato do email inválido", regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\\\.[a-z]{2,}$")
	private String username;

	@NotBlank
	@Size(min = 6, max = 6)
	private String password;
}

package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComprovanteDto {
	
	private LocalDateTime dataCompra;
	private String nome;
	private String cpfCnpj;
	private DocumentoDto documento;
	@Builder.Default
	private List<ComprovanteItemDto> produtos = new ArrayList<>();
	
}

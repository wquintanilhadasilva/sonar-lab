package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
@Slf4j
public class Api {
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> hook(@RequestBody ComprovanteStatusDto comprovanteStatusDto) {
		log.info("Chegou post para o comprovante: [{}]", comprovanteStatusDto);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}

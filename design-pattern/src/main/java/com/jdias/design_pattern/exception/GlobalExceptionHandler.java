package com.jdias.design_pattern.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Exemplo de tratamento de exceção específica
    @ExceptionHandler(TipoFreteNaoSuportadoException.class)
    public ResponseEntity<ErroDetalhes> handleTipoFreteNaoSuportadoException(TipoFreteNaoSuportadoException ex, WebRequest request) {
        ErroDetalhes detalhesErro = new ErroDetalhes(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                "Tipo de Frete Não Suportado",
                ex.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(detalhesErro, HttpStatus.BAD_REQUEST);
    }

    // Exemplo de tratamento genérico para outras exceções
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErroDetalhes> handleGlobalException(Exception ex, WebRequest request) {
        ErroDetalhes detalhesErro = new ErroDetalhes(
                LocalDateTime.now(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Erro Interno no Servidor",
                ex.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(detalhesErro, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

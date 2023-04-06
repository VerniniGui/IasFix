package br.com.iasfix.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class HandlerExceptions {
    @ExceptionHandler(MyNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handlerNotFoundException(MyNotFoundException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .titulo("Erro na solicitação")
                .mensagem(ex.getMessage())
                .codigoStatus(HttpStatus.NOT_FOUND.value())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }

}

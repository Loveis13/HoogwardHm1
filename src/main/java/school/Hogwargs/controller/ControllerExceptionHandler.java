package school.Hogwargs.controller;

import org.apache.coyote.Response;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import school.Hogwargs.exception.StudentAlreadyExistsException;
import school.Hogwargs.exception.StudentNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {
    @EventListener({StudentAlreadyExistsException.class})
    public ResponseEntity<String> handleException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ex.getMessage());
    }
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<String>handleNotFoundException(RuntimeException ex){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }

}

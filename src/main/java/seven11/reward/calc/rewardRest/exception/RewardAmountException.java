package seven11.reward.calc.rewardRest.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RewardAmountException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = InvalidAmountException.class)
    public ResponseEntity<Object> exception(InvalidAmountException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);

    }

    protected  ResponseEntity<Object>handleMethodNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request){
        return new ResponseEntity<>("Invalid request purchase must be number", HttpStatus.BAD_REQUEST);

    }
}

package com.hillel.loginsystem.excpetion.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {

    @ExceptionHandler(value = {Exception.class})
    public void resourceNotFoundException(Exception ex, HttpServletResponse response) throws IOException {
        log.error("Some error throw in application details : {}", ex.getMessage());
        response.sendError(500, ex.getMessage());
    }


}

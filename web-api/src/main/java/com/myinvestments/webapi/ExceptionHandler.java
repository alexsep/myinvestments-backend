package com.myinvestments.webapi;

import com.myinvestments.webapi.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ExceptionHandler {

    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public List<ErrorDto> handle(Exception e){
        List<ErrorDto> errorDtoList = new ArrayList<>();
        ErrorDto errorDto = new ErrorDto(e.getClass().getName(), e.getMessage());
        errorDtoList.add(errorDto);
        return errorDtoList;
    }

}

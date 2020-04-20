package com.myinvestments.webapi.controller.v1;

import com.myinvestments.core.entities.Entity;
import com.myinvestments.webapi.dto.ErrorDto;
import com.myinvestments.webapi.mappers.ErrorDtoMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResponseFormatter {

    public<T extends Entity>ResponseEntity formatSaveReponse(T entity, String location){
        if(entity.isValid()){
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("Location", location + entity.getId().toString());
            return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
        }
        List<ErrorDto> errorDtoList = ErrorDtoMapper.INSTANCE.map(entity.getValidationResult());
        return new ResponseEntity(errorDtoList, HttpStatus.UNPROCESSABLE_ENTITY);
    }
}

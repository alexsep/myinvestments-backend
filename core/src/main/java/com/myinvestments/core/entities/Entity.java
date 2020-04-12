package com.myinvestments.core.entities;

import com.myinvestments.core.dto.NotificationDto;
import com.myinvestments.core.interfaces.validations.Validator;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Entity {

    private UUID id = null;
    private boolean isValid = false;
    private List<NotificationDto> validationResult = new ArrayList<>();

    public Entity(UUID id, boolean isValid, List<NotificationDto> validationResult){
        this.id = id;
        this.isValid = isValid;
        this.validationResult = validationResult;
    }

    public <T> boolean validate(T entity, Validator<T> validator){
        validationResult = validator.validate(entity);
        isValid = validationResult.isEmpty();
        return isValid;
    }

}

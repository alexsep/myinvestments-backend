package com.myinvestments.core.interfaces.validations;

import com.myinvestments.core.dto.NotificationDto;

import java.util.List;

public interface Validator<T> {
    List<NotificationDto> validate(T entity);
}

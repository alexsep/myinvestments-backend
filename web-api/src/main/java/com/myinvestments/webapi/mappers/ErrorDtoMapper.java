package com.myinvestments.webapi.mappers;

import com.myinvestments.core.dto.NotificationDto;
import com.myinvestments.webapi.dto.ErrorDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ErrorDtoMapper {
    ErrorDtoMapper INSTANCE = Mappers.getMapper(ErrorDtoMapper.class);

    ErrorDto map(NotificationDto notificationDto);
    NotificationDto map(ErrorDto errorDto);
    List<ErrorDto> map(List<NotificationDto> notificationDtoList);
}

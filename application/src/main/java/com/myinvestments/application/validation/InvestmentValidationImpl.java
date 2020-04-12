package com.myinvestments.application.validation;

import com.myinvestments.core.dto.NotificationDto;
import com.myinvestments.core.entities.Investment;
import com.myinvestments.core.interfaces.validations.investment.InvestmentValidation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestmentValidationImpl implements InvestmentValidation {

    @Override
    public List<NotificationDto> validate(Investment entity) {
        List<NotificationDto> notificationDtoList = new ArrayList<>();
        return notificationDtoList;
    }
}

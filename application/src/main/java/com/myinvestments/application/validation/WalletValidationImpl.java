package com.myinvestments.application.validation;

import com.myinvestments.core.dto.NotificationDto;
import com.myinvestments.core.entities.Wallet;
import com.myinvestments.core.interfaces.validations.wallet.WalletValidation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WalletValidationImpl implements WalletValidation {
    @Override
    public List<NotificationDto> validate(Wallet entity) {
        List<NotificationDto> notificationDtoList = new ArrayList<>();
        return notificationDtoList;
    }
}

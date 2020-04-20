package com.myinvestments.webapi.controller.v1;

import com.myinvestments.core.entities.Wallet;
import com.myinvestments.core.interfaces.usecases.investments.SaveInvestmentUseCase;
import com.myinvestments.core.interfaces.usecases.wallet.FindWalletUseCase;
import com.myinvestments.core.interfaces.usecases.wallet.SaveWalletUseCase;
import com.myinvestments.webapi.dto.ErrorDto;
import com.myinvestments.webapi.dto.WalletDto;
import com.myinvestments.webapi.mappers.WalletDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/wallets")
public class WalletController {

    private SaveWalletUseCase saveWalletUseCase;
    private FindWalletUseCase findWalletUseCase;
    @Autowired
    private ResponseFormatter responseFormatter;

    WalletController(SaveWalletUseCase saveWalletUseCase, FindWalletUseCase findWalletUseCase){
        this.saveWalletUseCase = saveWalletUseCase;
        this.findWalletUseCase = findWalletUseCase;
    }


    @PostMapping
    public ResponseEntity save(@RequestBody @Valid WalletDto walletDto, UriComponentsBuilder uriBuilder) {
        Wallet wallet = saveWalletUseCase.save(WalletDtoMapper.INSTANCE.map(walletDto));

        return responseFormatter.formatSaveReponse(wallet, "/v1/wallets/{walletId}");
    }

    @GetMapping
    public ResponseEntity<List<WalletDto>> findAll(){
        return ResponseEntity.ok(WalletDtoMapper.INSTANCE.mapToDtoList(findWalletUseCase.findAll()));
    }
}

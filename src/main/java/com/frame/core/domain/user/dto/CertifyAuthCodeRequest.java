package com.frame.core.domain.user.dto;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
public class CertifyAuthCodeRequest {
    @NotEmpty
    private String authCode;
}

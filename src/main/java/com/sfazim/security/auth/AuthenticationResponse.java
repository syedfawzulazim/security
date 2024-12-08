package com.sfazim.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String token;
    private String errorMessage;

    public static AuthenticationResponse error(String errorMessage) {
        return AuthenticationResponse.builder()
                .errorMessage(errorMessage)
                .build();
    }

    public static AuthenticationResponse success(String token) {
        return AuthenticationResponse.builder()
                .token(token)
                .build();
    }
}

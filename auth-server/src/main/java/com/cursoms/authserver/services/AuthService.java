package com.cursoms.authserver.services;

import com.cursoms.authserver.dtos.TokenDto;
import com.cursoms.authserver.dtos.UserDto;

public interface AuthService {

    TokenDto login(UserDto user);
    TokenDto validateToken(TokenDto token);
}

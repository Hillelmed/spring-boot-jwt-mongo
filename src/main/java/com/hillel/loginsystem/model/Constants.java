package com.hillel.loginsystem.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {

    public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 18000;
    public static final String SIGNING_KEY = "hillel441";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}

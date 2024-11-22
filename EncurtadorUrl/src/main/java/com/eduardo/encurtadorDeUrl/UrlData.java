package com.eduardo.encurtadorDeUrl;

import lombok.*;


@AllArgsConstructor
@Setter
@Getter
public class UrlData {
    private String originalUrl;
    private long expirationTime;
}

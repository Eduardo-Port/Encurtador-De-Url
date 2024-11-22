package com.eduardo.redirectUrlShortener;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UrlData {
    private String originalUrl;
    private long expirationTime;
}

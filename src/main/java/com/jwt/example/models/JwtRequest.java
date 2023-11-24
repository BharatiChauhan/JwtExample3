package com.jwt.example.models;


import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtRequest
{
    @NotNull(message = "Email should not be null!")
    private String email;

    @NotNull(message = "Password should not be null")
    private String password;



}

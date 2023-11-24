package com.jwt.example.models;


import jakarta.validation.constraints.Email;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User
{
    private String userId;
    private String name;
    @Email
    private String email;
}

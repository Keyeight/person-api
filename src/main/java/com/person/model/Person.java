package com.person.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Locale;

@Setter
@Getter
@AllArgsConstructor
public class Person {

    private Long id;

    private String name;

    private String email;

    private String phone;

    private String cpf;

    private Date birthDate;

}
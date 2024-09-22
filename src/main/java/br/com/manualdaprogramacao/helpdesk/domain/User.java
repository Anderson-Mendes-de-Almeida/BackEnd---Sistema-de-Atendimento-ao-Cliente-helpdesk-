package br.com.manualdaprogramacao.helpdesk.domain;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class User {
    UUID id;
    String username;
    String password;
    String name_;
    String email;
    Date createAt;


}

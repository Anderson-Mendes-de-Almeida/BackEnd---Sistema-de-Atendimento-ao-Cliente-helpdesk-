package br.com.manualdaprogramacao.helpdesk.dto;

public record CreateUserDto(

        String username,
        String password,
        String name_,
        String email

) {
}

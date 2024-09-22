package br.com.manualdaprogramacao.helpdesk.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;

    @Column(name = "password")
    private String password;


    private String name_;

    private String email;

    protected boolean active;


    @Column(name = "created_by")
    private UUID createdBy;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "update_by")
    private UUID updateBy;

    @Column(name = "update_at")
    private Date updateAt;


}

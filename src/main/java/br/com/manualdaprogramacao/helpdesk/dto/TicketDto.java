package br.com.manualdaprogramacao.helpdesk.dto;

import br.com.manualdaprogramacao.helpdesk.domain.User;
import br.com.manualdaprogramacao.helpdesk.entity.UserEntity;
import br.com.manualdaprogramacao.helpdesk.enums.TicketStatus;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class TicketDto {

    private UUID id;

    private UserDto supportUser;

    private String subject;

    private String description;

    private TicketStatus status;

    private UserEntity createdBy;

    private Date createAt;

    private UUID updatedBy;

    private Date updatedAt;


}

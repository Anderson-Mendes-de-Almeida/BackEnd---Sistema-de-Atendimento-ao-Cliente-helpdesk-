package br.com.manualdaprogramacao.helpdesk.domain;

import br.com.manualdaprogramacao.helpdesk.entity.TicketEntity;
import br.com.manualdaprogramacao.helpdesk.entity.UserEntity;
import br.com.manualdaprogramacao.helpdesk.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class TicketInteraction {

    private String message;

    private TicketStatus status;

    private UUID userId;

    private UUID ticketId;

    private UUID id;

    private TicketEntity ticket;

    private List<Attachment> attachments;

    private UserEntity sentByUser;
    //não existe a coluna "sent-by-user_id" da relação "ticket_interactions"
    private UserEntity createdBy;

    private Date createAt;

    private UUID updatedBy;

    private Date updatedAt;


}

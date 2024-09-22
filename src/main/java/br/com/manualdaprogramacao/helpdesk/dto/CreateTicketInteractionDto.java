package br.com.manualdaprogramacao.helpdesk.dto;

import br.com.manualdaprogramacao.helpdesk.domain.Attachment;
import br.com.manualdaprogramacao.helpdesk.enums.TicketStatus;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CreateTicketInteractionDto {

    private String message;

    private UUID userId;

    private TicketStatus status; //pare se não estar em uso

    private List<AttachmentDto> attachments;



}

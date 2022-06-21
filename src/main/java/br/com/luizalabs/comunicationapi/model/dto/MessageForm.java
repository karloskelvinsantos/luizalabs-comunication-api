package br.com.luizalabs.comunicationapi.model.dto;

import br.com.luizalabs.comunicationapi.model.TypeMessage;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
public class MessageForm {

    private String body;
    private String to;
    private LocalDateTime dateToSend;
    @Enumerated(EnumType.STRING)
    private TypeMessage type;
}

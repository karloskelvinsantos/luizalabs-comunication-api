package br.com.luizalabs.comunicationapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "message")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;
    private String to;
    private LocalDateTime dateToSend;
    @Enumerated(EnumType.STRING)
    private TypeMessage type;

}

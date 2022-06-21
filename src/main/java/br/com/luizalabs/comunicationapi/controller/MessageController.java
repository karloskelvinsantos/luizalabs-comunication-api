package br.com.luizalabs.comunicationapi.controller;

import br.com.luizalabs.comunicationapi.model.Message;
import br.com.luizalabs.comunicationapi.model.dto.MessageForm;
import br.com.luizalabs.comunicationapi.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping("/schedule")
    public ResponseEntity<Message> create(@RequestBody MessageForm messageForm) {
        return ResponseEntity.ok(service.create(messageForm));
    }
}

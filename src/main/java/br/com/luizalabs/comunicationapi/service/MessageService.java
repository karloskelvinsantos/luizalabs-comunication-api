package br.com.luizalabs.comunicationapi.service;

import br.com.luizalabs.comunicationapi.model.Message;
import br.com.luizalabs.comunicationapi.model.dto.MessageForm;
import br.com.luizalabs.comunicationapi.repository.MessageRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MessageService {

    private final MessageRepository messageRepository;
    private final ModelMapper mapper;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
        this.mapper = new ModelMapper();
    }

    public Message create(MessageForm messageForm) {
        var message = mapper.map(messageForm, Message.class);
        return messageRepository.save(message);
    }
}

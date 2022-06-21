package br.com.luizalabs.comunicationapi.repository;

import br.com.luizalabs.comunicationapi.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}

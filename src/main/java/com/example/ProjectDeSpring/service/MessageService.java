package com.example.ProjectDeSpring.service;

import com.example.ProjectDeSpring.entity.Message;
import com.example.ProjectDeSpring.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    MessageRepository repository;


    //inserer un message dans la bd avec save predifinie dans JPA
    public Message saveMessage(Message m){

        try {
            if (m.getContent().isEmpty()) {
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException exception) {
            System.out.println(exception + "the message can't be empty");
        }
        return repository.save(m);
    }



    //Obtenir la liste de message du canal

    public List<Message> getChannelMessages(long idChannal) {
        return repository.getChannelMessage(idChannal);
    }

    //Ajouter ou Modifier un canal

    public Message updateMessage(Message m) {


        Message newMessage = repository.findById(Math.toIntExact((m.getId()))).orElse(null);

        newMessage.setContent(m.getContent());
        newMessage.setDateDepublication(m.getDateDepublication());
        newMessage.setIdChannel(m.getIdChannel());
        newMessage.setIdUser(m.getIdUser());

        return saveMessage(newMessage);

    }




}


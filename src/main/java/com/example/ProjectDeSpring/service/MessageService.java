package com.example.ProjectDeSpring.service;

import com.example.ProjectDeSpring.entity.Message;
import com.example.ProjectDeSpring.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository repository;

    /*recup tous les message dans la base avec le methode findall definie dans jpa */

    public List<Message> getAll(){
        return repository.findAll();
    }

}


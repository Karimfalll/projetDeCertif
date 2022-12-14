package com.example.ProjectDeSpring.controller;

import com.example.ProjectDeSpring.entity.Message;
import com.example.ProjectDeSpring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;

@RestController
@RequestMapping("/Api/Channel/Message")
public class MessaageController {

    @Autowired
    MessageService service;





    // Affiche liste de message du canal
    @GetMapping("messageschanal/{idChannal}")
    public List<Message> getAllMessagesFromChannel(@PathVariable long idChannel){
        return service.getChannelMessages(idChannel);
    }


    // Ecrire un message
    @PostMapping("addmessage")

    public List<Message> addmessage(@RequestBody Message m){
        service.saveMessage(m);
        return getAllMessagesFromChannel(m.getIdChannel());

    }



    //*Ecrire ou modifier un message
    @PutMapping("/updtedmessage")

    public List<Message> putMessage(@RequestBody Message m) {


        service.updateMessage(m);
        return getAllMessagesFromChannel(m.getIdChannel());
    }

    //supprimer un message
    @DeleteMapping("/deletemessage")

    public List<Message> deleteMessage(@RequestBody Message m){
        service.deleteMessage(m);

        return getAllMessagesFromChannel(m.getIdChannel());

    }


    //afficher tous le messages d'un utlisateur


    @GetMapping("messageschanal/{idUtilisateur}")
    public List<Message> getAllMessagesFromUser(@PathVariable long idUser){
        return service.getChannelMessages(idUser);
    }


}

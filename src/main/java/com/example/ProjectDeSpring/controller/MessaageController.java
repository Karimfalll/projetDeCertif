package com.example.ProjectDeSpring.controller;

import com.example.ProjectDeSpring.entity.Message;
import com.example.ProjectDeSpring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Api/Message")
public class MessaageController {
    @Autowired
    MessageService service;




}

package com.example.ProjectDeSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< Updated upstream

=======
import org.springframework.stereotype.Controller;
>>>>>>> Stashed changes
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectDeSpring.entity.Channel;
import com.example.ProjectDeSpring.service.ChannelService;



@RestController
@RequestMapping("/api/channel")
public class ChannelController {
	
	
	@Autowired
	ChannelService service;
	
	@GetMapping("/recupchannels")
	public List<Channel> getChannel(){
		return service.getChannels();
	}
	
	@PostMapping("/createchannels")
	public Channel postChannel(@RequestBody Channel c){
		return service.postChannel(c);
	}
	
	@PutMapping("/majchannels")
	public Channel putChannel(@RequestBody Channel c){
		
		return service.putChannel(c);
	}
		
	@DeleteMapping("/suppchannels/{id}")
	public String deleteChannel(@PathVariable int id){
		return service.deleteChannel(id);
	}
}

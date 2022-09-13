package com.example.ProjectDeSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectDeSpring.entity.Channel;
import com.example.ProjectDeSpring.repository.ChannelRepository;

@Service
public class ChannelService {
	
	@Autowired
	ChannelRepository repo;
	
	// Read
	public List<Channel> getChannels(){
		return repo.findAll();
	}
	
	// Create
	public Channel postChannel(Channel c) {
		return repo.save(c);
	}
	
	// Update
	public Channel putChannel(Channel c) {
		Channel newChannel = repo.findById(c.getIdchannel()).orElse(null);
		if(newChannel != null) {
			newChannel.setDate(c.getDate());
			newChannel.setIdchannel(c.getIdchannel());
			newChannel.setIduser(c.getIduser());
			newChannel.setName(c.getName());
			
			repo.save(newChannel);
		}
		
		return newChannel;
	}
	
	//Delete
	
	public String deleteChannel(int idchannel) {
		if(repo.findById(idchannel).isPresent()) {
			repo.deleteById(idchannel);
			
			return "Channel deleted: " + idchannel;
		}
		
		return "Channel not found: " + idchannel;
	}
}


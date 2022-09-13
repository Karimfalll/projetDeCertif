package com.example.ProjectDeSpring.repository;

import com.example.ProjectDeSpring.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {


    @Query("SELECT m FROM Message m WHERE m.idChannel =:idChannel")
    public  List<Message> getChannelMessages(@Param("idChannel")  long id);


    @Query("SELECT m FROM Message m WHERE m.idUser =:idUser")
    public  List<Message> getUserMessages(@Param("idUser")  long id);


}

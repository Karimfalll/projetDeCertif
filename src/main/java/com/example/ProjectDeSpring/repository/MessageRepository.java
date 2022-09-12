package com.example.ProjectDeSpring.repository;

import com.example.ProjectDeSpring.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
}

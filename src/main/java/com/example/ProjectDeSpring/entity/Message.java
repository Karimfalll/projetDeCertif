package com.example.ProjectDeSpring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private long idUser;
    private long idChannel;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public long getIdChannel() {
        return idChannel;
    }

    public void setIdChannel(long idChannel) {
        this.idChannel = idChannel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateDepublication() {
        return dateDepublication;
    }

    public void setDateDepublication(Date dateDepublication) {
        this.dateDepublication = dateDepublication;
    }

    private String content;
    private Date dateDepublication;

    public Message() {
    }

    public Message(Long id, long idUser, long idChannel, String content, Date dateDepublication) {
        this.id = id;
        this.idUser = idUser;
        this.idChannel = idChannel;
        this.content = content;
        this.dateDepublication = dateDepublication;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package com.example.ProjectDeSpring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Date dateDePublication;

    public Long getId() {
        return id;
    }

    public Channel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateDePublication() {
        return dateDePublication;
    }

    public void setDateDePublication(Date dateDePublication) {
        this.dateDePublication = dateDePublication;
    }

    public Channel(Long id, String name, Date dateDePublication) {
        this.id = id;
        this.name = name;
        this.dateDePublication = dateDePublication;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

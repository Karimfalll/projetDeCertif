package com.example.ProjectDeSpring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Date DateOfPublication;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfPublication() {
        return DateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        DateOfPublication = dateOfPublication;
    }

    public Utilisateur() {
    }

    public Utilisateur(Long id, String name, Date dateOfPublication) {
        this.id = id;
        this.name = name;
        DateOfPublication = dateOfPublication;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

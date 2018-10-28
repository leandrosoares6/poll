package com.example.polls.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                                                                    

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;

    public Role() {

    }

    public Role (RoleName name){
        this.name = name;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public RoleName getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(RoleName name) {
        this.name = name;
    }
}
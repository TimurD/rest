package com.tymur.rest.rest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "yearOfBorn")
    private Integer yearOfBorn;

    @Column(name = "loanState")
    private String loanState;

    private String gender;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(Integer yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLoanState() {
        return loanState;
    }

    public void setLoanState(String loanState) {
        this.loanState = loanState;
    }
}
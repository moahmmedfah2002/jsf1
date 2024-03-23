package com.example.j;

import jakarta.annotation.ManagedBean;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;

@ManagedBean
@RequestScoped
public class ManageBean {
    private Personne personne=new Personne();

    @PostConstruct
    public void init(){

    }
    public Personne getPersonne() {
        return personne;
    }
    public  void aff(){
        System.out.println(personne.getName());
    }
    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}

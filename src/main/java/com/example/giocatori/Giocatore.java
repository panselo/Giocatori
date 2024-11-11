package com.example.giocatori;

public class Giocatore {

    private String nome;
    private int goal;


    public String toString (){
        return "Nome: " + this.nome  + " Goal: " + this.goal;
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }




    public int getGoal(){
        return goal;
    }
    public void setGoal(int g){
        if (goal >= 0){
            goal = g;
        } else {
            goal = 0;
        }
    }


    public Giocatore(String nomeNuovo, int goalNuovo) {
        setNome(nomeNuovo);
        setGoal(goalNuovo);
    }
    public Giocatore (){
        setNome(null);
        setGoal(0);
    }



}

package com.example.giocatori;

public class Giocatore {

    private String nome;
    private String capitano;
    private int goal;




    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }



    public String getCapitano(){
        return capitano;
    }
    public void setCapitano(String cap){
        capitano = cap;
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


    public Giocatore(String nomeNuovo, String capitanoNuovo, int goalNuovo) {
        setNome(nomeNuovo);
        setCapitano(capitanoNuovo);
        setGoal(goalNuovo);
    }
    public Giocatore (){
        setNome(null);
        setCapitano(null);
        setGoal(0);
    }



}

package com.example.giocatori;

public class Squadra {

    private String nomeSquadra;
    private String nomeAllenatore;
    private Giocatore [] rosa;
    private int contatore ;

    public Squadra(String nomeSquadra, String nomeAllenatore){

        this.nomeSquadra = nomeSquadra;
        this.nomeAllenatore = nomeAllenatore;
        rosa = new Giocatore [30];
        contatore=0;

    }

    public String getNomeSquadra(){
        return nomeSquadra;
    }
    public void setNomeSquadra(String n){
        nomeSquadra = n;
    }

    public String getNomeAllenatore(){
        return nomeAllenatore;
    }
    public void setNomeAllenatore(String n){
        nomeAllenatore = n;
    }
    public Giocatore[] setRosa(){
        return rosa;
    }

    public void aggiuntaGiocatore(Giocatore g){

        if (contatore < 30) {
            rosa[contatore] = g;
            contatore++;
        }

    }

    public String visualizzaGiocatori (){

        String s = "";
        for (int i = 0; i<contatore; i++){
            s+=rosa[i]+"\n";
        }
        return s;

    }

    public int ricerca(String nomeGiocatore){

        for (int i = 0; i < contatore; i++){
            if (rosa [i].getNome().equals(nomeGiocatore)){
                return i;
            }
        }

        return -1;

    }

    public void modificaGiocatore(String nome, String nomeNuovo, int goalNuovo, String capitanoNuovo){

        int pos = ricerca(nome);
        rosa[pos].setNome(nomeNuovo);
        rosa[pos].setGoal(goalNuovo);

    }

    public int eliminaGiocatore(Giocatore[] g, int indice, int giocatore){
        for (int l = indice; l<giocatore-1; l++){
            g[l] = g[l+1];
        }
        return giocatore-1;
    }

    public void visualizzaGoal (int goal){
        for (int i=0; i < contatore; i++){
            if (rosa[i].getGoal()>5){
                System.out.println(rosa[i]);
            }
        }
    }


}
package com.example.giocatori;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int scelta;
        String nome;
        String capitano;
        int goal;
        int conta = 0;
        int giocatore;
        String nomeVecchio;
        Squadra s = new Squadra("atalanta", "Gasperini");


        do {

            System.out.println("1. Aggiungi un giocatore");
            System.out.println("2. Visualizza tutti i giocatori");
            System.out.println("3. Modifica un giocatore");
            System.out.println("4. Cancella un giocatore");
            System.out.println("5. Visualizza giocatori con più di 5 gol");
            System.out.println("6. Visualizza il capitano");
            System.out.println("7. Assegna il capitano in modo casuale");
            System.out.println("0. Esci");
            System.out.println("\nScegli un'opzione:");
            scelta = in.nextInt();
            switch (scelta) {

                case 1:
                    System.out.println("Nome del nuovo giocatore: ");
                    nome = in.next();
                    in.nextLine();

                    System.out.println("Il nuovo giocatore è capitano?: ");
                    capitano = in.nextLine();
                    System.out.println("Goal nuovo giocatore: ");
                    goal = in.nextInt();
                    //in.nextLine();
                    Giocatore g = new Giocatore(nome, capitano, goal);
                    s.aggiuntaGiocatore(g);
                    conta++;
                    break;

                case 2:
                    Giocatore[] sq = s.setRosa();
                    for(int i=0; i<=conta; i++)
                    {
                        System.out.println(sq[i].getNome());
                        System.out.println(sq[i].getCapitano());
                        System.out.println(sq[i].getGoal());

                    }

                    //System.out.println(s.visualizzaGiocatori());
                    break;

                case 3:
                    System.out.println("Di quale giocatore vorresti modificare i dati?: ");
                    nomeVecchio = in.nextLine();
                    System.out.println("Nuovo numero goal?: ");
                    goal = in.nextInt();
                    if (goal < 0) {
                        System.out.println("ERRORE!!");
                        break;
                    } else {
                        System.out.println("Nuovo nome?: ");
                        nome = in.nextLine();
                        in.nextLine();
                        System.out.println("è capitano(true/false)?: ");
                        capitano = in.nextLine();
                        in.nextLine();
                        s.modificaGiocatore(nomeVecchio, nome, goal, capitano);
                        break;
                    }

                /*case 4:
                    System.out.println("Quale giocatore vuoi eliminare?: ");
                    giocatore = in.nextInt();

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 0:
                    break;
            }*/


            }

        }while (scelta != 0) ;
    }
}
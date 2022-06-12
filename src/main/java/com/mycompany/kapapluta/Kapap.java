
package com.mycompany.kapapluta;

import java.util.Random;

public class Kapap {
    //atributos 
    private Kapaptador desafiado; 
    private Kapaptador desafiante;
    private int rounds;
    private boolean aprovada; 
    //métodos públicos
    public void marcarKapap(Kapaptador k1, Kapaptador k2){
        if (k1.getCategoria().equals(k2.getCategoria()) 
                && k1 !=k2){
            this.aprovada = true;
            this.desafiado = k1;
            this.desafiante = k2;
        }else {
            this.aprovada = false; 
            this.desafiado = null;
            this.desafiante = null;
        }
    }   
    public void kapapar(){ 
        if (this.aprovada){
            System.out.println("---DESAFIADO---"); 
            this.desafiado.apresentar(); 
            System.out.println("---DESAFIANTE---"); 
            this.desafiante.apresentar(); 
            
            Random aleatorio = new Random(); 
            int vencedor = aleatorio.nextInt(3); // 0 1 2 
            System.out.println("====RESULTADO KAPAP====");
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou !!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();  
                    break;
                case 1: //Desafiado vence     
                    System.out.println("Vencedor " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();                
                    break;
                case 2: //Desafiante vence     
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("========================");            
        }else {    
          System.out.println("Kapapar não ocorrerá");
        }
        
    }
    //métodos especiais

    public Kapaptador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Kapaptador desafiado) {
        this.desafiado = desafiado;
    }

    public Kapaptador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Kapaptador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}

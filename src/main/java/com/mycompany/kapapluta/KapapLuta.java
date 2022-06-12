
package com.mycompany.kapapluta;

public class KapapLuta {
    public static void main(String[] args){
        Kapaptador k[] = new Kapaptador[6];
            
    k[0] = new Kapaptador("Lesous", "Província Ludaea",33, 1.67f,
                                   67.7f, 1000, 0, 0);
    
    k[1] = new Kapaptador("Epafro", "Efrazon",28, 1.970f,
                                   57.1f, 0, 10, 0);
    
    k[2] = new Kapaptador("Zidom", "Cafarnam",41, 1.79f,
                                   97.7f, 4, 5, 2);
    
    k[3] = new Kapaptador("Áven", "Shakaui",23, 1.99f,
                                   108.3f, 3, 6, 1);
    
    k[4] = new Kapaptador("Beteyah", "Samaria",18, 1.85f,
                                   90.8f, 2, 1, 3);
    
    k[5] = new Kapaptador("Dêshaze", "Borubá",58, 1.57f,
                                   59.2f, 3, 3, 2);
    
    Kapap KAP01 = new Kapap(); 
    KAP01.marcarKapap(k[3], k[2]);
    KAP01.kapapar();   
    k[3].status();
    k[2].status();
    
  }    
    
}

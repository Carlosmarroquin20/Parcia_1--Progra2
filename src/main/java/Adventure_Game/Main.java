
package Adventure_Game;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner Sca = new Scanner(System.in);
        int Dw1;
        
        do {
            System.out.println("-------------------------------------");
            System.out.println("Bienvenido a ADVENTURE GAME -THE GAME-     ");
            System.out.println("-------------------------------------");
            System.out.println("Escoje una opcion jijijiji:");
            System.out.println("1. Heroe");
            System.out.println("2. Enemigo");
            System.out.println("3. Objetos Muebles");
            System.out.println("4. Objetos Inmuebles"); 
            int E1 = Sca.nextInt();

            switch (E1) {
                case 1:
                    System.out.println("-HEROE-");
                    Heroe heroe1 = new Heroe();
                    heroe1.Nivel_de_energia();
                    heroe1.Capacidad_ofensiva_de_personaje();
                    heroe1.Coordenada_x();
                    heroe1.Coordenada_y();
                    heroe1.Numero_de_Vidas();
                    heroe1.Mochila();
                    break;

                case 2:
                    System.out.println("-ENEMIGO-");
                    Enemigo enemigo1 = new Enemigo();
                    enemigo1.Nivel_de_energia();
                    enemigo1.Capacidad_ofensiva_de_personaje();
                    enemigo1.Coordenada_x();
                    enemigo1.Coordenada_y();
                    enemigo1.Numero_de_Vidas();
                    break;

                case 3:
                    System.out.println("-OBJETO MUEBLES-");
                    System.out.println("1. Arma");
                    System.out.println("2. Alimento");
                    System.out.println("3. Proyectil");
                    int E2 = Sca.nextInt();
                    
                    switch (E2){
                        case 1:
                            System.out.println("-ARMA-");
                            Arma arma1 = new Arma();
                            arma1.Nivel_de_energia();
                            arma1.Coordenada_x();
                            arma1.Coordenada_y();
                            arma1.Potenciador();
                            break;
                        
                        case 2:
                            System.out.println("-ALIMENTO-");
                            Alimento alimento1 = new Alimento();
                            alimento1.Coordenada_x();
                            alimento1.Coordenada_y();
                            break;
                            
                        case 3:
                            System.out.println("Proyectiles");
                            Proyectil proyectil1 = new Proyectil();
                            proyectil1.Coordenada_x();
                            proyectil1.Coordenada_y();
                            break;
                            
                        default:
                            System.out.println("...Adios...");
                    }
                    
                    break;

                case 4:
                    System.out.println("-OBJETOS INMUEBLES-");
                    System.out.println("1. Muros");
                    System.out.println("2. Torres");
                    System.out.println("3. Árboles");
                    int E3 = Sca.nextInt();
                    
                    switch (E3){
                        case 1:
                            System.out.println("-MUROS-");
                            Muros muro1 = new Muros();
                            muro1.Coordenada_x();
                            muro1.Coordenada_y();
                            break;
                            
                        case 2:
                            System.out.println("-TORRES-");
                            Torres torres1 = new Torres();
                            torres1.Coordenada_x();
                            torres1.Coordenada_y();
                            break;
                            
                        case 3:
                            System.out.println("Árboles");
                            Arbol arbol1 = new Arbol();
                            arbol1.Coordenada_x();
                            arbol1.Coordenada_y();
                            break;
                        
                        default:
                            break;
                    }
                    break;

                default:
                    System.out.println("...Adios..");
            }

            System.out.println("EXIT");
            System.out.println("NO EXIT");
            Dw1 = Sca.nextInt();
        }while(Dw1 != 1);        
    }
}

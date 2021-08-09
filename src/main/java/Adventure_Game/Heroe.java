
package Adventure_Game;

import java.util.Scanner;

public class Heroe extends Personaje_Objeto {
    
    Scanner Sca = new Scanner(System.in);
    
    @Override
    public void Nivel_de_energia() {
        System.out.println("El nivel de energia será:  ");
        int NEnergy = Sca.nextInt();
        System.out.println("El heroe tiene el nivel de energia igual a: " + NEnergy);
        System.out.println("");
    }

    @Override
    public void Numero_de_Vidas() {
        System.out.println("Las vidas del heroe seran: ");
        int NLi = Sca.nextInt();
        System.out.println("El número de vidas del heroe es: " + NLi);
        System.out.println("");
    }

    @Override
    public void Capacidad_ofensiva_de_personaje() {
        System.out.println("Nivel de defensa del hereo: ");
        int NDef = Sca.nextInt();
        System.out.println("La defensa del heroe es: " + NDef);
        System.out.println("");
    } 

    public void Mochila() {
        System.out.println("¿Cuantos objetos desean en la mochila?");
        System.out.println("1. Armamento 2. Proviciones 3. Bombas");
        int AddBackPack = Sca.nextInt();
        
        if(AddBackPack == 1){
            System.out.println("Objetos agregados a la mochila: 1");
        }else if (AddBackPack == 2){
            System.out.println("Objetos agregados a la mochila: 2");
        } else {
            System.out.println("Objetos agregados a la mochila: 3");
        }
    }

    @Override
    public void Coordenada_x() {
        System.out.println("Ingresar  coordenada X: ");
        int Nx = Sca.nextInt();
        System.out.println("La coordenada X es: " + Nx);
        System.out.println("");
    }

    @Override
    public void Coordenada_y() {
        System.out.println("Ingresar coordenada Y: ");
        int Ny = Sca.nextInt();
        System.out.println("La coordenada Y es: " + Ny);
        System.out.println("");
    }
}

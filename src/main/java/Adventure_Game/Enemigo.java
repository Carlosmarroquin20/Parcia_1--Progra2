
package Adventure_Game;

import java.util.Scanner;

public class Enemigo extends Personaje_Objeto {
        Scanner Sca = new Scanner(System.in);
    
    @Override
    public void Nivel_de_energia() {
        System.out.println("El nivel de energia será:  ");
        int NEnergy = Sca.nextInt();
        System.out.println("El enemigo tiene el nivel de energia igual a: " + NEnergy);
        System.out.println("");
    }

    @Override
    public void Numero_de_Vidas() {
        System.out.println("Las vidas del enemigo seran: ");
        int NLi = Sca.nextInt();
        System.out.println("El número de vidas del enemigo es: " + NLi);
        System.out.println("");
    }

    @Override
    public void Capacidad_ofensiva_de_personaje() {
        System.out.println("Nivel de defensa del enemigo: ");
        int NDef = Sca.nextInt();
        System.out.println("La defensa del enemigo es: " + NDef);
        System.out.println("");
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

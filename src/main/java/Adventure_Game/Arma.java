
package Adventure_Game;

import java.util.Scanner;

public class Arma implements Objetos_de_Muebles {
     
    Scanner Sca = new Scanner(System.in);
    
    public void Nivel_de_energia() {
        System.out.println("El nivel de energia sera: ");
        int Nenergy = Sca.nextInt();
        System.out.println("El arma tiene un nivel de energia de: ");
    }
    
    public void Potenciador(){
        System.out.println("El nivel del potenciador sera: ");
        int PTCR = Sca.nextInt();
        System.out.println("El potenciador tiene un nivel de potencia de  " + PTCR);
        System.out.println("");
    }
    
    @Override
    public void Coordenada_x() {
        System.out.println("Ingresar coordenada X: ");
        int Nx = Sca.nextInt();
        System.out.println("Coordenada X : " + Nx);
        System.out.println("");
    }

    @Override
    public void Coordenada_y() {
        System.out.println("Ingresar coordenada Y: ");
        int Ny = Sca.nextInt();
        System.out.println("Coordenada Y : " + Ny);
        System.out.println("");
    }  
}

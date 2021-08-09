
package Adventure_Game;

import java.util.Scanner;

public class Alimento implements Objetos_de_Muebles {
     
    Scanner Sca = new Scanner(System.in);

    @Override
    public void Coordenada_x() {
        System.out.println("Ingresar coordenada X: ");
        int Nx = Sca.nextInt();
        System.out.println("Coordenada X: " + Nx);
        System.out.println("");
    }

    @Override
    public void Coordenada_y() {
        System.out.println("Ingresar coordenada Y: ");
        int Ny = Sca.nextInt();
        System.out.println("Coordenada Y: " + Ny);
        System.out.println("");
    }  
}


package Adventure_Game;

public class Personaje {

    public int getNivel_de_energia() {
        return Nivel_de_energia;
    }

    public void setNivel_de_energia(int Nivel_de_energia) {
        this.Nivel_de_energia = Nivel_de_energia;
    }

    public int getNumero_de_Vidas() {
        return Numero_de_Vidas;
    }

    public void setNumero_de_Vidas(int Numero_de_Vidas) {
        this.Numero_de_Vidas = Numero_de_Vidas;
    }

    public int getCapacidad_ofensiva_de_personaje() {
        return Capacidad_ofensiva_de_personaje;
    }

    public void setCapacidad_ofensiva_de_personaje(int Capacidad_ofensiva_de_personaje) {
        this.Capacidad_ofensiva_de_personaje = Capacidad_ofensiva_de_personaje;
    }

    public int getCoordenada_x() {
        return Coordenada_x;
    }

    public void setCoordenada_x(int Coordenada_x) {
        this.Coordenada_x = Coordenada_x;
    }

    public int getCoordenada_y() {
        return Coordenada_y;
    }

    public void setCoordenada_y(int Coordenada_y) {
        this.Coordenada_y = Coordenada_y;
    }
    private int Nivel_de_energia;
    private int Numero_de_Vidas;
    private int Capacidad_ofensiva_de_personaje;
    private int Coordenada_x;
    private int Coordenada_y;
    
}

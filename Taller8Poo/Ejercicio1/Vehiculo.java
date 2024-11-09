package Taller8Poo.Ejercicio1;

public class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }


    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

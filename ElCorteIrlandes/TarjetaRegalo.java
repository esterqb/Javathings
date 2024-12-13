package U4_POO_clases.Ejercicios.POO_1_Intermedios;

import java.util.Random;
import java.util.Scanner;

public class TarjetaRegalo {
    /*
     * La empresa El Corte Islandés nos ha encargado una aplicación para gestionar las tarjetas regalo. Como primer paso para
     * implementar la aplicación, es necesario crear la clase principal. Implementa la clase ``TarjetaRegalo``. Cuando se crea una
     * nueva tarjeta, se le da un saldo y se asigna de forma automática un número de 5 dígitos. Si se intenta gastar más dinero del
     * que tiene la tarjeta, se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar creando una nueva tarjeta
     * con la suma del saldo que tenga cada una y un nuevo número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos
     * tarjetas originales se quedarían con 0 € de saldo.
     */

    private double saldo;
    private int numero;

    public static void main(String[] args){
        TarjetaRegalo tarjeta1 = new TarjetaRegalo();
        tarjeta1.numerar(new Random());
        System.out.println("Creando tarjeta...\nEl número de la tarjeta es: "+ tarjeta1.getNumero());
        System.out.println("El saldo de su tarjeta es: "+tarjeta1.getSaldo());
    }
    public TarjetaRegalo(){
        this.saldo = saldo;
        this.numero = numero;

    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }


    public void numerar(Random numero){
        Random random = new Random();
        int min=10000;
        int max=99999;
        setNumero(random.nextInt(max-min+1)+min);

    }



}

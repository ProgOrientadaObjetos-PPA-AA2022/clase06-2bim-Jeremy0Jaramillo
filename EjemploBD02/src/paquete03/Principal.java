/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {

        Scanner entry = new Scanner(System.in);
        double valor;
        String placa;
        boolean bandera = true;
        String confir;

        while (bandera) {
            System.out.println("Ingrese la placa del auto:");
            placa = entry.nextLine();
            System.out.println("Ingrese el valor de la matrícula:");
            valor = entry.nextDouble();
            entry.nextLine();

            Enlace c = new Enlace();
            Auto a = new Auto();
            a.establecerPlaca(placa);
            a.establecerValorMatricula(valor);

            c.insertarAuto(a);
            System.out.println("Ingrese 's' para salir");
            confir = entry.nextLine();
            if (confir.equals("s")) {
                bandera = false;
            }
        }
    }
}

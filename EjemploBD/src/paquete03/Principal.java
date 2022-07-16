/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner entry = new Scanner(System.in);
        int interio;
        String ciud;
        boolean bandera = true;
        String confir;

        while (bandera) {
            System.out.println("Ingrese la ciudad:");
            ciud = entry.nextLine();
            System.out.println("Ingrese la poblacion:");
            interio = entry.nextInt();
            entry.nextLine();

            Enlace c = new Enlace();
            Ciudad ciudad = new Ciudad(ciud, interio);
            c.insertarCiudad(ciudad);
            System.out.println("Ingrese 's' para salir");
            confir = entry.nextLine();
            if (confir.equals("s")) {
                bandera = false;
            }
        }

        /*for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
            System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }
         */
    }
}

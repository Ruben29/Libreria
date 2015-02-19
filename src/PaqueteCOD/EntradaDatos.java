package PaqueteCod;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDatos {

    public int introducir(int num) {

        int numero = 0;

        switch (num) {

            case 0:

                System.out.println("Introduce un número, por favor");
                Scanner scan = new Scanner(System.in);
                numero = scan.nextInt();

            case 1:

                String var = JOptionPane.showInputDialog("Introduce un número, por favor:");
                numero = Integer.parseInt(var);

            default:

                JOptionPane.showInputDialog("No sabes hacerlo... A clases con Nina!!!");

        }

        return numero;

    }

}

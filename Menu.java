package FARMACIA;

import java.util.Scanner;

public class Menu {
    public static void Lista() {
        Scanner sc = new Scanner(System.in);
        Metodo m = new Metodo();
        int n = m.PedirDimension(sc);
        OBJ[][] mt = new OBJ[n][n];
        int d;
        mt = m.IngresarMedicamentos(mt, sc);
        do {
            System.out.println("\n¡Bienvenido a FARMACIA SALUDPLUS! ¿Qué deseas hacer?" +
                    "\n1. Mostrar medicamento según el código \n2. Vender medicamento " +
                    "\n3. Actualizar información de medicamento \n0. Salir");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    m.Mostrar(mt, sc);
                    break;
                case 2:
                    mt = m.VenderMedicamento(mt, sc);
                    break;
                case 3:
                    mt = m.ActualizarInformacion(mt, sc);
                    break;
                case 0:
                    System.out.println("Gracias por visitar FARMACIO SALUDPLUS");
                    break;
                default:
                    System.out.println("Ingrese una opción válida: ");
                    break;
            }

        } while (d != 0);

    }

}

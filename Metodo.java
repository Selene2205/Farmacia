package FARMACIA;

import java.util.Scanner;

import EXITO.metodo;

public class Metodo {
    public int PedirDimension(Scanner sc) {
        System.out.println("Ingrese la cantidad de medicamentos: ");
        return sc.nextInt();
    }

    public OBJ[][] IngresarMedicamentos(OBJ[][] n, Scanner sc) {
        metodo m = new metodo();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                OBJ o = new OBJ();
                System.out.println("Ingrese el código del medicamento de la fila " + i + ", de la columna " + j + ": ");
                o.setCodigoMedicamento(sc.next());
                System.out.println("Ingrese nombre del medicamento: ");
                o.setNombre(sc.next());
                System.out.println("¿Qué cantidad hay del medicamento " + o.getNombre() + "?");
                o.setCantidadDisponible(m.ValidarEntero(sc));
                System.out.println("Ingrese el precio unitario: ");
                o.setPrecioUnitario(sc.nextDouble());
                o.setTotalInventario(o.getCantidadDisponible() * o.getPrecioUnitario());
                n[i][j] = o;
            }
        }
        return n;

    }

    public void Mostrar(OBJ[][] n, Scanner sc) {
        System.out.println("¿Qué medicamento desea buscar?");
        String codigo = sc.next();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i][j].getCodigoMedicamento().equals(codigo)) {
                    System.out.println("\nCódigo del medicamento: " + n[i][j].getCodigoMedicamento());
                    System.out.println("Nombre del medicamento: " + n[i][j].getNombre());
                    System.out.println("Cantidad disponible (unidad): " + n[i][j].getCantidadDisponible());
                    System.out.println("Precio Unitario: " + n[i][j].getPrecioUnitario());
                    System.out.println("Total precio en el inventario: " + n[i][j].getTotalInventario());
                    System.out.println("------------------------------------------\n");
                }

            }
        }

    }

    public OBJ[][] VenderMedicamento(OBJ[][] n, Scanner sc) {
        System.out.println("Ingrese el código del producto que va vender");
        String c = sc.next();
        System.out.println("Ingrese la cantidad que desea vender");
        int ca = sc.nextInt();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i][j].getCodigoMedicamento().equals(c)) {
                    System.out.println("Precio Unitario: " + n[i][j].getPrecioUnitario());
                    System.out.println("Precio total de la compra: " + n[i][j].getPrecioUnitario() * ca);
                    n[i][j].setCantidadDisponible(n[i][j].getCantidadDisponible() - ca);
                    n[i][j].setTotalInventario(n[i][j].getCantidadDisponible() * n[i][j].getPrecioUnitario());
                }
            }
        }
        return n;
    }

    public OBJ[][] ActualizarInformacion(OBJ[][] n, Scanner sc) {
        System.out.println("Ingrese el código del medicamento para actualizar: ");
        String c = sc.next();
        int b;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i][j].getCodigoMedicamento().equals(c)) {
                    do {
                        System.out.println(
                                "\n¿Qúe desea actualizar, dentro de lo posible? \n1. Cantidad \n2. Precio \n3. Nombre \n0. Salir");
                        b = sc.nextInt();
                        switch (b) {
                            case 1:
                                System.out.println("Ingrese la cantidad del medicamento: ");
                                n[i][j].setCantidadDisponible(sc.nextInt());
                                break;
                            case 2:
                                System.out.println("Ingrese el precio del medicamento: ");
                                n[i][j].setPrecioUnitario(sc.nextDouble());
                                break;
                            case 3:
                                System.out.println("Ingrese el nombre del medicamento: ");
                                n[i][j].setNombre(sc.next());
                                break;
                            case 0:
                                System.out.println("Actualización completada\n");
                                break;
                            default:
                                System.out.println("Ingrese una opción válida");
                                break;
                        }
                    } while (b != 0);

                }
            }
        }

        return n;
    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digitar un número entero: ");
            sc.next();
        }
        return sc.nextInt();
    }

}

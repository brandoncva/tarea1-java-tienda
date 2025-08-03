import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int opcion;
                boolean salir = false;

                do {
                    System.out.println("\n=== MENÚ DE LA TIENDA ===");
                    System.out.println("1. Ver productos disponibles");
                    System.out.println("2. Agregar producto al carrito");
                    System.out.println("3. Ver carrito y total a pagar");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");

                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("\nPróximamente: Lista de productos");
                            break;
                        case 2:
                            System.out.println("\nPróximamente: Agregar productos");
                            break;
                        case 3:
                            System.out.println("\nPróximamente: Ver carrito");
                            break;
                        case 4:
                            salir = true;
                            System.out.println("¡Hasta pronto!");
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }
                } while (!salir);

                scanner.close();

                        // Nuevo: Arreglos de productos
                        String[] productos = {"Laptop", "Teléfono", "Tablet", "Auriculares", "Cargador"};
                        double[] precios = {1200.99, 599.50, 299.99, 89.99, 19.99};

                        // [Resto del código anterior...]

                        switch (opcion) {
                            case 1:
                                System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
                                for (int i = 0; i < productos.length; i++) {
                                    System.out.printf("%d. %s - $%.2f%n", (i+1), productos[i], precios[i]);
                                }
                                break;
                            case 2:
                                System.out.println("\nSeleccione producto (1-5): ");
                                int seleccion = scanner.nextInt();
                                if (seleccion >= 1 && seleccion <= productos.length) {
                                    System.out.println("Agregado: " + productos[seleccion-1]);
                                } else {
                                    System.out.println("Selección inválida!");
                                }
                                break;
                            // [Resto de casos...]
                        }
                        // [Resto del código...]
                    }
            }
        
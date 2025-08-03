import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        // Nuevo: Arreglos de productos y precios (Segundo avance)
        String[] productos = {"Laptop", "Teléfono", "Tablet", "Auriculares", "Cargador"};
        double[] precios = {1200.99, 599.50, 299.99, 89.99, 19.99};

        do {
            System.out.println("\n=== MENU DE LA TIENDA ===");
            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver carrito y total a pagar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Nuevo: Mostrar productos con for (Segundo avance)
                    System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.printf("%d. %s - $%.2f%n", (i+1), productos[i], precios[i]);
                    }
                    break;

                case 2:
                    // Nuevo: Logica para seleccionar productos (Segundo avance)
                    System.out.println("\n--- AGREGAR PRODUCTO ---");
                    System.out.println("Seleccione el número del producto:");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.printf("%d. %s - $%.2f%n", (i+1), productos[i], precios[i]);
                    }
                    int seleccion = scanner.nextInt();

                    if (seleccion >= 1 && seleccion <= productos.length) {
                        System.out.println(" Producto agregado: " + productos[seleccion-1]);
                    } else {
                        System.out.println(" Selección inválida");
                    }
                    break;

                case 3:
                    System.out.println("\n--- CARRITO (Proximo avance) ---");
                    break;

                case 4:
                    salir = true;
                    System.out.println("Hasta pronto! 👋");
                    break;

                default:
                    System.out.println(" Opcion invalida");
            }
        } while (!salir);

        scanner.close();
    }
}
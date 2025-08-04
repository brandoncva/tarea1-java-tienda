import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        // Arreglos de productos y precios
        String[] productos = {"Laptop", "Telefono", "Tablet", "Auriculares", "Cargador"};
        double[] precios = {1200.99, 599.50, 299.99, 89.99, 19.99};

        // Nuevo: Carrito de compras (Tercer avance)
        String[] carrito = new String[10];
        double[] preciosCarrito = new double[10];
        int contadorCarrito = 0;

        do {
            System.out.println("\n=== MENU DE LA TIENDA ===");
            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver carrito y total a pagar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.printf("%d. %s - $%.2f%n", (i+1), productos[i], precios[i]);
                    }
                    break;

                case 2:
                    System.out.println("\n--- AGREGAR PRODUCTO ---");
                    System.out.println("Seleccione el numero del producto:");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.printf("%d. %s - $%.2f%n", (i+1), productos[i], precios[i]);
                    }
                    int seleccion = scanner.nextInt();

                    if (seleccion >= 1 && seleccion <= productos.length) {
                        if (contadorCarrito < carrito.length) {
                            carrito[contadorCarrito] = productos[seleccion-1];
                            preciosCarrito[contadorCarrito] = precios[seleccion-1];
                            contadorCarrito++;
                            System.out.println(" Producto agregado: " + productos[seleccion-1]);
                        } else {
                            System.out.println(" Carrito lleno (max 10 productos)");
                        }
                    } else {
                        System.out.println(" Seleccion invalida");
                    }
                    break;

                case 3:
                    // Nuevo: Mostrar carrito y total (Tercer avance)
                    System.out.println("\n--- CARRITO DE COMPRAS ---");
                    if (contadorCarrito == 0) {
                        System.out.println("Carrito vacio");
                    } else {
                        double total = 0;
                        for (int i = 0; i < contadorCarrito; i++) {
                            System.out.printf("%d. %s - $%.2f%n", (i+1), carrito[i], preciosCarrito[i]);
                            total += preciosCarrito[i];
                        }
                        System.out.printf("TOTAL A PAGAR: $%.2f%n", total);
                    }
                    break;

                case 4:
                    salir = true;
                    System.out.println("Hasta pronto!");
                    break;

                default:
                    System.out.println(" Opcion invalida");
            }
        } while (!salir);

        scanner.close();
    }
}
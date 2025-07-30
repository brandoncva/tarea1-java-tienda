import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Arreglos para productos y precios
        String[] productos = {"Laptop", "Teléfono", "Tablet", "Auriculares", "Cargador"};
        double[] precios = {1200.99, 599.50, 299.99, 89.99, 19.99};

        // Arreglo para el carrito de compras
        String[] carrito = new String[10];
        double[] preciosCarrito = new double[10];
        int contadorCarrito = 0;

        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        // Menú principal con do-while
        do {
            System.out.println("\n=== MENÚ DE LA TIENDA ===");
            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver carrito y total a pagar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            // Switch para manejar las opciones del menú
            switch (opcion) {
                case 1:
                    // Mostrar productos con for
                    System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.printf("%d. %s - $%.2f%n", (i+1), productos[i], precios[i]);
                    }
                    break;

                case 2:
                    // Agregar producto al carrito
                    System.out.println("\n--- AGREGAR PRODUCTO ---");
                    System.out.println("Seleccione el número del producto:");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.printf("%d. %s - $%.2f%n", (i+1), productos[i], precios[i]);
                    }

                    int seleccion = scanner.nextInt();
                    // Validar selección con if
                    if (seleccion >= 1 && seleccion <= productos.length) {
                        if (contadorCarrito < carrito.length) {
                            carrito[contadorCarrito] = productos[seleccion-1];
                            preciosCarrito[contadorCarrito] = precios[seleccion-1];
                            contadorCarrito++;
                            System.out.println("Producto agregado al carrito!");
                        } else {
                            System.out.println("El carrito está lleno!");
                        }
                    } else {
                        System.out.println("Selección inválida!");
                    }
                    break;

                case 3:
                    // Mostrar carrito y calcular total
                    System.out.println("\n--- CARRITO DE COMPRAS ---");
                    if (contadorCarrito == 0) {
                        System.out.println("El carrito está vacío.");
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
                    // Salir del sistema
                    salir = true;
                    System.out.println("Gracias por visitar nuestra tienda. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione 1-4.");
            }

        } while (!salir); // Continuar hasta que el usuario elija salir

        scanner.close();
    }
}
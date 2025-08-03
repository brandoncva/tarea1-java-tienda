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
            }
        }
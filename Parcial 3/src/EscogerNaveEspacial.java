import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EscogerNaveEspacial {
    private static List<NaveEspacial> inventarioNaves = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear una nave");
            System.out.println("2. Buscar una nave");
            System.out.println("3. Mostrar inventario de naves");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    crearNave(scanner);
                    break;
                case 2:
                    buscarNave(scanner);
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void crearNave(Scanner scanner) {
        System.out.println("Seleccione el tipo de nave:");
        System.out.println("1. Vehículo Lanzadera");
        System.out.println("2. Nave No Tripulada");
        System.out.println("3. Nave tripulada");
        System.out.println("4. Nave espacial de combate");
        System.out.println("5. Nave de exploracion");
        System.out.print("Ingrese el número correspondiente al tipo de nave: ");
        int tipoNave = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el país de origen de la nave: ");
        String pais = scanner.nextLine();

        System.out.print("Ingrese el peso kg de la nave: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la altura mt de la nave: ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese la capacidad de transporte de la nave: ");
        double capacidadTransporte = scanner.nextDouble();

        System.out.print("Ingrese la función de la nave: ");
        String funcion = scanner.nextLine();

        System.out.print("Ingrese los caballos de fuerza de la nave: ");
        int caballosFuerza = scanner.nextInt();

        System.out.print("La nave está destruida (true/false): ");
        boolean destruida = scanner.nextBoolean();

        switch (tipoNave) {
            case 1:
                System.out.print("Ingrese el número de pasajeros: ");
                int numPasajeros = scanner.nextInt();
                VehiculoLanzadera vehiculoLanzadera = new VehiculoLanzadera(pais, peso, altura, capacidadTransporte,
                        funcion, caballosFuerza, destruida, numPasajeros);
                inventarioNaves.add(vehiculoLanzadera);
                break;
            case 2:
                System.out.print("Ingrese el número de armas: ");
                int numArmas = scanner.nextInt();
                NavesNotripuladas navesNotripuladas = new NavesNotripuladas(pais, peso, altura, capacidadTransporte,
                        funcion, caballosFuerza, destruida, numArmas);
                inventarioNaves.add(navesNotripuladas);
                break;
            default:
                System.out.println("Tipo de nave inválido.");
                break;
        }

        System.out.println("La nave ha sido creada y añadida al inventario.");
    }

    private static void buscarNave(Scanner scanner) {
        System.out.println("Seleccione el criterio de búsqueda:");
        System.out.println("1. Por país de origen");
        System.out.println("2. Por función");
        System.out.print("Ingrese el número correspondiente al criterio de búsqueda: ");
        int criterio = scanner.nextInt();
        scanner.nextLine();

        switch (criterio) {
            case 1:
                System.out.print("Ingrese el país de origen: ");
                String pais = scanner.nextLine();
                buscarNavePorPais(pais);
                break;
            case 2:
                System.out.print("Ingrese la función: ");
                String funcion = scanner.nextLine();
                buscarNavePorFuncion(funcion);
                break;
            default:
                System.out.println("Criterio de búsqueda inválido.");
                break;
        }
    }

    private static void buscarNavePorPais(String pais) {
        List<NaveEspacial> navesEncontradas = new ArrayList<>();

        for (NaveEspacial nave : inventarioNaves) {
            if (nave.getPais().equalsIgnoreCase(pais)) {
                navesEncontradas.add(nave);
            }
        }

        mostrarNavesEncontradas(navesEncontradas);
    }

    private static void buscarNavePorFuncion(String funcion) {
        List<NaveEspacial> navesEncontradas = new ArrayList<>();

        for (NaveEspacial nave : inventarioNaves) {
            if (nave.getFuncion().equalsIgnoreCase(funcion)) {
                navesEncontradas.add(nave);
            }
        }

        mostrarNavesEncontradas(navesEncontradas);
    }

    private static void mostrarInventario() {
        System.out.println("Inventario de Naves:");

        for (NaveEspacial nave : inventarioNaves) {
            System.out.println(nave.getInfoNave());
        }
    }

    private static void mostrarNavesEncontradas(List<NaveEspacial> naves) {
        System.out.println("Naves encontradas:");

        if (naves.isEmpty()) {
            System.out.println("No se encontraron naves que coincidan con los criterios de búsqueda.");
        } else {
            for (NaveEspacial nave : naves) {
                System.out.println(nave.getInfoNave());
            }
        }
    }
}


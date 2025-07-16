import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidad.Cancion;
import interfaz.Reproductor;
import servicio.ReproductorCancion;
public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Cancion> canciones = new ArrayList<>();
        Reproductor reproductor = new ReproductorCancion();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n🎶 MENÚ BIBLIOTECA 🎶");
            System.out.println("1. Agregar canción");
            System.out.println("2. Mostrar canciones");
            System.out.println("3. Buscar canción");
            System.out.println("4. Eliminar canción");
            System.out.println("5. Reproducir canción");
            System.out.println("6. Pausar canción");
            System.out.println("7. Salir");
            System.out.print("Elige opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    reproductor.agregarCancion(canciones, new Cancion(titulo, artista, duracion));
                    break;

                case 2:
                    reproductor.mostrarCanciones(canciones);
                    break;

                case 3:
                    System.out.print("Título de canción a buscar: ");
                    String buscar = sc.nextLine();
                    reproductor.buscarCancion(canciones, buscar);
                    break;

                case 4:
                    System.out.print("Título de canción a eliminar: ");
                    String eliminar = sc.nextLine();
                    reproductor.eliminarCancion(canciones, eliminar);
                    break;

                case 5:
                    System.out.print("Número de canción: ");
                    int n1 = sc.nextInt();
                    if (n1 > 0 && n1 <= canciones.size()) {
                        reproductor.reproducir(canciones.get(n1 - 1));
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 6:
                    System.out.print("Número de canción: ");
                    int n2 = sc.nextInt();
                    if (n2 > 0 && n2 <= canciones.size()) {
                        reproductor.pausar(canciones.get(n2 - 1));
                    } else {
                        System.out.println(" Número inválido.");
                    }
                    break;

                case 7:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
        System.out.println("¡Gracias por usar la Biblioteca Musical!");
    }
    }

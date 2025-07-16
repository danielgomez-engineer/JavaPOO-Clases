package servicio;

import java.util.List;

import entidad.Cancion;
import interfaz.Reproductor;

public class ReproductorCancion implements Reproductor {

    @Override
    public void reproducir(Cancion cancion) {
        System.out.println(" Reproduciendo: " + cancion.getTitulo());
    }

    @Override
    public void pausar(Cancion cancion) {
        System.out.println("Pausando: " + cancion.getTitulo());
    }

    @Override
    public void mostrarCanciones(List<Cancion> canciones) {
        if (canciones.isEmpty()) {
            System.out.println("No hay canciones.");
        } else {
            for (int i = 0; i < canciones.size(); i++) {
                System.out.print((i + 1) + ". ");
                canciones.get(i).mostrarInfo();
            }
        }
    }

    @Override
    public void agregarCancion(List<Cancion> canciones, Cancion cancion) {
        canciones.add(cancion);
        System.out.println("Canción agregada.");
    }

    @Override
    public void eliminarCancion(List<Cancion> canciones, String titulo) {
        canciones.removeIf(c -> c.getTitulo().equalsIgnoreCase(titulo));
        System.out.println(" Canción eliminada si existía.");
    }

    @Override
    public void buscarCancion(List<Cancion> canciones, String titulo) {
        for (Cancion c : canciones) {
            if (c.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Canción encontrada:");
                c.mostrarInfo();
                return;
            }
        }
        System.out.println("Canción no encontrada.");
    }
}

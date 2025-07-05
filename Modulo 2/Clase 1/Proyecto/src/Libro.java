

public class Libro {
    
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;

    public Libro () {}

    public Libro (String titulo, String autor, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public String getIsbn() {
    return isbn;
}

public void setIsbn(String isbn) {
    this.isbn = isbn;
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public void actualizarPrecio(double precioNuevo) {
    if (precioNuevo > 0) {
        this.precio = precioNuevo;
        System.out.println("El precio ha sido actualizado a: $" + this.precio);
    } else {
        System.out.println("Error: El precio debe ser mayor que cero.");
    }
}

public double obtenerPrecioConIVA() { return precio * 1.19; }


@Override
public String toString() {
return String.format("""
        El autor es: %s
        El título es: %s
        El ISBN es: %s
        El precio es: %.2f
        """,
        autor,
        titulo,
        isbn,
        precio
);
}
}

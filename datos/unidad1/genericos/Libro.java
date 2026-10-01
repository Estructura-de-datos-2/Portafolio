package datos.unidad1.genericos;
public class Libro extends Producto<Integer> {

    public Libro(String nombre, double precio, Integer paginas) {
        super(nombre, precio, paginas);
    }

    @Override
    public void mostrarDetalles() {
        String datos = "Libro: " + super.nombre
                + " | Precio: $" + super.precio
                + " | Páginas: " + super.extra;
        System.out.println(datos);
    }
}

package datos.unidad1.genericos;
public class Electronicos extends Producto<String> {

    public Electronicos(String nombre, double precio, String garantia) {
        super(nombre, precio, garantia);
    }

    // Extrae el número de años del texto de la garantía ("2 años" -> 2)
    public int getAniosGarantia() {
        return Integer.parseInt(super.extra.trim().split(" ")[0]);
    }

    @Override
    public void mostrarDetalles() {
        String datos = "Electrónico: " + super.nombre
                + " | Precio: $" + super.precio
                + " | Garantía: " + super.extra;
        System.out.println(datos);
    }
}

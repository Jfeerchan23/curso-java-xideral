public class Tienda {
    private final MetodoPago metodoPago;

    // Inyección por constructor
    public Tienda(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarCompra(double total) {
        System.out.println("Procesando compra...");
        metodoPago.pagar(total);
    }
}

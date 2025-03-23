final public class Inyector {
    static void comprar(String tipoPago, double total) {
        MetodoPago metodo = switch (tipoPago.toLowerCase()) {
            case "tarjeta" -> new PagoTarjeta();
            case "paypal" -> new PagoPaypal();
            case "efectivo" -> new PagoEfectivo();
            default -> throw new IllegalArgumentException("Método de pago no válido");
        };

        Tienda tienda = new Tienda(metodo);  // Inyectamos la dependencia aquí
        tienda.realizarCompra(total);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE MÉTODOS DE PAGO\n");
        Inyector.comprar("tarjeta", 100.0);
        Inyector.comprar("paypal", 50.0);
        Inyector.comprar("efectivo", 25.0);
    }


}
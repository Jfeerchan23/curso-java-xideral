public class Cuadrado implements Figura{
    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}

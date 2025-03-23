import java.util.Arrays;

public class Triangulo implements Figura{
    double[] lados;

    public Triangulo(double[] lados) {
        if (lados.length != 3) {
            throw new IllegalArgumentException("Un triángulo debe tener 3 lados.");
        }
        if (!esTrianguloValido(lados)) {
            throw new IllegalArgumentException("Los lados no forman un triángulo válido.");
        }
        this.lados = lados;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2]));
    }

    @Override
    public double calcularPerimetro() {
        return lados[0] + lados[1] + lados[2];
    }

    private boolean esTrianguloValido(double[] l) {
        return (l[0] + l[1] > l[2]) &&
                (l[0] + l[2] > l[1]) &&
                (l[1] + l[2] > l[0]);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lados=" + Arrays.toString(lados) +
                '}';
    }
}

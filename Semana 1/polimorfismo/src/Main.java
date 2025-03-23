//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE  CÁLCULO DE ÁREAS Y PERÍMETROS DE FIGURAS GEOMÉTRICAS\n");

        show(
                new Cuadrado(10),
                new Circulo(5),
                new Triangulo(new double[]{10, 10, 10}),
                new Pentagono(5));
    }

    static void show(Figura... figuras) {
        for (Figura figura : figuras) {
            System.out.println(figura.toString());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println('\n');
        }
    }

}
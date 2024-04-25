import geometria.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Quadrado quadrado = new Quadrado(3, 3, "Quadrado");
        System.out.println(quadrado);
        System.out.println(quadrado.calcularArea());
        Circulo circulo = new Circulo(3, 3, 5);
        System.out.println(circulo);
        System.out.println(circulo.calcularArea());
        Triangulo triangulo = new Triangulo(2, 2, "Equilátero");
        System.out.println(triangulo);
        System.out.println(triangulo.calcularArea());

    }
}

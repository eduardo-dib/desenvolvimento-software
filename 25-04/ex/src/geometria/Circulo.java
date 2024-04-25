package geometria;

public class Circulo extends Formas{
    private double circunferencia;

    public Circulo(double base, double altura, double circunferencia) {
        super(base, altura);
        this.circunferencia = circunferencia;
    }

    public double calcularArea(){
        double raio = circunferencia / (2 * Math.PI);
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia(){
        return this.getCircunferencia();
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo [base=" + base + ", altura=" + altura + ", circunferencia=" + circunferencia + "]";
    }
}

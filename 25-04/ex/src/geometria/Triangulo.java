package geometria;

public class Triangulo extends Formas {
    private String tipo;

    public Triangulo(double base, double altura, String tipo) {
        super(base, altura);
        this.tipo = tipo;
    }

    public double calcularArea(){
        return (this.getAltura() * this.getBase()) / 2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", tipo=" + tipo + ", altura=" + altura + ", calcularArea()="
                + calcularArea() + "]";
    }
}

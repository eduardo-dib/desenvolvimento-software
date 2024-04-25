package geometria;

public class Quadrado extends Formas {
    private String cor;

    public Quadrado(double base, double altura, String cor) {
        super(base, altura);
        this.cor = cor;
    }

    public double calcularArea(){
        return this.getAltura() * this.getBase();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Quadrado [base=" + base + ", cor=" + cor + ", altura=" + altura + ", calcularArea()=" + calcularArea()
                + "]";
    }
}

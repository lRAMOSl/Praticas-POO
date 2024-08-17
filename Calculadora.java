public class Calculadora {

    private float a;
    private float b;

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float soma() {
        return a + b;

    }

    public float subtracao() {
        return a - b;

    }

    public float multiplicacao() {
        return a * b;

    }

    public float divisao() {
        return a / b;

    }

}

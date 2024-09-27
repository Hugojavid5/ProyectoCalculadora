package org.example.proyectocalculadora;

/**
 * Clase Operaciones que contiene métodos para realizar operaciones matemáticas básicas:
 * suma, resta, multiplicación y división.
 */
public class Operaciones {
    private double a;
    private double b;

    /**
     * Constructor que inicializa los operandos de la operación.
     * @param a El primer operando.
     * @param b El segundo operando.
     */
    public Operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Obtiene el valor del primer operando.
     * @return El valor del primer operando.
     */
    public double getA() {
        return a;
    }

    /**
     * Establece el valor del primer operando.
     * @param a El nuevo valor del primer operando.
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Obtiene el valor del segundo operando.
     * @return El valor del segundo operando.
     */
    public double getB() {
        return b;
    }

    /**
     * Establece el valor del segundo operando.
     * @param b El nuevo valor del segundo operando.
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Suma los dos operandos.
     * @return La suma de a y b.
     */
    public double sumar() {
        return a + b;
    }

    /**
     * Resta los dos operandos.
     * @return La resta de a menos b.
     */
    public double restar() {
        return a - b;
    }

    /**
     * Multiplica los dos operandos.
     * @return El producto de a y b.
     */
    public double multiplicar() {
        return a * b;
    }

    /**
     * Divide el primer operando entre el segundo.
     * @return El resultado de la división de a entre b.
     * @throws ArithmeticException Si el segundo operando es cero.
     */
    public double dividir() {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return a / b;
    }
}

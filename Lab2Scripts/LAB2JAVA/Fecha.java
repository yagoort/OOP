public class Fecha {
    private int dd;
    private int mm;
    private int aa;

    // Constructor por defecto
    public Fecha() {
        this.dd = 1;
        this.mm = 1;
        this.aa = 2000;
    }

    // Constructor con parámetros
    public Fecha(int dd, int mm, int aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    // Setters
    public void setDia(int dd) {
        this.dd = dd;
    }

    public void setMes(int mm) {
        this.mm = mm;
    }

    public void setA(int aa) {
        this.aa = aa;
    }

    // Getters
    public int getDia() {
        return dd;
    }

    public int getMes() {
        return mm;
    }

    public int getA() {
        return aa;
    }

    // Método toString
    public String toString() {
        return String.format("%02d - %02d - %04d", dd, mm, aa);
    }
}

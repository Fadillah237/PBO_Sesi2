/**
 * Persegi
 */
public class Persegi {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
        System.out.println("Sisi persegi adalah " + sisi);
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
        System.out.println("Sisi persegi diubah menjadi " + sisi);
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }
}

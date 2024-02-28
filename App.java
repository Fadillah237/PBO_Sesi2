public class App {
    public static void main(String[] args) {
        Persegi persegiA = new Persegi(10);
        double kelilingPersegiBefore = persegiA.getKeliling();
        double luasPersegiBefore = persegiA.getLuas();

        System.out.println("Keliling persegi sebelum diubah: " + kelilingPersegiBefore);
        System.out.println("Luas persegi sebelum diubah: " + luasPersegiBefore + "\n");

        persegiA.setSisi(5);
        double kelilingPersegiAfter = persegiA.getKeliling();
        double luasPersegiAfter = persegiA.getLuas();

        System.out.println("Keliling persegi setelah diubah: " + kelilingPersegiAfter);
        System.out.println("Luas persegi setelah diubah: " + luasPersegiAfter + "\n");

        Books book1 = new Books("Udin", "Artificial Intelligence", 20000, 1);
        Books book2 = new Books("Ujag", "Machine Learning", 10000, 2);

        double totalPrice = book1.buyBooks(2) + book2.buyBooks(3);
        System.out.println("\nTotal yang harus dibayar Rp." + totalPrice);
    }
}

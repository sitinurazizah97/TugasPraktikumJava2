public class SepatuYangDisukai {
    public static void main(String[] args) {

        Sepatu sepatu1 = new Sepatu();
        sepatu1.merk = "Adidas";
        sepatu1.jenis = "Sneakers";
        sepatu1.warna = "Abu-abu";
        sepatu1.nomor = 39;
        sepatu1.harga = 400000;
        sepatu1.cetakInfo();

        Sepatu sepatu2 = new Sepatu();
        sepatu2.merk = "Jimmy Choo";
        sepatu2.jenis = "Wedges";
        sepatu2.warna = "Hitam";
        sepatu2.nomor = 40;
        sepatu2.harga = 250000;
        sepatu2.cetakInfo();

        Sepatu sepatu3 = new Sepatu();
        sepatu3.merk = "Rubi";
        sepatu3.jenis = "Flatshoes";
        sepatu3.warna = "Pink";
        sepatu3.nomor = 38;
        sepatu3.harga = 200000;
        sepatu3.cetakInfo();
    }
}
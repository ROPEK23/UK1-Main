// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Objek-objek dari kelas anak
        Jus jusMangga = new Jus("Jus Mangga", "Manis", "Mangga");
        Teh tehHijau = new Teh("Teh Hijau", "Tawar", "Panas");
        Soda sodaLemon = new Soda("Soda Lemon", "Asam", "Tinggi");

        // Polimorfisme: memanggil method yang di-overriding oleh masing-masing kelas anak
        System.out.println(jusMangga.info());
        System.out.println(tehHijau.info());
        System.out.println(sodaLemon.info());

        // Menggunakan setter dan getter
        jusMangga.setBuah("Jeruk");
        System.out.println(jusMangga.getNama() + " sekarang adalah jus dari buah " + jusMangga.getBuah());

        tehHijau.setSuhu("Dingin");
        System.out.println(tehHijau.getNama() + " sekarang disajikan dalam kondisi " + tehHijau.getSuhu());

        sodaLemon.setKarbonasi("Sedang");
        System.out.println(sodaLemon.getNama() + " sekarang memiliki tingkat karbonasi " + sodaLemon.getKarbonasi());
    }
}

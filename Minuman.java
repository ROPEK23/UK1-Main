public class Minuman {
    private String nama;
    private String rasa;

    // Constructor
    public Minuman(String nama, String rasa) {
        this.nama = nama;
        this.rasa = rasa;
    }

    // Overloading Constructor
    public Minuman() {
        this("Tidak Diketahui", "Tidak Diketahui");
    }

    // Getter dan Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Getter dan Setter untuk rasa
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    // Method umum untuk info minuman
    public String info() {
        return "Minuman " + nama + " dengan rasa " + rasa;
    }
}


/**
 * Kelas Mahasiswa yang berfungsi untuk menyimpan informasi mahasiswa.
 * Kelas ini menyimpan data nama dan NIM (Nomor Induk Mahasiswa) untuk setiap
 * objek Mahasiswa yang dibuat.
 */
public class Mahasiswa {

    private String nama;
    private String nim;

    /**
     * Constructor untuk menginisialisasi nama dan NIM.
     *
     * @param nama Nama mahasiswa.
     * @param nim NIM mahasiswa.
     * @throws IllegalArgumentException jika nama atau nim kosong, untuk
     * memastikan bahwa setiap objek Mahasiswa memiliki data yang valid
     */
    public Mahasiswa(String nama, String nim) {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong.");
        }
        if (nim == null || nim.isEmpty()) {
            throw new IllegalArgumentException("NIM tidak boleh kosong.");
        }
        this.nama = nama;
        this.nim = nim;
    }

    /**
     * Menampilkan nama dan NIM mahasiswa.
     */
    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    /**
     * Metode utama (main) untuk melakukan pengujian sederhana pada kelas
     * Mahasiswa.
     *
     * @param args Argumen baris perintah yang tidak digunakan dalam program
     * ini.
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("ラヴィ・アズーラ・プトラ", "10121015");
        mahasiswa.tampilData();
    }
}

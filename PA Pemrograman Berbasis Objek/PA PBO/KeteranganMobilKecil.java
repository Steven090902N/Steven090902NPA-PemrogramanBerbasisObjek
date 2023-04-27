public class KeteranganMobilKecil extends DataPembeli {
    boolean Keterangan;

    public KeteranganMobilKecil(String nama, int tanggallahir, String alamat, String namamobil,
            boolean Keterangan) {
        super(nama, tanggallahir, alamat, namamobil);
        this.Keterangan = Keterangan;
    }

    public boolean Keterangan() {
        return Keterangan;
    }

    public void setKeterangan(boolean Keterangan) {
        this.Keterangan = Keterangan;
    }

    public void getketerangan() {
        if (Keterangan == true) {
            System.out.print("Keterangan Unit \t\t\t : Ready\n");

        } else {
            System.out.print("Keterangan Unit \t\t\t : Inden\n");
        }
    }
}
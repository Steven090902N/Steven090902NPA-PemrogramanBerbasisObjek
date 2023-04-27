public abstract class DataPembeli {
    protected final String PT = "PT.INDONESIA PRATAMA";
    protected String nama;
    protected int tanggallahir;
    protected String alamat;
    protected String namamobil;

    public DataPembeli(String nama, int tanggallahir, String alamat, String namamobil) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggallahir = tanggallahir;
        this.namamobil = namamobil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public int gettanggallahir() {
        return tanggallahir;
    }

    public void settanggallahir(int tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getnamamobil() {
        return namamobil;
    }

    public void setnamamobil(String namamobil) {
        this.namamobil = namamobil;
    }

    public void notif() {
        System.out.println("Data pembeli dengan nama " + nama + " berhasil di tambah. ");
    }

    public void tampil() {
        System.out.println("\t\t" + PT);
        System.out.println(" Terimakasih Telah Memesan ");
        System.out.println("Nama \t\t\t\t\t : " + nama);
        System.out.println("Alamat \t\t\t\t\t : " + alamat);
        System.out.println("Tanggal/Bulan/Tahun \t\t\t : " + tanggallahir);
        System.out.println("Nama Mobil\t\t\t\t : " + namamobil);
    }
}
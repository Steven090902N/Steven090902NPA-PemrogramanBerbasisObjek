public class MobilKecil extends DataPembeli {
    private String status = "Belum Spk";
    final String kelebihan = "Tidak Bisa Di-Segala Medan";
    final String StatusSpk = "Sudah Dimiliki";
    boolean isRegistered;

    public MobilKecil(String nama, int tanggallahir, String alamat, String namamobil,
            boolean isRegistered) {
        super(nama, tanggallahir, alamat, namamobil);
        this.isRegistered = isRegistered;
    }

    public String getstatuS() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setisRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public void getMobilKecil() {
        if (isRegistered == true) {
            System.out.println("Karyawan Yang Ber-Tanggung Jawab \t : Hendy Budimant");

        } else {
            System.out.println("Karyawan Yang Ber-Tanggung Jawab \t : Ari Erlangga");
        }
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Kelebihan Mobil \t\t\t : " + kelebihan);
        System.out.println("Status Spk(Surat Pemilik Kendaraan) \t : " + StatusSpk);
    }

    // overloading
    public void tampil(boolean showID) {
        if (showID)
            tampil();
        else
            super.tampil();
    }

}

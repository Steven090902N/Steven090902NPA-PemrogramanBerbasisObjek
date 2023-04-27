public class MobilBesar extends DataPembeli {
    private String status = "MobilBesar";
    final String kelebihan = "Bisa Di-Segala Medan";
    final String StatusSpk = "Sudah Dimiliki";
    boolean isRegistered;

    public MobilBesar(String nama, int tanggallahir, String alamat, String namamobil,
            boolean isRegistered) {
        super(nama, tanggallahir, alamat, namamobil);
        this.isRegistered = isRegistered;

    }

    public String getstatuS() {
        return status;
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

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setisRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public void getMobilBesar() {
        if (isRegistered == true) {
            System.out.print("Karyawan Yang Ber-Tanggung Jawab \t : Ujang Septianus");

        } else {
            System.out.print("Karyawan Yang Ber-Tanggung Jawab \t : Saipul Bastian");
        }
    }

}

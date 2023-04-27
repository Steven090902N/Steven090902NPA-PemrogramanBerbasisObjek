public class BayarMobilKecil extends DataPembeli {
    private String status = "bayar";
    boolean jenisbayar;

    public BayarMobilKecil(String nama, int tanggallahir, String alamat, String namamobil, boolean jenisbayar) {
        super(nama, tanggallahir, alamat, namamobil);
        this.jenisbayar = jenisbayar;
    }

    public String getstatuS() {
        return status;
    }

    public boolean jenisbayar() {
        return jenisbayar;
    }

    public void setjenisbayar(Boolean jenisbayar) {
        this.jenisbayar = jenisbayar;
    }

    public void getjenisbayar() {
        if (jenisbayar == true) {
            System.out.print("Status Pembayaran \t\t\t : Bulanan\n");

        } else {
            System.out.print("Status Pembayaran \t\t\t : Lunas\n");
        }
    }

}
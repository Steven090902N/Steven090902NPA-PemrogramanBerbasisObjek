import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PenjualanMobil {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    static ArrayList<MobilBesar> listSpk = new ArrayList<>();
    static ArrayList<MobilKecil> listTakSpk = new ArrayList<>();
    static ArrayList<BayarMobilBesar> listByr = new ArrayList<>();
    static ArrayList<BayarMobilKecil> listByrB = new ArrayList<>();
    static ArrayList<KeteranganMobilBesar> listmblB = new ArrayList<>();
    static ArrayList<KeteranganMobilKecil> listmblk = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        Admin User = new Admin();
        User.admin();
        System.out.println("|==================================================================|");
        System.out.println("|                    SISTEM PENJUALAN MOBIL                        |");
        System.out.println("|                     PT.INDONESIA PRATAMA                         |");
        System.out.println("|==================================================================|");
        System.out.println("|==================================================================|");
        System.out.println("|                SILAHKAN LOGIN TERLEBIH DAHULU                    |");
        System.out.println("|==================================================================|");
        System.out.print("\t Username : ");
        String uname = br.readLine();
        System.out.print("\t Password : ");
        String pass = br.readLine();
        System.out.println("|==================================================================|\n\n");
        boolean admin;

        while (!uname.equals(User.getUsername()) || !pass.equals(User.getPassword())) {
            System.err.println("Username atau Password anda salah ");
            System.err.print("\nUsername :");
            uname = br.readLine();
            System.err.print("\nPassword : ");
            pass = br.readLine();
        }

        admin = true;

        menu(admin);
    }

    public static void menu(boolean getadmin) throws IOException {
        while (true) {
            System.out.print(
                    " 1. Tambah Data pembeli \n 2. Melihat Data Pembeli \n 3. Ubah Data Pembeli \n 4. Hapus Data Pembeli \n 5. Keluar \n Masukkan Pilihan Anda : ");
            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1 -> tambah();
                case 2 -> lihatData();
                case 3 -> ubah();
                case 4 -> hapus();
                case 5 -> System.exit(0);
                default -> System.out.println("PILIHAN SALAH!");
            }
            System.out.println("\n\n");

        }
    }

    static void tambah() throws IOException {
        System.out.print(
                "\nPilih Jenis Mobil SUV(Mobil Besar) / LCGC(Mobil Kecil) :  \n 1. SUV\n 2. LCGC  \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            System.out.print("Masukkan Nama Pembeli \t\t\t: ");
            String nama = br.readLine();

            System.out.print("Masukkan Tanggal-Bulan-Tahun Lahir \t: ");
            int tanggallahir = Integer.parseInt(br.readLine());

            System.out.print("Masukkan Alamat \t\t\t: ");
            String alamat = br.readLine();

            System.out.print("Pilih Nama Mobil Yang Di-Pilih : \n");
            System.out.print("1. Toyota Fortuner \n");
            System.out.print("2. Mitsubishi Pajero Sport \n");
            System.out.print("3. Nissan Xtrail \n");
            System.out.print("masukan pilihan Anda : ");
            int mobil = Integer.parseInt(br.readLine());

            String namamobil = "";

            switch (mobil) {
                case 1:
                    namamobil = "Toyota Fortuner \nHarga\t\t\t\t\t : Rp.600.000.000";
                    break;
                case 2:
                    namamobil = "Mitsubishi Pajero Sport \nHarga\t\t\t\t\t : Rp.800.000.000";
                    break;
                case 3:
                    namamobil = "Nissan Xtrail \nHarga\t\t\t\t\t : Rp.400.000.000";
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    return;
            }

            System.out.print(
                    "Keterangan Unit : \n 1. Ready  \n 2. Inden \n masukan pilihan Anda :");
            int keterangan = Integer.parseInt(br.readLine());

            if (keterangan == 1) {
                KeteranganMobilBesar ktrA = new KeteranganMobilBesar(nama, tanggallahir, alamat, namamobil, true);
                listmblB.add(ktrA);
            } else if (keterangan == 2) {
                KeteranganMobilBesar krnA = new KeteranganMobilBesar(nama, tanggallahir, alamat, namamobil, false);
                listmblB.add(krnA);
            }

            System.out.print(
                    "status Pembayaran : \n 1. Bulanan  \n 2. Lunas \n masukan pilihan Anda :");
            int bayar = Integer.parseInt(br.readLine());

            if (bayar == 1) {
                BayarMobilBesar byrA = new BayarMobilBesar(nama, tanggallahir, alamat, namamobil, true);
                listByr.add(byrA);
            } else if (bayar == 2) {
                BayarMobilBesar byrA = new BayarMobilBesar(nama, tanggallahir, alamat, namamobil, false);
                listByr.add(byrA);
            }

            System.out.print(
                    "Karyawan Yang Ber-Tanggung Jawab : \n 1. Ujang Septianus  \n 2. Saipul Bastian \n masukan pilihan Anda :");
            int isregis = Integer.parseInt(br.readLine());

            if (isregis == 1) {
                MobilBesar mblA = new MobilBesar(nama, tanggallahir, alamat, namamobil, true);
                listSpk.add(mblA);
                mblA.notif();
            } else if (isregis == 2) {
                MobilBesar mblA = new MobilBesar(nama, tanggallahir, alamat, namamobil, false);
                listSpk.add(mblA);
                mblA.notif();
            }

        } else if (pil == 2) {
            System.out.print("Masukkan Nama Pembeli \t\t\t: ");
            String nama = br.readLine();

            System.out.print("Masukkan Tanggal-Bulan-Tahun Lahir \t: ");
            int tanggallahir = Integer.parseInt(br.readLine());

            System.out.print("Masukkan Alamat \t\t\t: ");
            String alamat = br.readLine();

            System.out.print("Pilih Nama Mobil Yang Di-Pilih : \n");
            System.out.print("1. Toyota Avanza \n");
            System.out.print("2. Toyota Agya \n");
            System.out.print("3. Wuling Air EV \n");
            System.out.print("masukan pilihan Anda : ");
            int mobil = Integer.parseInt(br.readLine());

            String namamobil = "";

            switch (mobil) {
                case 1:
                    namamobil = "Toyota Avanza \nHarga\t\t\t\t\t : Rp.200.000.000";
                    break;
                case 2:
                    namamobil = "Toyota Agya \nHarga\t\t\t\t\t : Rp.180.000.000";
                    break;
                case 3:
                    namamobil = "Wuling Air EV \nHarga\t\t\t\t\t : Rp.250.000.000";
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    return;
            }

            System.out.print(
                    "Keterangan Unit : \n 1. Ready  \n 2. Inden \n masukan pilihan Anda :");
            int keterangan = Integer.parseInt(br.readLine());

            if (keterangan == 1) {
                KeteranganMobilKecil ktrA = new KeteranganMobilKecil(nama, tanggallahir, alamat, namamobil, true);
                listmblk.add(ktrA);
            } else if (keterangan == 2) {
                KeteranganMobilKecil krnA = new KeteranganMobilKecil(nama, tanggallahir, alamat, namamobil, false);
                listmblk.add(krnA);
            }

            System.out.print(
                    "Jenis Pembayaran : \n 1. Bulanan  \n 2. Lunas \n masukan pilihan Anda :");
            int bayar = Integer.parseInt(br.readLine());

            if (bayar == 1) {
                BayarMobilKecil byrB = new BayarMobilKecil(nama, tanggallahir, alamat, namamobil, true);
                listByrB.add(byrB);
            } else if (bayar == 2) {
                BayarMobilKecil byrB = new BayarMobilKecil(nama, tanggallahir, alamat, namamobil, false);
                listByrB.add(byrB);
            }

            System.out.print(
                    "Karyawan Yang Ber-Tanggung Jawab : \n 1. Hendy Budimant \n 2. Ari Erlangga \n masukan pilihan Anda :");
            int isregis = Integer.parseInt(br.readLine());

            if (isregis == 1) {
                MobilKecil mblA = new MobilKecil(nama, tanggallahir, alamat, namamobil, true);
                listTakSpk.add(mblA);
                mblA.notif();
            } else if (isregis == 2) {
                MobilKecil mblA = new MobilKecil(nama, tanggallahir, alamat, namamobil, false);
                listTakSpk.add(mblA);
                mblA.notif();
            }

        } else {
            System.out.println("Yang Dimasukan Salah");
        }
    }

    static void lihatData() throws IOException {
        System.out.println("lihat data pembeli SUV / LCGC : \n 1. SUV \n 2. LCGC \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            if (listSpk.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                System.out.println("\n");
                for (int i = 0; i < listSpk.size(); i++) {
                    System.out.println("\nData indeks ke-" + (i + 1));
                    listSpk.get(i).tampil();
                    listmblB.get(i).getketerangan();
                    listByr.get(i).getjenisbayar();
                    listSpk.get(i).getMobilBesar();
                }
            }
        } else if (pil == 2) {
            if (listTakSpk.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                System.out.println("\n");
                for (int i = 0; i < listTakSpk.size(); i++) {
                    System.out.println("\nData indeks ke-" + (i + 1));
                    listTakSpk.get(i).tampil();
                    listmblk.get(i).getketerangan();
                    listByrB.get(i).getjenisbayar();
                    listTakSpk.get(i).getMobilKecil();
                }
            }
        }
    }

    static void ubah() throws IOException {
        System.out
                .print("\nPilih Jenis Mobil SUV(Mobil Besar) / LCGC(Mobil Kecil) Yang Mau DiUbah :  \n 1. SUV\n 2. LCGC  \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            lihatData();
            System.out.print("\nMau Ubah Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            System.out.print("\nNama Pembeli Baru: ");
            listSpk.get(pilihan).setNama(br.readLine());

            System.out.print("Tanggal/Bulan/Tahun Lahir Baru: ");
            listSpk.get(pilihan).settanggallahir(Integer.parseInt(br.readLine()));

            System.out.print("Masukan Alamat Baru: ");
            listSpk.get(pilihan).setalamat(br.readLine());

            System.out.print("Pilih Nama Mobil Yang Di-Pilih : \n");
            System.out.print("1. Toyota Fortuner \n");
            System.out.print("2. Mitsubishi Pajero Sport \n");
            System.out.print("3. Nissan Xtrail \n");
            System.out.print("masukan pilihan Anda : ");
            int mobil = Integer.parseInt(br.readLine());

            String namamobil = "";

            switch (mobil) {
                case 1:
                    namamobil = "Toyota Fortuner \nHarga\t\t\t\t\t : Rp.600.000.000";
                    break;
                case 2:
                    namamobil = "Mitsubishi Pajero Sport \nHarga\t\t\t\t\t : Rp.800.000.000";
                    break;
                case 3:
                    namamobil = "Nissan Xtrail \nHarga\t\t\t\t\t : Rp.400.000.000";
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    return;
            }
            listSpk.get(pilihan).setnamamobil(namamobil);

            System.out.print("\nData Berhasil Diubah...");
        } else if (pil == 2) {
            lihatData();
            System.out.print("\nMau Ubah Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            System.out.print("Nama Pembeli Baru: ");
            listTakSpk.get(pilihan).setNama(br.readLine());

            System.out.print("Pilih Nama Mobil Yang Di-Pilih : \n");
            System.out.print("1. Toyota Avanza \n");
            System.out.print("2. Toyota Agya \n");
            System.out.print("3. Wuling Air EV \n");
            System.out.print("masukan pilihan Anda : ");
            int mobil = Integer.parseInt(br.readLine());

            String namamobil = "";

            switch (mobil) {
                case 1:
                    namamobil = "Toyota Avanza \nHarga\t\t\t\t\t : Rp.200.000.000";
                    break;
                case 2:
                    namamobil = "Toyota Agya \nHarga\t\t\t\t\t : Rp.180.000.000";
                    break;
                case 3:
                    namamobil = "Wuling Air EV \nHarga\t\t\t\t\t : Rp.250.000.000";
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    return;
            }
            listTakSpk.get(pilihan).setnamamobil(namamobil);

            System.out.print("Masukkan Tanggal Lahir Baru: ");
            listTakSpk.get(pilihan).settanggallahir(Integer.parseInt(br.readLine()));

            System.out.print("Alamat Baru \t\t: ");
            listTakSpk.get(pilihan).setalamat(br.readLine());

            System.out.print("\nData Berhasil Diubah...");
        }

    }

    static void hapus() throws IOException {
        System.out.print(
                "\nPilih Jenis Mobil SUV(Mobil Besar) / LCGC(Mobil Kecil) Yang Mau Dihapus :  \n 1. SUV\n 2. LCGC  \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            lihatData();
            System.out.print("\nMau Hapus Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            listSpk.remove(pilihan);
            System.out.println("\nData Berhasil Dihapus");
        } else if (pil == 2) {
            lihatData();
            System.out.print("\nMau Hapus Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            listTakSpk.remove(pilihan);
            System.out.println("\nData Berhasil Dihapus");
        }

    }
}

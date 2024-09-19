package bangunruang;

import java.util.Scanner;

public class Inheritance_Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bola bola = new Bola();
        Balok balok = new Balok();
        Kubus kubus = new Kubus();
        LimasSegitiga limasSegitiga = new LimasSegitiga();
        BangunRuang bangunRuang = new BangunRuang();

        System.out.println("1. Volume Bola");
        System.out.println("2. Luas Permukaan bola");
        System.out.println("3. Volume Kubus");
        System.out.println("4. Luas Permukaan Kubus");
        System.out.println("5. Volume Balok");
        System.out.println("6. Luas Permukaan Balok");
        System.out.println("7. Volume Limas Segitiga");
        System.out.println("8. LuasPermukaan LimasSegitiga");
        System.out.print("Yang ingin dihitung : ");
        int pilih = scanner.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan Jari jari : ");
                bola.r = scanner.nextFloat();
                bola.volume();
                break;

            case 2:
                System.out.print("Masukkan Jari jari : ");
                bola.r = scanner.nextFloat();
                bola.LuasPermukaan();
                break;

            case 3:
                System.out.print("Masukkan Sisi : ");
                kubus.s = scanner.nextFloat();
                kubus.volume();
                break;

            case 4:
                System.out.print("Masukkan Sisi : ");
                kubus.s = scanner.nextFloat();
                kubus.LuasPermukaan();
                break;

            case 5:
                System.out.print("Masukkan Panjang : ");
                balok.p = scanner.nextFloat();
                System.out.print("Masukkan Lebar : ");
                balok.l = scanner.nextFloat();
                System.out.print("Masukkan Tinggi : ");
                balok.t = scanner.nextFloat();
                balok.volume();
                break;

            case 6:
                System.out.print("Masukkan Panjang : ");
                balok.p = scanner.nextFloat();
                System.out.print("Masukkan Lebar : ");
                balok.l = scanner.nextFloat();
                System.out.print("Masukkan Tinggi : ");
                balok.t = scanner.nextFloat();
                balok.LuasPermukaan();
                break;

            case 7:
                System.out.print("Masukkan Alas : ");
                limasSegitiga.a = scanner.nextFloat();
                System.out.print("Masukkan Tinggi Limas : ");
                limasSegitiga.tl = scanner.nextFloat();
                System.out.print("Masukkan Tinggi Segitiga : ");
                limasSegitiga.ts = scanner.nextFloat();
                limasSegitiga.volume();
                break;

            case 8:
                System.out.print("Masukkan Alas : ");
                limasSegitiga.a = scanner.nextFloat();
                System.out.print("Masukkan Tinggi Limas : ");
                limasSegitiga.tl = scanner.nextFloat();
                System.out.print("Masukkan Tinggi Segitiga : ");
                limasSegitiga.ts = scanner.nextFloat();
                System.out.println("Masukkan Luas Sisi Tegak");
                limasSegitiga.lst = scanner.nextFloat();
                limasSegitiga.LuasPermukaan();
                break;
                
        }
    }
}

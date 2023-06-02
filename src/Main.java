import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ho dan: ");
        int soHoDan = scanner.nextInt();
        KhuPho khuPho = new KhuPho(soHoDan);


        for (int i = 0; i < soHoDan; i++){
            System.out.println("Nhap thong tin cho ho dan thu " + (i + 1) );
            System.out.println("Nhap so nha: ");
            Scanner scanner1 = new Scanner(System.in);
            int soNha = scanner1.nextInt();
            System.out.println("Nhap so thanh vien: ");
            Scanner scanner2 = new Scanner(System.in);
            int soThanhVien = scanner2.nextInt();
            HoGiaDinh hoGiaDinh = new HoGiaDinh(soNha,soThanhVien);

            for (int j = 0; j < soThanhVien; j++){
                System.out.println("Nhap thong tin cho thanh vien thu " + (j + 1));
                System.out.println("Nhap ho ten: ");
                Scanner scanner3 = new Scanner(System.in);
                String hoTen = scanner3.nextLine();
                System.out.println("Nhap tuoi: ");
                Scanner scanner4 = new Scanner(System.in);
                int tuoi = scanner4.nextInt();
                System.out.println("Nhap nam sinh: ");
                Scanner scanner5 = new Scanner(System.in);
                int namSinh = scanner5.nextInt();
                System.out.println("Nhap nghe nghiep: ");
                Scanner scanner6 = new Scanner(System.in);
                String ngheNghiep = scanner6.nextLine();
                Nguoi nguoi = new Nguoi(hoTen,tuoi,namSinh,ngheNghiep);
                hoGiaDinh.ThemThanhVien(nguoi);

                khuPho.ThemHoDan(hoGiaDinh);
            }
        }
        khuPho.HienThiKhuPho();
    }
}
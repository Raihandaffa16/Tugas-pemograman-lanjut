/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pemograman.lanjut;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PenentuanNIM {

public static void main(String[] args) {
  int a,b,c,d,e,f;


Scanner scan = new Scanner(System.in);

System.out.println(" >>> Membuat NIM <<<");
System.out.println("Silahlah ISI bagian berikut : ");
System.out.println("S1 = 1 ");
System.out.println("S2 = 2 ");
System.out.println("S3 = 3 ");
System.out.println("|_________________________________|");
System.out.println("masukan no jenjang =  ");
a = scan.nextInt();
System.out.println("2020 = 20 ");
System.out.println("2019 = 19 ");
System.out.println("2018 = 18 ");
System.out.println("|_________________________________|");
System.out.println("masukan no tahun masuk  =  ");
b = scan.nextInt();
System.out.println("Tarbiyah dan keguruan = 1");
System.out.println("USHULUDDIN = 2");
System.out.println(" PSIKOLOGI = 3");
System.out.println("EKONOMI DAN ILMU SOSIAL = 4");
System.out.println("Sains dan Teknologi = 5");
System.out.println("SYARIAH DAN ILMU HUKUM = 6");
System.out.println("DAKWAH DAN ILMU KOMUNIKASI = 7");
System.out.println("PERTANIAN DAN PETERNAKAN = 8");
System.out.println("pasca sarjana = 9");
System.out.println("|_________________________________|");
System.out.println("masukan no fakultas =  ");
c = scan.nextInt();
System.out.println("Teknik Informatka = 01");
System.out.println("Sistem Informasi = 02");
System.out.println("Teknik Elektro = 03");
System.out.println("Teknik Industri = 04");
System.out.println("Matematika Terapan = 05");
System.out.println("|_________________________________|");
System.out.println("masukan no jurusan =  ");
d = scan.nextInt();
System.out.println("Laki-Laki = 146");
System.out.println("Laki-Laki = 166");
System.out.println("|_________________________________|");
System.out.println("masukan no jenis kelamin =  ");
e = scan.nextInt();
System.out.println("masukan no Absen kelas  =  ");
f = scan.nextInt();
System.out.println("NIM Anda adalah  = "+ a+ b+ c+ d+ e+ f );
  }

}

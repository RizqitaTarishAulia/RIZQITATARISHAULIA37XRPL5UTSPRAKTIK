/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspraktik;

import java.util.Scanner;

/**
 *
 * @author Tarishaulia
 */
public class UTSPraktikRizqitaTarish {
    public static void main(String[] args){
        System.out.println("Risa's Store");
        System.out.println("Jl.Danau Towuti II");
        System.out.println("Selamat Datang Di Risa's Store");
        Scanner  scanner = new Scanner(System.in);
        
        //Harga barang
        int a = 15000;
        int Pensil = a;
        System.out.println("Harga Pensil = Rp "+a);
        
        int b = 9000;
        int Penghapus = b;
        System.out.println("Harga Penghapus = Rp "+b);
        
        int c = 10000;
        int Buku = c;
        System.out.println("Harga Buku = Rp "+c);
        
        int d = 12000;
        int Penggaris = d;
        System.out.println("Harga Tas = Rp "+d);
        
        int e = 10000;
        int Bolpoin = e;
        System.out.println("Harga Bolpoin = Rp "+e);
        
        System.out.println("Berapa Pensil yang ingin anda beli?");
        int JumlahPensil = scanner.nextInt();
        System.out.println("Jumlah harga Pensil yang ingin anda beli adalah = " + JumlahPensil);
        int JumlahHargaPensil = a*JumlahPensil;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaPensil);
        
        System.out.println("Berapa Penghapus yang ingin anda beli?");
        int JumlahPenghapus = scanner.nextInt();
        System.out.println("Jumlah harga Penghapus yang ingin anda beli adalah = " + JumlahPenghapus);
        int JumlahHargaPenghapus = b*JumlahPenghapus;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaPenghapus);
        
        System.out.println("Berapa PBuku yang ingin anda beli?");
        int JumlahBuku = scanner.nextInt();
        System.out.println("Jumlah harga Buku yang ingin anda beli adalah = " + JumlahBuku);
        int JumlahHargaBuku = c*JumlahBuku;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaBuku);
        
        System.out.println("Berapa Penggaris yang ingin anda beli?");
        int JumlahPenggaris = scanner.nextInt();
        System.out.println("Jmlah harga Penggaris yang ingin anda beli adalah = " + JumlahPenggaris);
        int JumlahHargaPenggaris = d*JumlahPenggaris;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaPenggaris);
        
        System.out.println("Berapa Bolpoin yang ingin anda beli?");
        int JumlahBolpoin = scanner.nextInt();
        System.out.println("Jmlah harga Bolpoin yang ingin anda beli adalah = " + JumlahBolpoin);
        int JumlahHargaBolpoin = e*JumlahBolpoin;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaBolpoin); 
        
        int TotalBarang = JumlahHargaPensil + JumlahHargaPenghapus + JumlahHargaBuku +
                             JumlahHargaPenggaris + JumlahHargaBolpoin;
        
        System.out.println("       ");
        System.out.println("====TOTAL BELANJAAN====");
        
        if (TotalBarang >= 500000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 500000 diskon 50%");
               int TotalSetelahDiskon = (TotalBarang / 2);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
        }
        else if (TotalBarang >= 200000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 200000 diskon 20%");
               int TotalSetelahDiskon = (TotalBarang-TotalBarang *2/10);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
    }
        else if (TotalBarang >= 100000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 100000 diskon 10%");
               int TotalSetelahDiskon = (TotalBarang-TotalBarang *1/10);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
    }
        else System.out.println("Total Harga = "+"Rp "+ TotalBarang);
        System.out.println("Kasir : Rizqita Tarish");
        System.out.println("Barang yang sudah dibeli tidak dapat dikembalikan");
        System.out.println("Terima kasih sudah berbelanja di toko kami");
        System.out.println("Semoga barang yang anda beli bermanfaat");
    }
    }


package com.mycompany.konversisuhu;
import java.util.Scanner;
public class tester {
    public static void main(String[] args) 
    {
        Scanner userInput= new Scanner (System.in);
        konversisuhu KonversiSuhu = new konversisuhu();
        System.out.println("Selamat Anda Memasuki Aplikasi/Program Seftiani Ayu Lestari");
        System.out.println("Silahkan Masukan Suhu Celsius Yang Akan DiKonversi = ");
        double C = userInput.nextDouble();
        KonversiSuhu.suhuReamur(C);
        KonversiSuhu.suhuKelvin(C);
        KonversiSuhu.suhuFahrenheit(C);
    }
    
}

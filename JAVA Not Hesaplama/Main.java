import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // Değişkenler
    int mat, fizik, kimya, turkce, tarih, muzik;

    // Scanner
    Scanner inp = new Scanner(System.in);

    // Kullanıcının Değerleri
    System.out.print("Matematik Notunuz : ");
    mat = inp.nextInt();

    System.out.print("Fizik Notunuz : ");
    fizik = inp.nextInt();

    System.out.print("Kimya Notunuz : ");
    kimya = inp.nextInt();

    System.out.print("Türkçe Notunuz : ");
    turkce = inp.nextInt();

    System.out.print("Tarih Notunuz : ");
    tarih = inp.nextInt();

    System.out.print("Müzik Notunuz : ");
    muzik = inp.nextInt();

    int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
    double sonuc = toplam / 6.0;
    System.out.println( "Ortalama Not " + sonuc);
    boolean durum = sonuc >= 60;
    System.out.println(durum ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }

}
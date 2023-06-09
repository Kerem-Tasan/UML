import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        Scanner verial=new Scanner(System.in);

        int vize,finl;
            double notu;
            System.out.println("Vize notunuzu giriniz:");
             vize=verial.nextInt();
            
            System.out.println("Final notunuzu giriniz:");
            finl = verial.nextInt();

            notu=vize*0.4+finl*0.6;
            System.out.println("Vize ve Final ortalamanız :"+notu);
            
System.out.println("sayi1 i giriniz");
double sayi1=verial1.nextDouble();
System.out.println("sayi2 yi giriniz");
double sayi2=verial1.nextDouble();

System.out.println("+,/,-,* islemlerinden birini gir");
char islem=verial1.next().charAt(0);
System.out.println("operator="+islem);

System.out.println("sayi1 ve sayi2 islem sonucu="+islem);




    }
}
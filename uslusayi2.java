import java.util.Scanner;

public class uslusayi2 {
    public static void main(String[] args) {

        int n1, n2, toplam = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü Alınacak Değeri Giriniz");
        n1 = input.nextInt();
        System.out.println("Üssü Giriniz");
        n2 = input.nextInt();

        for (int i = 1; i <= n2; i++) {

            toplam *= n1;


        }

        System.out.println(toplam);
    }
}

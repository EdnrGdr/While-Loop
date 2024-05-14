import java.util.Scanner;

public class Main {

    public static void main ( String [] args) {

        /*

        while (döngü koşulu ) {
           Koşul dogru oldugu sürece calısır.

         */

        // 0'dan 10 a Kadar Sayıları Yazdır.for loop u ile yapalım önce.

        for ( int i = 0 ; i < 10; i++) {

            System.out.println(" i = " + i );
        }

        // WHILE LOOP    - while loop u ile 0'dan 10 a Kadar Sayıları Yazdır. yazılımları farklı.

        int a = 0;
        while ( a<10) {

            System.out.println("a=" + a );
            a++;
        }

        //while 2. Örnek

        int x = 20 ;
        while ( x <= 20000) {
            System.out.println("x= " + x);
            x *= 5;

        }


        // while 3. örnek. Kullanıcıdan aldıgımız input değerininin Faktöriyelini bulma

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz... :");
        int sayi = scanner.nextInt();
        int faktoriyel=1;

        while ( sayi > 0) {

            faktoriyel *= sayi;
            sayi--;

        }
        System.out.println("Faktoriyel = " + faktoriyel);



        /*

  DO WHILE LOOP

  do {

  // Koşul dogru oldugu sürece
  //while dan farkı en az bir kere çalışmasının garanti olması

  } while ( koşul);

         */

        int i = 0;
        do {
            System.out.println("i =" + i);
            i++;


        } while ( i <5);



        // Bir Sayının Rakamları Toplamını do while loop u ile bulma


        System.out.print("Lütfen Bir Sayı Giriniz..:");
        int sayii = scanner.nextInt();
        int toplam =0;

        do {

            toplam += sayii % 10;
            sayii = sayii/10;
            System.out.println("Sayı:" + sayii);



        } while ( sayii > 0);
        System.out.println("Rakamları Toplamı:" + toplam);








    }
}

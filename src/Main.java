import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int mesafe;
            double kmTutar= 2.20, odenecekTutar = 10;
            Scanner inp = new Scanner(System.in);

            System.out.print("Lütfen taksiyle gidilecek mesafeyi giriniz : " );
            mesafe = inp.nextInt();


                odenecekTutar = odenecekTutar+(mesafe*kmTutar);

                if(odenecekTutar < 20){
                    System.out.println("Ödeyeceğiniz tutar : 20tl");
                }
                else {
                System.out.println("Ödeyeceğiniz tutar : " + odenecekTutar);
            }




        }
}
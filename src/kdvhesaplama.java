import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {


                double ilkDeğer, kdv, kdvlideğer, kdv18=18, kdv8=8;
                boolean kosul1, kosul2, sonuc;

                Scanner input = new Scanner(System.in);
                System.out.print("İlk değerinizi giriniz :");
                ilkDeğer = input.nextDouble();

                kosul1 = ilkDeğer >= 0;
                kosul2 = ilkDeğer <= 1000;
                sonuc = kosul1 && kosul2;

                System.out.println("KDV'siz Fiyat :" + ilkDeğer);

                kdv= sonuc ? kdv18 : kdv8;
                kdvlideğer = ilkDeğer + ((ilkDeğer * kdv)/100);

                System.out.println("KDV'li Fiyat :" + kdvlideğer);
                System.out.println("KDV tutarı :" + kdv/10);

            }
        }

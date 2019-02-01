
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Test {
    
    public static void main(String[] args) {
         
        System.out.println("Beyblade Programına Hoşgeldiniz");
        System.out.println("Çıkış için q 'ya basınız");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Üretmek İstediğiniz Beyblade 'i Söyleyiniz ? '");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor....");
                break;
            }
            else{
                BeybladeFabrikası fabrika = new BeybladeFabrikası();
                Beyblade beyblade = fabrika.beybladeUret(islem); 
                
                if (beyblade == null){
                    System.out.println("Geçerli Beyblade İsmi Gir!");
                }
                else{
                    beyblade.bilgilerigoster();
                    beyblade.saldir();
                    beyblade.canavarCikar();
                }
            }
            
        }
        
    }
            
}

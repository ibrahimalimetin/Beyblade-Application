/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Dranza extends Beyblade{
    
    private String kutsalCanavar;

    public Dranza(String kutsalCanavar, String kullanici, int hizi, int gucu) {
        super(kullanici, hizi, gucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        
        System.out.println("Kutsal Canavar Adı" + kutsalCanavar);
    }

    @Override
    public void canavarCikar() {
        System.out.println(getKullanici() + " " + kutsalCanavar + " 'ı ortaya çıkartıyor.");
        System.out.println(getKullanici() + " 'ın gizli saldırısı ateş kılıcıdır");
    }
    
    
}

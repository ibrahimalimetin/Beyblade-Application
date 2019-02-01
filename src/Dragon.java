/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Dragon extends Beyblade{
    
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String kutsalCanavar,String gizliYetenek, String kullanici, int hizi, int gucu) {
        super(kullanici, hizi, gucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);
    }

    @Override
    public void canavarCikar() {
        System.out.println(getKullanici() + " " + kutsalCanavar + " ' ı ortaya çıkartıyor.");
        System.out.println(getKullanici() + " ' ın saldırısı Kasırgadır!"); 
    }
    
}

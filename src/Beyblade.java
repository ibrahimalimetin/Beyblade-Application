/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Beyblade {
    
    private String kullanici;
    private int hizi;
    private int gucu;

    public Beyblade(String kullanici, int hizi, int gucu) {
        this.kullanici = kullanici;
        this.hizi = hizi;
        this.gucu = gucu;
    }

    /**
     * @return the kullanici
     */
    public String getKullanici() {
        return kullanici;
    }

    /**
     * @param kullanici the kullanici to set
     */
    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    /**
     * @return the hizi
     */
    public int getHizi() {
        return hizi;
    }

    /**
     * @param hizi the hizi to set
     */
    public void setHizi(int hizi) {
        this.hizi = hizi;
    }

    /**
     * @return the gucu
     */
    public int getGucu() {
        return gucu;
    }

    /**
     * @param gucu the gucu to set
     */
    public void setGucu(int gucu) {
        this.gucu = gucu;
    }
    
    public void saldir(){
        
        System.out.println(kullanici + "" + gucu + " ve " + hizi + " ile saldırıyor.");
       
    }
    public void canavarCikar(){
        System.out.println("Bu beyblade 'in kutsal canavarı yok!");
    }
    
    public void bilgilerigoster(){
        System.out.println("Beyblade kullanıcısı : " + kullanici);
        System.out.println("Saldırı Gücü : " + gucu);
        System.out.println("Dönüş hızı : " + hizi);
    }
}

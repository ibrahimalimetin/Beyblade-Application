/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class BeybladeFabrikası {
    
    public Beyblade beybladeUret (String beyblade_turu){
        //alt classlar 'ın referansını direk üst classlar 'a vereiliriz. Bu sebeple beylade şeklinde döndürdük referansı. 
        
        if (beyblade_turu.equals("Dragon")){
           
            return new Dragon("Mavi Ejderha", "Kutsal Canavarla Konuşma", "Takao", 800, 300);
        }
        else if (beyblade_turu.equals("Dranza")){
            return new Dranza("Kırmızı Anka Kuşu","Kai", 600, 400);
        }
        else if (beyblade_turu.equals("Drayga")){
            return new Dranza("Beyaz Kaplan","Rei", 800, 250);
        }
        else if (beyblade_turu.equals("Draciel")){
            return new Dranza("Kara Kaplunbağ","Max", 400, 1000);
        }
        
        else {
            return null;
        }
    }
    
}

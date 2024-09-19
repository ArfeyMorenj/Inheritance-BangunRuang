
package bangunruang;

public class Balok {
    
    
    float p;
    float l;
    float t;
    
    float volume (){
        float volume = (float) (p * l * t);
        System.out.println("Menghitung Volume Balok" + volume);
        return volume;
    }
    
 
    float LuasPermukaan (){
        float LuasPermukaan = (float) (2 * p * l + l * t + p * t);
         System.out.println("Menghitung LuasPermukaan Balok" + LuasPermukaan);
         return LuasPermukaan;
    }
    
}


package bangunruang;


public class Bola extends BangunRuang  {
    
    float r;
    
   
    float volume(){
        float volume = (float)(r*r*r);
        System.out.println("Menghitung Volume Bola" + volume);
        return volume;
    }
   
    float LuasPermukaan (){
        float LuasPermukaan = (float)(4 * Math.PI * r * r);
          System.out.println("Menghitung LuasPermukaan Bola" + LuasPermukaan);
          return LuasPermukaan;
    }
    
}

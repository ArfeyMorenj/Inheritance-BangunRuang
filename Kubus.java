
package bangunruang;

public class Kubus extends BangunRuang{
    
    float s;
    
   
    float volume(){
        float volume = (float)(s * s * s);
        System.out.println("Menghitung Volume Kubus" + volume);
        return volume;
    }
   
    float LuasPermukaan(){
        float LuasPermukaan = (float)(6 * s * s);
        System.out.println("Menghitung Luas Permukaan Kubus" + LuasPermukaan);
        return LuasPermukaan;
    }
    
}

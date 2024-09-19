package bangunruang;

public class LimasSegitiga extends BangunRuang {

    float a, ts, tl, lst;

    float volume() {
        float volume = (float) (1 / 6 * (1 / 2 * a * ts) * tl);
        System.out.println("Menghitung volume Limas Segitiga" + volume);
        return volume;
    }

    @Override
    float LuasPermukaan() {
        float luasPermukaan = (float) ( a * ts/2) + (3 * ( a * lst/2));
        System.out.println("Menghitung Luas Permukaan" + luasPermukaan);
        return luasPermukaan;
    }

}

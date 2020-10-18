public class Rocket {
    double height = 50 ;
    double speed = 8 ;
    double fuel = 90 ;
    void set(int power) {
        var burn = 15.0 * power / 100;
        if (burn > fuel) {
            burn = fuel;
        }
        fuel -= burn;
        var accel = 1.62 - (36 / 8 * burn / 15);
        speed += accel ;
        height -= speed + accel / 2;
    }
}

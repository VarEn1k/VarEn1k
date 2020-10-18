import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        var rocket = new Rocket();
        var scanner = new Scanner(System.in);
       //---------------------
        System.out.println("Введите номер 1, 2 or 3? ");
        switch ( scanner.nextInt()) {
            case 1:
                rocket.fuel = 90;
                rocket.height = 50;
                rocket.speed = 8;
                break;
            case 2:
                rocket.fuel = 130;
                rocket.height = 150;
                rocket.speed = 14;
                break;
            case 3:
                rocket.fuel = 350;
                rocket.height = 1000;
                rocket.speed = 25;
                break;
            default:
                rocket.fuel = 120;
                rocket.height = 500;
                rocket.speed = 18;
        }
      // -----------------

        while (rocket.height > 0) {
            System.out.print(
                    "Height: " + rocket.height +
                            "Speed: " + rocket.speed +
                            "Fuel: " + rocket.fuel +
                            "Power? ");
            rocket.set(scanner.nextInt());
        }
        System.out.print("Landing speed: " + rocket.speed);
        if (rocket.speed < 2) {
            System.out.println("Very well "
            );
        } else if (rocket.speed < 4) {
            System.out.println("Not bad ");
        } else if (rocket.speed < 6) {
            System.out.println("Rocket destroyed ");
        } else {
            System.out.println("New crater on the Moon ");}

    }
}

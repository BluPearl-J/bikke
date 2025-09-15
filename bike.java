import java.util.Scanner;

public class Bike {

    public static double gearOne(double speed) {
        return speed + 1;
    }

    public static void accelerate(double speed, int gearConstant) {
        if (gearConstant > 4 || gearConstant < 1) {
            throw new IllegalArgumentException("Invalid gear: must be between 1 and 4");
        }
        double result = speed + gearConstant;
        System.out.println("Accelerated speed: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter current speed:");
        double speed = 0;
        try {
            speed = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid speed input. Exiting...");
            return;
        }

        System.out.println("Enter gear (1 to 4):");
        int gear = 0;
        try {
            gear = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Gear must be a number. Exiting...");
            return;
        }

        switch (gear) {
            case 1:
                if (speed < 0 || speed > 20) {
                    throw new IllegalArgumentException("Gear 1 speed must be between 0 and 20");
                }
                accelerate(speed, 1);
                break;
            case 2:
                if (speed < 21 || speed > 30) {
                    throw new IllegalArgumentException("Gear 2 speed must be between 21 and 30");
                }
                accelerate(speed, 2);
                break;
            case 3:
                if (speed < 31 || speed > 40) {
                    throw new IllegalArgumentException("Gear 3 speed must be between 31 and 40");
                }
                accelerate(speed, 3);
                break;
            case 4:
                if (speed < 41) {
                    throw new IllegalArgumentException("Gear 4 speed must be 41 or above");
                }
                accelerate(speed, 4);
                break;
            default:
                System.out.println("Invalid gear selection.");
        }
    }
}

package DataTypes;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float timeSeconds;
        float mps, kph, mph;

        System.out.println("Enter distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.println("Enter hour: ");
        float hr = scanner.nextFloat();

        System.out.println("Enter minutes: ");
        float min = scanner.nextFloat();

        System.out.println("Enter seconds: ");
        float sec = scanner.nextFloat();

        scanner.close();

        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
        mph = kph / 1.609f;

        System.out.println("Your speed in meters per second is: " + mps);
        System.out.println("Your speed in km/h is: " + kph);
        System.out.println("Your speed in miles/h is: " + mph);
    }
}

package dz18;

import org.apache.commons.math3.primes.Primes;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valuers: ");
        System.out.println("----See the result press enter----");
        String value;
        while (true) {
            value = sc.nextLine();
            if (value.isEmpty()) {
                break;
            }
            sortNum(value);
        }
    }

    static void sortNum(String point) {
        if (point.matches("[0-9]+")) {
            if (Primes.isPrime(Integer.parseInt(point))) {
                System.out.println("Enter value: " + point + " - prime");
            } else {
                System.out.println("Enter value: " + point + " - not prime");
            }
        } else {
            System.out.println("Enter value: " + point + " - NOT A NUMBER");
        }
    }
}
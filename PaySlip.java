package PROGRAMS;

import java.util.*;

public class PaySlip {

    int id;
    String name;
    double basicPay;
    double da;
    double hra;
    double ta;
    double grossPay;

    PaySlip(int id, String name, double basicPay) {
        this.id = id;
        this.name = name;
        this.basicPay = basicPay;
    }

    void FindDA() {
        da = basicPay * 10 / 100;
    }

    void FindHRA() {
        hra = basicPay * 20 / 100;
    }

    void FindTA() {
        ta = basicPay * 5 / 100;
    }

    void FindGross() {
        grossPay = basicPay + da + hra + ta;
    }

    void GetDetails() {

        FindDA();
        FindHRA();
        FindTA();
        FindGross();

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("Gross Pay: " + grossPay);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Details");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        PaySlip p1 = new PaySlip(id, name, basicPay);

        boolean run = true;

        while (run) {

            System.out.println("\n1. Find DA");
            System.out.println("2. Find HRA");
            System.out.println("3. Find TA");
            System.out.println("4. Find Gross Pay");
            System.out.println("5. Display Pay Slip");
            System.out.println("6. Exit");

            System.out.print("Enter the operation: ");
            int choose = sc.nextInt();

            switch (choose) {

                case 1:
                    p1.FindDA();
                    System.out.println("DA: " + p1.da);
                    break;

                case 2:
                    p1.FindHRA();
                    System.out.println("HRA: " + p1.hra);
                    break;

                case 3:
                    p1.FindTA();
                    System.out.println("TA: " + p1.ta);
                    break;

                case 4:
                    p1.FindGross();
                    System.out.println("Gross Pay: " + p1.grossPay);
                    break;

                case 5:
                    p1.GetDetails();
                    break;

                case 6:
                    run = false;
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Please enter a valid operation");
            }
        }
    }
}
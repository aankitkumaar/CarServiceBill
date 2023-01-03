package Assesment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cars {

   public static void printService()
    {
        System.out.print("Service Code :- \n" +
                "1. Basic Servicing - BS01\n" +
                "2. Engine Fixing - EF01 \n" +
                "3. Clutch Fixing - CF01\n" +
                "4. Brake Fixing - BF01 \n" +
                "5. Gear Fixing - GF01 \n");
        System.out.println("Enter the Service Code Using White-Space");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type of Car: - (Hatchback/Sedan/SUV) ");
        String cars = br.readLine();
        switch (cars) {
            case "Hatchback": {
                Hatchback hb = new Hatchback();
                printService();
                String[] ser = br.readLine().split(" ");
                hb.AllCharge(ser);
                System.out.println("Total Bill - Rs."+hb.bill());
                break;

            }
            case "Sedan": {
                Sedan sedan = new Sedan();
                printService();
                String[] ser = br.readLine().split(" ");
                sedan.AllCharge(ser);
                System.out.println("Total Bill - Rs."+sedan.bill());
                break;

            }
            case "SUV":
            {
                SUV suv = new SUV();
                printService();
                String[] ser = br.readLine().split(" ");
                suv.AllCharge(ser);
                System.out.println("Total Bill - Rs." + suv.bill());
                break;
            }
           default:
                System.out.println("Please Enter The Valid Car Name :)");
        }
    }
}

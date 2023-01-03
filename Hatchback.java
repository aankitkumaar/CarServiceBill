package Assesment;

import java.util.HashMap;

public class Hatchback {
    int price;
    public Hatchback()
    {
        this.price = 0;
    }

    public void AllCharge(String[] service)
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("BS01",2000);
        map.put("EF01",5000);
        map.put("CF01",2000);
        map.put("BF01",1000);
        map.put("GF01",3000);
        HashMap<String,String> serviceType = new HashMap<>();
        serviceType.put("BS01","Basic Servicing");
        serviceType.put("EF01","Engine Fixing");
        serviceType.put("CF01","Clutch Fixing");
        serviceType.put("BF01","Brake Fixing");
        serviceType.put("GF01","Gear Fixing");

        for(String temp : service)
        {
            System.out.println("Charge for " + serviceType.get(temp)+" - Rs. "+map.get(temp));
            price+=map.get(temp);
        }
    }
    public int bill()
    {
        return this.price;
    }
}

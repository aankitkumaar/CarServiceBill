package Assesment;

import java.util.HashMap;

public class SUV {
    int price;
    public SUV()
    {
        this.price = 0;
    }

    public void AllCharge(String[] service)
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("BS01",5000);
        map.put("EF01",10000);
        map.put("CF01",6000);
        map.put("BF01",2500);
        map.put("GF01",8000);
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

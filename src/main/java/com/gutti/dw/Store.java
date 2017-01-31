package com.gutti.dw;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Veeresh Gutti on 3/1/16.
 */
public class Store {
    public static Map<Map<String, Retailer>, Map<String, Product>> retailerProductMap = new HashMap();

    public static boolean isRetailerExist(String rid){
        for (Map<String, Retailer> stringRetailerMap : retailerProductMap.keySet()) {
            return stringRetailerMap.containsKey(rid);
        }
        return false;
    }

   /* public static boolean isProductExist(String rid, String pid){
        if(isRetailerExist(rid)){
            //retailerProductMap.get()
        }
    }*/
}

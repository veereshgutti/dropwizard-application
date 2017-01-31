package com.gutti.dw;

import java.util.*;

/**
 * Created by Veeresh Gutti on 2/1/16.
 */
public class RetailerDao {
    private static Map<String,Retailer> retailerMap = new HashMap();

    public void createRetailer(Retailer retailer){
        if(!retailerMap.containsKey(retailer.getrId())) {
            //retailerMap.put(retailer.getrId(), retailer);
            //Store.retailerProductMap.
        } else
            throw new DuplicateResourceException("409", retailer.getrId(), "Duplicate Resource Found!");

    }

    public void updateRetailer(Retailer retailer){
        if(retailerMap.containsKey(retailer.getrId()))
            retailerMap.put(retailer.getrId(),retailer);
        else
            throw new ResourceNotFoundException("404", retailer.getrId(), "Resource Not Found");
    }

    public Collection<Retailer> getRetailers(){
        return retailerMap.values();
    }

    public Retailer getRetailer(String id){
        if(retailerMap.containsKey(id))
            return retailerMap.get(id);
        else
            throw new ResourceNotFoundException("404", id, "Resource Not Found");
    }

    public void deleteRetailer(String id){
        if(retailerMap.containsKey(id)){
            retailerMap.remove(id);
        } else {
            throw new ResourceNotFoundException("404", id, "Resource Not Found");
        }
    }
}

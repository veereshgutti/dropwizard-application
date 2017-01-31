package com.gutti.dw;

import java.util.*;

/**
 * Created by Veeresh Gutti on 2/1/16.
 */
public class ProductsDao {
    private static Map<String,Product> productMap = new HashMap();

    public void createProduct(Product product){
        productMap.put(product.getPid(), product);
    }

    public void updateProduct(Product product){
        if(productMap.containsKey(product.getPid()))
            productMap.put(product.getPid(), product);
    }

    public Collection<Product> getProducts(){
        return productMap.values();
    }

    public Product getProduct( String id){
        return productMap.get(id);
    }

    public void deleteProduct(String id){
        if(productMap.containsKey(id)){
            productMap.remove(id);
        }
    }

}

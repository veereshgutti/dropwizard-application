package com.gutti.dw;

/**
 * Created by Veeresh Gutti on 29/12/15.
 */
public class Retailer {
    private String rId;
    private String rName;

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    @Override
    public String toString() {
        return "Retailer{" +
                "rId='" + rId + '\'' +
                ", rName='" + rName + '\'' +
                '}';
    }
}

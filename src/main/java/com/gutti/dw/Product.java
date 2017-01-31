package com.gutti.dw;

/**
 * Created by Veeresh Gutti on 31/12/15.
 */
public class Product {
    private String pid;
    private String pName;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }
}

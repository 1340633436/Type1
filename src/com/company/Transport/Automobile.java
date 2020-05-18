package com.company.Transport;

import java.util.Date;

/**
 * @description:
 * @author: 邓建军
 * @date: Created in 2020/5/18 14:23
 * @version: 1.0
 * @modified By:
 */
public class Automobile {
    private String ownership = null;
    private String GPSPosition;
    private String price;
    private Date dataOfPurchase;
    private String id;

    public void drivingMethod() {
        System.out.println("Automobile!");
    }

    public Automobile() {
    }

    public Automobile(String id) {
        this.id = id;
    }
}

package com.company.Transport;

import java.util.Date;

/**
 * @description:
 * @author: 邓建军
 * @date: Created in 2020/5/18 14:36
 * @version: 1.0
 * @modified By:
 */
public class Hovercraft {
    private String ownership = null;
    private String GPSPosition;
    private String price;
    private Date dataOfPurchase;
    private String id;

    public void drivingMethod() {
        System.out.println("Hovercraft!");
    }

    public Hovercraft() {
    }

    public Hovercraft(String id) {
        this.id = id;
    }
}

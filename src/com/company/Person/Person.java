package com.company.Person;

import com.company.Transport.*;

/**
 * @description:
 * @author: 邓建军
 * @date: Created in 2020/5/18 14:53
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age = 19;
    private String p_Sex = "男";
    private String id = "201902187";
    private String p_Name;

    public Person(String p_Name) {
        this.p_Name = p_Name;
    }

    public Person() {
    }

    public void driveTransport(Aircraft transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Airship transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Automobile transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Bicycle transport) {
        transport.drivingMethod();
    }
    public void driveTransport(HotAirBalloon transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Hovercraft transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Motorcycle transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Ship transport) {
        transport.drivingMethod();
    }
    public void driveTransport(Submarine transport) {
        transport.drivingMethod();
    }
}

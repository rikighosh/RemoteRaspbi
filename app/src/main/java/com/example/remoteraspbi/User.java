package com.example.remoteraspbi;

import androidx.annotation.Keep;

@Keep
public class User {

    private long sensor1;
    private long sensor2;
    private long sensor3;
    private long sensor4;
    private long sensor5;
    private long sensor6;
    private long sensor7;
    private long sensor8;
    private long time;
    private float temp;
    private float hum;



    private long dev1;
    private long dev2;
    private long dev3;
    private long dev4;
    private long count;

    public User() {

    }

    public User(long sensor1, long sensor2, long sensor3, long sensor4, long sensor5, long sensor6, long sensor7, long sensor8, long time, float temp, float hum,long dev1,long dev2,long dev3,long dev4,long count) {
        this.sensor1 = sensor1;
        this.sensor2 = sensor2;
        this.sensor3 = sensor3;
        this.sensor4 = sensor4;
        this.sensor5 = sensor5;
        this.sensor6 = sensor6;
        this.sensor7 = sensor7;
        this.sensor8 = sensor8;
        this.time = time;
        this.temp = temp;
        this.hum = hum;
        this.dev1=dev1;
        this.dev2=dev2;
        this.dev3=dev3;
        this.dev4=dev4;
        this.count=count;

    }

    public long getSensor1() {
        return sensor1;
    }

    public void setSensor1(long sensor1) {
        this.sensor1 = sensor1;
    }

    public long getSensor2() {
        return sensor2;
    }

    public void setSensor2(long sensor2) {
        this.sensor2 = sensor2;
    }

    public long getSensor3() {
        return sensor3;
    }

    public void setSensor3(long sensor3) {
        this.sensor3 = sensor3;
    }

    public long getSensor4() {
        return sensor4;
    }

    public void setSensor4(long sensor4) {
        this.sensor4 = sensor4;
    }

    public long getSensor5() {
        return sensor5;
    }

    public void setSensor5(long sensor5) {
        this.sensor5 = sensor5;
    }

    public long getSensor6() {
        return sensor6;
    }

    public void setSensor6(long sensor6) {
        this.sensor6 = sensor6;
    }

    public long getSensor7() {
        return sensor7;
    }

    public void setSensor7(long sensor7) {
        this.sensor7 = sensor7;
    }

    public long getSensor8() {
        return sensor8;
    }

    public void setSensor8(long sensor8) {
        this.sensor8 = sensor8;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }


    public float getHum() {
        return hum;
    }

    public void setHum(float hum) {
        this.hum = hum;
    }

    public long getDev1() {
        return dev1;
    }

    public void setDev1(long dev1) {
        this.dev1 = dev1;
    }

    public long getDev2() {
        return dev2;
    }

    public void setDev2(long dev2) {
        this.dev2 = dev2;
    }

    public long getDev3() {
        return dev3;
    }

    public void setDev3(long dev3) {
        this.dev3 = dev3;
    }

    public long getDev4() {
        return dev4;
    }

    public void setDev4(long dev4) {
        this.dev4 = dev4;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}




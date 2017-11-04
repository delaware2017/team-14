package com.example.kaleb.wavealpha;

import java.util.Date;

/**
 * Created by omers on 11/3/2017.
 */

public class receipt {
    private double transaction_num;
    private Date transaction_date;
    private String time;
    private double total_amount;
    private String store_ID;

    public double getTransaction_num() {
        return transaction_num;
    }

    public void setTransaction_num(double transaction_num) {
        this.transaction_num = transaction_num;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public String getStore_ID() {
        return store_ID;
    }

    public void setStore_ID(String store_ID) {
        this.store_ID = store_ID;
    }
}

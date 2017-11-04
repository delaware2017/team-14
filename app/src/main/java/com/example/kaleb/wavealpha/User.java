package com.example.kaleb.wavealpha;


/**
 * Created by vqn on 11/3/17.
 */

public class User {

    private String name, email, addr;
    private int phoneNo, balance, familyMembers, clinicID, triggerTime;
    private boolean status;
    private String password;

    public int getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(int triggerTime) {
        this.triggerTime = triggerTime;
    }

    public int getClinicID() {
        return clinicID;
    }

    public void setClinicID(int clinicID) {
        this.clinicID = clinicID;
    }

    public int getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(int familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User(String name, String email, String addr, int phoneNo, int balance, String password, boolean status, int familyMembers, int clinicID, int triggerTime) {
        this.name = name;
        this.email = email;
        this.addr = addr;
        this.phoneNo = phoneNo;
        this.balance = balance;
        this.password = password;
        this.status = status;
        this.clinicID = clinicID;
        this.familyMembers = familyMembers;
        this.triggerTime = triggerTime;
    }

    public int makePurchase(int purchaseCost) {
        return getBalance() - purchaseCost;


    }
}

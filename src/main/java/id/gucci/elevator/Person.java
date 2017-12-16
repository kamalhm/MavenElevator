/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.gucci.elevator;

/**
 *
 * @author Kamal
 */
public class Person {

    private int berat;
    private boolean status;
    private int tujuan;

    public Person(int berat, boolean status, int tujuan) {
        this.berat = berat;
        this.status = status;
        this.tujuan = tujuan;
    }

    public Person(int berat, int tujuan) {
        this.berat = berat;
        this.tujuan = tujuan;
        this.status = false;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public boolean isStatus() {
        return status;
    }

    public boolean isVIP() {
        if (this.status) {
            return true;
        }
        return false;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTujuan() {
        return tujuan;
    }

    public void setTujuan(int tujuan) {
        this.tujuan = tujuan;
    }
    

}

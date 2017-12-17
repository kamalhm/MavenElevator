package id.gucci.elevator;

import java.util.ArrayList;

public class Elevator {

    private boolean arah;
    private int lantaiSekarang;
    private final int maxBeban;
    private final int maxOrang;
    private ArrayList<Person> listOrang;

    public Elevator(int lantaiSekarang, int maxOrang, int maxBeban) {
        this.lantaiSekarang = lantaiSekarang;
        this.maxBeban = maxBeban;
        this.maxOrang = maxOrang;
        this.arah = true;
        listOrang = new ArrayList<Person>();
    }

    public boolean cekStatus() {
        int bebanSekarang = 0;
        for (Person list : listOrang) {
            bebanSekarang += list.getBerat();
        }
        return bebanSekarang <= maxBeban && listOrang.size() <= maxOrang;

    }

    public void tambahOrang(Person p) {
        listOrang.add(p);
    }

    public void bergerak() {
        if (cekStatus()) {
            for (Person person : listOrang) {
                if (lantaiSekarang != person.getTujuan() && lantaiSekarang < person.getTujuan()) {
                    while (lantaiSekarang != person.getTujuan()) {
                        this.lantaiSekarang++;
                        System.out.println("Lantai saat ini " + this.lantaiSekarang);
                    }

                    System.out.println("Pengguna telah sampai ke tujuan");
                    listOrang.remove(this);

                } else if (lantaiSekarang != person.getTujuan() && lantaiSekarang > person.getTujuan()) {
                    while (lantaiSekarang != person.getTujuan()) {
                        this.lantaiSekarang--;
                        System.out.println("Lantai saat ini " + this.lantaiSekarang);

                    }
                    System.out.println("Pengguna telah sampai ke tujuan");
                    listOrang.remove(this);

                }

            }

        } else {
            System.out.println("Elevator penuh, beban dan orang telah melebihi batas.");
        }

    }

    public boolean getArah() {
        return this.arah;
    }

    public void setArah(boolean arah) {
        this.arah = arah;
    }

    public int getLantaiSekarang() {
        return lantaiSekarang;
    }

    public void setLantaiSekarang(int lantaiSekarang) {
        this.lantaiSekarang = lantaiSekarang;
    }

    public String getListOrang() {
        String s = "";
        for (Person person : listOrang) {
            s = "" + person.getBerat() + "" + person.getTujuan() + "\n";

        }
        return s;
    }

}

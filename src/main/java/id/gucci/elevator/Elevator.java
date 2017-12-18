package id.gucci.elevator;

import java.util.ArrayList;
import java.util.Collections;

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
        ArrayList<Integer> tempnaik = new ArrayList<Integer>();
        ArrayList<Integer> tempturun = new ArrayList<Integer>();
        if (cekStatus()) {
            for (Person person : listOrang) {
                if (person.getTujuan() > lantaiSekarang) {
                    tempnaik.add(person.getTujuan());
                } else if (person.getTujuan() < lantaiSekarang) {
                    tempturun.add(person.getTujuan());
                }
            }
            Collections.sort(tempnaik);
            Collections.sort(tempturun);

            if (arah) {
                for (int i = 0; i < tempnaik.size(); i++) {
                    while (lantaiSekarang != tempnaik.get(i)) {
                        lantaiSekarang++;
                        System.out.println("Lantai saat ini " + lantaiSekarang);
                      
                    }

                }
                for (int j = 0; j < tempturun.size(); j++) {
                    while (lantaiSekarang != tempturun.get(j)) {
                        lantaiSekarang--;
                        System.out.println("Lantai saat ini " + lantaiSekarang);
                    }
                }
                arah = false;
            } else if (!arah) {
                for (int i = 0; i < tempturun.size(); i++) {
                    while (lantaiSekarang != tempturun.get(i)) {
                        lantaiSekarang--;
                        System.out.println("Lantai saat ini " + lantaiSekarang);
                    }
                }
                for (int j = 0; j < tempnaik.size(); j++) {
                    while (lantaiSekarang != tempnaik.get(j)) {
                        lantaiSekarang++;
                        System.out.println("Lantai saat ini " + lantaiSekarang);
                       
                    }
                }
                arah = true;
            }
            tempnaik.clear();
            tempturun.clear();
            listOrang.clear();
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

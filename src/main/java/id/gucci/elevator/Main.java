/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.gucci.elevator;

import controller.ControllerGUI;

/**
 *
 * @author Kamal
 */
public class Main {
    public static void main(String[] args) {
//        ControllerGUI c = new ControllerGUI();
        Elevator a = new Elevator(1, 5, 250); // max 5 orang atau beban mencapai 250kg.
        Person p1 = new Person(40, 8);
        Person p2 = new Person(40, 5);
        Person p3 = new Person(20, 2);
        Person p4 = new Person(20, true, 12); // overloading, jika true maka dia adalah user VIP yang mendapat prioritas.
        Person p5 = new Person(40, 9);
        Person p6 = new Person(300, 4);
        a.tambahOrang(p1); // memasukan orang ke dalam elevator
        a.tambahOrang(p3);
        a.tambahOrang(p2);
        a.tambahOrang(p4);
        a.tambahOrang(p5);
        System.out.println("Lantai sekarang = " + a.getLantaiSekarang());
        a.bergerak(); 
    }
}

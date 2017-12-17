/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Kamal
 */
import id.gucci.elevator.Elevator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.GUI;
import id.gucci.elevator.*;
import javax.swing.JOptionPane;

public class ControllerGUI implements ActionListener {
    
    private GUI view;
    private Elevator app;
    
    public ControllerGUI() {
        app = new Elevator(1, 10, 500);
        view = new GUI();
        view.setVisible(true);
        view.addActionListener(this);
        view.setTxLantaiSekarang("" + app.getLantaiSekarang());
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnBergerak())) {
            JOptionPane.showMessageDialog(null, "Bergerak");
            view.setTxListTujuan(app.getListOrang());
            app.bergerak();   
        } else if (source.equals(view.getBtnTambahOrang())) {
            if (view.getRdoYa().isSelected()) {
                try {
                    app.tambahOrang(new Person(Integer.parseInt(view.getTxBerat()), true, Integer.parseInt(view.getTxTujuan())));
                    JOptionPane.showMessageDialog(null, "Berhasil tambah pengguna VIP");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            } else if (view.getRdoTdk().isSelected()) {
                try {
                    app.tambahOrang(new Person(Integer.parseInt(view.getTxBerat()), Integer.parseInt(view.getTxTujuan())));
                    JOptionPane.showMessageDialog(null, "Berhasil tambah pengguna");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            }
            
        }
    }
    
}

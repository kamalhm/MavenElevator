/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.gucci.elevator;

import cucumber.api.java.en.*; // And But Given When  Then
import junit.framework.Assert;

/**
 *
 * @author Kamal
 */
public class Stepdefs {

    @Given("^Saya telah menekan lantai tujuan$")
    public void saya_telah_menekan_lantai_tujuan() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Given("^Saya berada di dalam elevator$")
    public void saya_berada_di_dalam_elevator() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Then("^Pintu elevator akan terbuka$")
    public void pintu_elevator_akan_terbuka() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Given("^Saya telah menekan tombol atas/bawah$")
    public void saya_telah_menekan_tombol_atas_bawah() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @When("^Sudah menunggu elevator datang$")
    public void sudah_menunggu_elevator_datang() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @When("^Saya sudah berada di dalam elevator$")
    public void saya_sudah_berada_di_dalam_elevator() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @When("^Elevator sedang tidak ada antrian$")
    public void elevator_sedang_tidak_ada_antrian() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Then("^Elevator akan berpindah ke lantai tujuan$")
    public void elevator_akan_berpindah_ke_lantai_tujuan() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @When("^Elevator sedang ada antrian$")
    public void elevator_sedang_ada_antrian() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Then("^Elevator akan berpindah ke lantai tujuan yang berada pada antrian pertama$")
    public void elevator_akan_berpindah_ke_lantai_tujuan_yang_berada_pada_antrian_pertama() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Given("^pengguna prioritas sudah ada didalam elevator$")
    public void pengguna_prioritas_sudah_ada_didalam_elevator() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @When("^pengguna prioritas mentapping id card dan memilih lantai$")
    public void pengguna_prioritas_mentapping_id_card_dan_memilih_lantai() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Then("^elevator menuju lantai yang dipilih oleh pengguna prioritas$")
    public void elevator_menuju_lantai_yang_dipilih_oleh_pengguna_prioritas() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }
}

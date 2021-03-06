/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author gilbertsolanosotomayor
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorinicialMenu;

    public Menu(String n, double v) {
        nombrePlato = n;
        valorinicialMenu = v;
    }

    public void establecerNombrePlato(String c) {
        nombrePlato = c;
    }

    public void establecerValorMenu(double c) {
        valorMenu = c;
    }

    public void establecerValorinicialMenu(double c) {
        valorinicialMenu = c;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorinicialMenu() {
        return valorinicialMenu;
    }

    public abstract void calcularvalorMenuTotal();

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Valor menu inicial:%.2f\n", obtenerNombrePlato(),
                obtenerValorinicialMenu());
        return cadena;
    }

}

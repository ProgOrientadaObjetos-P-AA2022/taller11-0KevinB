/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UsuarioITC
 */
public class MenuNinos extends Menu {

    private double valorPorcionHelada;
    private double valorPorcionPastel;

    public MenuNinos(String n, double v, double vph, double vpp) {
        super(n, v);
        valorPorcionHelada = vph;
        valorPorcionPastel = vpp;
    }

    public void establecerValorPorcionHelada(double c) {
        valorPorcionHelada = c;
    }

    public void establecerValorPorcionPastel(double c) {
        valorPorcionPastel = c;
    }

    public double obtenerValorPorcionHelada() {
        return valorPorcionHelada;
    }

    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }

    @Override
    public void calcularvalorMenuTotal() {
        valorMenu = valorinicialMenu + valorPorcionHelada + valorPorcionPastel;
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu de Niños\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor Porcion Helado:%.2f\n"
                + "Valor Porcion Pastel:%.2f\n"
                + "Valor Menu:%.2f\n", cadena,
                obtenerValorPorcionHelada(),
                obtenerValorPorcionPastel(),
                obtenerValorMenu()
        );
        return cadena;
    }

}

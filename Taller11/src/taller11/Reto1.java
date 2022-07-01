/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author UTPL
 */
public class Reto1 {

    public static void main(String[] args) {
        ArrayList<Menu> lista = new ArrayList<>();
        
        MenuCarta menuCar1 = new MenuCarta("Plato Carta 001", 6, 1.5, 2);
        menuCar1.establecerPorcentajeAdicional(10);
        menuCar1.calcularvalorMenuTotal();
        MenuDia menudia1 = new MenuDia("Plato Dia 001", 5, 1, 1);
        menudia1.calcularvalorMenuTotal();
        MenuNinos menuninos1 = new MenuNinos("Plato de niños 01", 2, 1, 1.50);
        menuninos1.calcularvalorMenuTotal();
        MenuNinos menuninos2 = new MenuNinos("Plato de niños 02", 3, 1, 1.50);
        menuninos2.calcularvalorMenuTotal();
        MenuEconomico menuEco1 = new MenuEconomico("Plato Economico 001", 4);
        menuEco1.establecerPorcentajeDescuento(25);
        menuEco1.calcularvalorMenuTotal();

        lista.add(menuninos1);
        lista.add(menuninos2);
        lista.add(menuEco1);
        lista.add(menudia1);
        lista.add(menuCar1);

        CuentaMenu cuenta1 = new CuentaMenu();
        cuenta1.establecerListaMenu(lista);
        cuenta1.establecerId(012);
        cuenta1.establecerNombreCliente("Rene Elizalde");
        cuenta1.calcularvalortotalcancelar();
        System.out.println(cuenta1);

    }
}

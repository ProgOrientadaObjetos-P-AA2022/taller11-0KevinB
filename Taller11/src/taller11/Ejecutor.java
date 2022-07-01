/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author UsuarioITC
 */
public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu> listamenu = new ArrayList<>();
        MenuCarta menuCar1 = new MenuCarta("Arroz rrelleno", 5, 1, 2);
        menuCar1.establecerPorcentajeAdicional(10);
        menuCar1.calcularvalorMenuTotal();
        MenudelDia menudia1 = new MenudelDia("Fritada", 3, 2, 3);
        menudia1.calcularvalorMenuTotal();
        MenuNinos menuninos1 = new MenuNinos("Papi pollo", 2, 1, 2);
        menuninos1.calcularvalorMenuTotal();
        MenuNinos menuninos2 = new MenuNinos("Hot dog", 1, 2, 3);
        menuninos2.calcularvalorMenuTotal();
        MenuEconomico menuEco1 = new MenuEconomico("Carne asada", 3);
        menuEco1.establecerPorcentajeDescuento(10);
        menuEco1.calcularvalorMenuTotal();

        listamenu.add(menuCar1);
        listamenu.add(menudia1);
        listamenu.add(menuninos1);
        listamenu.add(menuninos2);
        listamenu.add(menuEco1);
        CuentaMenu cuenta1 = new CuentaMenu();
        cuenta1.establecerListaMenu(listamenu);
        cuenta1.establecerId(012);
        cuenta1.establecerNombreCliente("Jose Martinez");
        cuenta1.calcularvalortotalcancelar();
        System.out.println(cuenta1);

    }

}

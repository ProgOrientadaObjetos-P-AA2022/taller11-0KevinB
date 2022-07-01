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
        ArrayList<Menu> lista = new ArrayList<>();
        MenuCarta menuCarta = new MenuCarta("Arroz rrelleno", 5, 1, 2);
        menuCarta.establecerPorcentajeAdicional(10);
        menuCarta.calcularvalorMenuTotal();
        MenuDia menuDia = new MenuDia("Pizza", 3, 2, 3);
        menuDia.calcularvalorMenuTotal();
        MenuNinos menuN1 = new MenuNinos("Papi pollo", 2, 1, 2);
        menuN1.calcularvalorMenuTotal();
        MenuNinos menuN2 = new MenuNinos("Hot dog", 1, 2, 3);
        menuN2.calcularvalorMenuTotal();
        MenuEconomico menuEco = new MenuEconomico("Carne asada", 3);
        menuEco.establecerPorcentajeDescuento(10);
        menuEco.calcularvalorMenuTotal();

        lista.add(menuN1);
        lista.add(menuN2);
        lista.add(menuCarta);
        lista.add(menuDia);
        lista.add(menuEco);
        CuentaMenu cuenta1 = new CuentaMenu();
        cuenta1.establecerListaMenu(lista);
        cuenta1.establecerId(005);
        cuenta1.establecerNombreCliente("Kevin Barrazueta");
        cuenta1.calcularvalortotalcancelar();
        System.out.println(cuenta1);

    }

}

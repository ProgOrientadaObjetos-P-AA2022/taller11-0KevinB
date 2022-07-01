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
public class Reto2 {

    public static void main(String[] args) {
        ArrayList<Menu> lista = new ArrayList<>();

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};
        
        for (int i = 0; i < datos001.length; i++) {
            for (int j = 0; j < datos001[i].length; j++) {
                
            }
        }
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularvalorMenuTotal();
        }
        CuentaMenu cuenta1 = new CuentaMenu();
        cuenta1.establecerListaMenu(lista);
        cuenta1.establecerId(012);
        cuenta1.establecerNombreCliente("Rene Elizalde");
        cuenta1.calcularvalortotalcancelar();
        System.out.println(cuenta1);

    }
}

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
public class Principal2 {

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
            MenuNinos menuN = new MenuNinos(datos001[i][0],
                    Double.parseDouble(datos001[i][1]),
                    Integer.parseInt(datos001[i][2]),
                    Double.parseDouble(datos001[i][3]));
            menuN.calcularvalorMenuTotal();
            lista.add(menuN);
        }
        for (int i = 0; i < datos002.length; i++) {
            MenuEconomico menuE = new MenuEconomico(datos002[i][0],
                    Double.parseDouble(datos002[i][1]));
            menuE.establecerPorcentajeDescuento(Integer.parseInt(datos002[i][2]));
            menuE.calcularvalorMenuTotal();
            lista.add(menuE);
        }
        for (int i = 0; i < datos003.length; i++) {
            MenuDia menuD = new MenuDia(datos003[i][0],
                    Double.parseDouble(datos003[i][1]),
                    Double.parseDouble(datos003[i][2]),
                    Double.parseDouble(datos003[i][3])
            );
            menuD.calcularvalorMenuTotal();
            lista.add(menuD);
        }
        for (int i = 0; i < datos004.length; i++) {
            MenuCarta menuC = new MenuCarta(datos004[i][0],
                    Double.parseDouble(datos004[i][1]),
                    Double.parseDouble(datos004[i][2]),
                    Double.parseDouble(datos004[i][3])
            );
            menuC.establecerPorcentajeAdicional(Integer.parseInt(datos004[i][4]));
            menuC.calcularvalorMenuTotal();
            lista.add(menuC);
        }
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularvalorMenuTotal();
        }
        CuentaMenu miCuenta = new CuentaMenu("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal(0);
        miCuenta.calcularvalortotalcancelar();
        System.out.printf("%s\n", miCuenta);

    }
}

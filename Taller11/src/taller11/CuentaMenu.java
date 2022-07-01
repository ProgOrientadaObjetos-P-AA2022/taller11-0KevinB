/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author UsuarioITC
 */
public class CuentaMenu {

    private String nombreCliente;
    private ArrayList<Menu> listamenu = new ArrayList<>();
    private double valorCancelar;
    private double subtotal;
    private double iva = 0.12;
    private int id;

    public void establecerId(int c) {
        id = c;
    }

    public void establecerNombreCliente(String c) {
        nombreCliente = c;
    }

    public void establecerListaMenu(ArrayList<Menu> c) {
        listamenu = c;
    }

    public void establecerSubtotal(double c) {
        subtotal = c;
    }

    public void establecerIva(double c) {
        iva = c;
    }

    public void calcularvalortotalcancelar() {
        for (int i = 0; i < listamenu.size(); i++) {
            subtotal = subtotal + listamenu.get(i).obtenerValorMenu();

        }
        iva = subtotal * iva;
        valorCancelar = subtotal + iva;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public int obtenerId() {
        return id;
    }

    public ArrayList<Menu> obtenerListaMenu() {
        return listamenu;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Cuenta\n"
                + "Nombre cliente:%s\n\n", obtenerNombreCliente());
        for (int i = 0; i < obtenerListaMenu().size(); i++) {
            cadena = String.format("%s"
                    + "%d "
                    + "%s\n", cadena, (i + 1),
                    obtenerListaMenu().get(i));

        }
        cadena = String.format("\n%s"
                + "Subtotal:%.2f\n"
                + "Iva:%.2f\n"
                + "Total a pagar:%.2f\n", cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelar());
        return cadena;
    }

}

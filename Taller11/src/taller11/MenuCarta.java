/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UsuarioITC
 */
public class MenuCarta extends Menu {

    private double guarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String n, double v, double vpg, double vb) {
        super(n, v);
        guarnicion = vpg;
        valorBebida = vb;

    }

    public void establecerValorPorcionGuarnicion(double c) {
        guarnicion = c;
    }

    public void establecerValorBebida(double c) {
        valorBebida = c;
    }

    public void establecerPorcentajeAdicional(double c) {
        porcentajeAdicional = ((valorinicialMenu * c)) / 100;
    }

    public double obtenerValorPorcionGuarnicion() {
        return guarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public void calcularvalorMenuTotal() {
        valorMenu = valorinicialMenu + guarnicion + valorBebida + porcentajeAdicional;

    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la carta\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor porcion guarnicion:%.2f\n"
                + "Valor bebida:%.2f\n"
                + "Costo Adicional:%.2f\n"
                + "Valor menu:%.2f\n", cadena,
                obtenerValorPorcionGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());
        return cadena;
    }

}

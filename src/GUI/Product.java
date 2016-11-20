/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Date;

/**
 *
 * @author ubuntudesk
 */
public class Product {

    public Product(String nombre, int codigo, double precio, Date fechaCaducidad, String marca, int cantidad, String unidad, int existencia) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
        this.marca = marca;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.existencia = existencia;
    }

    Product(String manzana, int i, int i0, Date date, String del_Campo, int i1, String manzana0, int i2, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    public String nombre;
    public int codigo;
    public double precio;
    public Date fechaCaducidad;
    public String marca;
    public int cantidad;
    public String unidad;
    public int existencia;
}

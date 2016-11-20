package Data;

import java.util.Date;

public abstract class Producto {

    public Producto(String nombre, int codigo, double precio, Date fechaCaducidad, String marca, int cantidad, String unidad, int existencia) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
        this.marca = marca;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.existencia = existencia;
    }

    public Producto() {
    }
    public String nombre;
    public int codigo;
    public double precio;
    public Date fechaCaducidad;
    public String marca;
    public int cantidad;
    public String unidad;
    public int existencia;
    
    public String toString(){
        String string = "Nombre: " + getNombre();
        return string;
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
        return codigo;
    }

    public void setExistancia(int existancia) {
        this.existencia = existencia;
    }
}

package co.com.falabella.models;

public class Producto {

    private final String categoria;
    private final String tipoProducto;
    private final String marca;
    private final String tamano;

    public Producto(String categoria, String producto, String marca, String tamano) {
        this.categoria = categoria;
        this.tipoProducto = producto;
        this.marca = marca;
        this.tamano = tamano;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamano() {
        return tamano;
    }

}

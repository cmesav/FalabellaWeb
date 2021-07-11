package co.com.falabella.models;

public class DireccionEnvio {

    private final String departamento;
    private final String ciudad;
    private final String direccion;
    private final String complementoDireccion;

    public DireccionEnvio(String departamento, String ciudad, String direccion, String complementoDireccion) {
        this.departamento = departamento.toUpperCase();
        this.ciudad = ciudad.toUpperCase();
        this.direccion = direccion;
        this.complementoDireccion = complementoDireccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComplementoDireccion() {
        return complementoDireccion;
    }
}

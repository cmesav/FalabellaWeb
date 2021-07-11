package co.com.falabella.setup.datadefinition;

import co.com.falabella.models.Producto;
import io.cucumber.java.DataTableType;


import java.util.Map;

public class DefiniciondeModelos {

    @DataTableType
    public Producto productoEntry(Map<String, String> entry) {
        return new Producto(
                entry.get("categoria"),
                entry.get("tipoProducto"),
                entry.get("marca"),
                entry.get("tamano")
        );
    }
}

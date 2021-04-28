package implementacionesED;

public class Productos {
    public float precio;
    public String talla,color,marca,nombre;
    public int existencias;


    public Productos(float precio, String talla, String color, String marca, String nombre,int existencias) {
        this.precio = precio;
        this.talla = talla;
        this.color = color;
        this.marca = marca;
        this.nombre = nombre;
        this.existencias = existencias;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    
}


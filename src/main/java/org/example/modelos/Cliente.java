package org.example.modelos;

public class Cliente {

    private String nombre;
    private String identificaion;
    private Integer edad;
    private String correo;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String nombre, String identificaion, Integer edad, String correo, String direccion) {
        this.nombre = nombre;
        this.identificaion = identificaion;
        this.edad = edad;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificaion() {
        return identificaion;
    }

    public void setIdentificaion(String identificaion) {
        this.identificaion = identificaion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

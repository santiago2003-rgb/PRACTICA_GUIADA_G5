package org.example.ayudas;

import java.time.LocalDate;

public class Licor {

    private String marca;
    private LocalDate fechaCaducidad;
    private Float porcentajeAlcohol;
    private String tipoLicor;
    private Double precio;

    public Licor() {
    }

    public Licor(String marca, LocalDate fechaCaducidad, Float porcentajeAlcohol, String tipoLicor, Double precio) {
        this.marca = marca;
        this.fechaCaducidad = fechaCaducidad;
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.tipoLicor = tipoLicor;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Float getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Float porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public String getTipoLicor() {
        return tipoLicor;
    }

    public void setTipoLicor(String tipoLicor) {
        this.tipoLicor = tipoLicor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}


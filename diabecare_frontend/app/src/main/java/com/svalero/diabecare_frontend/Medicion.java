package com.svalero.diabecare_frontend;

public class Medicion {
    private String idUsuario, medicion, fecha;

    public Medicion() {
    }

    public Medicion(String idUsuario, String medicion, String fecha) {
        this.idUsuario = idUsuario;
        this.medicion = medicion;
        this.fecha = fecha;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMedicion() {
        return medicion;
    }

    public void setMedicion(String medicion) {
        this.medicion = medicion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

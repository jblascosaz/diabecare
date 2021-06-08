package com.svalero.diabecare_frontend;

public class User {
    public int peso, altura, sensibilidad, edad;
    public char sexo;

    public User() {
    }

    public User(int peso, int altura, int sensibilidad, int edad, char sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sensibilidad = sensibilidad;
        this.edad = edad;
        this.sexo = sexo;
    }
}

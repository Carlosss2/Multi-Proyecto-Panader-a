package models;

import java.util.Objects;

public class Estudiante {
    String nombre,apellido,  matricula;
    Integer edad;

    public Estudiante(String matricula, String nombre, String apellido,  Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}

package models;

import java.util.Objects;

public class Alumno {
    String nombre,  matricula;

    public Alumno( String matricula,String nombre) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(matricula, alumno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}

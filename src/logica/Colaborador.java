/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Colaborador {
    
    private int cedula;
    private String nombre;
    private LocalDate fechaNac;
    private LocalDate fechaIngreso;
    private LocalDate fechaDespido;
    private String direccion;
    private int telefono;
    private String email;
    private Puestos puesto;
    private int cedJefe;

    public Colaborador(int cedula, String nombre, LocalDate fechaNac, LocalDate fechaIngreso, LocalDate fechaDespido, String direccion, int telefono, String email, Puestos puesto, int cedJefe) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.fechaIngreso = fechaIngreso;
        this.fechaDespido = fechaDespido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.puesto = puesto;
        this.cedJefe = cedJefe;
    }
    public Colaborador() {
        this.cedula = 0;
        this.nombre = "";
        this.fechaNac = null;
        this.fechaIngreso = null;
        this.fechaDespido = null;
        this.direccion = "";
        this.telefono = 0;
        this.email = "";
        this.puesto = null;
        this.cedJefe = 0;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaDespido() {
        return fechaDespido;
    }

    public void setFechaDespido(LocalDate fechaDespido) {
        this.fechaDespido = fechaDespido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Puestos getPuesto() {
        return puesto;
    }

    public void setPuesto(Puestos puesto) {
        this.puesto = puesto;
    }

    public int getCedJefe() {
        return cedJefe;
    }

    public void setCedJefe(int cedJefe) {
        this.cedJefe = cedJefe;
    }
    
    
    
}

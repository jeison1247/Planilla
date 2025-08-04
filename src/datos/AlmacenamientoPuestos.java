/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import logica.Puestos;

/**
 *
 * @author Student
 */
public class AlmacenamientoPuestos {
    private ArrayList<Puestos> listaPuestos;

    public AlmacenamientoPuestos() {
        this.listaPuestos = new ArrayList();
    }

    public ArrayList<Puestos> getListaPuestos() {
        return listaPuestos;
    }

    public void setListaPuestos(ArrayList<Puestos> listaPuestos) {
        this.listaPuestos = listaPuestos;
    }
    
    
    //METODOS DEL CRUD
    public void insertarPuesto(Puestos puesto){
        if(this.listaPuestos != null){
            this.listaPuestos.add(puesto);
        }
    }
    
    public boolean editarPuesto(Puestos puesto){
        if(this.listaPuestos.contains(puesto)){
            this.listaPuestos.remove(puesto);
            return true;
        }
        return false;//el puesto no existe en el arraylist
    }
}

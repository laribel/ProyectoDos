/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticados;

/**
 *
 * @author Laribel
 */
public class Persona {
     
    String nombre;
    String appellidos;
    int celular;
    int cedula;
    String email;

    public Persona(String nombre, String appellidos, int celular, int cedula, String email) {
        this.nombre = nombre;
        this.appellidos = appellidos;
        this.celular = celular;
        this.cedula = cedula;
        this.email = email;
    }
    
    public Persona(){
        this.nombre = "";
        this.appellidos = "";
        this.celular = 0;
        this.cedula = 0;
        this.email = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellidos() {
        return appellidos;
    }

    public void setAppellidos(String appellidos) {
        this.appellidos = appellidos;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
        
        
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   
    
    
}

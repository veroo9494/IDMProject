package Business.Entities;
// Generated 18/04/2017 09:37:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Municipio generated by hbm2java
 */
public class Municipio  implements java.io.Serializable {


     private Integer idMunicipio;
     private String nombre;
     private String descripcion;
     private boolean estado;
     private Set barrios = new HashSet(0);

    public Municipio() {
    }

	
    public Municipio(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    public Municipio(String nombre, String descripcion, boolean estado, Set barrios) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.estado = estado;
       this.barrios = barrios;
    }
   
    public Integer getIdMunicipio() {
        return this.idMunicipio;
    }
    
    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Set getBarrios() {
        return this.barrios;
    }
    
    public void setBarrios(Set barrios) {
        this.barrios = barrios;
    }




}



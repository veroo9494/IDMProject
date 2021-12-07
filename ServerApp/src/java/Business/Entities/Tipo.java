package Business.Entities;
// Generated 18/04/2017 09:37:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipo generated by hbm2java
 */
public class Tipo  implements java.io.Serializable {


     private Integer idTipo;
     private String nombre;
     private String descripcion;
     private boolean estado;
     private Set tipodetalles = new HashSet(0);

    public Tipo() {
    }

	
    public Tipo(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    public Tipo(String nombre, String descripcion, boolean estado, Set tipodetalles) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.estado = estado;
       this.tipodetalles = tipodetalles;
    }
   
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
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
    public Set getTipodetalles() {
        return this.tipodetalles;
    }
    
    public void setTipodetalles(Set tipodetalles) {
        this.tipodetalles = tipodetalles;
    }




}



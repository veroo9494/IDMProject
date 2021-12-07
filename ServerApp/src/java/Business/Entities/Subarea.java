package Business.Entities;
// Generated 18/04/2017 09:37:33 by Hibernate Tools 4.3.1



/**
 * Subarea generated by hbm2java
 */
public class Subarea  implements java.io.Serializable {


     private SubareaId id;
     private Area area;
     private String nombre;
     private String descripcion;
     private boolean estado;

    public Subarea() {
    }

	
    public Subarea(SubareaId id, Area area, String nombre, boolean estado) {
        this.id = id;
        this.area = area;
        this.nombre = nombre;
        this.estado = estado;
    }
    public Subarea(SubareaId id, Area area, String nombre, String descripcion, boolean estado) {
       this.id = id;
       this.area = area;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.estado = estado;
    }
   
    public SubareaId getId() {
        return this.id;
    }
    
    public void setId(SubareaId id) {
        this.id = id;
    }
    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
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




}



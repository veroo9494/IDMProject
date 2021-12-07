package Business.Entities;
// Generated 18/04/2017 09:37:33 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Servicio generated by hbm2java
 */
public class Servicio  implements java.io.Serializable {


     private Long idServicio;
     private Tiposervicio tiposervicio;
     private Ubicacionservicio ubicacionservicio;
     private String descripcion;
     private String rutaImagen;
     private short estado;
     private Date fechaIngreso;
     private Date fechaModificacion;
     private Integer idUsuarioFuncionario;
     private Integer tipoOrigen;
     private String observaciones;
     private Set historialservicios = new HashSet(0);
     private Set supervisors = new HashSet(0);
     private Set serviciosolicitantes = new HashSet(0);
     private Set empresas = new HashSet(0);

    public Servicio() {
    }

	
    public Servicio(Tiposervicio tiposervicio, Ubicacionservicio ubicacionservicio, short estado, Date fechaIngreso, Date fechaModificacion) {
        this.tiposervicio = tiposervicio;
        this.ubicacionservicio = ubicacionservicio;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.fechaModificacion = fechaModificacion;
    }
    public Servicio(Tiposervicio tiposervicio, Ubicacionservicio ubicacionservicio, String descripcion, String rutaImagen, short estado, Date fechaIngreso, Date fechaModificacion, Integer idUsuarioFuncionario, Integer tipoOrigen, String observaciones, Set historialservicios, Set supervisors, Set serviciosolicitantes, Set empresas) {
       this.tiposervicio = tiposervicio;
       this.ubicacionservicio = ubicacionservicio;
       this.descripcion = descripcion;
       this.rutaImagen = rutaImagen;
       this.estado = estado;
       this.fechaIngreso = fechaIngreso;
       this.fechaModificacion = fechaModificacion;
       this.idUsuarioFuncionario = idUsuarioFuncionario;
       this.tipoOrigen = tipoOrigen;
       this.observaciones = observaciones;
       this.historialservicios = historialservicios;
       this.supervisors = supervisors;
       this.serviciosolicitantes = serviciosolicitantes;
       this.empresas = empresas;
    }
   
    public Long getIdServicio() {
        return this.idServicio;
    }
    
    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }
    public Tiposervicio getTiposervicio() {
        return this.tiposervicio;
    }
    
    public void setTiposervicio(Tiposervicio tiposervicio) {
        this.tiposervicio = tiposervicio;
    }
    public Ubicacionservicio getUbicacionservicio() {
        return this.ubicacionservicio;
    }
    
    public void setUbicacionservicio(Ubicacionservicio ubicacionservicio) {
        this.ubicacionservicio = ubicacionservicio;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getRutaImagen() {
        return this.rutaImagen;
    }
    
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    public short getEstado() {
        return this.estado;
    }
    
    public void setEstado(short estado) {
        this.estado = estado;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Integer getIdUsuarioFuncionario() {
        return this.idUsuarioFuncionario;
    }
    
    public void setIdUsuarioFuncionario(Integer idUsuarioFuncionario) {
        this.idUsuarioFuncionario = idUsuarioFuncionario;
    }
    public Integer getTipoOrigen() {
        return this.tipoOrigen;
    }
    
    public void setTipoOrigen(Integer tipoOrigen) {
        this.tipoOrigen = tipoOrigen;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Set getHistorialservicios() {
        return this.historialservicios;
    }
    
    public void setHistorialservicios(Set historialservicios) {
        this.historialservicios = historialservicios;
    }
    public Set getSupervisors() {
        return this.supervisors;
    }
    
    public void setSupervisors(Set supervisors) {
        this.supervisors = supervisors;
    }
    public Set getServiciosolicitantes() {
        return this.serviciosolicitantes;
    }
    
    public void setServiciosolicitantes(Set serviciosolicitantes) {
        this.serviciosolicitantes = serviciosolicitantes;
    }
    public Set getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Set empresas) {
        this.empresas = empresas;
    }




}


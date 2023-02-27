/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iticket.grupo4.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author yulien
 */

@Entity
@Table (name="Concierto")
public class Concierto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreartista;
    private double costo;
    private String fecha;
    private int capacidad;
    private String lugar;
    
    @ManyToOne
    @JoinColumn(name="concierto_id")
    private Concierto concierto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreartista() {
        return nombreartista;
    }

    public void setNombreartista(String nombreartista) {
        this.nombreartista = nombreartista;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Concierto getConcierto() {
        return concierto;
    }

    public void setConcierto(Concierto concierto) {
        this.concierto = concierto;
    }

  

    public void setPais(Concierto concierto) {
        this.concierto = concierto;
    }
    
    
    
}


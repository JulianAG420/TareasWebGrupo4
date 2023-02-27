/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iticket.grupo4.Service;


import iticket.grupo4.Entity.Concierto;
import java.util.List;

/**
 *
 * @author yulien
 */
public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public Concierto getConciertoById (long id);
    public void saveConcierto(Concierto concierto);
    public void delete (long id);
}

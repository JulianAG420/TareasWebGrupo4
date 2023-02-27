/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iticket.grupo4.Repository;

import iticket.grupo4.Entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author yulien
 */
@Repository
public interface ConciertoRepository extends CrudRepository<Concierto,Long>{
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iticket.grupo4.Controller;



import iticket.grupo4.Entity.Concierto;

import iticket.grupo4.Service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author yulien
 */

@Controller
public class ConciertoController {
    
    @Autowired
    private IConciertoService conciertoService;
    

    @GetMapping("/concierto")
    public String index(Model model){
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla concierto");
        model.addAttribute("concierto", listaConcierto);
        return "concierto";
        
        
        
        
    }
    
     @GetMapping("/conciertoN")
    public String CrearConcierto(Model model){
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("Concierto", new Concierto());
        return "Crear";
        
        
        
        
    }
}

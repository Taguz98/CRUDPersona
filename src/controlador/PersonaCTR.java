/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.PersonaElimUI;
import vista.PersonaFrmUI;
import vista.PersonaUI;

/**
 *
 * @author Usuario
 */
public class PersonaCTR {
    
    private final PersonaUI vtnPersona;
    
    public PersonaCTR(PersonaUI vtnPersona){
        this.vtnPersona = vtnPersona;
        vtnPersona.setVisible(true); 
    }
    
    public void iniciar(){ 
        
        //Le daremos funcionamiento a los botones  
        vtnPersona.getBtnNuevo().addActionListener(e -> nueva());
        vtnPersona.getBtnEditar().addActionListener(e -> editar());
        vtnPersona.getBtnEliminar().addActionListener(e -> eliminar()); 
    }
    
    //Con este metodo iniciaremos el controlador para ingresar una nueva persona
    public void nueva(){
        PersonaFrmUI frmPer = new PersonaFrmUI(); 
        NuevaCTR nv = new NuevaCTR(frmPer, vtnPersona);
        nv.iniciar();
    }
    
    //Con este metodo eliminaremos a la persona seleccionada 
    public void eliminar(){ 
        PersonaElimUI elimPer = new PersonaElimUI(); 
        EliminarCTR elm = new EliminarCTR(elimPer, vtnPersona);
        elm.iniciar();
        
    }
    
    //Con este metodo editaremos a la persona selecciona
    public void editar(){
        PersonaFrmUI frmPer = new PersonaFrmUI(); 
        EditarCTR ed = new EditarCTR(frmPer, vtnPersona); 
        ed.iniciar();
    }
    
    
}

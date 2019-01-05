/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.PersonaElimUI;
import vista.PersonaUI;

/**
 *
 * @author Usuario
 */
public class EliminarCTR {
    
    private final PersonaElimUI elimPersona; 
    private final PersonaUI vtnPersona; 
    
    public EliminarCTR(PersonaElimUI elimPersona, PersonaUI vtnPersona){ 
        this.elimPersona = elimPersona; 
        this.vtnPersona = vtnPersona; 
        
        vtnPersona.setEnabled(false);
        elimPersona.setVisible(true); 
    }
    
    public void iniciar(){
        elimPersona.getBtnCancelar().addActionListener(e -> cancelar());
    }
    
    public void cancelar(){ 
        
        vtnPersona.setEnabled(true); 
        elimPersona.dispose();
    }
    
}

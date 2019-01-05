package controlador;

import vista.PersonaFrmUI;
import vista.PersonaUI;

/**
 *
 * @author Usuario
 */
public class NuevaCTR {
    
    private final PersonaFrmUI frmPersona; 
    private final PersonaUI vtnPersona; 
    
    public NuevaCTR(PersonaFrmUI frmPersona, PersonaUI vtnPersona){ 
        this.frmPersona = frmPersona;
        this.vtnPersona = vtnPersona; 
        
        frmPersona.setVisible(true); 
        vtnPersona.setEnabled(false); 
    }
    
    public void iniciar(){ 
        //Le daremos una accion al boton cancelar
        frmPersona.getBtnCancelar().addActionListener( e-> cancelar());
    }
    
    //Cerraremos la venta del formulario de una persona y habilitaremos la ventana principal
    public void cancelar(){ 
        vtnPersona.setEnabled(true);
        frmPersona.dispose(); 
    }
    
}

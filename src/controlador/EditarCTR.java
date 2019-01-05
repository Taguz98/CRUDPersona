package controlador;

import vista.PersonaFrmUI;
import vista.PersonaUI;

/**
 *
 * @author Usuario
 */
public class EditarCTR {
    private final PersonaFrmUI frmPersona; 
    private final PersonaUI vtnPersona; 

    public EditarCTR(PersonaFrmUI frmPersona, PersonaUI vtnPersona) {
        this.frmPersona = frmPersona;
        this.vtnPersona = vtnPersona;
        
        frmPersona.setVisible(true);
        frmPersona.getLblTituloVtn().setText("Editar");
        vtnPersona.setEnabled(false);
    }
    
    public void iniciar(){ 
         frmPersona.getBtnCancelar().addActionListener(e -> cancelar());
    }
    
    public void cancelar(){ 
        vtnPersona.setEnabled(true);
        frmPersona.dispose();
    }
    
    
}

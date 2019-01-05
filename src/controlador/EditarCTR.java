package controlador;

import modelo.estilo.BtnHover;
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
        //Le pasamos todas las animaciones alos btns de esta ventana 
        frmPersona.getBtnCancelar().addMouseListener(new BtnHover(frmPersona.getBtnCancelar())); 
        frmPersona.getBtnGuardar().addMouseListener(new BtnHover(frmPersona.getBtnGuardar()));  
        
        ocultarLbl();
        
        frmPersona.getBtnCancelar().addActionListener(e -> cancelar());
    }
    
    public void ocultarLbl(){ 
        //Oculatamos todos los lbl de error
        frmPersona.getLblErrorApellido().setVisible(false);
        frmPersona.getLblErrorCedula().setVisible(false);
        frmPersona.getLblErrorFechaNac().setVisible(false);
        frmPersona.getLblErrorNombre().setVisible(false);
        frmPersona.getLblErrorSueldo().setVisible(false);
        frmPersona.getLblErrorTelefono().setVisible(false);
    }
    
    public void cancelar(){ 
        vtnPersona.setEnabled(true);
        frmPersona.dispose();
    }
    
    
}

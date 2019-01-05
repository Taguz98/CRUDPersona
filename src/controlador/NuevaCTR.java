package controlador;

import modelo.estilo.BtnHover;
import modelo.estilo.VtnBorde;
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
        //Le agregamos las animaciones a las ventanas  
        frmPersona.getBtnCancelar().addMouseListener(new BtnHover(frmPersona.getBtnCancelar())); 
        frmPersona.getBtnGuardar().addMouseListener(new BtnHover(frmPersona.getBtnGuardar()));  
        
        //Le agregamos la animacion de borde  
        frmPersona.addWindowFocusListener(new VtnBorde(frmPersona.getPnlFondo()));
        
        ocultarLbl();
        
        //Le daremos una accion al boton cancelar
        frmPersona.getBtnCancelar().addActionListener( e-> cancelar());
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
    
    //Cerraremos la venta del formulario de una persona y habilitaremos la ventana principal
    public void cancelar(){ 
        vtnPersona.setEnabled(true);
        frmPersona.dispose(); 
    }
    
}

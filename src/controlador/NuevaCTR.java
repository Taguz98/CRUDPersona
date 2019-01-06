package controlador;

import java.time.LocalDate;
import java.time.Month;
import modelo.PersonaDB;
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
    private final PersonaDB persona; 
    
    public NuevaCTR(PersonaFrmUI frmPersona, PersonaUI vtnPersona, PersonaDB persona){ 
        this.frmPersona = frmPersona;
        this.vtnPersona = vtnPersona; 
        this.persona = persona;
        
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
        frmPersona.getBtnGuardar().addActionListener( e-> guardar());
    }
    
    public void guardar(){ 
        boolean guardar = true; 
        String anio = frmPersona.getTxtAnio().getText(); 
        String apellido = frmPersona.getTxtApellido().getText(); 
        String cedula = frmPersona.getTxtCedula().getText(); 
        String dia = frmPersona.getTxtDia().getText(); 
        String mes = frmPersona.getTxtMes().getText(); 
        String nombre = frmPersona.getTxtNombre().getText();
        String sueldo = frmPersona.getTxtSueldo().getText(); 
        String telefono = frmPersona.getTxtTelefono().getText(); 
        char sexo; 
        
        if (frmPersona.getBtnrFemenino().isSelected()) {
            sexo = 'F'; 
        }else{
            sexo = 'M';
        }
        
        if (anio.length() == 0) {
            guardar = false; 
        }
        
        if (apellido.length() == 0) {
            guardar = false;
        }
        
        if (cedula.length() == 0) {
            guardar = false;
        }
        
        if (dia.length() == 0) {
            guardar = false;
        }
        
        if (mes.length() == 0) {
            guardar = false;
        }
        
        if (nombre.length() == 0) {
            guardar = false;
        }
        
        if (sueldo.length() == 0) {
            guardar = false;
        }
        
        if (telefono.length() == 0) {
            guardar = false;
        }
        
        //Si no existe ningun error guardamos
        if (guardar) {
            
            persona.setApellido(apellido);
            persona.setCedula(cedula);
            LocalDate fn = LocalDate.of(Integer.parseInt(anio), Integer.parseInt(mes), Integer.parseInt(dia));
            persona.setFechaNacimiento(fn);
            persona.setNombre(nombre);
            persona.setSexo(sexo);
            persona.setSueldo(Double.parseDouble(sueldo)); 
            persona.setTelefono(telefono);
            //Guardamos la personas en base de datos
            //Si se guardao enviamos el mensaje de guardado y cerramos la ventana 
            if(persona.guardarPersona()){
                vtnPersona.setEnabled(true); 
                vtnPersona.getLblMensaje().setText("Se guardo a "+persona.getNombre()+" "+persona.getApellido()+" correctamente.");
                frmPersona.dispose(); 
            }else{
                vtnPersona.getLblMensaje().setText("No se pudo guardar a "+persona.getNombre()+" "+persona.getApellido()+" correctamente.");
            };
            
            
        }
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

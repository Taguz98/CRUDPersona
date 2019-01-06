package controlador;

import java.time.LocalDate;
import modelo.PersonaDB;
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
    private PersonaDB persona;
    private final String id;

    public EditarCTR(PersonaFrmUI frmPersona, PersonaUI vtnPersona, PersonaDB persona, String id) {
        this.frmPersona = frmPersona;
        this.vtnPersona = vtnPersona;
        this.persona = persona;
        this.id = id;

        frmPersona.setVisible(true);
        frmPersona.getLblTituloVtn().setText("Editar");
        vtnPersona.setEnabled(false);
    }

    public void iniciar() {
        //Le pasamos todas las animaciones alos btns de esta ventana 
        frmPersona.getBtnCancelar().addMouseListener(new BtnHover(frmPersona.getBtnCancelar()));
        frmPersona.getBtnGuardar().addMouseListener(new BtnHover(frmPersona.getBtnGuardar()));

        ocultarLbl();
        
        cargarFormulario();
        
        //Les asignamos acciones a nuestros botones
        frmPersona.getBtnCancelar().addActionListener(e -> cancelar());
        frmPersona.getBtnGuardar().addActionListener(e -> guardar());
    }

    public void cargarFormulario() {
        System.out.println("Estes es el id "+id);
        persona = persona.consultaPersona(id);
        if (persona != null) {
            frmPersona.getTxtAnio().setText(persona.getFechaNacimiento().getYear()+""); 
            frmPersona.getTxtApellido().setText(persona.getApellido());
            frmPersona.getTxtCedula().setText(persona.getCedula());
            frmPersona.getTxtDia().setText(persona.getFechaNacimiento().getDayOfMonth()+"");
            frmPersona.getTxtMes().setText(persona.getFechaNacimiento().getMonthValue()+"");
            frmPersona.getTxtNombre().setText(persona.getNombre());
            frmPersona.getTxtSueldo().setText(persona.getSueldo()+"");
            frmPersona.getTxtTelefono().setText(persona.getTelefono());
            
            if (persona.getSexo() == 'F') {
                frmPersona.getBtnrFemenino().setSelected(true);
            }else{
                frmPersona.getBtnrMasculino().setSelected(true);
            }
            
            //Desabilitamos el campo de cedula porque ese no se puede editar 
            frmPersona.getTxtCedula().setEnabled(false); 
        } 
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
            if(persona.editarPersona(id)){
                vtnPersona.setEnabled(true); 
                vtnPersona.getLblMensaje().setText("Se edito a "+persona.getNombre()+" "+persona.getApellido()+" correctamente.");
                frmPersona.dispose(); 
            }else{
                vtnPersona.getLblMensaje().setText("No se pudo editar a "+persona.getNombre()+" "+persona.getApellido()+" correctamente.");
            };
            
            
        }
    }

    public void ocultarLbl() {
        //Oculatamos todos los lbl de error
        frmPersona.getLblErrorApellido().setVisible(false);
        frmPersona.getLblErrorCedula().setVisible(false);
        frmPersona.getLblErrorFechaNac().setVisible(false);
        frmPersona.getLblErrorNombre().setVisible(false);
        frmPersona.getLblErrorSueldo().setVisible(false);
        frmPersona.getLblErrorTelefono().setVisible(false);
    }

    public void cancelar() {
        vtnPersona.setEnabled(true);
        frmPersona.dispose();
    }

}

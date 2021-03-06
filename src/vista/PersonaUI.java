package vista;

import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class PersonaUI extends javax.swing.JFrame {

    //Esto lo uso para mover la ventana  
    private int mouseX; 
    private int mouseY;
    
    public PersonaUI() {
        initComponents();
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public JComboBox<String> getCbFiltro() {
        return cbFiltro;
    }

    public JLabel getLblMensaje() {
        return lblMensaje;
    }

    public JTable getTblPersonas() {
        return tblPersonas;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public JPanel getPnlFondo() {
        return pnlFondo;
    }

    public JScrollPane getScrollTblPersona() {
        return scrollTblPersona;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        bntCerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        scrollTblPersona = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(642, 482));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(24, 131, 215), 3));
        pnlFondo.setMinimumSize(new java.awt.Dimension(642, 482));
        pnlFondo.setPreferredSize(new java.awt.Dimension(642, 482));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(27, 49, 71));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Subtract_30px.png"))); // NOI18N
        btnMinimizar.setToolTipText("");
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Subtract_30px_1.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        pnlHeader.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 20));

        bntCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_30px.png"))); // NOI18N
        bntCerrar.setToolTipText("");
        bntCerrar.setBorder(null);
        bntCerrar.setBorderPainted(false);
        bntCerrar.setContentAreaFilled(false);
        bntCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bntCerrar.setFocusPainted(false);
        bntCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_30px_1.png"))); // NOI18N
        bntCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntCerrarMouseClicked(evt);
            }
        });
        pnlHeader.add(bntCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Persona");
        pnlHeader.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 30));

        pnlFondo.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 640, 30));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMensaje.setBackground(new java.awt.Color(66, 88, 110));
        lblMensaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setOpaque(true);
        pnlPrincipal.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 620, 30));

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.setText("Búsqueda");
        pnlPrincipal.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ordenar por:");
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 90, 30));

        cbFiltro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbFiltro.setForeground(new java.awt.Color(51, 51, 51));
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Cedula" }));
        pnlPrincipal.add(cbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Buscar:");
        pnlPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        btnActualizar.setBackground(new java.awt.Color(66, 88, 110));
        btnActualizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setFocusPainted(false);
        btnActualizar.setOpaque(true);
        pnlPrincipal.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 90, 30));

        btnNuevo.setBackground(new java.awt.Color(66, 88, 110));
        btnNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.setOpaque(true);
        pnlPrincipal.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 30));

        btnEditar.setBackground(new java.awt.Color(66, 88, 110));
        btnEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.setOpaque(true);
        pnlPrincipal.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 90, 30));

        btnEliminar.setBackground(new java.awt.Color(66, 88, 110));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setOpaque(true);
        pnlPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 90, 30));

        scrollTblPersona.setBackground(new java.awt.Color(255, 255, 255));

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido"
            }
        ));
        tblPersonas.setSelectionBackground(new java.awt.Color(65, 87, 108));
        scrollTblPersona.setViewportView(tblPersonas);

        pnlPrincipal.add(scrollTblPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 310));

        pnlFondo.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 31, 640, 450));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 642, 482));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCerrarMouseClicked
        System.exit(0); 
    }//GEN-LAST:event_bntCerrarMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        //Al presionar el mause en el panel se cantura las posiciones 
        mouseX = evt.getX(); 
        mouseY = evt.getY(); 
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        //Al tener sostenido el click se captura las posiciones  
        int x = evt.getXOnScreen(); 
        int y = evt.getYOnScreen(); 
        //Cambiamos la posicion del frame pasandole una posicion 
        //Restamos la posicion actual menos la posicion general 
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_pnlHeaderMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCerrar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrollTblPersona;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

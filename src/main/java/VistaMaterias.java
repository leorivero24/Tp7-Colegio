
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author Leonardo
 */
public class VistaMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewFormularioMaterias
     */
    private HashSet<Materia> materias;

    public VistaMaterias(HashSet<Materia> materias) {
        initComponents();
        this.materias = materias;
    }

    public VistaMaterias() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtNombreMateria = new javax.swing.JTextField();
        jtAnioMateria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtIdMateria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Codigo de materia:");

        jLabel2.setText("Nombre de la materia:");

        jLabel3.setText("Año al que pertenece:");

        jtNombreMateria.setBackground(new java.awt.Color(0, 153, 255));

        jtAnioMateria.setBackground(new java.awt.Color(0, 153, 255));
        jtAnioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAnioMateriaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jtIdMateria.setBackground(new java.awt.Color(0, 153, 255));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("FORMULARIO MATERIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 112, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(101, 101, 101)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtAnioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAnioMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAnioMateriaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombre = jtNombreMateria.getText();
        int idMateria = 0;
        int anio = 0;
        if (!validarIdAnio(jtIdMateria.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Dato Id incorrecto >> Intente nuevamente...","Error!",JOptionPane.ERROR_MESSAGE);
            jtIdMateria.requestFocus();
            jtIdMateria.setText("");
        } else if (jtIdMateria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CAMPO ID >> VACIO!!","Advertencia!",JOptionPane.WARNING_MESSAGE);
        } else if (!validarNombreMateria(jtNombreMateria.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Dato Materia incorrecto >> Intente nuevamente...","Error!",JOptionPane.ERROR_MESSAGE);
            jtNombreMateria.requestFocus();
            jtNombreMateria.setText("");
        } else if (jtNombreMateria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CAMPO MATERIA >> VACIO!!","Advertencia!",JOptionPane.WARNING_MESSAGE);
        } else if (!validarIdAnio(jtAnioMateria.getText())) {
            JOptionPane.showMessageDialog(this, "Dato Año incorrecto >> Intente nuevamente...","Error!",JOptionPane.ERROR_MESSAGE);
            jtAnioMateria.requestFocus();
            jtAnioMateria.setText("");
        } else if (jtAnioMateria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CAMPO AÑO >> VACIO!!","Advertencia!",JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                idMateria = Integer.parseInt(jtIdMateria.getText());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El id ingresado de la materia es incorrecto, por favor ingrese un id valido");
                jtIdMateria.requestFocus();

            }
            try {
                anio = Integer.parseInt(jtAnioMateria.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El anio ingresado de la materia es incorrecto, por favor ingrese un anio valido");
                jtAnioMateria.requestFocus();
            }
            Materia m1 = new Materia(idMateria, nombre, anio);
            boolean resultado = materias.add(m1);
            if (resultado) {
                JOptionPane.showMessageDialog(this, "Materia Registrada!!","Informacion",JOptionPane.INFORMATION_MESSAGE);
                limpiarMaterias();
            } else {
                JOptionPane.showMessageDialog(this, "Materia No Registrada..","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiarMaterias();
    }//GEN-LAST:event_jButton2ActionPerformed
    public static boolean validarIdAnio(String idAnio) {
        return idAnio.matches("[0-9]*");
    }

    public static boolean validarNombreMateria(String nombreMateria) {
        return nombreMateria.matches("[a-z A-Z]*");
    }
   
    public void limpiarMaterias() {
        jtAnioMateria.setText("");
        jtIdMateria.setText("");
        jtNombreMateria.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtAnioMateria;
    private javax.swing.JTextField jtIdMateria;
    private javax.swing.JTextField jtNombreMateria;
    // End of variables declaration//GEN-END:variables
}

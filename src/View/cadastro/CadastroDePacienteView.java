
package View.cadastro;

import Controller.PacienteController;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

public class CadastroDePacienteView extends javax.swing.JPanel {
private JTabbedPane tabbedPane;
    
    public CadastroDePacienteView(JTabbedPane tabbedPanel) 
    {
        this.tabbedPane = tabbedPanel;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textFieldEndereco = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldQuarto = new javax.swing.JTextField();
        textFieldDiasDeInternado = new javax.swing.JTextField();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldDoenca = new javax.swing.JTextField();
        comboBoxPlanoDeSaude = new javax.swing.JComboBox<>();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        jLabel1.setText("Cadastro de Paciente");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Email");

        jLabel5.setText("Quarto");

        jLabel6.setText("Dias de Internado");

        jLabel7.setText("Telefone");

        jLabel8.setText("Doença");

        jLabel9.setText("Plano de Saude");

        textFieldDiasDeInternado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDiasDeInternadoActionPerformed(evt);
            }
        });

        comboBoxPlanoDeSaude.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        comboBoxPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPlanoDeSaudeActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(316, 316, 316)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldDiasDeInternado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxPlanoDeSaude, 0, 156, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldNome)
                                .addComponent(textFieldEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textFieldQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldTelefone)
                                    .addComponent(textFieldDoenca, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancelar)))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(textFieldQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldDiasDeInternado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPlanoDeSaudeActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
       
        if (JOptionPane.showConfirmDialog(this,"Desea salir sin salvar los datos?","confirmação",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) 
        {
            tabbedPane.remove(this);
            tabbedPane.validate();
            tabbedPane.repaint();
        }
        
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
if (textFieldNome != null && !textFieldNome.getText().equals("")&& textFieldEmail != null && !textFieldEmail.getText().equals("") && textFieldEndereco != null && !textFieldEndereco.getText().equals ("") && textFieldDoenca != null && !textFieldDoenca.getText().equals("") ) 
{PacienteController pc = new PacienteController();
try 
{
pc.inserir(textFieldNome.getText(),textFieldEmail.getText(),textFieldEndereco.getText(),textFieldTelefone.getText(),textFieldQuarto.getText(),textFieldDoenca.getText(),textFieldDiasDeInternado.getText(),(String)comboBoxPlanoDeSaude.getSelectedItem());
JOptionPane.showMessageDialog(this,"Contato salvo com susceso!","sucesso",JOptionPane.INFORMATION_MESSAGE);
limparDados();
}
catch (Exception e)
{
    JOptionPane.showMessageDialog(this,"não foi posivel salvar","error",JOptionPane.ERROR_MESSAGE);
    
}
}else
{
JOptionPane.showMessageDialog(this,"O NOME, EMAIL, ENDEREÇO E DOENÇA DO" +  "PACIENTE SÃO CAMPOS OBLIGATORIOS!","ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_buttonSalvarActionPerformed
    }
    private void textFieldDiasDeInternadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDiasDeInternadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDiasDeInternadoActionPerformed
    
private void limparDados( )
        {
            textFieldNome.setText("");
            textFieldEmail.setText("");
            textFieldEndereco.setText("");
            textFieldTelefone.setText("");
            textFieldQuarto.setText("");
            textFieldDoenca.setText("");
            textFieldDiasDeInternado.setText("");
            comboBoxPlanoDeSaude.setSelectedItem(0);
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboBoxPlanoDeSaude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textFieldDiasDeInternado;
    private javax.swing.JTextField textFieldDoenca;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldQuarto;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables

}

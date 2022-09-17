package javasort;

import com.sun.tools.javac.util.Convert;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {

    ArrayList<Dados_MC_India_Ajustado> lista = new ArrayList<>();

    Comparator<Dados_MC_India_Ajustado> compareEnergyKcal
            = (Dados_MC_India_Ajustado a1, Dados_MC_India_Ajustado a2)
            -> Double.compare(a1.getEnergyKcal(), a2.getEnergyKcal());

    Comparator<Dados_MC_India_Ajustado> compareProteinGrams
            = (Dados_MC_India_Ajustado a1, Dados_MC_India_Ajustado a2)
            -> Double.compare(a1.getProteinG(), a2.getProteinG());

    Comparator<Dados_MC_India_Ajustado> compareTotalFatGrams
            = (Dados_MC_India_Ajustado a1, Dados_MC_India_Ajustado a2)
            -> Double.compare(a1.getTotalFatG(), a2.getTotalFatG());

    Comparator<Dados_MC_India_Ajustado> compareSatFatGrams
            = (Dados_MC_India_Ajustado a1, Dados_MC_India_Ajustado a2)
            -> Double.compare(a1.getSatFatG(), a2.getSatFatG());

    Comparator<Dados_MC_India_Ajustado> compareTransFatGrams
            = (Dados_MC_India_Ajustado a1, Dados_MC_India_Ajustado a2)
            -> Double.compare(a1.getTransFatG(), a2.getTransFatG());

    public FormSistema() {
        initComponents();
        carregaArquivo();
    }

    //dados_tempo_import
    //India_Menu
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        btnOrdNome1 = new javax.swing.JButton();
        btnBuscaSequencial = new javax.swing.JButton();
        btnBuscaBinaria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        menuCategory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        lblProx.setBackground(new java.awt.Color(153, 153, 255));
        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 102, 0));
        lblProx.setText("Sistema de Informações Nutricionais para itens do cardápio indiano do McDonald's");
        lblProx.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setBackground(new java.awt.Color(204, 255, 204));
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaDados.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tabelaDados.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EnergyKcal", "Protein (g)", "Total fat (g)", "Sat  fat (g)", "Trans fat (g)" }));
        cbOrdena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnOrdNome1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list (1).png"))); // NOI18N
        btnOrdNome1.setText("Ordena");
        btnOrdNome1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNome1ActionPerformed(evt);
            }
        });

        btnBuscaSequencial.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBuscaSequencial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/busca.png"))); // NOI18N
        btnBuscaSequencial.setText("BuscaSequencial");
        btnBuscaSequencial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscaSequencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaSequencialActionPerformed(evt);
            }
        });

        btnBuscaBinaria.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBuscaBinaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/busca.png"))); // NOI18N
        btnBuscaBinaria.setText("BuscaBinaria");
        btnBuscaBinaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaBinariaActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor p/ busca:");

        jLabel4.setText("ItemMenuCategory");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SELETOR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtValor))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscaSequencial, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscaBinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(148, 148, 148))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnOrdNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(menuCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscaSequencial, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscaBinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/mc.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo() {
        String csvFile = "India_Menu_Ajustado.csv";
        String line = "";
        String[] leitura = null;
        try ( BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {

                Dados_MC_India_Ajustado dMC_India_ajustado = new Dados_MC_India_Ajustado();
                leitura = line.split(",");
                dMC_India_ajustado.setMenuCategory(leitura[0]);
                dMC_India_ajustado.setMenuItens(leitura[1]);
                dMC_India_ajustado.setPerServeSize(leitura[2]);
                dMC_India_ajustado.setEnergyKcal(Double.parseDouble(leitura[3]));
                dMC_India_ajustado.setProteinG(Double.parseDouble(leitura[4]));
                dMC_India_ajustado.setTotalFatG(Double.parseDouble(leitura[5]));
                dMC_India_ajustado.setSatFatG(Double.parseDouble(leitura[6]));
                dMC_India_ajustado.setTransFatG(Double.parseDouble(leitura[7]));

                lista.add(dMC_India_ajustado);
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra() {

        tabelaDados.setModel(new DefaultTableModel(null, new String[]{"MenuCategory", "MenuItens", "PerServeSize", "Energy (kcal)", "Protein (g)", "Total fat (g)", "Sat fat (g)", "Trans fat (g)"}));

        DefaultTableModel model
                = (DefaultTableModel) tabelaDados.getModel();
        Object rowData[] = new Object[8];// qtd colunas

        for (Dados_MC_India_Ajustado dataMC_India_aux : lista) {

            rowData[0] = dataMC_India_aux.getMenuCategory();
            rowData[1] = dataMC_India_aux.getMenuItens();
            rowData[2] = dataMC_India_aux.getPerServeSize();
            rowData[3] = dataMC_India_aux.getEnergyKcal();
            rowData[4] = dataMC_India_aux.getProteinG();
            rowData[5] = dataMC_India_aux.getTotalFatG();
            rowData[6] = dataMC_India_aux.getSatFatG();
            rowData[7] = dataMC_India_aux.getTransFatG();

            model.addRow(rowData);
        }// fim preenche modelo
    }// fim mostra


    private void btnOrdNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNome1ActionPerformed
        switch (cbOrdena.getSelectedIndex()) {
            case 0:

                lista.sort(compareEnergyKcal);
                break;
            case 1:
                //Collections.sort(lista);
                lista.sort(compareProteinGrams);

                break;
            case 2:

                lista.sort(compareTotalFatGrams);
                break;
            case 3:

                lista.sort(compareSatFatGrams);
                break;
            case 4:

                lista.sort(compareTransFatGrams);
                break;

        }
        mostra();
    }//GEN-LAST:event_btnOrdNome1ActionPerformed

    private void btnBuscaSequencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaSequencialActionPerformed
        // TODO add your handling code here:
        int comp = 0;
        switch (cbOrdena.getSelectedIndex()) {
            case 0:
                //coloca o 'for' abaixo dentro de um if para que se o btn da busca
                //sequencial for acionada faça o loop
                for (Dados_MC_India_Ajustado dAux : lista) {
                    comp++;
                    if (Double.parseDouble(txtValor.getText()) == dAux.getEnergyKcal()
                            && dAux.getMenuCategory().equals(menuCategory.getText())) {

                        JOptionPane.showMessageDialog(null, "MenuCategory: " + menuCategory.getText()
                                + "->consta energy! " + dAux.getEnergyKcal() + "kcal comp: " + comp);
                        return;
                    }
                }
                //AQUI EH O TRECHO DE CODIGO DA BUSCA BINARIA, BASTA ADAPTAR!!
                //a busca binaria eh soh para um atributo, nesse meu caso o EnergyKcal
                //nao precisa aplicar esse comando nos demais trechos de codigo..
                //
                /*else if (opBinaria.isSelected()) {

                    Dados_MC_India_Ajustado dAux = new Dados_MC_India_Ajustado();

                    dAux.setEnergyKcal(Double.parseDouble(txtValor.getText()));
                    int pos = Collections.binarySearch(lista, dAux, compareEnergyKcal);
                    if (pos > 0) {
                        pos++;
                        JOptionPane.showMessageDialog(null, "Encontrado Energy Kcal -> "
                                + dAux.getEnergyKcal() + "kcal" + " -> posicao: " + pos);

                        return;
                    }else
                        JOptionPane.showMessageDialog(null, "valor nao existe para EnergyKcal");

                    }*/
                break;
            //return;
            case 1:
                for (Dados_MC_India_Ajustado dAux : lista) {
                    comp++;
                    if (Double.parseDouble(txtValor.getText()) == dAux.getProteinG()
                            && dAux.getMenuCategory().equals(menuCategory.getText())) {
                        JOptionPane.showMessageDialog(null, "MenuCategory: " + menuCategory.getText()
                                + "->consta protein! " + dAux.getProteinG() + "g comp: " + comp);
                        return;
                    }
                }

                break;
            //return;
            case 2:
                for (Dados_MC_India_Ajustado dAux : lista) {
                    comp++;
                    if (Double.parseDouble(txtValor.getText()) == dAux.getTotalFatG()
                            && dAux.getMenuCategory().equals(menuCategory.getText())) {
                        JOptionPane.showMessageDialog(null, "MenuCategory: " + menuCategory.getText()
                                + "->consta total fat! " + dAux.getTotalFatG() + "g comp: " + comp);
                        return;
                    }
                }

                break;
            //return;
            case 3:
                for (Dados_MC_India_Ajustado dAux : lista) {
                    comp++;
                    if (Double.parseDouble(txtValor.getText()) == dAux.getSatFatG()
                            && dAux.getMenuCategory().equals(menuCategory.getText())) {
                        JOptionPane.showMessageDialog(null, "MenuCategory: " + menuCategory.getText()
                                + "->consta sat fat! " + dAux.getSatFatG() + "g comp: " + comp);
                        return;
                    }
                }

                break;
            //return;            //return;

            case 4:
                for (Dados_MC_India_Ajustado dAux : lista) {
                    comp++;
                    if (Double.parseDouble(txtValor.getText()) == dAux.getTransFatG()
                            && dAux.getMenuCategory().equals(menuCategory.getText())) {

                        JOptionPane.showMessageDialog(null, "MenuCategory: " + menuCategory.getText()
                                + "->consta trans fat! " + dAux.getTransFatG() + "g comp: " + comp);
                        return;
                    }
                }

                break;
            //return;

        }
        JOptionPane.showMessageDialog(null, "nao tem");
    }//GEN-LAST:event_btnBuscaSequencialActionPerformed

    private void btnBuscaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaBinariaActionPerformed
        // TODO add your handling code here:
           
    }//GEN-LAST:event_btnBuscaBinariaActionPerformed

    /**
         * @param args the command line arguments
         */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaBinaria;
    private javax.swing.JButton btnBuscaSequencial;
    private javax.swing.JButton btnOrdNome1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JTextField menuCategory;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.outros;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.visao.Cidade.CadCidade;
import com.mycompany.visao.Cidade.ListCidade;
import com.mycompany.visao.Endereco.CadEndereco;
import com.mycompany.visao.Endereco.ListEndereco;
import com.mycompany.visao.Estado.CadEstado;
import com.mycompany.visao.Estado.ListEstado;
import com.mycompany.visao.EstadoCivil.CadEstadoCivil;
import com.mycompany.visao.EstadoCivil.ListEstadoCivil;
import com.mycompany.visao.Marca.CadMarca;
import com.mycompany.visao.Marca.ListMarca;
import com.mycompany.visao.Pessoa.CadPessoa;
import com.mycompany.visao.Pessoa.ListPessoa;
import com.mycompany.visao.Produto.CadProduto;
import com.mycompany.visao.Produto.ListProduto;
import com.mycompany.visao.categoria.CadCategoria;
import com.mycompany.visao.categoria.ListCategoria;
import com.mycompany.visao.pais.CadPais;
import com.mycompany.visao.pais.ListPais;
import com.mycompany.visao.pedido.ListPedido;
import javax.swing.JOptionPane;

/**
 *
 * @author batista.4995
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        setExtendedState(MAXIMIZED_BOTH);
        
        if (!BancoDeDadosMySql.conectar()){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. O sistema será finalizado.");
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmCadastroCidade = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jmcadastroEstado = new javax.swing.JMenuItem();
        jmCadastroEndereço = new javax.swing.JMenuItem();
        jmCadastrosProduto = new javax.swing.JMenuItem();
        jmCadastrosPessoa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmConsultaCidade = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jmconsultaEstado = new javax.swing.JMenuItem();
        jmConsultasEndereco = new javax.swing.JMenuItem();
        jmConsultasProduto = new javax.swing.JMenuItem();
        jmConsultasPessoa = new javax.swing.JMenuItem();
        jmenuconsultasPedido = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("RMB");

        jMenu1.setText("Cadastros");

        jMenuItem1.setText("Categoria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jmCadastroCidade.setText("Cidade");
        jmCadastroCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroCidadeActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastroCidade);

        jMenuItem3.setText("Pais");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem8.setText("Estado Civil");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Marca");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jmcadastroEstado.setText("Estado");
        jmcadastroEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcadastroEstadoActionPerformed(evt);
            }
        });
        jMenu1.add(jmcadastroEstado);

        jmCadastroEndereço.setText("Endereço");
        jmCadastroEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroEndereçoActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastroEndereço);

        jmCadastrosProduto.setText("Produtos");
        jmCadastrosProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrosProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastrosProduto);

        jmCadastrosPessoa.setText("Pessoa");
        jmCadastrosPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrosPessoaActionPerformed(evt);
            }
        });
        jMenu1.add(jmCadastrosPessoa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuItem4.setText("Categoria");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jmConsultaCidade.setText("Cidade");
        jmConsultaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaCidadeActionPerformed(evt);
            }
        });
        jMenu2.add(jmConsultaCidade);

        jMenuItem6.setText("Pais");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem11.setText("Estado Civil");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Marca");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jmconsultaEstado.setText("Estado");
        jmconsultaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmconsultaEstadoActionPerformed(evt);
            }
        });
        jMenu2.add(jmconsultaEstado);

        jmConsultasEndereco.setText("Endereço");
        jmConsultasEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultasEnderecoActionPerformed(evt);
            }
        });
        jMenu2.add(jmConsultasEndereco);

        jmConsultasProduto.setText("Produtos");
        jmConsultasProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultasProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jmConsultasProduto);

        jmConsultasPessoa.setText("Pessoa");
        jmConsultasPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultasPessoaActionPerformed(evt);
            }
        });
        jMenu2.add(jmConsultasPessoa);

        jmenuconsultasPedido.setText("Pedido");
        jmenuconsultasPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuconsultasPedidoActionPerformed(evt);
            }
        });
        jMenu2.add(jmenuconsultasPedido);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadastroCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroCidadeActionPerformed
        if (Formularios.cadCidade == null)
            Formularios.cadCidade = new CadCidade();
        
        Formularios.cadCidade.setVisible(true);
    }//GEN-LAST:event_jmCadastroCidadeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (Formularios.cadCategoria == null)
            Formularios.cadCategoria = new CadCategoria();
        
        Formularios.cadCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (Formularios.listCategoria == null)
            Formularios.listCategoria = new ListCategoria();
        
        Formularios.listCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (Formularios.cadPais == null)
            Formularios.cadPais = new CadPais();
        
        Formularios.cadPais.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if (Formularios.listPais == null)
            Formularios.listPais = new ListPais();
        
        Formularios.listPais.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        if (Formularios.cadEstadoCivil == null)
            Formularios.cadEstadoCivil = new CadEstadoCivil();
        
        Formularios.cadEstadoCivil.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if (Formularios.listEstadoCivil == null)
            Formularios.listEstadoCivil = new ListEstadoCivil();
        
        Formularios.listEstadoCivil.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if (Formularios.cadMarca == null)
            Formularios.cadMarca = new CadMarca();
        
        Formularios.cadMarca.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        if (Formularios.listMarca == null)
            Formularios.listMarca = new ListMarca();
        
        Formularios.listMarca.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jmconsultaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmconsultaEstadoActionPerformed
        if (Formularios.listEstado == null)
            Formularios.listEstado = new ListEstado();
        
        Formularios.listEstado.setVisible(true);
    }//GEN-LAST:event_jmconsultaEstadoActionPerformed

    private void jmcadastroEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcadastroEstadoActionPerformed
        if (Formularios.cadEstado == null)
            Formularios.cadEstado = new CadEstado();
        
        Formularios.cadEstado.setVisible(true);
    }//GEN-LAST:event_jmcadastroEstadoActionPerformed

    private void jmConsultaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaCidadeActionPerformed
         if (Formularios.listCidade == null)
            Formularios.listCidade = new ListCidade();
        
        Formularios.listCidade.setVisible(true);
    }//GEN-LAST:event_jmConsultaCidadeActionPerformed

    private void jmCadastroEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroEndereçoActionPerformed
        if (Formularios.cadEndereco == null)
            Formularios.cadEndereco = new CadEndereco();
        
        Formularios.cadEndereco.setVisible(true);
    }//GEN-LAST:event_jmCadastroEndereçoActionPerformed

    private void jmConsultasEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultasEnderecoActionPerformed
        if (Formularios.listEndereco == null)
            Formularios.listEndereco = new ListEndereco();
        
        Formularios.listEndereco.setVisible(true);
    }//GEN-LAST:event_jmConsultasEnderecoActionPerformed

    private void jmCadastrosProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrosProdutoActionPerformed
        if (Formularios.cadProduto == null)
            Formularios.cadProduto = new CadProduto();
        
        Formularios.cadProduto.setVisible(true);
    }//GEN-LAST:event_jmCadastrosProdutoActionPerformed

    private void jmConsultasProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultasProdutoActionPerformed
        if (Formularios.listProduto == null)
            Formularios.listProduto = new ListProduto();
        
        Formularios.listProduto.setVisible(true);
    }//GEN-LAST:event_jmConsultasProdutoActionPerformed

    private void jmConsultasPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultasPessoaActionPerformed
        if (Formularios.listPessoa == null)
            Formularios.listPessoa = new ListPessoa();
        
        Formularios.listPessoa.setVisible(true);
    }//GEN-LAST:event_jmConsultasPessoaActionPerformed

    private void jmCadastrosPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrosPessoaActionPerformed
        if (Formularios.cadPessoa == null)
            Formularios.cadPessoa = new CadPessoa();
        
        Formularios.cadPessoa.setVisible(true);
    }//GEN-LAST:event_jmCadastrosPessoaActionPerformed

    private void jmenuconsultasPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuconsultasPedidoActionPerformed
        if (Formularios.listPedido == null)
            Formularios.listPedido = new ListPedido();
        
        Formularios.listPedido.setVisible(true);
    }//GEN-LAST:event_jmenuconsultasPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jmCadastroCidade;
    private javax.swing.JMenuItem jmCadastroEndereço;
    private javax.swing.JMenuItem jmCadastrosPessoa;
    private javax.swing.JMenuItem jmCadastrosProduto;
    private javax.swing.JMenuItem jmConsultaCidade;
    private javax.swing.JMenuItem jmConsultasEndereco;
    private javax.swing.JMenuItem jmConsultasPessoa;
    private javax.swing.JMenuItem jmConsultasProduto;
    private javax.swing.JMenuItem jmcadastroEstado;
    private javax.swing.JMenuItem jmconsultaEstado;
    private javax.swing.JMenuItem jmenuconsultasPedido;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujante;

import java.awt.BorderLayout;

/**
 *
 * @author josearielpereyra
 */
public class VentanaPrincipal extends javax.swing.JFrame {
  
  /**
   * Creates new form VentanaPrincipal
   */
  public VentanaPrincipal() {
    initComponents();
    
    setTitle("Mi Aplicacion de Dibujo");
    setSize(500, 600);
    setLocationRelativeTo( null );
     
     final PanelDeDibujo panelDeDibujo = new PanelDeDibujo( this );
     
     add(panelDeDibujo, BorderLayout.CENTER);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    grupoBotonesFiguras = new javax.swing.ButtonGroup();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();
    menuItemLapiz = new javax.swing.JRadioButtonMenuItem();
    menuItemLinea = new javax.swing.JRadioButtonMenuItem();
    menuItemRectangulo = new javax.swing.JRadioButtonMenuItem();
    menuItemRombo = new javax.swing.JRadioButtonMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jMenu1.setText("Archivo");

    jMenuItem1.setText("Salir");
    jMenu1.add(jMenuItem1);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Figuras");

    grupoBotonesFiguras.add(menuItemLapiz);
    menuItemLapiz.setSelected(true);
    menuItemLapiz.setText("Lapiz");
    jMenu2.add(menuItemLapiz);

    grupoBotonesFiguras.add(menuItemLinea);
    menuItemLinea.setText("Linea");
    jMenu2.add(menuItemLinea);

    grupoBotonesFiguras.add(menuItemRectangulo);
    menuItemRectangulo.setText("Rectangulo");
    jMenu2.add(menuItemRectangulo);

    grupoBotonesFiguras.add(menuItemRombo);
    menuItemRombo.setText("Rombo");
    jMenu2.add(menuItemRombo);

    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

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
      java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VentanaPrincipal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup grupoBotonesFiguras;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JRadioButtonMenuItem menuItemLapiz;
  private javax.swing.JRadioButtonMenuItem menuItemLinea;
  private javax.swing.JRadioButtonMenuItem menuItemRectangulo;
  private javax.swing.JRadioButtonMenuItem menuItemRombo;
  // End of variables declaration//GEN-END:variables

  public javax.swing.JRadioButtonMenuItem getMenuItemLapiz() {
    return menuItemLapiz;
  }

  public javax.swing.JRadioButtonMenuItem getMenuItemLinea() {
    return menuItemLinea;
  }

  public javax.swing.JRadioButtonMenuItem getMenuItemRectangulo() {
    return menuItemRectangulo;
  }
  
  public javax.swing.JRadioButtonMenuItem getMenuItemRombo() {
    return menuItemRombo;
  }
}

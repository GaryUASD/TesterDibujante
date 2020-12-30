/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujante;

import figuras.*;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;

/**
 *
 * @author josearielpereyra
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form VentanaPrincipal
     */
    ArrayList<Figura> figuras;
    Figura figuraActual;
    Color colorActual;
    public Color colorSeleccionado;

    public VentanaPrincipal() {
        initComponents();

        setTitle("Mi Aplicacion de Dibujo");
        setSize(850, 800);
        setLocationRelativeTo(null);

        final PanelDeDibujo panelDeDibujo = new PanelDeDibujo(this);

        add(panelDeDibujo, BorderLayout.CENTER);

        //Codigo para definir los colores de borde y de fondo de las figuras   
        Enumeration<AbstractButton> botonesColorBorde = getGrupoDeColores().getElements();

        while (botonesColorBorde.hasMoreElements()) {
            AbstractButton botonActual = botonesColorBorde.nextElement();

            botonActual.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (getBtnColorFondo().isSelected()) {
                        getBtnColorFondo().setBackground(botonActual.getBackground());
                    } else {
                        getBtnColorBorde().setBackground(botonActual.getBackground());
                    }
                }
            });
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

    grupoBotonesFiguras = new javax.swing.ButtonGroup();
    jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
    jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
    jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
    grupoDeColores = new javax.swing.ButtonGroup();
    grupoBotonesRellenoColores = new javax.swing.ButtonGroup();
    jMenuItem2 = new javax.swing.JMenuItem();
    ToolBar = new javax.swing.JToolBar();
    BtnG = new javax.swing.JButton();
    jSeparator2 = new javax.swing.JToolBar.Separator();
    btnLapiz = new javax.swing.JToggleButton();
    jSeparator5 = new javax.swing.JToolBar.Separator();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    btnColorBorde = new javax.swing.JToggleButton();
    jLabel3 = new javax.swing.JLabel();
    btnColorFondo = new javax.swing.JToggleButton();
    jLabel4 = new javax.swing.JLabel();
    btnRestablecerColores = new javax.swing.JButton();
    jSeparator3 = new javax.swing.JToolBar.Separator();
    GridColors = new javax.swing.JPanel();
    btnBlack = new javax.swing.JToggleButton();
    btnWhite = new javax.swing.JToggleButton();
    btnBlue = new javax.swing.JToggleButton();
    btnRed = new javax.swing.JToggleButton();
    btnYellow = new javax.swing.JToggleButton();
    btnGreen = new javax.swing.JToggleButton();
    btnColor = new javax.swing.JButton();
    BtnColorC = new javax.swing.JButton();
    jSeparator4 = new javax.swing.JToolBar.Separator();
    jLabel2 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    btnRectangulo = new javax.swing.JToggleButton();
    btnTrianguloRectangulo = new javax.swing.JToggleButton();
    btnRombo = new javax.swing.JToggleButton();
    btnCuadrado = new javax.swing.JToggleButton();
    btnLinea = new javax.swing.JToggleButton();
    btnPentagon = new javax.swing.JToggleButton();
    btnHexagon = new javax.swing.JToggleButton();
    btnTriangle = new javax.swing.JToggleButton();
    btnCircle = new javax.swing.JToggleButton();
    btnElipse = new javax.swing.JToggleButton();
    btnStrat = new javax.swing.JToggleButton();
    btnParallelogram = new javax.swing.JToggleButton();
    btnEscalene = new javax.swing.JToggleButton();
    btnFlecha = new javax.swing.JToggleButton();
    btnSemiCircle = new javax.swing.JToggleButton();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenuItem2_Save2 = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();
    menuItemLapiz = new javax.swing.JRadioButtonMenuItem();
    menuItemLinea = new javax.swing.JRadioButtonMenuItem();
    menuItemRectangulo = new javax.swing.JRadioButtonMenuItem();
    menuItemRombo = new javax.swing.JRadioButtonMenuItem();
    menuItemCuadrado = new javax.swing.JRadioButtonMenuItem();
    menuItemTrianguloRectangulo = new javax.swing.JRadioButtonMenuItem();
    menuItemCubeta = new javax.swing.JRadioButtonMenuItem();
    menuItemTriangulo = new javax.swing.JRadioButtonMenuItem();
    btnKite = new javax.swing.JRadioButtonMenuItem();
    MenuItemTrianguloEscaleno = new javax.swing.JRadioButtonMenuItem();
    MenuItemFlecha = new javax.swing.JRadioButtonMenuItem();

    jRadioButtonMenuItem1.setSelected(true);
    jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

    jRadioButtonMenuItem2.setSelected(true);
    jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

    jRadioButtonMenuItem3.setSelected(true);
    jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

    jMenuItem2.setText("jMenuItem2");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    ToolBar.setRollover(true);

    BtnG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
    BtnG.setText("Guardar");
    BtnG.setEnabled(false);
    BtnG.setFocusable(false);
    BtnG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    BtnG.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    BtnG.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnGActionPerformed(evt);
      }
    });
    ToolBar.add(BtnG);
    ToolBar.add(jSeparator2);

    grupoBotonesFiguras.add(btnLapiz);
    btnLapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil.png"))); // NOI18N
    btnLapiz.setFocusable(false);
    btnLapiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnLapiz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    ToolBar.add(btnLapiz);
    ToolBar.add(jSeparator5);

    jPanel2.setLayout(new java.awt.GridLayout(0, 1));

    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Color de  Bordes:");
    jPanel2.add(jLabel1);

    btnColorBorde.setBackground(new java.awt.Color(0, 0, 0));
    grupoBotonesRellenoColores.add(btnColorBorde);
    btnColorBorde.setSelected(true);
    btnColorBorde.setText(" ");
    btnColorBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 128, 128), 5, true));
    btnColorBorde.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnColorBordeActionPerformed(evt);
      }
    });
    jPanel2.add(btnColorBorde);

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Color de Relleno:");
    jPanel2.add(jLabel3);

    btnColorFondo.setBackground(new java.awt.Color(255, 255, 255));
    grupoBotonesRellenoColores.add(btnColorFondo);
    btnColorFondo.setText(" ");
    btnColorFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
    btnColorFondo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnColorFondoActionPerformed(evt);
      }
    });
    jPanel2.add(btnColorFondo);

    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Reiniciar Colores:");
    jPanel2.add(jLabel4);

    btnRestablecerColores.setText("Restablecer");
    btnRestablecerColores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRestablecerColoresActionPerformed(evt);
      }
    });
    jPanel2.add(btnRestablecerColores);

    ToolBar.add(jPanel2);
    ToolBar.add(jSeparator3);

    GridColors.setLayout(new java.awt.GridLayout(2, 0));

    btnBlack.setBackground(new java.awt.Color(0, 0, 0));
    grupoDeColores.add(btnBlack);
    GridColors.add(btnBlack);

    btnWhite.setBackground(new java.awt.Color(255, 255, 255));
    grupoDeColores.add(btnWhite);
    GridColors.add(btnWhite);

    btnBlue.setBackground(new java.awt.Color(0, 153, 255));
    grupoDeColores.add(btnBlue);
    btnBlue.setPreferredSize(new java.awt.Dimension(28, 28));
    GridColors.add(btnBlue);

    btnRed.setBackground(new java.awt.Color(255, 0, 51));
    grupoDeColores.add(btnRed);
    GridColors.add(btnRed);

    btnYellow.setBackground(new java.awt.Color(255, 255, 0));
    grupoDeColores.add(btnYellow);
    GridColors.add(btnYellow);

    btnGreen.setBackground(new java.awt.Color(0, 204, 51));
    grupoDeColores.add(btnGreen);
    GridColors.add(btnGreen);

    grupoDeColores.add(btnColor);
    btnColor.setFocusable(false);
    btnColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnColor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    GridColors.add(btnColor);

    ToolBar.add(GridColors);

    BtnColorC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rueda-de-color-2.png"))); // NOI18N
    BtnColorC.setText("Editar Color");
    BtnColorC.setFocusable(false);
    BtnColorC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    BtnColorC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    BtnColorC.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnColorCActionPerformed(evt);
      }
    });
    ToolBar.add(BtnColorC);
    ToolBar.add(jSeparator4);

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/geometric.png"))); // NOI18N
    jLabel2.setText("Figuras");
    ToolBar.add(jLabel2);

    jPanel1.setLayout(new java.awt.GridLayout(3, 0));

    grupoBotonesFiguras.add(btnRectangulo);
    btnRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rectangle.png"))); // NOI18N
    jPanel1.add(btnRectangulo);

    grupoBotonesFiguras.add(btnTrianguloRectangulo);
    btnTrianguloRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trianglerectangle.png"))); // NOI18N
    jPanel1.add(btnTrianguloRectangulo);

    grupoBotonesFiguras.add(btnRombo);
    btnRombo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rombe.png"))); // NOI18N
    jPanel1.add(btnRombo);

    grupoBotonesFiguras.add(btnCuadrado);
    btnCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/square.png"))); // NOI18N
    jPanel1.add(btnCuadrado);

    grupoBotonesFiguras.add(btnLinea);
    btnLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
    jPanel1.add(btnLinea);

    grupoBotonesFiguras.add(btnPentagon);
    btnPentagon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pentagon.png"))); // NOI18N
    btnPentagon.setEnabled(false);
    jPanel1.add(btnPentagon);

    grupoBotonesFiguras.add(btnHexagon);
    btnHexagon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hexagon.png"))); // NOI18N
    btnHexagon.setEnabled(false);
    jPanel1.add(btnHexagon);

    grupoBotonesFiguras.add(btnTriangle);
    btnTriangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/triangle.png"))); // NOI18N
    jPanel1.add(btnTriangle);

    grupoBotonesFiguras.add(btnCircle);
    btnCircle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circle.png"))); // NOI18N
    btnCircle.setEnabled(false);
    jPanel1.add(btnCircle);

    grupoBotonesFiguras.add(btnElipse);
    btnElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ellipse.png"))); // NOI18N
    btnElipse.setEnabled(false);
    jPanel1.add(btnElipse);

    grupoBotonesFiguras.add(btnStrat);
    btnStrat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/star.png"))); // NOI18N
    btnStrat.setEnabled(false);
    jPanel1.add(btnStrat);

    grupoBotonesFiguras.add(btnParallelogram);
    btnParallelogram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/parallelogram.png"))); // NOI18N
    btnParallelogram.setEnabled(false);
    jPanel1.add(btnParallelogram);

    grupoBotonesFiguras.add(btnEscalene);
    btnEscalene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scalene.png"))); // NOI18N
    jPanel1.add(btnEscalene);

    grupoBotonesFiguras.add(btnFlecha);
    btnFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow.png"))); // NOI18N
    jPanel1.add(btnFlecha);

    grupoBotonesFiguras.add(btnSemiCircle);
    btnSemiCircle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/semicircle.png"))); // NOI18N
    btnSemiCircle.setEnabled(false);
    jPanel1.add(btnSemiCircle);

    ToolBar.add(jPanel1);

    getContentPane().add(ToolBar, java.awt.BorderLayout.PAGE_START);

    jMenu1.setText("Archivo");

    jMenuItem2_Save2.setText("Guardar Como...");
    jMenuItem2_Save2.setEnabled(false);
    jMenuItem2_Save2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem2_Save2ActionPerformed(evt);
      }
    });
    jMenu1.add(jMenuItem2_Save2);
    jMenu1.add(jSeparator1);

    jMenuItem1.setText("Salir");
    jMenu1.add(jMenuItem1);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Figuras");
    grupoBotonesFiguras.add(jMenu2);

    grupoBotonesFiguras.add(menuItemLapiz);
    menuItemLapiz.setText("Lapiz");
    menuItemLapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil.png"))); // NOI18N
    jMenu2.add(menuItemLapiz);

    grupoBotonesFiguras.add(menuItemLinea);
    menuItemLinea.setText("Linea");
    menuItemLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
    menuItemLinea.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        menuItemLineaFocusGained(evt);
      }
    });
    menuItemLinea.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        menuItemLineaMouseClicked(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        menuItemLineaMousePressed(evt);
      }
    });
    menuItemLinea.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuItemLineaActionPerformed(evt);
      }
    });
    jMenu2.add(menuItemLinea);

    grupoBotonesFiguras.add(menuItemRectangulo);
    menuItemRectangulo.setText("Rectangulo");
    menuItemRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rectangle.png"))); // NOI18N
    jMenu2.add(menuItemRectangulo);

    grupoBotonesFiguras.add(menuItemRombo);
    menuItemRombo.setText("Rombo");
    menuItemRombo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rombe.png"))); // NOI18N
    jMenu2.add(menuItemRombo);

    grupoBotonesFiguras.add(menuItemCuadrado);
    menuItemCuadrado.setText("Cuadrado");
    menuItemCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/square.png"))); // NOI18N
    menuItemCuadrado.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuItemCuadradoActionPerformed(evt);
      }
    });
    jMenu2.add(menuItemCuadrado);

    grupoBotonesFiguras.add(menuItemTrianguloRectangulo);
    menuItemTrianguloRectangulo.setText("Triangulo Rectangulo");
    menuItemTrianguloRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trianglerectangle.png"))); // NOI18N
    menuItemTrianguloRectangulo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuItemTrianguloRectanguloActionPerformed(evt);
      }
    });
    jMenu2.add(menuItemTrianguloRectangulo);

    grupoBotonesFiguras.add(menuItemCubeta);
    menuItemCubeta.setText("Cubeta");
    menuItemCubeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FillWithColor.png"))); // NOI18N
    jMenu2.add(menuItemCubeta);

    grupoBotonesFiguras.add(menuItemTriangulo);
    menuItemTriangulo.setText("Triangulo");
    menuItemTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/triangle.png"))); // NOI18N
    jMenu2.add(menuItemTriangulo);

    grupoBotonesFiguras.add(btnKite);
    btnKite.setText("Kite");
    jMenu2.add(btnKite);

    MenuItemTrianguloEscaleno.setText("Triangulo Escaleno");
    MenuItemTrianguloEscaleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scalene.png"))); // NOI18N
    MenuItemTrianguloEscaleno.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        MenuItemTrianguloEscalenoActionPerformed(evt);
      }
    });
    jMenu2.add(MenuItemTrianguloEscaleno);

    MenuItemFlecha.setText("Flecha");
    MenuItemFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow.png"))); // NOI18N
    jMenu2.add(MenuItemFlecha);

    jMenuBar1.add(jMenu2);
    
        grupoBotonesFiguras.add(menuItemParalelogramo);
        menuItemParalelogramo.setText("Paralelogramo");
        menuItemParalelogramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemParalelogramoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemParalelogramo);

    setJMenuBar(jMenuBar1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void menuItemCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCuadradoActionPerformed

    private void menuItemTrianguloRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTrianguloRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemTrianguloRectanguloActionPerformed

    private void jMenuItem2_Save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_Save2ActionPerformed
        System.out.println("Guardando...");
        savefile();
    }//GEN-LAST:event_jMenuItem2_Save2ActionPerformed

    private void menuItemLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLineaActionPerformed

    }//GEN-LAST:event_menuItemLineaActionPerformed

    private void menuItemLineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemLineaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemLineaMouseClicked

    private void menuItemLineaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemLineaMousePressed
        // TODO add your handling code here:
        //ventana.getBtnRectangulo().setFocusable(false);
        //ventana.getBtnRectangulo().setFocusable(true);
    }//GEN-LAST:event_menuItemLineaMousePressed

    private void menuItemLineaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuItemLineaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemLineaFocusGained

    private void btnColorFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorFondoActionPerformed
        btnColorBorde.setBorder(null);
        btnColorFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 128, 128), 5, true));
    }//GEN-LAST:event_btnColorFondoActionPerformed

    private void BtnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGActionPerformed

    private void BtnColorCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnColorCActionPerformed
        JColorChooser colorP = new JColorChooser();
        colorSeleccionado = colorP.showDialog(null, "Selecciona un color para agregar", colorSeleccionado.WHITE);
        btnColor.setBackground(colorSeleccionado);
    }//GEN-LAST:event_BtnColorCActionPerformed

  private void btnRestablecerColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerColoresActionPerformed
      btnColorBorde.setBackground(Color.BLACK);
      btnColorFondo.setBackground(Color.WHITE);
  }//GEN-LAST:event_btnRestablecerColoresActionPerformed

  private void btnColorBordeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorBordeActionPerformed
      btnColorBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 128, 128), 5, true));
      btnColorFondo.setBorder(null);
  }//GEN-LAST:event_btnColorBordeActionPerformed

    private void MenuItemTrianguloEscalenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTrianguloEscalenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemTrianguloEscalenoActionPerformed
  
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
  private javax.swing.JButton BtnColorC;
  private javax.swing.JButton BtnG;
  private javax.swing.JPanel GridColors;
  private javax.swing.JRadioButtonMenuItem MenuItemFlecha;
  private javax.swing.JRadioButtonMenuItem MenuItemTrianguloEscaleno;
  private javax.swing.JToolBar ToolBar;
  private javax.swing.JToggleButton btnBlack;
  private javax.swing.JToggleButton btnBlue;
  private javax.swing.JToggleButton btnCircle;
  private javax.swing.JButton btnColor;
  private javax.swing.JToggleButton btnColorBorde;
  private javax.swing.JToggleButton btnColorFondo;
  private javax.swing.JToggleButton btnCuadrado;
  private javax.swing.JToggleButton btnElipse;
  private javax.swing.JToggleButton btnEscalene;
  private javax.swing.JToggleButton btnFlecha;
  private javax.swing.JToggleButton btnGreen;
  private javax.swing.JToggleButton btnHexagon;
  private javax.swing.JRadioButtonMenuItem btnKite;
  private javax.swing.JToggleButton btnLapiz;
  private javax.swing.JToggleButton btnLinea;
  private javax.swing.JToggleButton btnParallelogram;
  private javax.swing.JToggleButton btnPentagon;
  private javax.swing.JToggleButton btnRectangulo;
  private javax.swing.JToggleButton btnRed;
  private javax.swing.JButton btnRestablecerColores;
  private javax.swing.JToggleButton btnRombo;
  private javax.swing.JToggleButton btnSemiCircle;
  private javax.swing.JToggleButton btnStrat;
  private javax.swing.JToggleButton btnTriangle;
  private javax.swing.JToggleButton btnTrianguloRectangulo;
  private javax.swing.JToggleButton btnWhite;
  private javax.swing.JToggleButton btnYellow;
  private javax.swing.ButtonGroup grupoBotonesFiguras;
  private javax.swing.ButtonGroup grupoBotonesRellenoColores;
  private javax.swing.ButtonGroup grupoDeColores;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JMenuItem jMenuItem2_Save2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
  private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
  private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JToolBar.Separator jSeparator2;
  private javax.swing.JToolBar.Separator jSeparator3;
  private javax.swing.JToolBar.Separator jSeparator4;
  private javax.swing.JToolBar.Separator jSeparator5;
  private javax.swing.JRadioButtonMenuItem menuItemCuadrado;
  private javax.swing.JRadioButtonMenuItem menuItemCubeta;
  private javax.swing.JRadioButtonMenuItem menuItemLapiz;
  private javax.swing.JRadioButtonMenuItem menuItemLinea;
  private javax.swing.JRadioButtonMenuItem menuItemRectangulo;
  private javax.swing.JRadioButtonMenuItem menuItemRombo;
  private javax.swing.JRadioButtonMenuItem menuItemTriangulo;
  private javax.swing.JRadioButtonMenuItem menuItemTrianguloRectangulo;
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

    public javax.swing.JRadioButtonMenuItem getMenuItemCuadrado() {
        return menuItemCuadrado;
    }

    public javax.swing.JRadioButtonMenuItem getMenuItemTrianguloRectangulo() {
        return menuItemTrianguloRectangulo;
    }

    public javax.swing.JRadioButtonMenuItem MenuItemTrianguloEscaleno() {
        return MenuItemTrianguloEscaleno;
    }

    public javax.swing.JRadioButtonMenuItem getMenuItemFlecha() {
        return MenuItemFlecha;
    }

    //Metodos para accerder a los botones graficos de las figuras
    public JToggleButton getBtnRectangulo() {
        return btnRectangulo;
    }

    public JToggleButton getBtnLinea() {
        return btnLinea;
    }

    public JToggleButton getBtnCuadrado() {
        return btnCuadrado;
    }

    public JToggleButton getBtnTrianguloRectangulo() {
        return btnTrianguloRectangulo;
    }

    public JToggleButton getBtnRombo() {
        return btnRombo;
    }

    public JToggleButton getBtnLapiz() {
        return btnLapiz;
    }

    public JToggleButton getBtnGreen() {
        return btnGreen;
    }

    public ButtonGroup getGrupoDeColores() {
        return grupoDeColores;
    }

    public JToggleButton getBtnColorBorde() {
        return btnColorBorde;
    }

    public JToggleButton getBtnColorFondo() {
        return btnColorFondo;
    }

    public ButtonGroup getGrupoBotonesRellenoColores() {
        return grupoBotonesRellenoColores;
    }

    public JButton getBtnRestablecerColores() {
        return btnRestablecerColores;
    }

    public JToggleButton getBtnTriangle() {
        return btnTriangle;
    }

    public JToggleButton getbtnEscalene() {
        return btnEscalene;
    }

    public JToggleButton getBtnFlecha() {
        return btnFlecha;
    }

    public JRadioButtonMenuItem getBtnKite() {
        return btnKite;
    }

//Guardar Como
    public void savefile() {
        BufferedImage image2 = new BufferedImage(PanelDeDibujo.WIDTH, PanelDeDibujo.HEIGHT, BufferedImage.TYPE_INT_RGB);

        JFileChooser jFile = new JFileChooser();
        jFile.showSaveDialog(null);

        Path pth = jFile.getSelectedFile().toPath();

        JOptionPane.showMessageDialog(null, "Se guardo en  " + pth.toString());

        Graphics2D graphics2D = image2.createGraphics();
        //PanelDeDibujo.paint(graphics2D);
        try {
            ImageIO.write(image2, "jpeg", new File(pth.toString()));
        } catch (IOException ox) {
            // TODO: handle exception
            ox.printStackTrace();
        }
    }

    public javax.swing.JRadioButtonMenuItem getMenuItemCubeta() {
        return menuItemCubeta;
    }

    public javax.swing.JRadioButtonMenuItem getMenuItemTriangulo() {
        return menuItemTriangulo;
    }
}

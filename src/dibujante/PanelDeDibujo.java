package dibujante;

import figuras.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JPanel;

/**
 *
 * @author josearielpereyra
 */
public class PanelDeDibujo extends JPanel {

  ArrayList<Figura> figuras;
  Figura figuraActual;
  VentanaPrincipal ventana;
  Color colorDeBorde;
  Color colorDeFondo;

  public PanelDeDibujo(VentanaPrincipal ventana) {
    this.ventana = ventana;
    figuras = new ArrayList<>();

    this.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mousePressed(MouseEvent evento) {
        colorDeBorde = ventana.getBtnColorBorde().getBackground();
        colorDeFondo = ventana.getBtnColorFondo().getBackground();

        //Condicionales para detectar cual es la figura seleccionada a dibujar  apartir de los menuItem
        if (ventana.getMenuItemLinea().isSelected()) {
          figuraActual = new Linea(evento.getPoint(), evento.getPoint(), colorDeBorde);
        }else if (ventana.getMenuItemRectangulo().isSelected()) {
         figuraActual = new Rectangulo(evento.getPoint(),false,colorDeBorde, colorDeFondo);
        } else if (ventana.getMenuItemRombo().isSelected()) {
          figuraActual = new Rombo(evento.getPoint(), colorDeBorde, colorDeFondo);
        } else if (ventana.getMenuItemTrianguloRectangulo().isSelected()) {
          figuraActual = new TrianguloRectangulo(evento.getPoint(), colorDeBorde, colorDeFondo);
        } else if (ventana.getMenuItemCubeta().isSelected()) {
          figuraActual = new Cubeta(evento.getPoint(), colorDeBorde, PanelDeDibujo.this);
        } else  if (ventana.getMenuItemCuadrado().isSelected()) {
          figuraActual = new Rectangulo(evento.getPoint(),true,colorDeBorde, colorDeFondo);//Cuadrado
        } else if(ventana.getMenuItemTriangulo().isSelected()) {
           figuraActual = new Triangulo(evento.getPoint(), colorDeBorde, colorDeFondo);
         } 
        else if(ventana.getBtnKite().isSelected()) {
           figuraActual = new Kite(evento.getPoint(), colorDeBorde, colorDeFondo);
        } 
        else if (ventana.getMenuItemFlecha().isSelected()) {
            figuraActual = new Flecha(evento.getPoint(), colorDeBorde, colorDeFondo);
        } 
        else if (ventana.MenuItemTrianguloEscaleno().isSelected()) {
            figuraActual = new TrianguloEscaleno(evento.getPoint(), colorDeBorde, colorDeFondo);   
        } else{
          figuraActual = new DibujoLibre(evento.getPoint());
        }

        //Agregando los condicionales para seleccionar la figura a dibujar apartir de los iconos de las figuras.
        if (ventana.getBtnRectangulo().isSelected()) {
          figuraActual = new Rectangulo(evento.getPoint(),false,colorDeBorde, colorDeFondo);
        } else if (ventana.getBtnLinea().isSelected()) {
          figuraActual = new Linea(evento.getPoint(), evento.getPoint(), colorDeBorde);
        } else if (ventana.getBtnCuadrado().isSelected()) {
          figuraActual = new Rectangulo(evento.getPoint(),true,colorDeBorde, colorDeFondo);
        } else if (ventana.getBtnTrianguloRectangulo().isSelected()) {
          figuraActual = new TrianguloRectangulo(evento.getPoint(), colorDeBorde, colorDeFondo);
        } else if (ventana.getBtnRombo().isSelected()) {
          figuraActual = new Rombo(evento.getPoint(), colorDeBorde, colorDeFondo);
        } else if (ventana.getBtnTriangle().isSelected()) {
          figuraActual = new Triangulo(evento.getPoint(), colorDeBorde, colorDeFondo);
        }else if (ventana.getBtnLapiz().isSelected()) {
          figuraActual = new DibujoLibre(evento.getPoint());
        } else if (ventana.getbtnEscalene().isSelected()) {
           figuraActual = new TrianguloEscaleno(evento.getPoint(), colorDeBorde, colorDeFondo);
        } else if (ventana.getBtnFlecha().isSelected()) {
           figuraActual = new Flecha(evento.getPoint(), colorDeBorde, colorDeFondo);
        }


        figuraActual.setColor(colorDeBorde);
        figuras.add(figuraActual);
        repaint();
      }
    });

    this.addMouseMotionListener(new MouseAdapter() {
      @Override
      public void mouseDragged(MouseEvent evento) {
        figuraActual.actualizar(evento.getPoint());
        repaint();
      }
    });
  }

  //Este es el metodo que dibuja las figuras en el panel de dibujo
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    setBackground(Color.WHITE);
    for (Figura figura : figuras) {
      g.setColor(figura.getColor());
      figura.dibujar(g);
    }
  }
}

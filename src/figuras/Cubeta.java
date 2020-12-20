package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import dibujante.PanelDeDibujo;
import java.awt.AWTException;
import java.awt.Graphics2D;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author josearielpereyra
 */
public class Cubeta extends Figura{
  ArrayList<Point> puntos;
  Color colorACambiar;
  private Robot robot;
  Queue<Point> colaPuntos;
  private BufferedImage imagen;

  public Cubeta(Point puntoInicial, Color nuevoColor, PanelDeDibujo panel) {
    super(nuevoColor);
    try {
      this.puntos = new ArrayList<>();
      this.colaPuntos = new PriorityQueue<>();
      
      imagen = crearImagen(panel);
      
      robot = new Robot();
      Point ubicacionDelPanel = panel.getLocationOnScreen();
      //puntoInicial = new Point(ubicacionDelPanel.x + puntoInicial.x, ubicacionDelPanel.y + puntoInicial.y);
      
      int clr = imagen.getRGB(puntoInicial.x, puntoInicial.y);
      int rojo =   (clr & 0x00ff0000) >> 16;
      int verde = (clr & 0x0000ff00) >> 8;
      int azul =   clr & 0x000000ff;
      this.colorACambiar = new Color( rojo, verde, azul);
      
      System.out.println("El color es: " + colorACambiar );
              
      rellenar(puntoInicial, nuevoColor, panel);
    } catch (AWTException ex) {
      Logger.getLogger(Cubeta.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  public void dibujar(Graphics g) {
    g.setColor( getColor() );
    for (int i = 1; i < puntos.size(); i++) {
      Point puntoInicial = puntos.get(i-1);
      Point puntoFinal = puntos.get(i);
      
      g.drawLine(puntoInicial.x, puntoInicial.y, puntoFinal.x, puntoFinal.y);
    }
  }

  @Override
  public void actualizar(Point puntoActual) {
    System.out.println("No actualizar");
  }

  private void rellenar(Point puntoActual, Color nuevoColor, PanelDeDibujo panel) {
    
    int color = imagen.getRGB(puntoActual.x, puntoActual.y);
    int rojo =   (color & 0x00ff0000) >> 16;
    int verde = (color & 0x0000ff00) >> 8;
    int azul =   color & 0x000000ff;
    
    Color colorPuntoActual = new Color(rojo, verde, azul);
    
    if( colorPuntoActual.equals(colorACambiar) ) {
      puntos.add(puntoActual);
      imagen.setRGB( puntoActual.x, puntoActual.y, nuevoColor.getRGB() );
      
      Point puntoIzquierdo = new Point(puntoActual.x - 1, puntoActual.y);
      Point puntoDerecho = new Point(puntoActual.x + 1, puntoActual.y);
      Point puntoArriba = new Point(puntoActual.x, puntoActual.y - 1);
      Point puntoAbajo = new Point(puntoActual.x, puntoActual.y + 1);
      
      rellenar(puntoIzquierdo, nuevoColor, panel);
      rellenar(puntoDerecho, nuevoColor, panel);
      rellenar(puntoArriba, nuevoColor, panel);
      rellenar(puntoAbajo, nuevoColor, panel);
    }
  }
  
  public BufferedImage crearImagen(JPanel panel) {
    int w = panel.getWidth();
    int h = panel.getHeight();
    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
    Graphics2D g = bi.createGraphics();
    panel.paint(g);
    g.dispose();
    return bi;
  }
}

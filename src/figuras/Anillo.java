package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Dell
 */
public class Anillo extends Circulo {

  static final int MAX = 40;
  
 Color colorFondo;
  Color colorBorde;

  public Anillo(Point ubicacion, Color colorBorde, Color colorFondo) {
    super(ubicacion);
    this.colorFondo = colorFondo;
    this.colorBorde = colorBorde;
  }
  
  @Override
  public void dibujar(Graphics g) {
    int x = ubicacion.x + ((anchura < 0) ? this.anchura : 0);
    int y = ubicacion.y + ((altura < 0) ? this.altura : 0);

     g.setColor(this.colorFondo);
    g.fillOval(x, y, Math.abs(anchura), Math.abs(altura));
    g.fillOval(x - (MAX / 2), y - (MAX / 2), Math.abs(anchura) + MAX, Math.abs(altura) + MAX);
    
    g.setColor(this.colorBorde);
    g.drawOval(x, y, Math.abs(anchura), Math.abs(altura));
    g.drawOval(x - (MAX / 2), y - (MAX / 2), Math.abs(anchura) + MAX, Math.abs(altura) + MAX);

  }
}

package figuras;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

/**
 *
 * @author HectorGaryMoquete
 */
public class Ovalo extends Figura {

  Point ubicacion;
  int anchura;
  int altura;
  Color colorFondo;
  Color colorBorde;
  
  public Ovalo(Point ubicacion, Color colorBorde, Color colorFondo) {
    this.ubicacion = ubicacion;
    anchura = 0;
    altura = 0;
    this.colorFondo = colorFondo;
    this.colorBorde = colorBorde;
  }
  public Ovalo(Point ubicacion, Color colorBorde) {
    this.ubicacion = ubicacion;
    anchura = 0;
    altura = 0;
    this.colorFondo = null;
    this.colorBorde = colorBorde;
  }
  
  @Override
  public void actualizar(Point puntoActual) {
    anchura = puntoActual.x - ubicacion.x;
    altura = puntoActual.y - ubicacion.y;
  }

  @Override
  public void dibujar(Graphics g) {
    int x = ubicacion.x + ( (anchura < 0) ? this.anchura : 0 );
    int y = ubicacion.y + ( (altura < 0) ? this.altura : 0 );
    
    if(colorFondo != null){
        g.setColor(this.colorFondo);
        g.fillOval(x, y, Math.abs(anchura), Math.abs(altura)); 
    }
    g.setColor(this.colorBorde);
    g.drawOval(x, y, Math.abs(anchura), Math.abs(altura)); 
  }

}
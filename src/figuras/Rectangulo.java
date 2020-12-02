package figuras;

import java.awt.Point;
import java.awt.Graphics;

/**
 *
 * @author josearielpereyra
 */
public class Rectangulo extends Figura{

  Point ubicacion; 
  int anchura;
  int altura;

  public Rectangulo(Point ubicacion) {    // Ubicacion es el punto que se obtiene cuando el boton del mouse esta presionado. Este se le pasa como parametro al constructor de cada figura.
    this.ubicacion = ubicacion;     
    anchura = 0;
    altura = 0;
  }
  
  @Override
  public void actualizar(Point puntoActual) {    //puntoActual es el punto que se obtiene cuando al presionar el boton del mouse el puntero es arrastrado sobre el panel de dibujo. Este se le pasa como parametro al metodo actualizar de cada figura.
    anchura = puntoActual.x - ubicacion.x;
    altura = puntoActual.y - ubicacion.y;
  }

  @Override
  public void dibujar(Graphics g) {
    int x = ubicacion.x + ( (anchura < 0) ? this.anchura : 0 );
    int y = ubicacion.y + ( (altura < 0) ? this.altura : 0 );
    
    g.drawRect(x, y, Math.abs(anchura), Math.abs(altura) );
  }
}
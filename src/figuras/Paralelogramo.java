
package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Robinzon Montero Montero y Emilio Jose Santana Holguin
 */

public class Paralelogramo extends Rectangulo{
    
    Color colorDeBorde;
    Color colorDeFondo;
    
    public Paralelogramo(Point ubicacion, Color colorDeBorde, Color colorDeFondo) {
        super(ubicacion);
        this.colorDeBorde = colorDeBorde;
        this.colorDeFondo = colorDeFondo;
    }
    
    @Override
    public void actualizar(Point puntoActual) {    //puntoActual es el punto que se obtiene cuando al presionar el boton del mouse el puntero es arrastrado sobre el panel de dibujo. Este se le pasa como parametro al metodo actualizar de cada figura.
      anchura = puntoActual.x - ubicacion.x;       //La variable puntoActual.x represena el punto final en el eje X y la variable ubicacion.x representa el punto inicial en el eje X.
      altura = puntoActual.y - ubicacion.y;        //La variable puntoActual.y represena el punto final en el eje Y y la variable ubicacion.y representa el punto inicial en el eje Y.
    }

    @Override
    public void dibujar(Graphics g) {
      Point punto1 = new Point(ubicacion.x, ubicacion.y);
      Point punto2 = new Point((ubicacion.x - (int)(anchura * 0.30)), ubicacion.y + altura);
      Point punto3 = new Point((ubicacion.x + (int)(anchura - (anchura * 0.30))), ubicacion.y + altura);
      Point punto4 = new Point((ubicacion.x + anchura), ubicacion.y);
      int[] puntosX = new int[]{punto1.x, punto2.x, punto3.x, punto4.x};
      int[] puntosY = new int[]{punto1.y, punto2.y, punto3.y, punto4.y};

      //Metodos para dibujar los bordes y el relleno del poligono
     
      g.setColor(this.colorDeFondo);
      g.fillPolygon(puntosX, puntosY, 4);
      g.setColor(this.colorDeBorde);
      g.drawPolygon( puntosX, puntosY, 4);
      
    }
    
}

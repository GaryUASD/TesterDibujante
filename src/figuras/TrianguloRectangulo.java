
package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Robinzon Montero Montero y Emilio Jose Santana Holguin
 */
public class TrianguloRectangulo extends Rectangulo{
    
    public TrianguloRectangulo(Point ubicacion) {
        super(ubicacion);
    }
    
    @Override
    public void actualizar(Point puntoActual) {    //puntoActual es el punto que se obtiene cuando al presionar el boton del mouse el puntero es arrastrado sobre el panel de dibujo. Este se le pasa como parametro al metodo actualizar de cada figura.
      anchura = puntoActual.x - ubicacion.x;       //La variable puntoActual.x represena el punto final en el eje X y la variable ubicacion.x representa el punto inicial en el eje X.
      altura = puntoActual.y - ubicacion.y;        //La variable puntoActual.y represena el punto final en el eje Y y la variable ubicacion.y representa el punto inicial en el eje Y.
    }

    @Override
    public void dibujar(Graphics g) {
        //Implementacion realizada por el profesor para el Rectangulo
//      int x = ubicacion.x + ( (anchura < 0) ? this.anchura : 0 );
//      int y = ubicacion.y + ( (altura < 0) ? this.altura : 0 );
//
//      g.drawRect(x, y, Math.abs(anchura), Math.abs(altura) );


    //Nueva implementacion del metodo
    Point punto1 = new Point(ubicacion.x, ubicacion.y);
    Point punto2 = new Point(ubicacion.x, ubicacion.y + altura);
    Point punto3 = new Point(ubicacion.x + anchura, ubicacion.y + altura);
    int[] puntosX = new int[]{punto1.x, punto2.x, punto3.x};
    int[] puntosY = new int[]{punto1.y, punto2.y, punto3.y};
    
    //TODO DEFINIR COMO SELECCIONAR EL COLOR DE PRIMER PLANO Y SEGUNDO PLANO
    //g.setColor(Color.yellow);
    //g.fillPolygon( puntosX, puntosY, 3);
    //g.setColor(Color.red);
    g.drawPolygon( puntosX, puntosY, 3);
    
    }
}

package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import dibujante.VentanaPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Robinzon Montero Montero y Emilio Jose Santana Holguin
 */
public class TrianguloRectangulo extends Rectangulo {

    Color colorFondo;
    Color colorBorde;

    public TrianguloRectangulo(Point ubicacion, Color colorBorde, Color colorFondo) {
        super(ubicacion);
        //setColor(colorBorde);
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

    @Override
    public void actualizar(Point puntoActual) {    //puntoActual es el punto que se obtiene cuando al presionar el boton del mouse el puntero es arrastrado sobre el panel de dibujo. Este se le pasa como parametro al metodo actualizar de cada figura.
        anchura = puntoActual.x - ubicacion.x;
        altura = puntoActual.y - ubicacion.y;
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
        g.setColor(this.colorFondo);
        g.fillPolygon( puntosX, puntosY, 3);
        g.setColor(this.colorBorde);
        g.drawPolygon(puntosX, puntosY, 3);
        
    }
}

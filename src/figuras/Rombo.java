package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author DELL
 */
public class Rombo extends Rectangulo {

    public Rombo(Point ubicacion) {
        super(ubicacion);
    }

    @Override
    public void dibujar(Graphics g) {
        Point punto1 = new Point(ubicacion.x, ubicacion.y + altura / 2);
        Point punto2 = new Point(ubicacion.x + anchura / 2, ubicacion.y);
        Point punto3 = new Point(ubicacion.x + anchura, ubicacion.y + altura / 2);
        Point punto4 = new Point(ubicacion.x + anchura / 2, ubicacion.y + altura);
        int[] puntosX = new int[]{punto1.x, punto2.x, punto3.x, punto4.x};
        int[] puntosY = new int[]{punto1.y, punto2.y, punto3.y, punto4.y};

        //TODO DEFINIR COMO SELECCIONAR EL COLOR DE PRIMER PLANO Y SEGUNDO PLANO
        g.setColor(Color.yellow);
        g.fillPolygon( puntosX, puntosY, 4);
        g.setColor(Color.red);
        g.drawPolygon( puntosX, puntosY, 4);
    }

}

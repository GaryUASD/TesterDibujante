package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author lwiss
 */
public class Kite extends Rectangulo {

    public Kite(Point ubicacion, Color colorBorde, Color colorFondo) {
        super(ubicacion);

        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

    @Override
    public void dibujar(Graphics g) {
        Point punto1 = new Point(ubicacion.x, ubicacion.y + altura / 2);
        Point punto2 = new Point(ubicacion.x + anchura / 2, ubicacion.y);
        Point punto3 = new Point(ubicacion.x + anchura, ubicacion.y + altura / 2);
        Point punto4 = new Point(ubicacion.x + anchura / 2, ubicacion.y + altura);
                int d =(punto4.y/4);
        int[] puntosX = new int[]{punto1.x, punto2.x, punto3.x, punto4.x};
        int[] puntosY = new int[]{punto1.y, punto2.y, punto3.y, punto4.y+d};

        //TODO DEFINIR COMO SELECCIONAR EL COLOR DE PRIMER PLANO Y SEGUNDO PLANO
        g.setColor(this.colorFondo);
        g.fillPolygon(puntosX, puntosY, puntosX.length);
        g.setColor(this.colorBorde);
        g.drawPolygon( puntosX, puntosY, puntosX.length);
    }

}
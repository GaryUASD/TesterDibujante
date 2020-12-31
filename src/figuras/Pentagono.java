package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
*
* @author Wailan Brea
* @author Rafael Santiago
*/

public class Pentagono extends Rectangulo{

    Color colorFondo;
    Color colorBorde;

    public Pentagono(Point ubicacion, Color colorBorde, Color colorFondo) {
        super(ubicacion);
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }


    @Override
    public void dibujar(Graphics g) {
        Point punto1 = new Point(ubicacion.x+anchura/2, ubicacion.y+altura);
        Point punto2 = new Point(ubicacion.x, ubicacion.y+altura/2);
        Point punto3 = new Point(ubicacion.x+anchura, ubicacion.y+altura/6);
        Point punto4 = new Point(ubicacion.x+anchura*2, ubicacion.y+altura/2);
        Point punto5 = new Point(ubicacion.x+anchura/2*3, ubicacion.y+altura/2*2);
        int[] puntosX = new int[]{punto1.x, punto2.x, punto3.x, punto4.x,punto5.x};
        int[] puntosY = new int[]{punto1.y, punto2.y, punto3.y, punto4.y,punto5.y};
        g.drawPolygon(puntosX, puntosY, 5);

        //TODO DEFINIR COMO SELECCIONAR EL COLOR DE PRIMER PLANO Y SEGUNDO PLANO
        g.setColor(this.colorFondo);
        g.fillPolygon( puntosX, puntosY, 5);
        g.setColor(this.colorBorde);
        g.drawPolygon(puntosX, puntosY, 5);
    }
}
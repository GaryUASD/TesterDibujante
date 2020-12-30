package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Jesus Daniel Valdez
 */
public class Flecha extends Rectangulo {

    Color colorFondo;
    Color colorBorde;

    public Flecha(Point ubicacion, Color colorBorde, Color colorFondo) {

        super(ubicacion);
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

    @Override
    public void actualizar(Point puntoActual) {

        anchura = puntoActual.x - ubicacion.x;
        altura = puntoActual.y - ubicacion.y;
    }

    @Override
    public void dibujar(Graphics g) {

        Point punto1 = new Point(ubicacion.x, ubicacion.y);
        Point punto2 = new Point(ubicacion.x, ubicacion.y + altura);
        Point punto3 = new Point(ubicacion.x + anchura, ubicacion.y + altura);
        Point punto4 = new Point(ubicacion.x + anchura, ubicacion.y);
        Point punto5 = new Point(ubicacion.x + anchura, ubicacion.y - altura);
        Point punto6 = new Point(ubicacion.x + anchura, ubicacion.y + altura * 2);
        Point punto7 = new Point(ubicacion.x + anchura * 2, ubicacion.y + altura / 2);

        int[] puntosX = new int[]{punto7.x, punto5.x, punto4.x, punto1.x, punto2.x, punto3.x, punto6.x, punto7.x, punto4.x};
        int[] puntosY = new int[]{punto7.y, punto5.y, punto4.y, punto1.y, punto2.y, punto3.y, punto6.y, punto7.y, punto4.y};

        g.setColor(this.colorFondo);
        g.fillPolygon(puntosX, puntosY, 8);
        g.setColor(this.colorBorde);
        g.drawPolygon(puntosX, puntosY, 8);
    }

}

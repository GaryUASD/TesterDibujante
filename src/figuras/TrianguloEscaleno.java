package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Jesus Daniel Valdez
 */
public class TrianguloEscaleno extends Triangulo {

    Color colorFondo;
    Color colorBorde;

    public TrianguloEscaleno(Point ubicacion, Color colorBorde, Color colorFondo) {
        super(ubicacion);
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

    /**
     *
     * @param g
     */
    @Override

    public void dibujar(Graphics g) {

        Point punto1 = new Point(ubicacion.x, ubicacion.y + altura);
        Point punto2 = new Point(ubicacion.x + anchura, ubicacion.y + altura);
        Point punto3 = new Point(ubicacion.x - anchura / 2, ubicacion.y);

        int[] puntosX = new int[]{punto1.x, punto2.x, punto3.x};
        int[] puntosY = new int[]{punto1.y, punto2.y, punto3.y};

        g.setColor(this.colorFondo);
        g.fillPolygon(puntosX, puntosY, 3);
        g.setColor(this.colorBorde);
        g.drawPolygon(puntosX, puntosY, 3);

    }
}

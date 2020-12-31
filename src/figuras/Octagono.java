package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Jesus Daniel Valdez
 */
public class Octagono extends Rectangulo {

    Color colorFondo;
    Color colorBorde;

    public Octagono(Point ubicacion, Color colorBorde, Color colorFondo) {
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

    Point punto1 = new Point((ubicacion.x - (int) (anchura * 0.25)), ubicacion.y + altura / 2);
    Point punto2 = new Point (ubicacion.x - (int) (anchura * 0.25), ubicacion.y + altura + 5 );
    Point punto3 = new Point (ubicacion.x + anchura / 4, ubicacion.y + altura + 50  );
    Point punto4 = new Point (ubicacion.x + anchura + 10, ubicacion.y + altura + 50 );
    Point punto5 = new Point (ubicacion.x + (int) (anchura + (anchura * 0.5)), ubicacion.y + altura +2);
    Point punto6 = new Point (ubicacion.x + (int) (anchura + (anchura * 0.5)), ubicacion.y + altura - 50);
    Point punto7 = new Point (ubicacion.x + (int) (anchura + (anchura * 0.1)), ubicacion.y + altura - 100);
    Point punto8 = new Point(ubicacion.x + anchura / 5, ubicacion.y + altura - 100 );
    
    int[] puntosX = new int[]{punto1.x, punto2.x, punto3.x, punto4.x, punto5.x, punto6.x,punto7.x,punto8.x};
    int[] puntosY = new int[]{punto1.y, punto2.y, punto3.y, punto4.y, punto5.y, punto6.y, punto7.y,punto8.y};

        g.setColor(this.colorFondo);
        g.fillPolygon(puntosX, puntosY, 8);
        g.setColor(this.colorBorde);
        g.drawPolygon(puntosX, puntosY, 8);

    }
}

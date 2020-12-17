package figuras;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Jesus Daniel Valdez
 */
public class Flecha extends Rectangulo {

    public Flecha(Point ubicacion) {
        super(ubicacion);
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

        g.drawLine(punto1.x, punto1.y, punto2.x, punto2.y);
        g.drawLine(punto2.x, punto2.y, punto3.x, punto3.y);
        g.drawLine(punto1.x, punto1.y, punto4.x, punto4.y);
        g.drawLine(punto4.x, punto4.y, punto5.x, punto5.y);
        g.drawLine(punto3.x, punto3.y, punto6.x, punto6.y);
        g.drawLine(punto6.x, punto6.y, punto7.x, punto7.y);
        g.drawLine(punto7.x, punto7.y, punto5.x, punto5.y);

    }

}

package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Soporte
 */
public class Triangulo extends Rectangulo {
    

    public Triangulo(Point ubicacion) {
        super(ubicacion);
    }

    /**
     *
     * @param g
     */
    @Override

    public void dibujar(Graphics g) {

        
      
      //Implemtenacion con lineas
      Point punto1 = new Point(ubicacion.x,ubicacion.y+altura);
      Point punto2 = new Point(ubicacion.x+anchura,ubicacion.y+altura);
      Point punto3 = new Point(ubicacion.x+anchura/2,ubicacion.y);
      
      
      g.drawLine(punto1.x, punto1.y,punto2.x,punto2.y);
      g.drawLine(punto2.x,punto2.y,punto3.x,punto3.y);
      g.drawLine(punto3.x,punto3.y,punto1.x,punto1.y);

    
        
        
        /*
      
        Point punto1 = new Point(ubicacion.x - anchura / 2, ubicacion.y + altura / 2);
        Point punto2 = new Point(ubicacion.x + anchura / 2, ubicacion.y);
        Point punto3 = new Point(ubicacion.x + anchura, ubicacion.y + altura / 2);
        int[] puntosX = new int[]{punto1.x, punto2.x, punto3.x};
        int[] puntosY = new int[]{punto1.y, punto2.y, punto3.y};
      
        g.setColor(Color.yellow);
        g.fillPolygon(puntosX, puntosY, 3);
        g.setColor(Color.red);
        g.drawPolygon(puntosX, puntosY, 3);
        */
    }
}

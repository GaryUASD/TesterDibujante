package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class SemiCirculo extends Circulo {

  int angulo = 180;

  Color colorFondo;
  Color colorBorde;

  public SemiCirculo(Point ubicacion, Color colorBorde, Color colorFondo) {
    super(ubicacion);
    this.colorFondo = colorFondo;
    this.colorBorde = colorBorde;
  }

  @Override
  public void dibujar(Graphics g) {
    int x = ubicacion.x + ((anchura < 0) ? this.anchura : 0);
    int y = ubicacion.y + ((altura < 0) ? this.altura : 0);

    if (altura < 0) {
      angulo = -180;
    } else {
      angulo = 180;
    }

    g.setColor(this.colorFondo);
    g.fillArc(x, y, Math.abs(anchura), Math.abs(altura), angulo, -angulo);
    g.drawLine(x, y + Math.abs(altura) / 2, x + Math.abs(anchura), y + Math.abs(altura) / 2);

    g.setColor(this.colorBorde);
    g.drawArc(x, y, Math.abs(anchura), Math.abs(altura), angulo, -angulo);
    g.drawLine(x, y + Math.abs(altura) / 2, x + Math.abs(anchura), y + Math.abs(altura) / 2);

  }
}

  /*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * Contributor(s):Octani T
 */
package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Octa
 */
public class Triangulo extends Rectangulo {
 Color colorFondo;
 Color colorBorde;
 
   public Triangulo(Point ubicacion, Color colorBorde, Color colorFondo) {
        super(ubicacion);
        //setColor(colorBorde);
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

  @Override
  public void dibujar(Graphics g) {

    Point punto1 = new Point(ubicacion.x, ubicacion.y + altura);
    Point punto2 = new Point(ubicacion.x + anchura, ubicacion.y + altura);
    Point punto3 = new Point(ubicacion.x + anchura / 2, ubicacion.y);
    int[] puntosX = new int[]{punto1.x, punto2.x, punto3.x};
    int[] puntosY = new int[]{punto1.y, punto2.y, punto3.y};

//    g.drawLine(punto1.x, punto1.y, punto2.x, punto2.y);
//    g.drawLine(punto2.x, punto2.y, punto3.x, punto3.y);
//    g.drawLine(punto3.x, punto3.y, punto1.x, punto1.y);
    
    //TODO DEFINIR COMO SELECCIONAR EL COLOR DE PRIMER PLANO Y SEGUNDO PLANO
        g.setColor(this.colorFondo);
        g.fillPolygon( puntosX, puntosY, 3);
        g.setColor(this.colorBorde);
        g.drawPolygon(puntosX, puntosY, 3);
  }
}

package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    @Test
    public void calcularArea() {
        Circulo circulo1 = new Circulo(1.0);
        assertEquals("el área del circulo es " + Math.PI + " unidades cuadradas", circulo1.areaCirculo());
    }

}



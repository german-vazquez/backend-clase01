package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrismaTest {
    @Test
    public void calcularArea(){
        Prisma prisma1 = new Prisma(2.0,3.0);
        assertEquals("el área del prisma es 6.0 unidades cuadradas", prisma1.areaPrisma());
    }

}
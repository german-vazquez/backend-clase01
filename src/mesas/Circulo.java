package mesas;

public class Circulo {
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public String areaCirculo() {
        Double area = 0.0;
        if (radio > 0) {
            area = Math.PI * Math.pow(radio, 2.0);
        } else {
            System.out.println("el valor del radio debe ser mayor que cero");
        }
        return "el área del circulo es " + area + " unidades cuadradas";
    }
}


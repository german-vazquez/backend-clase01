package mesas;

public class Prisma {
    private Double base;
    private Double altura;

    public Prisma(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public String areaPrisma(){
        Double area=0.0;
        if (base>0&&altura>0){
            area=base*altura;
        }else{
            System.out.println("El valor de las medidas debe ser mayor que cero");
        }
        return "el área del prisma es "+area+" unidades cuadradas";
    }
}

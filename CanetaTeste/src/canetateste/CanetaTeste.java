package canetateste;

public class CanetaTeste {

    public static void main(String[] args) {
         Caneta caneta = new Caneta("BIC", "Azul", 15);

        System.out.println(caneta.toString());

        caneta.setMarca("Compactor");
        caneta.setCor("Vermelha");
        caneta.setTamanho(18);

        System.out.println(caneta.toString());
    }
}
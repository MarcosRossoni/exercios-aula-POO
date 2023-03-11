package meupacote;

public class Exercicio2 {

    public static void main(String arg[]){
        Moto moto = new Moto("Honda",
                "CG-125",
                "Vermelha",
                2);
        System.out.println(moto.cor);

        Moto moto1;
        moto1 = new Moto();
        System.out.println();

        Moto moto2 = new Moto();
    }
}

package decorator.main;


import decorator.clase.NotaDePlata;
import decorator.clase.NotaDePlataAbstract;
import decorator.decoratoare.NotaDePlataDecorator;
import decorator.decoratoare.NotaDePlataPrintat1Mai;
import decorator.decoratoare.NotaDePlataPrintatNouAn;

public class Main{
    public static void main(String[] args) {
        System.out.println("DA");

        NotaDePlataAbstract notaDePlata = new NotaDePlata(50, "azi");
        NotaDePlataAbstract newNotaDePlata = new NotaDePlata(1000, "maine");

        notaDePlata.printeaza();
        newNotaDePlata.printeaza();

        NotaDePlataDecorator notaDePlataAnulNou = new NotaDePlataPrintatNouAn(notaDePlata);

        notaDePlata.printeaza();
        notaDePlataAnulNou.printeazaFelicitare();

        int input = 0;
        NotaDePlataDecorator notaDePlataDecoratorInput;

        if(input == 1){
            notaDePlataDecoratorInput = new NotaDePlataPrintatNouAn(notaDePlata);
        }
        else{
            notaDePlataDecoratorInput = new NotaDePlataPrintat1Mai(notaDePlata);
        }

        notaDePlataDecoratorInput.printeazaFelicitare();
    }
}
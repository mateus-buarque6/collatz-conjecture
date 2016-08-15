import java.util.Scanner;

class Collatz {

    int steps = 0;

    public int collatz (int num){

        int numero = num;

        if (num == 4){
          steps += 1;
          return 1;
        } else if (num % 2 == 0){
          steps += 1;
          return collatz(numero/2);
        } else if (num % 2 == 1){
          steps += 1;
          return collatz(3*numero + 1);
        }

        return 0;
    }

    public int getSteps(){
        return steps;
    }
}

public class CollatzConjecture {

    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        // INSTANCIA A CLASSE "Collatz" E LÊ UM VALOR INTEIRO
        Collatz n = new Collatz();
        System.out.println("Digite um valor");
        int number = ler.nextInt();

        // DIGITE O RESULTADO
        System.out.println();
        System.out.println(n.collatz(number));
        System.out.println(n.getSteps());
    }
}

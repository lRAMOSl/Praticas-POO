import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int resp;
        Calculadora cal = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("[1]Somar\n[2]Subtração\n[3]Multiplicação\n[4]Divisão");

        System.out.println("Qual operação deseja realizar?");
        resp = sc.nextInt();

        switch (resp) {
            case 1:
                System.out.println("Digite o primeiro valor");
                cal.setA(sc.nextFloat());
                System.out.println("Digite o segundo valor");
                cal.setB(sc.nextFloat());

                System.out.println("O resultado da soma é " + cal.soma());
                break;

            case 2:
                System.out.println("Digite o primeiro valor");
                cal.setA(sc.nextFloat());
                System.out.println("Digite o segundo valor");
                cal.setB(sc.nextFloat());

                System.out.println("O resultado da subtração é " + cal.subtracao());

                break;

            case 3:
                System.out.println("Digite o primeiro valor");
                cal.setA(sc.nextFloat());
                System.out.println("Digite o segundo valor");
                cal.setB(sc.nextFloat());

                System.out.println("O resultado da multiplicação é " + cal.multiplicacao());
                break;

            case 4:
                System.out.println("Digite o primeiro valor");
                cal.setA(sc.nextFloat());
                System.out.println("Digite o segundo valor");
                cal.setB(sc.nextFloat());

                System.out.println("O resultado da divisão é " + cal.divisao());
                break;
        }

    }
}

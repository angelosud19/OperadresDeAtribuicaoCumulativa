import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();

        double conta  = 50.0;
        if (min > 100) {
            conta += (min - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);

                sc.close();
    }
}

// AO COLOCAR UM VALOR ACIMA DE 50,00R$ CADA NUMERO SERÁ EQUIVALENTE A MAIS 2,00R$ DE ACRESCIMO NO CALCULO.
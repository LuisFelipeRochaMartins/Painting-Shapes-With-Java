import Objects.Cube;
import java.util.Scanner;

public class Cubo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        System.out.print("Informe o lado do cubo: ");
        double n = input.nextDouble();
        Cube cubo = new Cube(n);


        System.out.print("Informe o rendimento da tinta : ");
        double x = input.nextDouble();

        cubo.setRendimento(x);

        System.out.print("Informe o tipo da tinta : ");
        double y = input.nextDouble();

        cubo.setTipo(y);

        System.out.println(cubo);
        input.close();
    }
}
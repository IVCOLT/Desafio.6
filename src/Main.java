import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean entradaValida;

        double m,h,t = 0;

        do {
            System.out.println("Digite a Massa (kg). Altura (m). Tempo (s). Respectivamente: ");

            String mStr = input.nextLine();
            String aStr = input.nextLine();
            String tStr = input.nextLine();

            try {
                m = Double.parseDouble(mStr);
                h = Double.parseDouble(aStr);
                t = Double.parseDouble(tStr);
                entradaValida = true;

                double cavalos = (m * h / t) / 745.6999;

                System.out.println("A quantidade de cavalos sera de: "+ cavalos);
            }catch (NumberFormatException e){
                System.out.println("Erro. Digite um numero valido!");
                entradaValida = false;

            }
        }while(!entradaValida);

        input.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        int resultados[] = new int[11];
        int numTiros = 0;
        int random = 0;
        int dados=0;

        //juego
        System.out.println("Introduce el numero de tiros: ");
        numTiros = in.nextInt();

        //bucle jugadas
        for (int i = 0; i <numTiros ; i++) {
            //dado1
            //actualizar random

            random = (int) (Math.random() * 6) + 1;
            System.out.println(random);
            dados=random;

            //dado2
            random = (int) (Math.random() * 6) + 1;
            dados+=random;

            //guardar resultado
            resultados[dados-2]+=1;
            //reiniciar dados
        }

        //printar resultados
        for (int i = 0; i <resultados.length ; i++) {

            System.out.println("EL NUMERO " + (i+2) + " HA SALIDO: " + resultados[i] + " VECES.");

        }
    }
}

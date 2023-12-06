import java.util.Scanner;

public class menorAMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los 5 numeros: ");
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] resultado = Ordenar(arr);
        System.out.println();

        for (int item : resultado) {
            System.out.println(item + " ");
        }
    }
    public static int[] Ordenar(int[] inicio) {
        for (int i = 0; i < inicio.length; i++) {
            for (int j = i + 1; j < inicio.length; j++) {
                if (inicio[j] < inicio[i]) {
                    int anterior = inicio[i];
                    int nuevoMenor = inicio[j];
                    inicio[i] = nuevoMenor;
                    inicio[j] = anterior;
                }
            }
        }
        return inicio;
    }
}

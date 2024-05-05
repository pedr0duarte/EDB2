import java.util.Arrays;

public class OrdenacaoCrescente {
    public static int OrdenacaoCheck(int[] vetor) {
        if (vetor.length < 2) {
            return -1;
        }
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return i; 
            }
        }
        return -1;
    }
    
    public static void resultado(int[] vetor) {
    	int resultado = OrdenacaoCheck(vetor);
        System.out.print("O vetor ---> " + Arrays.toString(vetor) + " está ordenado? ");
        if (resultado == -1) {
            System.out.println("VERDADEIRO!");
        }
        else {
            System.out.println("FALSO!");
        }
    }

    public static void main(String[] args) {
        int[] vetorOrdenado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] vetorDesordenado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 19};
        
        resultado(vetorOrdenado);
        resultado(vetorDesordenado);
    }
}
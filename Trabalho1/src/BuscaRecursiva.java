public class BuscaRecursiva {

    public static int buscaSequencialRecursiva(int[] vetor, int x, int indice) {
    	if (indice >= vetor.length) {
            return -1;
        }
        if (vetor[indice] == x) {
            return indice;
        }
        return buscaSequencialRecursiva(vetor, x, indice + 1);
    }
    
    public static void resultado(int[] vetor, int x) {
        int resultado = buscaSequencialRecursiva(vetor, x, 0);
        if (resultado != -1) {
        	System.out.println("Elemento " + x + " encontrado na posição: " + resultado + "º do vetor");
        }
        else {
        	System.out.println("Elemento " + x + " não encontrado no vetor");
        }
    }

    public static void main(String[] args) {
        int[] vetor20 = {100, 5, 17, 3, 12, 8, 19, 4, 11, 2, 15, 7, 20, 6, 13, 1, 14, 9, 16, 99};
        int[] vetor40 = {100, 109, 23, 135, 72, 47, 88, 98, 31, 113, 139, 5, 64, 81, 129, 42, 16, 124, 67, 8, 53, 119, 76, 95, 140, 11, 121, 91, 58, 30, 144, 70, 26, 87, 13, 115, 39, 106, 101, 99};
        int xNoInicio = 100;
        int xNoFinal = 99;
        int xAusente = 0;
        
        resultado(vetor20, xNoInicio);
        resultado(vetor20, xNoFinal);
        resultado(vetor20, xAusente);
        resultado(vetor40, xNoInicio);
        resultado(vetor40, xNoFinal);
        resultado(vetor40, xAusente);
    }
}

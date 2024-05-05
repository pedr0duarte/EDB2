public class BuscaBinaria {
    
    public static int buscaBinaria(int[] vetor, int chave) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            if (vetor[meio] == chave) {
                return meio;
            }
            if (vetor[meio] < chave) {
                esquerda = meio + 1;
            }
            else {
                direita = meio - 1;
            }
        }
        return -1;
    }
        
    public static void resultado(int[] vetor, int chave) {
    	int resultado = buscaBinaria(vetor, chave);
    	if (resultado != -1) {
    		System.out.println("Elemento " + chave + " encontrado na posição: " + resultado + "º do vetor");
        }
    	else {
            System.out.println("Elemento " + chave + " não encontrado no vetor");
        }
    }

    public static void main(String[] args) {
    	int[] vetor20 = {1, 7, 14, 20, 27, 35, 42, 50, 58, 65, 73, 80, 88, 95, 103, 110, 118, 125, 133, 140};
    	int[] vetor40 = {1, 5, 11, 17, 23, 29, 35, 41, 47, 53, 59, 65, 71, 77, 83, 89, 95, 101, 107, 113, 119, 125, 131, 137, 43, 49, 55, 61, 67, 73, 79, 85, 91, 97, 103, 109, 115, 121, 133, 140};
    	int xNoInicio = 1;
    	int xNoFinal = 140;
        int xAusente = 0;
    
        resultado(vetor20, xNoInicio);
        resultado(vetor20, xNoFinal);
        resultado(vetor20, xAusente);
        resultado(vetor40, xNoInicio);
        resultado(vetor40, xNoFinal);
        resultado(vetor40, xAusente);
    }
}

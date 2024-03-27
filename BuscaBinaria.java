public class BuscaBinaria {
    public static void main(String[] args) throws Exception {
    
        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
            75, 76, 77, 78, 79, 80, 81,
            82, 83, 84, 85, 86, 87, 88, 89,
            90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

            int indice1 = buscaBinaria(listaNumeros, 99);
            int indice2 = buscaBinaria(listaNumeros, 81) ;

            System.out.println("O indice do numero 99 é: "+ indice1 );
            System.out.println("O indice do numero 81 é: "+ indice2);
        }


    public static int buscaBinaria(int[] numeros, int x) {
        int pos = 0, posInicial = 0, posFinal = numeros.length - 1;
        while(posInicial <= posFinal) {
        pos = (posFinal  + posInicial) / 2;
        if(numeros[pos] == x) return pos;
        else if(numeros[pos] > x) posFinal = pos - 1;
        else posInicial = pos + 1;
        };
        return -1;
    }
}

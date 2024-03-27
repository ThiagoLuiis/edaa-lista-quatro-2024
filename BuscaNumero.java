package ListaQuatro.src;
public class BuscaNumero {
public static void main(String[] args) {
    int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74,
        32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52,
        25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19,
        33, 21, 57, 19, 55, 93, 31, 54, 31, 50,
        66, 44, 54, 55, 29, 75, 43, 88, 61, 65,
        49, 87, 10, 25, 33, 70, 84, 125, 345, 400,
        77, 32, 41, 66, 33, 70, 84, 125, 600,
        38, 43, 51, 34, 76, 25, 48, 14, 50, 71,
        1, 98, 86, 38, 91, 65, 96, 60, 43, 75,
        86, 59, 17, 86, 12, 10, 16, 10, 33, 15,
        77, 22, 56, 4, 9, 63, 49, 80, 39, 53,
        97, 36, 34, 16, 1, 98, 78, 92, 100, 35 };
 
        
        int qum = buscaIndice(listaNumeros, 77);
        System.out.println("Questão 1\níndice do  numero 77:"+qum);

        int qdois = buscaIndice(listaNumeros, 600);
        System.out.println("Questão 2\níndice do  numero 600:"+qdois);

        int qtres = buscaIndice(listaNumeros, 56);
        System.out.println("Questão 3\níndice do  numero 56:"+qtres);

        int qquatro = buscaIndice(listaNumeros, 65);
        System.out.println("Questão 4\níndice do numero 65:"+qquatro);

        System.out.println("\nQuestão 5 \nTodos os índices do número '65': ");
        for (int i=0;i<listaNumeros.length-1;i++){
            if(listaNumeros[i]==65){
                System.out.println(i);
                continue;
            }            
        }  
    }

    public static int buscaIndice(int arr[], int t){

 
  
        if (arr == null) {
            return -1;
        }
 

        int len = arr.length;
        int i = 0;
 
        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

}





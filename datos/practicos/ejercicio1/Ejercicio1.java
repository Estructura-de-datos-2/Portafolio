package datos.practicos.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

        int K = 7; //mi matrícula 122510099"6" + 1 = 7 

        // FASE 1
	System.out.println("fase 1: ");
	System.out.println("");
	System.out.println(""); 
        int[] lecturas = {10, -5, 20, K * 2, -1, 30, 0, 15};

        // 1.1: empiezo en length - 1
        for (int i = lecturas.length - 1; i >= 0; i--) {
            if (lecturas[i] > 0) {
                System.out.println("Lectura positiva: " + lecturas[i]);
            }
        }
        // 1.2: el arreglo empieza en 0, entonces el último índice es length - 1.
        // Con i = length me salía del arreglo y daba error.

        // FASE 2
	System.out.println("");
	System.out.println("fase 2: ");
	System.out.println("");
	System.out.println(""); 
        int[][] ventas = new int[3][];
        ventas[0] = new int[K];
        ventas[1] = new int[K + 1];
        ventas[2] = new int[2];

        int suma = 0;

        // 2.1: uso el tamaño de cada fila
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = (i + 1) * (j + 1);
                suma += ventas[i][j];
            }
        }

        // 2.2
        System.out.println("Suma total: " + suma);
	System.out.println("");

        // 2.3: el jagged array usa solo la memoria que necesita cada fila.
        // La matriz normal reserva espacio que no se usa.

        // FASE 3
	System.out.println("fase 3:  ");
	System.out.println("");
	System.out.println(""); 
        int[][][] cubo = new int[2][K][K];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < K; j++)
                for (int k = 0; k < K; k++)
                    cubo[i][j][k] = i + j + k + 1;

        // 3.1: el while nunca terminaba porque i no aumentaba. Faltaba i++.
        int i = 0;
        while (i < 2) {
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < K; k++) {
                    if (cubo[i][j][k] % 3 == 0) {
                        System.out.println("Múltiplo encontrado en: " + i + "," + j + "," + k);
                    }
                }
            }
            i++; // corrección
        }

        // 3.2: lo mismo con for-each, ahora también cuenta los múltiplos
        int contador = 0;
        for (int[][] plano : cubo) {
            for (int[] fila : plano) {
                for (int valor : fila) {
                    if (valor % 3 == 0) {
                        System.out.println("Múltiplo encontrado: " + valor);
                        contador++;
                    }
                }
            }
        }
        System.out.println("Total de múltiplos de 3: " + contador);

        // 3.3: en el for-each "valor" es una copia, no cambia el arreglo.
        // Para modificar hay que usar el for normal con índices.
    }
}

/*- QUESTÃO 01: 

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int[] numeros = new int[5];*/

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Elementos do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}

//- QUESTÃO 02:

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int[] numeros = new int[6];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;

        int a = 0;

        for (int i = 0; i < numeros.length; i++) {
            a += numeros[i];
        }
        System.out.println("Soma dos elementos: " +a);
    }
}

//- QUESTÃO 03:

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int[] numeros = {12, 45, 7, 89, 23, 56, 90, 34};

        int a = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > a){
                a = numeros[i];
            }
        }
    System.out.println("O maior valor e: " +a);
    }
}

//- QUESTÃO 04:

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int[] numeros = {12, 45, 7, 89, 23, 56, 90, 34};

        int a = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < a){
                a = numeros[i];
            }
        }
    System.out.println("O menor valor e: " +a);
    }
}

//- QUESTÃO 05:

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int[] n = {10, 9, 7, 2, 5};
        int m = 0;
        int d = 0;

        for (int a = 0; a < n.length; a++) {
            m += n[a];
            d = m/n.length;
        }
        System.out.println(d);
    }
}

//- QUESTÃO 06:

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int[] n = {39, 22, 46, 6, 3, 77, 28, 34, 86, 73};
        int d = 0;
        for (int a = 0; a < n.length; a++) {
            if (n[a] % 2 == 0) {
            d++;
        }
        }
        System.out.println("Quantidade de numeros pares: " +d);
    }
}

//- QUESTÃO 07:

package paulo;

public class Paulo {

    public static void main(String[] args) {
        String[] n = {"alexandre", "roblox", "marcos", "kaua", "paulo"};
        for (int a = 0; a < n.length; a++) {
            System.out.println("Posicao " + a + ": " + n[a]);
        }
    }
}

//- QUESTÃO 08:

package nick;
import java.util.Scanner;
public class Nick {

    public static void main(String[] args) {
        int[] vetor = {3, 7, 12, 5, 9, 21, 14};

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que deseja procurar: ");
        int valor = sc.nextInt();

        boolean e = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                e = true;
                break;
            }
        }

        if (e) {
            System.out.println("O valor esta presente no vetor.");
        } else {
            System.out.println("O valor nao esta presente no vetor.");
        }

        sc.close();
    }
}

//- QUESTÃO 09:

package nick;
public class Nick {

    public static void main(String[] args) {
        String nome = "Luiz Felipe";
        System.out.print("Meu nome e: "+nome);
    }
}

//- QUESTÃO 10:

package nick;
public class Nick {

    public static void main(String[] args) {
        String texto= "Feijao com farinha";
        System.out.println("Tamanho: " + texto.length() + " caracteres.");
    }
}

//- QUESTÃO 11:

package nick;
public class Nick {

    public static void main(String[] args) {
        String texto= "Feijao com farinha";
        System.out.println("Maiusculo: " + texto.toUpperCase());
    }
}

//- QUESTÃO 12:

package nick;
public class Nick {

    public static void main(String[] args) {
        String texto= "FEIJAO COM FARINHA";
        System.out.println("Minusculo: " + texto.toLowerCase());
    }
}

//- QUESTÃO 13:

package nick;
public class Nick {

    public static void main(String[] args) {
        String texto= "Feijao com Farinha!";
        System.out.println("Contem 'Farinha'? " + texto.contains("Farinha"));
    }
}

//- QUESTÃO 14:

package nick;
public class Nick {

    public static void main(String[] args) {
        String a= "Feijao com Farinha";
        String b= "Feijao com Farinha";
        System.out.println("Sao iguais? " + a.equals(b));
    }
}

//- QUESTÃO 15:

package nick;
public class Nick {

    public static void main(String[] args) {
        String a= "Feijao com Farinha";
        System.out.println("Primeira letra: " + a.charAt(0));
        System.out.println("Ultima letra: " + a.charAt(17));
    }
}

//- QUESTÃO 16:

package ronaldo;
import java.util.Scanner;
public class Ronaldo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.println("Número de vogais: " + contador);

        sc.close();
    }
}

//- QUESTÃO 17:

package ronaldo;

public class Ronaldo {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2},
            {3, 4}
        };

        System.out.println("Valores da matriz:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//- QUESTÃO 18:

package ronaldo;

public class Ronaldo {

    public static void main(String[] args) {
   int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma dos elementos: " + soma);
    }
}

//- QUESTÃO 19:

package ronaldo;

public class Ronaldo {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elementos da diagonal principal:");

        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}


//- QUESTÃO 20:

package ronaldo;

public class Ronaldo {

    public static void main(String[] args) {
       int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de números pares: " + contador);
    }
}

//- A):

package ronaldo;

public class Ronaldo {

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Beatriz", "João", "Fernanda"};

        System.out.println("Nomes com mais de 5 letras:");

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].length() > 5) {
                System.out.println(nomes[i]);
            }
        }
    }
}

//- B):

package ronaldo;

public class Ronaldo {

    public static void main(String[] args) {
        int[][] matriz = {
            {3, 5, 1},
            {9, 2, 8},
            {4, 7, 6}
        };

        int maior = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("Maior valor: " + maior);
    }
}

//- C):

 package ronaldo;

public class Ronaldo {

    public static void main(String[] args) {
        String texto = "banana";

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("Quantidade de 'a': " + contador);
    }
}


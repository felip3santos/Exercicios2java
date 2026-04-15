/*- QUESTÃO 01: CRIAR E EXIBIR VETOR
Crie um vetor de 5 números inteiros, atribua valores e mostre todos os elementos.*/
 

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int[] numeros = new int[5];

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

/*- QUESTÃO 02: SOMA DOS ELEMENTOS
Crie um vetor com 6 números inteiros e mostre a soma de todos os elementos.*/


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

/*- QUESTÃO 03: MAIOR VALOR DO VETOR
Crie um vetor com 8 números inteiros e mostre o maior valor.*/

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

/*- QUESTÃO 04: MENOR VALOR DO VETOR
Crie um vetor com 8 números inteiros e mostre o menor valor.*/

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

/*- QUESTÃO 05: MÉDIA DOS VALORES
Crie um vetor com 5 notas, calcule e mostre a média.*/

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

/*- QUESTÃO 06: CONTAR NÚMEROS PARES
Crie um vetor com 10 números e mostre quantos são pares.*/

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

/*- QUESTÃO 07: MOSTRAR POSIÇÕES
Crie um vetor com 5 nomes e mostre nome + posição.*/

package paulo;

public class Paulo {

    public static void main(String[] args) {
        String[] n = {"alexandre", "roblox", "marcos", "kaua", "paulo"};
        for (int a = 0; a < n.length; a++) {
            System.out.println("Posicao " + a + ": " + n[a]);
        }
    }
}

/*- QUESTÃO 08: BUSCAR UM VALOR
Crie um vetor com 7 números e verifique se um valor está presente.*/

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

/*- QUESTÃO 09: EXIBIR STRING
Crie uma String com seu nome e mostre:
"Meu nome é ..."*/

package nick;
public class Nick {

    public static void main(String[] args) {
        String nome = "Luiz Felipe";
        System.out.print("Meu nome e: "+nome);
    }
}

/*- QUESTÃO 10: TAMANHO DA STRING
Mostre a quantidade de caracteres de uma String.*/

package nick;
public class Nick {

    public static void main(String[] args) {
        String texto= "Feijao com farinha";
        System.out.println("Tamanho: " + texto.length() + " caracteres.");
    }
}

/*- QUESTÃO 11: MAIÚSCULO
Mostre uma String em letras maiúsculas.*/

package nick;
public class Nick {

    public static void main(String[] args) {
        String texto= "Feijao com farinha";
        System.out.println("Maiusculo: " + texto.toUpperCase());
    }
}

/*- QUESTÃO 12: MINÚSCULO
Mostre uma String em letras minúsculas.*/

package nick;
public class Nick {

    public static void main(String[] args) {
        String texto= "FEIJAO COM FARINHA";
        System.out.println("Minusculo: " + texto.toLowerCase());
    }
}

/*- QUESTÃO 13: VERIFICAR PALAVRA
Verifique se uma frase contém determinada palavra.*/

package nick;
public class Nick {

    public static void main(String[] args) {
        String texto= "Feijao com Farinha!";
        System.out.println("Contem 'Farinha'? " + texto.contains("Farinha"));
    }
}

/*- QUESTÃO 14: COMPARAR STRINGS
Compare duas Strings e informe se são iguais.*/

package nick;
public class Nick {

    public static void main(String[] args) {
        String a= "Feijao com Farinha";
        String b= "Feijao com Farinha";
        System.out.println("Sao iguais? " + a.equals(b));
    }
}

/*- QUESTÃO 15: PRIMEIRO E ÚLTIMO CARACTERE
Mostre o primeiro e o último caractere de uma String.*/

package nick;
public class Nick {

    public static void main(String[] args) {
        String a= "Feijao com Farinha";
        System.out.println("Primeira letra: " + a.charAt(0));
        System.out.println("Ultima letra: " + a.charAt(17));
    }
}

/*- QUESTÃO 16: CONTAR VOGAIS
Conte quantas vogais existem em uma palavra.*/

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

/*- QUESTÃO 17: MATRIZ 2x2
Crie uma matriz 2x2 e mostre os valores.*/

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

/*- QUESTÃO 18: SOMA DA MATRIZ
Crie uma matriz 3x3 e mostre a soma dos elementos.*/

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

/*- QUESTÃO 19: DIAGONAL PRINCIPAL
Mostre os elementos da diagonal principal de uma matriz 3x3.*/

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


/*- QUESTÃO 20: CONTAR PARES NA MATRIZ
Mostre quantos números pares existem em uma matriz 3x3.*/

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

/*- A): Vetor de nomes: mostrar apenas nomes com mais de 5 letras.*/

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

/*- B): Matriz 3x3: mostrar o maior valor.*/

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

/*- C): String: contar quantas vezes a letra 'a' aparece.*/

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


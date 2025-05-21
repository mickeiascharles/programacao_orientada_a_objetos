package application;

import java.util.Locale;

import java.util.Scanner;

public class Programa_matrizbidimensional {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);



        System.out.println("Qual o tamanho da sua MATRIZ (bidimensional)?");

        int n = sc.nextInt();

        int[][] matriz = new int[n][n]; //[n]linhas [n]colunas



//CADASTRO DOS VALORES DA MATRIZ

        for (int i = 0; i < matriz.length; i++) { //loop de todas as LINHAS / matriz.length retorna o nº total de linhas na matriz

            for (int j = 0; j < matriz[i].length; j++) { //loop de todas as COLUNAS / matriz[i].length retorna nº total de colunas na linha atual

                System.out.printf("Digite o valor: ");

                matriz[i][j] = sc.nextInt(); //[i] linhas [j]colunas

            }

        }



//IMPRESSÃO DA MATRIZ (layout Matriz)

        System.out.printf("\nMATRIZ:");

        for (int i = 0; i < matriz.length; i++) { //faz a leitura de todas as LINHAS

            System.out.println();

            for (int j = 0; j < matriz[i].length; j++) { //faz a leitura de todas as COLUNAS

                System.out.print(matriz[i][j] + " ");

            }

        }



//CONTA QUANTOS VALORES NEGATIVOS FORAM INSERIDOS

        int negativos = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] < 0) { //se o valor for menor que zero, negativo+1 ou negativo++

                    negativos++;

                }

            }

        }

        System.out.println("\n\nTotal de Negativos = " + negativos);

        sc.close();

    }

}
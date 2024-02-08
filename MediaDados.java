/*
 * Laboratório de Programação 2 - Lab 01
 *
 * LUCAS SANTOS DUARTE DE OLIVEIRA
 */

import java.util.Scanner;

public class MediaDados{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String[] arrayString = sc.nextLine().split(" ");
	int tamanho = arrayString.length;
	int[] arrayInteiro = new int[tamanho];
	int media = 0;
	int[] arrayResultado = new int[tamanho];
	int t = 0;

	for (int i = 0; i < tamanho; i++) {
		arrayInteiro[i] = Integer.parseInt(arrayString[i]);
		media += arrayInteiro[i];
		}

	media = media/tamanho;
	
	int k = 0;
	for (int j = 0;j < tamanho; j++) {
		if (arrayInteiro[j] > media){
			arrayResultado[k] = arrayInteiro[j];
			k += 1;
			}else{
				t++;
			}
		}
	tamanho = arrayResultado.length;
	for (int l = 0;l < tamanho; l++){
	System.out.println(arrayResultado[l]);
		} 
	}
}

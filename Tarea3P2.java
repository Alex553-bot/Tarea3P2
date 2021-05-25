// tarea 3 p2

import java.util.ArrayList;

public class Tarea3{
	private int [][] matrix;

	public Tarea3(int tam){
		matrix = new int [tam][tam];
	}

	public String imprimir(){
		String respuesta = "";
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0 ; j < matrix.length; j++){
				respuesta = respuesta + matrix[i][j] + "\t";
			}
			respuesta = respuesta + "\n";
		}
		System.out.println(respuesta);
		return respuesta;
	}

	public void caracol(){
		int num = 1;
        boolean[][] matris;
        int PosInicial = 0;
        int PosFinal = matrix.length-1;

        matris = new boolean [matrix.length][matrix.length];

        while(num<=(matrix.length*matrix.length)){
            for(int col = 0; col<matrix[0].length; col++){
                if(matris[PosInicial][col] == false){
                    matrix [PosInicial][col] = num;
                    num++;
                    matris[PosInicial][col] = true;
                }
            }

            for(int fila = 0; fila < matrix.length; fila++){
                if(matris[fila][PosFinal]==false){
                    matrix [fila][PosFinal] = num;
                    num++;
                    matris [fila][PosFinal] = true;
                }
            }
            
            for(int col = matrix[0].length-1; col >=0; col--){
                if(matris[PosFinal][col] == false){
                    matrix [PosFinal][col] = num;
                    num++;
                    matris [PosFinal][col] =true;
                }
            }
            for(int fila = matrix.length-1; fila >= 0; fila--){
                if(matris[fila][PosInicial]==false){
                    matrix [fila][PosInicial] = num;
                    num++;
                    matris [fila][PosInicial] = true;
                }
            }

            PosInicial++;
            PosFinal--;
        }
	}

    public void Diagonales(){
        ArraList[] principal;
        ArraList[] secundaria;
        int contador = 0;
        int fila = 0;
        int col = 0;

        principal = new ArrayList[Integer];
        secundaria = new ArrayList[Integer];


        for(int i = 0 ; i < matrix.length; i++){
            principal[i] = matrix[i][i];
            contador++;
        }

        contador = matrix.length-1;   

        for(int i = 0; i < matrix.length; i++){
            secundaria [i] = matrix[contador][i];
        }
    
        System.out.println("diagonal principal \n")
        System.out.println(principal + "\n");
        System.out.println("diagonal secundaria \n")
        System.out.println(secundaria);
    }
}

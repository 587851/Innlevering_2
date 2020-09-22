package no.hvl.dat100;

import java.util.Arrays;

public class Tabeller {

	public static void main(String[] args) {
		int [][] matrise = {
				{1, 1, 1},
				{0, 0, 0},
				{1, 1, 1}};
		int [][] matrise1 = {
				{1, 0, 1},
				{0, 1, 0},
				{1, 0, 1},
				};
		//a)
		skrivUtv1(matrise);
		//b)
		System.out.println(tilStreng(matrise));
		//c)
		int [][]nyMatrise =skaler(5, matrise);
		skrivUtv1(nyMatrise);
		//d) versjon 1
		boolean lik = erLik(matrise, matrise1);
		if ( lik == true) {
			System.out.println("Dei er like");
		}
		else {
			System.out.println("Dei er ulike");
		}
		
		//d) versjon 2
		boolean lik1 = erLik1(matrise, matrise1);
		if ( lik1 == true) {
			System.out.println("Dei er like");
		}
		else {
			System.out.println("Dei er ulike");
		}
	}
	
	//a)
	public static void skrivUtv1(int[][] matrise) {
		for(int []rad : matrise) {
			for(int v : rad) {
				System.out.print(v + " ");
			}
		System.out.println();
		}
	}

	
	//b)
	public static String tilStreng(int[][] matrise) {
		String matriseString = "";
		for(int []rad : matrise) {
			for(int v : rad) {
				matriseString = matriseString + Integer.toString(v) + " ";
			}
			matriseString += "\n";
		}
		return matriseString;
	}
	
	//c)
	public static int[][] skaler(int tall, int[][] matrise){
		int [][]nyMatrise = new int[matrise.length][matrise[0].length];
		for(int r = 0; r<matrise.length; r++) {
			for(int v = 0; v<matrise[r].length; v++) {
				nyMatrise[r][v] = matrise[r][v]*tall;
			}
		}
		return nyMatrise;
	}
	//d) versjon 1
	public static boolean erLik(int[][] mat1, int[][] mat2){
		boolean lik = false;
		
		if (mat1.length != mat2.length) {
			return lik;
		}
		for(int a = 0; a<mat1.length; a++) {
			if(mat1[a].length != mat2[a].length) {
				return lik;
			}
		}
		for(int r = 0; r<mat1.length; r++){
			for(int v = 0; v<mat1[0].length; v++) {
				if(mat1[r][v] != mat2[r][v]) {
					return lik;
				}
			}
		}
		lik = true;	
		return lik;
	}
	//d) versjon 2
	public static boolean erLik1(int[][] mat1, int[][] mat2){
		boolean lik = false;
		if(Arrays.deepEquals(mat1, mat2)) {
			lik = true;
			return lik;
		}
		else {
			return lik;
		}
	}
	}
	
	


package br.com.array.estudo;

public class Ex03 {
	public static void main(String[] args) {
		
		int origem[]= {1,2,3,4,5,6};
		int destino1 [] = new int[8];
		int destino2 [] = new int[4];
		for(int i=0; i< destino1.length; i++) {
			System.out.println("limpo : " + destino1[i]);
		}
		System.arraycopy(origem, 2, destino1, 6, 2);
		System.arraycopy(origem, 2, destino2, 0, 4);
		
		for(int i=0; i< destino1.length; i++) {
			System.out.println("destino : " + destino1[i]);
		}
		
		for(int i=0; i< destino2.length; i++) {
			System.out.println("destino : " + destino2[i]);
		}
		
		

	}
}

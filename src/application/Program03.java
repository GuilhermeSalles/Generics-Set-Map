package application;

import java.util.Arrays;
import java.util.List;

public class Program03 {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
//		Porém não é possível adicionar dados a uma coleção de tipo curinga
//		List<?> list = new ArrayList<Integer>();
//		list.add(3);  erro de compilação
	}
//Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo":
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}

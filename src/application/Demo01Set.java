package application;

import java.util.HashSet;
import java.util.Set;

public class Demo01Set {
	public static void main(String[] args) {
		// TreeSet(); ordena alfabeticamente
		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}
}

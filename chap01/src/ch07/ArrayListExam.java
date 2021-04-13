package ch07;

import java.util.ArrayList;
import java.util.List;

import ch06.blackjack.Card;

public class ArrayListExam {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(10.1);
		list.add("asdads");
		list.add(new Card("",""));
		int i = (int)list.get(0);
		Object ob = list.get(1);
		double val = (double)ob;
		System.out.println("val : " + val);
	}

}

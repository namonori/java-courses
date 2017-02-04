import java.util.Random;
import java.util.*;
import static java.lang.Math.*;

public class Test {
	public static void main (String[] arg) {
		int[] myFirstArray = new int[15];
		for(int i = 0; i < 15; i++) {
			myFirstArray[i] = i;
		}
		Random myRandom = new Random();

		for(int i = 0; i<myFirstArray.length; i++) {
			myFirstArray[i] = myRandom.nextInt(100);
			System.out.println("No " + (i+1) + " - " + myFirstArray[i]);
		}
		Arrays.sort(myFirstArray);

		System.out.println(sqrt(9));

		//сортировка перебором
		/*
		for(int i = 0; i<myFirstArray.length; i++) {
			int min = myFirstArray[i];
			int min_i = i;
			for (int j = i+1; j < myFirstArray.length; j++) {
				if (myFirstArray[j] < min) {
					min = myFirstArray[j];
					min_i = j;
				}
			}
			if (i != min_i) {
				int tmp = myFirstArray[i];
				myFirstArray[i] = myFirstArray[min_i];
				myFirstArray[min_i] = tmp;
			}
		}
		*/

		//вывод после сортировки
		for(int i = 0; i<myFirstArray.length; i++) {
			System.out.println("No " + (i+1) + " - " + myFirstArray[i]);
		}
	}
}

package collections.list;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumExample {
	enum Colors {
		Vilote, Indigo, Blue, Green, Yellow, Orange, Red
	}

	public static void main(String[] args) {
		EnumSet<Colors> enumSet_colors = EnumSet.of(Colors.Vilote, Colors.Indigo, Colors.Blue,
				Colors.Green, Colors.Yellow, Colors.Orange, Colors.Red);
		Iterator<Colors> it = enumSet_colors.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

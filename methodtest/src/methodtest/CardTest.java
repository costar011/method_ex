package methodtest;

public class CardTest {

	public static void main(String[] args) {

		System.out.println("card.width = " + card.width);
		System.out.println("card.height= " + card.hegith);

		card c1 = new card();
		c1.kind = "Heart";

		c1.number = 7;

		card c2 = new card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은" + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + " ," + c1.hegith + ") ");
		System.out.println("c1은" + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + " ," + c2.hegith + ") ");

		System.out.println("c1의 width와 hegith를 각각 50, 80으로 변경한다.");
		c1.width = 50;
		c2.hegith = 80;

		System.out.println("c1은" + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + " ," + c1.hegith + ") ");
		System.out.println("c1은" + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + " ," + c2.hegith + ") ");

	}
}

class card {

	String kind;
	int number;
	static int width = 100;
	static int hegith = 250;
}

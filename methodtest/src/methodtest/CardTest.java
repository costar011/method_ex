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

		System.out.println("c1��" + c1.kind + "," + c1.number + "�̸�, ũ��� (" + c1.width + " ," + c1.hegith + ") ");
		System.out.println("c1��" + c2.kind + "," + c2.number + "�̸�, ũ��� (" + c2.width + " ," + c2.hegith + ") ");

		System.out.println("c1�� width�� hegith�� ���� 50, 80���� �����Ѵ�.");
		c1.width = 50;
		c2.hegith = 80;

		System.out.println("c1��" + c1.kind + "," + c1.number + "�̸�, ũ��� (" + c1.width + " ," + c1.hegith + ") ");
		System.out.println("c1��" + c2.kind + "," + c2.number + "�̸�, ũ��� (" + c2.width + " ," + c2.hegith + ") ");

	}
}

class card {

	String kind;
	int number;
	static int width = 100;
	static int hegith = 250;
}

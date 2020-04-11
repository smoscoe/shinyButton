
public class loops {

	public static void main(String[] args) {
		// Even number while loop
		System.out.println("Counting to 100 with even numbers:");
		int i= 2;
		while (i<=100){
			System.out.println(i);
			i+=2;
		}
		System.out.println(" ");
		System.out.println(" ");
		// By 3 going down while loop
		System.out.println("Counting down from 100 by 3:");
		int q = 100;
		while ( q >= 0) {
			System.out.println(q);
			q-=3;
		}
		System.out.println(" ");
		System.out.println(" ");
		//for loop counting every other number from 1 to 100
		System.out.println("Every other number from 1 to 100:");
		for (int a = 1; a <= 100; a+=2) {
			System.out.println(a);
		}
		System.out.println(" ");
		System.out.println(" ");
		//Hello on 3, World on 5, HelloWorld on both; 0 to 100
		System.out.println("Exchanging Hello, World, and HelloWorld for numbers divisible by 3, 5, and both:");
		for (int r = 0; r <= 100; r++) {
			 if (r % 3 == 0 && r % 5 == 0 && r >= 3) {
				System.out.println("HelloWorld");
			}
			else if (r % 5 == 0 && r >= 3) {
				System.out.println("World");
			}
			else if (r % 3 == 0 && r >= 3) {
				System.out.println("Hello");
			}
			else {
				System.out.println(r);
			}
			
		}
	}

}

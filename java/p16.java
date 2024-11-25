import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class P16 {
	public static void main(String args[]) {
		Scanner s1 = new Scanner(System.in);
		while (true) {
			System.out.println("1.Stack");
			System.out.println("2.Queue");
			System.out.println("3.Sphere");
			System.out.println("4.Cube");
			System.out.println("5.exit");
			System.out.println("\nenter your choice");
			int choice = s1.nextInt();

			if (choice == 1) {
				System.out.println("Enter Stack Size");
				int size = s1.nextInt();
				Stack s = new Stack(size);
				innerLoop: while (true) {
					System.out.println("1.PUSH");
					System.out.println("2.POP");
					System.out.println("3.PEEK");
					System.out.println("4.Display");
					System.out.println("5.exit");
					System.out.println("enter your choice");
					choice = s1.nextInt();
					try {
						switch (choice) {
							case 1:
								System.out.println("Enter New Value : ");
								int d = s1.nextInt();
								s.push(d);
								break;
							case 2:
								System.out.println("Pop element is : " + s.pop());
								break;
							case 3:
								System.out.println("Top element is : " + s.peek());
								break;
							case 4:
								System.out.println(s);
								break;
							case 5:
								break innerLoop;
							default:
								System.out.println("\nPlease,enter valid choice");
						}
					} catch (Exception e) {
						System.out.println("Error : " + e.getMessage());
					}
				}

			} else if (choice == 2) {
				System.out.println("Enter Queue Size");
				int size = s1.nextInt();
				Queue s = new Queue(size);
				innerLoop2: while (true) {
					System.out.println("1.EnQueue");
					System.out.println("2.DeQueue");
					System.out.println("3.Display");
					System.out.println("4.exit");
					System.out.println("enter your choice");
					choice = s1.nextInt();
					try {
						switch (choice) {
							case 1:
								System.out.println("Enter New Value : ");
								int d = s1.nextInt();
								s.enQueue(d);
								break;
							case 2:
								System.out.println("Pop element is : " + s.deQueue());
								break;

							case 3:
								System.out.println(s);
								break;
							case 4:
								break innerLoop2;
							default:
								System.out.println("\nPlease,enter valid choice");
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			} else if (choice == 3) {
				System.out.println("Enter radius size");
				int radius = s1.nextInt();
				Sphere s = new Sphere(radius);
				innerLoop2: while (true) {
					System.out.println("1.surfaceArea");
					System.out.println("2.volume");
					System.out.println("3.circumference");
					System.out.println("4.exit");
					System.out.println("enter your choice");
					choice = s1.nextInt();

					switch (choice) {
						case 1:
							System.out.println("Surface Area : " + s.surfaceArea());
							break;
						case 2:
							System.out.println("Volume : " + s.volume());
							break;

						case 3:
							System.out.println("Circumference : " + s.circumference());
							break;
						case 4:
							break innerLoop2;
						default:
							System.out.println("\nPlease,enter valid choice");
					}
				}
			} else if (choice == 4) {
				System.out.println("Enter length of one side :");
				int side = s1.nextInt();
				Cube s = new Cube(side);
				innerLoop2: while (true) {
					System.out.println("1.surfaceArea");
					System.out.println("2.volume");
					System.out.println("3.diagonal");
					System.out.println("4.exit");
					System.out.println("enter your choice");
					choice = s1.nextInt();

					switch (choice) {
						case 1:
							System.out.println("Surface Area : " + s.surfaceArea());
							break;
						case 2:
							System.out.println("Volume : " + s.volume());
							break;

						case 3:
							System.out.println("Diagonal : " + s.diagonal());
							break;
						case 4:
							break innerLoop2;
						default:
							System.out.println("\nPlease,enter valid choice");
					}
				}
			} else
				System.exit(0);

		}
	}
}
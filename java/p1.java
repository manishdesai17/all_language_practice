import java.util.Arrays;

class p1 {
	public static void main(String[] args) {
		int  arr[] = new int[args.length];
		int len = arr.length;
		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
			System.out.print(args[i] + " ");
		}
		System.out.println("\n\nSorted elment");
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("\nmax value in array");
		System.out.println("\nmax value is " + arr[len - 1]);

		System.out.println("\nmin value in array");
		System.out.println("min value is " + arr[0]);
	}
}
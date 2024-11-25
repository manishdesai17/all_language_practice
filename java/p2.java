import java.util.Arrays;

class p2 {
	public static void main(String[] args) {
		String arr[] = new String[args.length];
		System.out.println("hello");
		int len = arr.length;
		for (int i = 0; i < args.length; i++) {
			arr[i] = args[i];
			System.out.print(args[i] + " ");
		}
		System.out.println("\n\nSorted String");
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
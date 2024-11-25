import java.util.Arrays;

class arrnum {
	public static void main(String[] args) {
		int[]  arr = new int[5];
		for (int i = 0; i <=5; i++) {
			arr[i] = Integer.parseInt(args[i]);
			System.out.print(Arrays.toString(arr[i] + " "));
		}
		
	}
}
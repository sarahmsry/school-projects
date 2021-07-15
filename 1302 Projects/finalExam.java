public class finalExam{
	public static void main(String[] args) {
		int array[] = new int[] {2,4,6};
		int min = getMin(array);
		System.out.println("Minimum value in the array is: " + min);
	}
	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for(int i = 1; i<inputArray.length; i++) {
			if(inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}
}
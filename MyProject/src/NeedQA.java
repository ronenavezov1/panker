public class NeedQA {
	public static int sum( int a, int b){
		return a + b;
	}
	public static int[] sortWithError(int[] arr){

		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			newArr[i] = i;
		}
		return newArr;
	}
}
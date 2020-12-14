package project4;

public class BubbleSort implements Sorter {
	@Override
	public double[] sort(double[] in) {
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in.length - i - 1; j++) {
				if(in[j] > in[j + 1]){
					swap(in, j, j + 1);
				}
			}
		}
		return in;
	}

	static void swap(double[] arr, int i, int j){
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

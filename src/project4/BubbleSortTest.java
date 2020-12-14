package project4;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

	@Test
	public void testSort() {
		double[] arr = {3, 1, 6, 7, 2};

		BubbleSort b = new BubbleSort();
		arr = b.sort(arr);

		assertArrayEquals(arr, new double[]{1, 2, 3, 6, 7}, 0);
	}

	@Test
	public void testSwap(){
		double[] arr = {1,2,3,4,5};
		double[] swapped = {5,2,3,4,1};


		BubbleSort.swap(arr, 0, 4);

		assertArrayEquals(arr, swapped, 0.0);
	}
}
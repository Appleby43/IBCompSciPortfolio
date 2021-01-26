package sortAlg;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DescendingNumberFinderTest {

	@Test
	public void test(){
		DescendingNumberFinder d = new DescendingNumberFinder();

		List<Integer> l = new ArrayList<>();

		l.add(123);
		l.add(321);
		l.add(24323);
		l.add(39);
		l.add(159);

		d.find(l);
	}
}
package ArraysAndSort;
import java.util.ArrayList;
import java.util.List;

public class ArrayListWithWindowSizeSum {

	ArrayList<Integer> sum(ArrayList<Integer> values, int w){

		AL<Integer> result = new AL<Integer>();

		for(i = 0; i<values.length; i++){
			for(j=0; j<w; j++){
				int sum += values.get(j);
			}
			result.add(sum);
		}
		return result;
		}

}

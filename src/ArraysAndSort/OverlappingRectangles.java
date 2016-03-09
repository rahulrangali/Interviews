package ArraysAndSort;

public class OverlappingRectangles {
	boolean overlap(Point l1, Point l2, Point r1, Point r2) {

		if (l1.x > r2.x || l2.x > r1.x || l1.y < r2.y || l2.y < r1.y)
			return false;

		else
			return true;
	}

}

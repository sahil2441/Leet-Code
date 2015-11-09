
import java.util.HashMap;

public class MaxPointsOnLine {

	public static void main(String[] args) {
		Point[] points = { new Point(0, 0), new Point(-1, -1), new Point(1, 1) };
		System.out.println(maxPoints(points));
	}

	public static int maxPoints(Point[] points) {
		if (points == null)
			return 0;
		else if (points.length <= 2) {
			return points.length;
		}

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int xi, yi, xj, yj, deltaX, deltaY;
		int a, b, c;
		int maxCount = 0;
		Double slope;

		for (int i = 0; i < points.length; i++) {
			xi = points[i].x;
			yi = points[i].y;

			for (int j = i + 1; j < points.length; j++) {
				xj = points[j].x;
				yj = points[j].y;
				deltaX = xi - xj;
				deltaY = yi - yj;
				slope = new Double(deltaY / deltaX);
				// c=yj-xj*slope

				String key = generateKey(points[i], points[j]);
				if (map.get(key) == null) {
					map.put(key, 1);
				}

				if (map.get(key) > maxCount) {
					maxCount = map.get(key);
				}
			}
		}

		return maxCount;

	}

	private static String generateKey(Point point, Point point2) {
		return null;
	}
}

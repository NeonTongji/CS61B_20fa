package bearmaps;


import java.util.List;

public class NaivePointSet implements PointSet{

    List<Point> pointList;

    public NaivePointSet(List<Point> pointList) {
        this.pointList = pointList;
    }

    @Override
    public Point nearest(double x, double y) {
        double min = Double.MAX_VALUE;
        Point nearestPoint = null;
        Point target = new Point(x, y);

        for(Point point : pointList) {
            double dist = Point.distance(point, target);
            if(min > dist) {
                min = dist;
                nearestPoint = point;
            }
        }
        return nearestPoint;
    }


}

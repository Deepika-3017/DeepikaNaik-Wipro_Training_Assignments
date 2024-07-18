public class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistance() {
        double distance = Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate);
        return Math.round(distance * 100.0) / 100.0;
    }

    public double calculateDistance(Point point) {
        double distance = Math.sqrt(Math.pow(point.xCoordinate - this.xCoordinate, 2) + Math.pow(point.yCoordinate - this.yCoordinate, 2));
        return Math.round(distance * 100.0) / 100.0;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Input for point1
        System.out.println("Enter xCoordinate for point1:");
        double x1 = scanner.nextDouble();
        System.out.println("Enter yCoordinate for point1:");
        double y1 = scanner.nextDouble();
        Point point1 = new Point(x1, y1);

        // Input for point2
        System.out.println("Enter xCoordinate for point2:");
        double x2 = scanner.nextDouble();
        System.out.println("Enter yCoordinate for point2:");
        double y2 = scanner.nextDouble();
        Point point2 = new Point(x2, y2);

        scanner.close();

        System.out.println("Distance of point1 from origin is " + point1.calculateDistance());
        System.out.println("Distance of point2 from origin is " + point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is " + point1.calculateDistance(point2));
    }
}
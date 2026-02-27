/**
 * Helps show the difference and advantageous between an class with immutable fields and a functionally equivalent record class.
 * 
 * @author Jon Mrowczynski
 */
public class Records {

    public static void main(String[] args) {
        displaySpaceTimePoints();
        System.out.println();
        displaySpaceTimePointRecords();
    }

    private static void displaySpaceTimePoints() {
        System.out.println("Comparing SpaceTimePoints: ");
        final var point1 = new SpaceTimePoint(1, 1, 1, 0);
        System.out.println("point1: " + point1);
        System.out.println("Have to call getter: " + point1.getX() + " to access field values.");
        final var point2 = new SpaceTimePoint(1, 1, 1, 0);
        final var point3 = new SpaceTimePoint(1, 2, 3, 4);
        System.out.println("point1.equals(point2) ? -> " + point1.equals(point2));
        System.out.println("point1.equals(point3) ? -> " + point1.equals(point3));
    }

    private static void displaySpaceTimePointRecords() {
        System.out.println("Comparing SpaceTimePointRecords: ");
        final var point1 = new SpaceTimePointRecord(1, 1, 1, 0);
        System.out.println("point1: " + point1);
        System.out.println("Can either call field: " + point1.x + " or the getter: " + point1.x() + " to access field values since immutable!");
        final var point2 = new SpaceTimePointRecord(1, 1, 1, 0);
        final var point3 = new SpaceTimePointRecord(1, 2, 3, 4);
        System.out.println("point1.equals(point2) ? -> " + point1.equals(point2));
        System.out.println("point1.equals(point3) ? -> " + point1.equals(point3));
    }

    /**
     * A rather simple class that unfortunately contains a lot of boilerplate code. This is usually more "ceremonial" code that
     * you tend to have to write just to satisfy certain OOP requirements, such as encapsulation. 
     * <p>
     * This is a functionally equivalent, albeit significantly more verbose version of {@link SpaceTimePointRecord}.
     * 
     * @author Jon Mrowczynski
     */
    private static class SpaceTimePoint {

        private final double x;
        private final double y;
        private final double z;
        private final double t;

        SpaceTimePoint(double x, double y, double z, double t) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.t = t;
        }

        public double getX() { return x; }
        public double getY() { return y; }
        public double getZ() { return z; }
        public double getT() { return t; }

        @Override public boolean equals(Object o) {
            return o instanceof SpaceTimePoint p && x == p.getX() && y == p.getY() && z == p.getZ() && t == p.getT();
        }

        @Override public String toString() {
            return SpaceTimePoint.class.getSimpleName() + "[x=%.1f, y=%.1f, z=%.1f, t=%.1f]".formatted(x, y, z, t);
        }

    }

    /**
     * A record (or a data class) is a special kind of class that helps to reduce boilerplate code. Sometimes significantly so!
     * This record class is effectively functionally equivalent to {@link SpaceTimePoint}.
     * <p>
     * It is only possible to have a record if all of the instance fields are final.
     * <p>
     * While not shown in this example, a record also automatically provides an implicit implementation for {@link Object#hashCode()}.
     * <p>
     * Frequently we want to group together some immutable data, which is often where a record comes in. While seeming like a
     * pesky constraint, immutability helps with synchronization, producing more readable and efficient code.
     * <p>
     * If you wanted, you can still perform constructor overloading and write additional methods/functions inside a record!
     * 
     * @author Jon Mrowczynski
     */
    private static record SpaceTimePointRecord(double x, double y, double z, double t) { 

        /**
         * We can define our own methods inside a record!
         * 
         * @return return how far away the {@link SpaceTimPointRecord} is away from the origin!
         */
        public double magnitude() { return Math.sqrt(x * x + y * y + z * z); }

        /**
         * You can also overload the default constructor that Java makes implicitly for records!
         * 
         * @param x the x position of the point.
         * @param y the y position of the point.
         * @param z the z position of the point.
         */
        SpaceTimePointRecord(double x, double y, double z) {
            this(x, y, z, 0); // Always set time to 0 if JUST given spatial information.
        }

    }

}
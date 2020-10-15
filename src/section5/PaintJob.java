package section5;

public class PaintJob {
    // write your code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;

        double areaOfWall = width * height;
        int noOfBuckets = (int)Math.ceil(areaOfWall/areaPerBucket);

        return noOfBuckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;

        double areaOfWall = width * height;

        return (int)Math.ceil(areaOfWall/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0)
            return -1;

        return (int)(Math.ceil(area/areaPerBucket));
    }

}
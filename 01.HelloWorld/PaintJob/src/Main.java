public class Main {

    public static void main(String[] args) {

    }

    public static int getBucketCount(double width, double hight ,double areaPerBucket , int extraBuckets){

        if (width <= 0 || hight <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double bucketsneed = 0;
        double area = width * hight;
        if ( area % areaPerBucket == 0 ) {
             bucketsneed = (area / areaPerBucket);
        }else {
             bucketsneed = (area / areaPerBucket)+ 1;
        }

        int result = (int)(bucketsneed - extraBuckets) ;
        return result;



    }

    public static int getBucketCount(double width, double hight ,double areaPerBucket){
        if (width <= 0 || hight <= 0 || areaPerBucket <= 0 ) {
            return -1;
        }
        double bucketsneed = 0;
        double area = width * hight;
        if ( area % areaPerBucket == 0 ) {
            bucketsneed = (area / areaPerBucket);
        }else {
            bucketsneed = (area / areaPerBucket) + 1;
        }

        return (int)bucketsneed;
    }

    public static int getBucketCount(double area , double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0 ) {
            return -1;
        }

        double bucketsneed = 0;
        if ( area % areaPerBucket == 0 ) {
            bucketsneed = (area / areaPerBucket);
        }else {
            bucketsneed = (area / areaPerBucket)+ 1;
        }

        return (int)bucketsneed;

    }
}

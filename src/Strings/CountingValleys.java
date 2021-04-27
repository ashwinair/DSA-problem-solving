package Strings;
//An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly steps, for every step it was noted if it was an uphill, , or a downhill, step. Hikes always start and end at sea level, and each step up or down represents a
//
//        unit change in altitude. We define the following terms:
//
//        A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
//        A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
//
//        Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.

public class CountingValleys {
    public static void main(String[] args) {
        String path = "UDDDUDUU";
        System.out.println(countingValleys(8, path));
    }

    public static int countingValleys(int steps, String path) {

        int valley = 0;
        int count = 0;
        int u = 1;
        int d = -1;
        for (int i = 0; i < steps; i++) {
            char c = path.charAt(i);
            if (c == 'U')
                count += u;
            else
                count += d;
            if (count == 0 && path.charAt(i) == 'U') {
                valley++;
            }
        }
        return valley;
    }
}

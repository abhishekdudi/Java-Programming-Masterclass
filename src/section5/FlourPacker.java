package section5;

public class FlourPacker {
    public static boolean canPack (int bigCount,int smallCount,int goal) {

        if (bigCount<0 || smallCount<0 || goal<0)
            return false;

        int totalBigCount = bigCount * 5;
        int remValue;

        if (totalBigCount+smallCount == goal)
            return true;

        if (totalBigCount <= goal)
            remValue = goal - totalBigCount;
        else
            remValue = goal%5;

        return (remValue <= smallCount);
    }
}
public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalCount = (bigCount * 5) + smallCount;
        if(totalCount < goal) {
            return false;
        } else if(totalCount == goal) {
            return true;
        } else if(goal % 5 == 0 && goal / 5 <= bigCount) {
            return true;
        } else if (goal % 5 <= smallCount) {
            return true;
        } else {
            return false;
        }
    }

}

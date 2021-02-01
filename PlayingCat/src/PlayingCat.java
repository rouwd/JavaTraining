public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int topRange = summer ? 45 : 35;
        int bottomRange = 25;
        return temperature >= bottomRange && temperature <= topRange;
    }
}

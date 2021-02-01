public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int megaBytes = kiloBytes / 1024;
        int remainingKiliBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " +
                megaBytes +" MB and " +
                remainingKiliBytes + " KB");
    }
}

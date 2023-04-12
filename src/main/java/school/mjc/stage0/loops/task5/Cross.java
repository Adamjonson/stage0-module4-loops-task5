package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int halfLength;
        if (sideLength%2==0){
            halfLength = sideLength / 2;
        }else {
            halfLength = sideLength / 2 + 1;
        }

        for (int x = 1; x <= sideLength; x++) {
            if (x == halfLength) {
                for (int y = 1; y <= sideLength; y++) {
                    System.out.print("8");
                }
            } else {
                for (int y = 1; y <= sideLength; y++) {
                    if (y == halfLength) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        if (sideLength == 0){
            System.out.println("");
        }

    }
}

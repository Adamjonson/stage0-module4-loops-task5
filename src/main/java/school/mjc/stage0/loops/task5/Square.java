package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int x = 1; x <= sideLength; x++) {
            for (int y = 1; y <= sideLength; y++) {
                if (x == 1 || x == sideLength) {
                    System.out.print("8");
                } else if (y == 1 || y == sideLength) {
                    System.out.print("8");
                    if (y == 1) {
                        System.out.print(" ".repeat(sideLength-2));
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

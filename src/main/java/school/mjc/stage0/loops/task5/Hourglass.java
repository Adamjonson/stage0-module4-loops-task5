package school.mjc.stage0.loops.task5;

public class Hourglass {

    public static void hours(int height, int space){
        // height = 3;
        if (height == 1){
            System.out.println("8");
            //System.out.print(" ".repeat(space-1));
            //System.out.println("8");
            System.out.print(" ".repeat(space-2));
        }else if(height == 2){
            System.out.println("88");
            System.out.print(" ".repeat(space-1));
            System.out.println("88");
            System.out.print(" ".repeat(space-2));
        }else{
            System.out.println("8".repeat(height));
            System.out.print(" ".repeat(space));
            hours(height-2, space+1);
            // System.out.print(" ".repeat(space));
            System.out.println("8".repeat(height));
            if(space-2 >= 0){
                System.out.print(" ".repeat(space-2));
            }

        }

    }
    public void printHourglassOfGivenSize(int height) {
        if (height == 0){
            System.out.println("");
        }else {
            int space = 1;
            hours(height, space);
        }
    }
}

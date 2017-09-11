package nyc.c4q;

import java.util.Scanner;

public class Signboard {

    private int mFrame = 0;

    private void printLine(){
        System.out.println("IIII");
    }

    private int playerHorizontalPosition(){
        return mFrame % 4;
    }

    private int playerVerticalPosition(){
        return mFrame / 4;
    }

    public void display() {
        if (mFrame == 12){
            mFrame = 0;
        }
        for (int vertical=0; vertical < 3; vertical++){
            for (int horizontal=0; horizontal< 4; horizontal++){
                if (vertical == playerVerticalPosition() &&
                        horizontal == playerHorizontalPosition()) {
                    System.out.print("O");
                }
                else {
                    System.out.print("I");
                }
            }
            System.out.print("\n");
        }
        mFrame++;
    }

    public static void main(String[] args) throws InterruptedException {
        Signboard signboard = new Signboard();
        Scanner scanner = new Scanner(System.in);
        while (true){
            signboard.display();
            scanner.next();
        }
    }
}

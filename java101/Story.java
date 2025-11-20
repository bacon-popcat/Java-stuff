import java.util.Scanner;

public class Story {
    private static final Scanner scanner = new Scanner(System.in);

    public static String AskQuestion(String Question) {
        System.out.println(Question);
        return scanner.nextLine();
    }
    public static void print(String Text) {
       System.out.println(Text);
    }

    public static void waitMs(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupt flag
            System.out.println("The wait was interrupted.");
        }
    }

    public static void main(String[] args) {
        print("You wake up in your bed, realizing you have 5 minutes before school starts.");
        waitMs(1000);
        String Choice1 = Story.AskQuestion("What do you do: \n[A] - Skip breakfest and teeth brushing to go to school\n[B] - Take your time and prepare");
        waitMs(1000);
        if (Choice1.equalsIgnoreCase("A")) {
            print("You head to school as soon as possible but while doing so, you forgot your backpack!");
            waitMs(1000);
            String Choice2 = Story.AskQuestion("What do you do:\n[A] - Run back home to get backpack\n[B] - Keep walking to school\n");       
            waitMs(1000);

            if (Choice2.equalsIgnoreCase("A")) {
                print("As you quickly run back home, you didnt see the red light and got ran over by a car.");
                print("Ending #1: Death");
            } else if (Choice2.equalsIgnoreCase("B")) {
                print("You enter school just on time but the teachers ask where your backpack is.");
                print("Ending #2: Good Ending?");
            }

        } else if (Choice1.equalsIgnoreCase("B")) {
            print("You take your time but after your done, you're already 10 minutes late!");
            waitMs(1000);
            String Choice2 = Story.AskQuestion("What do you do:\n[A] - Run to school\n[B] - Skip school");
            waitMs(1000);

            if (Choice2.equalsIgnoreCase("A")) {
                print("When you get to school, your teachers were very understanding and cleared the lateness.");
                print("Ending #3: Amazing Ending");
            } else if (Choice2.equalsIgnoreCase("B")) {
                print("You decide to skip school but your parents were notified of it.\nYour parents beat you up for skipping school.");
                print("Ending #4: Bad Ending");
            }
        }
    }
}
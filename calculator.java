import java.util.Scanner;
// This is a basic calculator performing addition
class calculator{
    public static void main(String args[]) {
        Scanner userIn= new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Please enter first number: ");
        fnum = userIn.nextDouble();
        System.out.println("Please enter second number: ");
        snum = userIn.nextDouble();
        answer= fnum + snum;
        System.out.println("The answer is "+answer);
    }
}

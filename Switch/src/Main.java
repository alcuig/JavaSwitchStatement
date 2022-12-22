public class Main {
    // day of the week Challenge
        /*
        Write a method with printDayOfTheWeek that has one parameter of type int and name it day
        The method should not return any value at all
        Using a switch statement print "Sunday", "Monday" etc. if the int parameter "day' is 1,0, .... 6 respectively,
        otherwise it should print "Invalid Day"
        Bonus:
        write a second solution using if then else, instead of using switch
         */
    private static void printDayOfTheWeek (int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
        ;
    }
    private static void printDayOfTheWeek2 (int day) {
        if (day== 0) {
                System.out.println("Sunday");
        }
        else if(day == 1 )
        {
                System.out.println("Monday");
        }
        else if (day == 2)
        {
                System.out.println("Tuesday");
        }
        else if (day == 3)
        {
                System.out.println("Wednesday");
        }
        else if (day == 4)
        {
                System.out.println("Thursday");
        }
        else if (day == 5)
        {
                System.out.println("Friday");
        }
        else if (day == 6) {
                System.out.println("Saturday");
        }
        else {
                System.out.println("Invalid day.");
        }
    }
    public static void main(String[] args) {
        printDayOfTheWeek(1);
        printDayOfTheWeek(-1);
        printDayOfTheWeek2(1);
        printDayOfTheWeek2(-1);

        int value = 1;
        if(value ==1) {
            System.out.println("Value was 1");
        }else if (value ==2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }
        int switchValue = 1;



        switch (switchValue) {
            case 1: //equivalent of doing "if value ==1"
                System.out.println("Value was 1");
                break;  /*terminates the enclosing switch statement and goes to the next block of code
                        after the switch block */
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5://to test multiple values can use this syntax
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue); // to see value of variable
                break; //fif you don't have break statement you will get unpredictable results

            default: //equivalent of "else" --> for all other case that hasn't been covered above
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;

        }

        /* Create a new switch statement using char instead of int
        create a new char variable
        create a switch statement testing for
        A, B, C, D or E
        display a message if any of these are found and then break
        add a default which displays a message saying not found
         */

        char switchValueChar = 'A'; // single quotes for char, double for string
        switch (switchValueChar) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Was a C, D or E");
                System.out.println(switchValueChar + " was found");
                break;
            default:
                System.out.println("Not found");
                break;

        }

        //string version of switch code block

        String month = "January";
        switch (month.toLowerCase()) {
            case "january": // case-sensitive, will not detect "january", so use method .toLowerCase on input value
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
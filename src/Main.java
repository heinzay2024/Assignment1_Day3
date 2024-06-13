import java.util.*;

public class Main {
    public static void main(String[] args) {

        tutorial1();
        tutorial2A();
        tutorial2B();
        tutorial2C();
        tutorial3A();
        tutorial3B();
        tutorial3C();
        tutorial4A();
        tutorial4B();
        tutorial5();
        tutorial6();

    }

    //Tutorial-1 Start
    static void tutorial1(){
        int rows = 7;
        System.out.println("\n\nTutorial 1\n");
        //outer-loop for row
        for(int i = 1; i <= rows; i++){
            //inner first loop for space
            for(int j = 1;j < i; j++){
                System.out.print(" ");
            }
            //inner second loop for number print
            for(int k = i;k <= rows; k++){
                System.out.print(k+" ");
            }
            System.out.println();//Next Line
        }
        //for reverse
        for(int i = rows-1; i >= 1; i-- ){
            //inner-loop for space
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            //inner-loop for print
            for (int k = i; k <= rows; k++){
                System.out.print(k+" ");
            }
            System.out.println();//Next Line
        }
    }// Tutorial-1 End

    //Tutorial-2A Start
    static void tutorial2A(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        if ( num > 0 ){
            System.out.println("Number is Positive!");
        }else{
            System.out.println("Number is Negative!");
        }
    }

    //Tutorial-2B Start
    static void tutorial2B(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter Third Number : ");
        int num3 = scanner.nextInt();

        if( num1 > num2 && num1 > num3){
            System.out.println("The greatest : " + num1 );
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest : " + num2 );
        }else {
            System.out.println("The greatest : " + num3 );
        }
    }

    //Tutorial-2C Start
    static void tutorial2C(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();
        if( year % 4 == 0){
            if ( year % 100 == 0){
                if ( year % 400 == 0){
                    System.out.println("You entered Leap Year!");
                }else {
                    System.out.println("Not a leap Year!");
                }
            }else {
                System.out.println("You entered Leap Year!");
            }
        }else {
            System.out.println("Not a leap Year!");
        }
    }

    //Tutorial-3A Start
    static void tutorial3A(){
        double sum=0;
        double avg;
        int[] num={3,4,5,7,9};
        for (int i : num){
            sum += i;
        }
        avg = sum / 5;
        System.out.println(sum);
        System.out.println("Average is : " + avg);

    }

    //Tutorial-3B Start
    static  void tutorial3B(){
        int[] num = {25,14,56,15,36};
        int searchValue = 36;
        int[] newNum=new int[4];

        int j=0;
        for(int i = 0 ; i < num.length; i++){
            if ( num[i] != searchValue) {
                newNum[j] = num[i];
                j++;
            }
        }
    System.out.println(Arrays.toString(newNum));

    }

    //Tutorial-3C Start
    static void tutorial3C(){
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("Python");
        myArray.add("Java");
        myArray.add("PHP");
        myArray.add("Perl");
        myArray.add("C#");

        Object[] objArray = myArray.toArray();
        String[] intArray = new String[objArray.length];

        for (int i = 0; i < objArray.length; i++) {
            intArray[i] = (String) objArray[i];
        }

        System.out.println(Arrays.toString(intArray));
    }

    //Tutorial-4A Start
    static  void tutorial4A(){
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("Red");
        myArray.add("Green");
        myArray.add("Orange");
        myArray.add("White");
        myArray.add("Black");

        System.out.println(myArray);
    }

    //Tutorial-4B Start
    static void tutorial4B(){
        ArrayList<String> myString = new ArrayList<>();
        myString.add("Red");
        myString.add("Green");
        myString.add("Black");
        myString.add("White");
        myString.add("Pink");

        Collections.swap(myString,0,2);
        System.out.println("After Swaping : "+myString);
    }

    //Tutorial-5 Start
    static void tutorial5(){
        System.out.println("For Game Play");
        System.out.println("---Press 0: Rock, 1:Paper , 2: Scissor ---");
        Scanner sc = new Scanner(System.in);
        int inputData = sc.nextInt();
        Random random=new Random();
        int randomData = random.nextInt(3);


        switch (randomData){
            case 0:
                System.out.println("Computer is Rock!");
                if(inputData==0) {
                    System.out.println("You and me are the same!");
                } else if (inputData==1) {
                    System.out.println("You Win!");
                }else {
                    System.out.println("You Lose!");
                }
                break;
            case 1:
                System.out.println("Computer is Paper!");
                if(inputData==0) {
                    System.out.println("You Lose!");
                } else if (inputData==1) {
                    System.out.println("You and me are the same!");
                }else {
                    System.out.println("You Win!");
                }
                break;
            case 2:
                System.out.println("Computer is Scissor!");
                if(inputData==0) {
                    System.out.println("You Win!");
                } else if (inputData==1) {
                    System.out.println("You lose!");
                }else {
                    System.out.println("You and me are the same!");
                }
        }

    }

    //Tutorial-6 Start
    static void tutorial6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = scanner.nextLine();
        if (password.length()>=8 && hasUpper(password) && hasLower(password)){
            if (hasNumber(password) && hasSpecial(password)){
                System.out.println("Password is Strong!");
            }else {
                System.out.println("Password is Week!");
            }
        }else {
            System.out.println("Password is Week!");
        }

    }

    public static boolean hasUpper(String pass){
        boolean upper = false;
        for (char ch : pass.toCharArray()){
            if (Character.isUpperCase(ch)){
                upper = true;
            }
        }
        return upper;
    }

    public static boolean hasLower(String pass){
        boolean lower = false;
        for (char ch : pass.toCharArray()){
            if (Character.isLowerCase(ch)){
                lower = true;
            }
        }
        return lower;
    }

    public static boolean hasNumber(String pass){
        boolean hasdigit = false;
        for (char ch : pass.toCharArray()){
            if (Character.isDigit(ch)){
                hasdigit = true;
            }
        }
        return hasdigit;
    }

    public static boolean hasSpecial(String pass){
        boolean special = false;
        String specChar = "!@#$%^&*()-_=+{}[]|;:',.<>?";

        for (char ch : pass.toCharArray()) {
            if (specChar.contains(Character.toString(ch))) {
                special = true;
            }
        }
        return special;
    }
}
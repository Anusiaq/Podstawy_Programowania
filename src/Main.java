import java.util.Scanner;

public class Main {public static void main(String[] args) {
    int liczba = 5;
    int liczba2 = 2;
    System.out.println("Hello word" + liczba);

    String account = "AnnaZareba";
    account.length();
    System.out.println(account.length());
    System.out.println(account.indexOf('r'));
    System.out.println(account.substring(0, 5));
    System.out.println(account.trim());

    char a = 'a';
    char alpha = '\u03B1';
    System.out.println(alpha);

    char[] witaj = {'w', 'i', 't', 'a', 'j'};
    System.out.println(witaj);
    Character.isDigit(a);
    System.out.println(Character.isDigit(a));

    if (liczba>liczba2){
        System.out.println("SystemDziala");
    }else {
        System.out.println("SystemNieDziala");

        }
    Scanner skaner = new Scanner(System.in);
    System.out.println("Wpisz swoje imie");
    String userInputName = skaner.nextLine();
    System.out.println("Wpisz swoj nazwisko");
    String userInputSurname = skaner.nextLine();
    System.out.println("Witaj" + userInputName + userInputSurname + "!");

    }

}





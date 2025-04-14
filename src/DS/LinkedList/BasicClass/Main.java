package DS.LinkedList.BasicClass;

public class Main {
    public static void main(String args[]) {
        Cookie cookieOne = new Cookie("Green");
        Cookie cookieTwo = new Cookie("White");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
        cookieOne.setColor("Blue");
        System.out.println(cookieOne.getColor());
    }
}
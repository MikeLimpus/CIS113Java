/* 
 * Jonathan Limpus
 * Chapter 7 Part 2 Notes 
 * Circle client
 */
public class Chapter7NotesPt2 {
    public static void main(String args[]) {
        Circle circleObject1 = new Circle();
        Circle circleObject2 = new Circle(50.0);
        Circle circleObject3 = new Circle(25.0);

        System.out.println(circleObject1.toString());
        System.out.println(circleObject2.toString());
        System.out.println(circleObject3.toString());

        System.out.println("You created " + Circle.getCount() + " circles");
    }
}
/*
 * Jonathan Limpus
 * Chapter 7 lecture notes
 */

 public class Chapter7 {
    public static void main(String args[]) {
        Automobile carObject1 = new Automobile();
        System.out.print(carObject1.getMake() + " " + carObject1.getModel());
        
        carObject1.setColor("Red");
        carObject1.setYear(1969);
        carObject1.setMake("Ford");
        carObject1.setModel("Mustang");

        System.out.print("\n" + carObject1.getMake() + " " + carObject1.getModel() + " " +
                        carObject1.getColor() + " " + carObject1.getYear() + "\n");
        
        Automobile carObject2  = new Automobile("Black", "Tesla", "Model S", 2018);
        System.out.println(carObject1.getColor() + " " + carObject1.getMake() + " " + carObject1.getModel() + " " + carObject1.getYear());

        Automobile carObject3 = new Automobile("Tan", "Ford", "Pinto", 1971);

        // Accessing a public field, this is not common

        carObject1.example = "Don't make public fields"; 
        System.out.println(carObject1.example);


    }
 }
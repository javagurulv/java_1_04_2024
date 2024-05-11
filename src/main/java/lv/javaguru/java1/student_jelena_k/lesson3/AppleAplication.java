package lv.javaguru.java1.student_jelena_k.lesson3;

public class AppleAplication {
    public static void main(String[] args) {
        Apple appleType1 = new Apple(  "GrenySmit",  "Green",  100);
        Apple appleType2 = new Apple( "Gala" , "Red" , 55);
        Apple appleType3 = new Apple( "Fusion" , "yelow" , 70);

        System.out.println("Type: " + appleType1.getType());
        System.out.println("Type: " + appleType2.getType());
        System.out.println("Type: " + appleType3.getType());

        System.out.println("Color: " + appleType1.getColor());
        System.out.println("Color: " + appleType2.getColor());
        System.out.println("Color: " + appleType3.getColor());

        System.out.println("Weight: " + appleType1.getWeight());
        System.out.println("Weight: " + appleType2.getWeight());
        System.out.println("Weight: " + appleType3.getWeight());

    }
}

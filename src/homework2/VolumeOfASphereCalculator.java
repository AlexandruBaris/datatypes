package homework2;

public class VolumeOfASphereCalculator {
    public static void main(String[] args) {

        double radius = 10;
        double pi = Math.PI;
        double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        System.out.print("The volume of a sphere is= " + volume);
    }
}

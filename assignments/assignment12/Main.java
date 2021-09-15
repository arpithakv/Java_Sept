package co.arpitha.training.assignments.assignment12;

public class Main {

    public static void main(String[] args) {
        Circle[] circles = {
                new Cylinder(),
                new Cylinder(12.34),
                new Cylinder(12.34, 10.0),
                new Cylinder(12.34, 10.0, "blue")
        };

        for (int i = 0; i < circles.length; i++) {
            System.out.println("Cylinder " + i + " : Area of circular region is " + circles[i].getArea() + " cm^2  and " +
                    "volume is " + ((Cylinder) circles[i]).getVolume());
        }
    }
}
/*OUTPUT
Cylinder 0 : Area of circular region is 3.141592653589793 cm^2  and volume is 3.141592653589793
Cylinder 1 : Area of circular region is 478.38790628097786 cm^2  and volume is 478.38790628097786
Cylinder 2 : Area of circular region is 478.38790628097786 cm^2  and volume is 4783.879062809779
Cylinder 3 : Area of circular region is 478.38790628097786 cm^2  and volume is 4783.879062809779
 */

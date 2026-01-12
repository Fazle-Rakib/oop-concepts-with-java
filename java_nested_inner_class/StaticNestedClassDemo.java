package java_nested_inner_class;
class MotherBoard {
    String model;
    public MotherBoard(String model) {
        this.model = model;
    }
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            return usb2 + usb3;
        }
//        boolean isMSIBoard() {
//            if(model.equals("MSI")) {
//                return true;
//            }
//            return false;
//        }
    }

}

public class StaticNestedClassDemo {
    public static void main(String[] args) {

        // create an object of the static nested class
        // using the name of the outer class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}

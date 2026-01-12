package java_nested_inner_class;

class CPU {
    double price = 15000;
    class Processor {
        int cores = 4;
        int getCores() {
            return cores;
        }
        void setCores(int cores) {
            this.cores = cores;
            this.setPrice();
        }
        void setPrice() {
            price = price + (cores * 10000);
        }
    }
    double getPrice() {
        return price;
    }

    int setProcessorCores() {
        Processor p1 = new Processor();
        p1.setCores(16);
        return p1.getCores();
    }

}
public class CPUDemo {
    public static void main(String[] args) {
        CPU c1 = new CPU();
        System.out.println("# of cores in c1: " + c1.setProcessorCores());
        System.out.println("c1 price: " + c1.getPrice());

        CPU.Processor c1p2 = c1.new Processor();
        c1p2.setCores(10);
        System.out.println("c1 price: " + c1.getPrice());

    }
}

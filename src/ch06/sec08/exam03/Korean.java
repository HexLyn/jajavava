package ch06.sec08.exam03;

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean (String name, String ssn){

    }

    public static class CAR {
        int gas;

        void setGas(int gas) {
            this.gas = gas;
        }

        boolean isLeftGas() {
            if (gas == 0) {
                System.out.println("no gas");
                return false;
            }
            System.out.println("yes gas");
            return true;
        }
        void run() {
            while(true) {
                if (gas>0) {
                    System.out.println("gas left" + gas);
                    gas -=1;
                } else {
                    System.out.println("stop" + gas);
                    return;
                }
            }
        }
    }
}

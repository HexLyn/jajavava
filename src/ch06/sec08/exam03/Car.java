package ch06.sec08.exam03;

public class Car {
    int gas;
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas () {
        if(gas==0) {
            System.out.println("gas없어");
            return false;
        }
        System.out.println("gas있어");
        return  true;
    }
    void run() {
        while(true) {
            if(gas>0) {
                System.out.println("달려. (gas잔량:" +gas+")");
                gas -=1;
            }   else {
                System.out.println("멈춰. (gas잔량:"+gas+")");
                return;
            }
        }
    }
}

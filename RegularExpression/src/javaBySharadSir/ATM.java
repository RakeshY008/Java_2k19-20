package javaBySharadSir;
import java.util.*;
public class ATM {
    void cash(){
        System.out.println("cash withdraw");
    }
    void statement(){
        System.out.println("mini statement");
    }
    void balance(){
        System.out.println("balance enquery");
    }

    public static void main(String[] args) {
        ATM card = new ATM();
        card.cash();
    }
}

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Patient {

    private int p_id;
    private String p_name;


    public void Choice() {
        System.out.println("Enter your choice: 1)Pay Bill 2)null");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                PayBill();
                break;
            case 2:


        }

    }


    // encapsulation

    public int getP_id(){
        return p_id;
    }

    public void setP_id(int p_id){
        this.p_id = p_id;
    }


    public String getP_name(){
        return p_name;
    }

    public void setP_name( String p_name) {
        this.p_name = p_name;
    }

    // method pay
    public void PayBill(){
        System.out.println("Thanks for paying");
    }


}
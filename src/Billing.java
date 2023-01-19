

public class Billing {

    private  int b_no = 201;
    private int b_amt = 100;


    // aggregation
    Patient p = new Patient();
    String p_name = p.getP_name();   //object class  pass by method(reference)

    int p_id = p.getP_id();


    // agregation ?  composition  ( agregation code)
    public String getP_name(){
         return p_name;
    }

    public int getB_no(){
        return b_no;
    }

    public int getB_amt(){
        return b_amt;
    }


    public int getP_id(){
        return p_id;
    }

}

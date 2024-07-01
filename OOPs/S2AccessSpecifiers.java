/*
 * ACCESS MODIFIER     WITHIN CLASS     WITHIN PACKAGE     OUTSIDE PACKAGE ONLY BY SUBCLASS     OUTSIDE PACKAGE
 *
 * Private             YES               NO                   NO                                  NO
 * Default             YES               YES                  NO                                  NO
 * Protected           YES               YES                  YES                                 YES
 * Public              YES               YES                  YES                                 YES
 */
public class S2AccessSpecifiers {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        p1.name = "Spoorthy";
        p1.age = 20;
        // p1.password="XYZ"; ==>Gives Error due to private
        System.out.println(p1.getPassword());
        
    }
}

class BankAccount {
    String name;
    int age;
    private String password; //ONLY WITHIN // CLASS
    protected String protrct="PROTECTED"; //CLASS PACKAGE OPBSC
    public String pub="PUBLIC";          //CLASS PACK OPBSC OP
    void setPassword(String p) {
        this.password = p;
    }
    {
        this.password = new String("XTR");
    }
    String getPassword() {
        return this.password;
    }
}

public class S6StaticAndSuper {

    public static void main(String[] args) {
        School s1 = new School();
        s1.setname("Balu");
        s1.schName = "JVN";
        School s2 = new School();
        s2.setname("John");
        System.out.println(s2.schName);
    }
}
class School {
    String name;
    int rollNo;
    static String schName;

    public void setname(String name) {
        this.name = name;
    }
}
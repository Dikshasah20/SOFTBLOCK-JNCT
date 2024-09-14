public class program2 {
    static void burger(){
        System.out.println("Cheese burger");
    }
    public static void main(String[] args) {
        System.out.println("started");
        burger();
        System.out.println("main method");
        maggi();
        System.out.println("ended");
    }
    static void maggi() {
        System.out.println("Cheese Maggi");
    }

}

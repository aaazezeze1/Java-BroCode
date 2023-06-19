public class variables {
    public static void main(String[] args) {
//        declaration
        int x;

//        assignment
        x = 123;

//        initialization
        int x = 123;
        System.out.println(x);

//        String and integer combination
        System.out.println("My number is: " + x);

//        long needs another character at the end and will be displayed without it
        long x = 123209384092830423L;
        System.out.println(x);

//        byte x = 130 will show an error
        byte x = 100;
        System.out.println(x);

//        float needs f at the end
        float y = 3.14f;
        System.out.println(y);

//        doubles are more precise and don't need another character at the end
//        can store up to 15 digits after the decimal point
        double y = 3.14;
        System.out.println(y);

//        true or false only
        boolean z = true;
        System.out.println(z);

        char symbol = '@';
        System.out.println(symbol);

        String name = "Bro";
        System.out.println("Hello " + name);
    }
}
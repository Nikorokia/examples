public class JavaBasics { //primary class name and filename must be the same, case-sensitive
    public static void main(String[] args) {
        /* block
            comment */
        print("Hello World!");

        String name = "JavaBasics";
        int number = 100, number2 = 101;
        final int onehundred = 100; //can't be changed
        float decimal = 100.1f;
        char letter = 'A';
        boolean truth = true;

        if (number > number2) {
            print("if");
        } else if (number > onehundred) {
            print("else if");
        } else {
            print("else");
        }

        switch (number) {
            case 42:
                print("First case: " + number);
                break;
            case 100:
                print("I'm a run-on case!");
            default:
                print(truth);
        }
    }

    public static void print(Object o) {
        System.out.println(o.toString());
    }
}
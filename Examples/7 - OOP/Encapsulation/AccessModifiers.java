/**
 * @author Jon Mrowczynski
 */
public class AccessModifiers {

    public static void main(String[] args) {
        // Since the outer class "AccessModifiers" contains NestedClass1, we can access any of its public or private fields and functions!
        System.out.println(NestedClass1.publicField);
        System.out.println(NestedClass1.privateField);
        NestedClass1.publicFunction();
        NestedClass1.privateFunction();
        NestedClass2.myFunc();
    }

    public class NestedClass1 {

        public static int publicField = 42;
        private static int privateField = 24;

        public static void publicFunction() {
            System.out.println("We are in NestedClass1's public function.");
        }

        private static void privateFunction() {
            System.out.println("We are in NestedClass1's private function.");
        }

    }

    private class NestedClass2 {

        public static void myFunc() {
            System.out.println(NestedClass1.publicField);
            System.out.println(NestedClass1.privateField);
            NestedClass1.publicFunction();
            NestedClass1.privateFunction();
        }
        
    }

}
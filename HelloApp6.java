public class HelloApp6 {
    public static void main(String[] args) {

        // If no arguments → print default
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build names string
        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}
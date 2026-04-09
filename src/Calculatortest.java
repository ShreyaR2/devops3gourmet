public class CalculatorTest {

    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("========== RUNNING TESTS ==========");

        // Test Add
        test("Add 2 + 3 = 5",        calc.add(2, 3) == 5);
        test("Add 0 + 0 = 0",        calc.add(0, 0) == 0);
        test("Add -1 + 1 = 0",       calc.add(-1, 1) == 0);

        // Test Subtract
        test("Subtract 10 - 4 = 6",  calc.subtract(10, 4) == 6);
        test("Subtract 0 - 5 = -5",  calc.subtract(0, 5) == -5);

        // Test Multiply
        test("Multiply 3 * 4 = 12",  calc.multiply(3, 4) == 12);
        test("Multiply 0 * 9 = 0",   calc.multiply(0, 9) == 0);

        // Test Divide
        test("Divide 10 / 2 = 5.0",  calc.divide(10, 2) == 5.0);
        test("Divide 7 / 2 = 3.5",   calc.divide(7, 2) == 3.5);

        // Test Divide by Zero
        try {
            calc.divide(5, 0);
            test("Divide by zero throws exception", false);
        } catch (ArithmeticException e) {
            test("Divide by zero throws exception", true);
        }

        System.out.println("====================================");
        System.out.println("RESULTS: " + passed + " passed, " + failed + " failed.");

        if (failed > 0) {
            System.exit(1); // Fail the pipeline if any test fails
        }
    }

    static void test(String name, boolean result) {
        if (result) {
            System.out.println("  PASS --> " + name);
            passed++;
        } else {
            System.out.println("  FAIL --> " + name);
            failed++;
        }
    }
}

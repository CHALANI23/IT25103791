public class Calculator {
    
    public int add(int n1, int n2) {
        return n1 + n2;
    }

   
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    
    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

       
        int part1 = myCalc.multiply(3, 4); // 12
        int part2 = myCalc.multiply(5, 7); // 35
        int sum1 = myCalc.add(part1, part2); // 47
        int result1 = myCalc.square(sum1); // 2209
        System.out.println("Result 1: " + result1);

       
        int sumA = myCalc.add(4, 7); // 11
        int sqA = myCalc.square(sumA); // 121
        
        int sumB = myCalc.add(8, 3); // 11
        int sqB = myCalc.square(sumB); // 121
        
        int result2 = myCalc.add(sqA, sqB); // 242
        System.out.println("Result 2: " + result2);
    }
}
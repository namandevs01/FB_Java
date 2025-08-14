public class Bit_Operators{
    public static void main(String[] args){
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        // Bitwise AND
        int andResult = a & b; 
        System.out.println("a & b = " + andResult);
        // Bitwise OR
        int orResult = a | b; 
        System.out.println("a | b = " + orResult);
        // Bitwise XOR
        int xorResult = a ^ b; 
        System.out.println("a ^ b = " + xorResult);
        // Bitwise NOT
        int notA = ~a; 
        System.out.println("~a = " + notA);
        // Left shift
        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift);
        // Right shift
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift);
    }
}
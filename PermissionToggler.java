import java.util.Scanner;

public class PermissionToggler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: current permissions and bit position to toggle
        System.out.print("Enter current permissions (0-15): ");
        int permissions = scanner.nextInt();
        System.out.print("Enter the bit position to toggle (0-3): ");
        int bitPosition = scanner.nextInt();
        
        // Display original permissions
        System.out.println("Original permissions: " + String.format("%4s", Integer.toBinaryString(permissions)));

        // Toggle the specified bit using XOR
        int mask = 1 << bitPosition;
        permissions ^= mask;
        
        // Display updated permissions
        System.out.println("Updated permissions: " + String.format("%4s", Integer.toBinaryString(permissions)).replace(' ', '0'));
        
        scanner.close();
    }
}

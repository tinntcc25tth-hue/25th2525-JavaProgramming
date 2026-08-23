import java.util.Scanner;

public class TonghaiSo {

	public static void main(String[] args) {
		// Khai báo biến
		double num1, num2, sum;
		
		// khai báo đối tượng Scanner
		Scanner banphim = new Scanner(System.in);
		
		// In ra thông tin, mời User nhập số thứ nhất
		
		System.out.print("Mời nhập số thứ nhất: ");
		num1= banphim.nextDouble();
				
		System.out.print("Mời nhập số thứ hai: ");
		num2= banphim.nextDouble();
				
		// Tính toán
		
		sum = num1+num2;
		
		// Xuất ra
		System.out.print("Tổng của " + num1 + "và " + num2 + "là" + sum);
		System.out.print("Tổng của ");
		System.out.print(num1);
		System.out.print(" và ");
		System.out.print(num2);
		System.out.print(" là ");
		System.out.print(sum);

	}

}


package targilimHW;

public class HW {
	public static int exc10(int n) {
		if(n==1) {
			return 1*2;
		}
		if(n%2==0) {
			return exc10(n-1)+n*n;
		}
		return exc10(n-1)*2;
	}

	public static double exc11(int n ,int a,int k, int c) { 
		if(n==c) {
			return a-Math.sqrt(k);	
		}
		return exc11(n,a+4,k+4,c+1)+(a-Math.sqrt(k));
	}

	public static int exc12(int n1,int n2,int a) {
		if(a*n2>=n1) {
			return 0;
		}
		return exc12(n1,n2,a+1)+a*n2;
	}

	public static int exc13(int a,int b,int c) {
		if(c==1) {
			return a;
		}
		return exc13(b,a*a+b*b,c-1);
	}

	public static int exc21(String str, int index) {
		if (index == str.length()) {
			return 0;
		}
		int count = 0;
		if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
			count = 1;
		}
		return count + exc21(str, index + 1);
	}

	public static String exc22(String str, int index) {
		if (index >= str.length()) {
			return "";
		}
		if (index > 0 && index % 3 == 0) {
			return "*" + str.charAt(index) + exc22(str, index + 1);
		}
		return str.charAt(index) + exc22(str, index + 1);
	}

	public static String exc23(String str, int index) {
		if (index == str.length()) {
			return "";
		}

		return exc23(str, index + 1) + str.charAt(index);
	}

	public static void exc24(char start, char end) {
		if (start > end) {
			return;
		}

		System.out.print(start + " ");

		exc24((char) (start + 1), end);
	}

	public static void exc25(int n, int divisor) {
		if (divisor > n) {
			return;
		}

		if (n % divisor == 0) {
			System.out.print(divisor + " ");
		}
		exc25(n, divisor + 1);
	}

	public static void exc26(int n) {
		if (n == 0) {
			return;
		}
		int lastDigit = n % 10;
		if (lastDigit % 2 == 0) {
			System.out.print(lastDigit + " ");
		}

		exc26(n / 10);
	}
	public static void exc27(int i, int j) {
		if (j > 10) {
			if (i < 10) {
				System.out.println(); 
				exc27(i + 1, 1); 	            }
			return;
		}
		System.out.print(i * j + "\t");
		exc27(i, j + 1);
	}

	public static void exc28(int a1, int d, int n) {
		if (n == 0) {
			return;
		}
		System.out.print(a1 + " ");
		exc28(a1 + d, d, n - 1);
	}


	public static void exc29(int current, int increment, int n) {
		if (n == 0) {
			return;
		}
		System.out.print(current + " ");
		exc29(current + increment, increment + 1, n - 1);
	}


	public static void exc30(int n, int current, boolean isIncrease) {
		if (n == 0) return;
		System.out.print(current + " ");
		if (isIncrease) {
			exc30(n - 1, current + 1, false);
		} else {
			exc30(n - 1, current - 1, true);
		}
	}

	public static void exc31(int[] arr, int index) {
		if (index >= arr.length) {
			return;
		}
		if (index % 2 == 0) {
			System.out.println(arr[index]);
		}
		exc31(arr, index + 1);
	}

	public static void exc32(int[] arr, int index) {
		if (index >= arr.length-1) {
			return;
		}
		if (arr[index] < arr[index+1]) {
			System.out.println(arr[index]);
		}
		exc32(arr, index + 1);
	}

	public static int exc42(int n) {
		if (n<10) {
			return n;
		}
		int sum = 0;
		while (n >0) {
			sum += n /10;  
			n /= 10; 
		}
	return exc42(sum);
}




	public static void main(String[] args) {

	}

}

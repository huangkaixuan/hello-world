package firstProgram;

/**
 * 
 * 99乘法表
 * @author hkx
 * @date 2019-12-21
 */
public class NineNine {

	public static void main(String[] args) {
		/*
		 * for(int i=0;i<9;i++) { for (int j = 0; j <=i;j++) { System.out.print("*"); }
		 * System.out.print("\n"); }
		 */

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
			}
			System.out.print("\n");
		}
	}

}

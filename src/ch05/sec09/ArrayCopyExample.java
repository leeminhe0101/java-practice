package ch05.sec09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArr = {"java", "array", "copy"};
		String[] newStrArr = new String[5];
		
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for(String srr: newStrArr) {
			System.out.print(srr + ", ");
		}
	}
}


public class ExpOnIdentiyMatrix {

	public static void main(String[] args) {
		int x[][] = { { 1, 0, 0 }, { 8, 1, 0 }, { 0, 0, 1 } };
		
		boolean isIdentity= checkForIdentityMatrix(x);
		System.out.println(isIdentity);
	}

	private static boolean checkForIdentityMatrix(int[][] x) {
		boolean isIdentiy = true;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (i == j) {
					if (x[i][j] != 1) {
						isIdentiy = false;
						break;
					}
				} else {
					if (x[i][j] != 0) {
						isIdentiy = false;
						break;
					}
				}
			}
		}
		return isIdentiy;
	}
}

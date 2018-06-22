package ch05;

public class ch05Ex02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] su= {
				{3,5,9},
				{2,11,5},
				{8,30,10},
				{22,5,1}
		};
		int sum=0;
		for(int i=0; i<su.length;i++) {
			for(int j=0; j<3;j++) {
				System.out.printf("%d ",su[i][j]);
				sum+=su[i][j];
			}System.out.println();
		}System.out.println(sum);
		
	}

}

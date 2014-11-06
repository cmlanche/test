
public class Test {
	
	public static void main(String[] args){
		
		int[][] a = {
				{1,2,3,'r','y', 1},
				{4,5,6,'e','k', 1},
				{5,5,6,'l','g', 1},
				{1,2,3, 4,  5 , 1},
				{4,4,4, 4,  4 , 1}
		};
		//out put: 1 2 4 3 5 'r' 6 'y' 'e' 'k'
		
		int k = 0;
		int m = a.length;
		int n = a[0].length;
		int[] b = new int[m*n];
		
		int index = 0;
		while(k < n){
			//开始新的循环
			int i=0;
			int j=k;
			while(i <= k){
				b[index++] = a[i++][j--];
				if(i == m) break;
			}
			k++;
		}
		
		int p=1;
		while(p < m){
			int i = p;
			int j = n-1;
			
			while(i < m){
				b[index++] = a[i++][j--];
			}
			p++;
		}
		
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+" ");
		}
		
		System.out.println("test");
	}

}

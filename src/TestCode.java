
public class TestCode {
	
	public void printBossEle(int arr[], int size) {
		
		for(int i = 0; i< size; i++) {
			
			int j;
			for (j = i+1; j<size; j++) {
				
				if(arr[i] <= arr[j]) 
					break;
				
			}
				if(j == size) 
					System.out.println(arr[i] + " ");
			
		}
		
	}
	
	public static void main(String[] args) {
		TestCode boss = new TestCode();
		int arr[] = new int [] {1,3,2,4,5,10,11,0,8,2};
		int len = arr.length;
		boss.printBossEle(arr, len);
	}
	
}




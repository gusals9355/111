package ch07;

public class MyArrayList implements MyList {
	private int[] arr;
	
	public MyArrayList() {
		arr= new int[0];
	}
	
	@Override
	public void add(int value) {
		add(arr.length, value);
		
//		int[] temp = new int[arr.length+1]; // 2
//		for(int i=0; i<arr.length; i++) {
//			temp[i] = arr[i];
//		}
//		temp[arr.length] = value;
//		arr = temp;
	}
	@Override
	public void add(int index, int value) {
		int[] temp = new int[arr.length+1];
		int cnt=0;
		for(int i=0; i<temp.length; i++) {
			if(i == index) {
				temp[i] = value;
			}else {
				temp[i] = arr[cnt++];
			}
		}
		arr=temp;
	}
	
	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int i) {
		return arr[i];
	}
	
//	@Override
//	public void remove(int i) {
//		int[] temp = new int[arr.length-1];
//		int cnt=0;
//		for(int j=0; j<i; j++) {
//			temp[cnt++] = arr[j];
//		}
//		for(int j=i+1; j<=temp.length; j++) {
//			temp[cnt++] = arr[j];
//		}
//		arr=temp;
//	}
	@Override
	public int remove(int i) {
		int[] temp = new int[arr.length-1];
		int cnt=0;
		int reVal = arr[i];
		
		for(int j=0; j<i; j++) {
			temp[cnt++] = arr[j];
		}
		
		for(int j=i+1; j<=temp.length; j++) {
			temp[cnt++] = arr[j];
		}
		arr=temp;
		return reVal;
	}

}

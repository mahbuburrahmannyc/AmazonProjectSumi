package arrayExercise;

import java.util.Arrays;

public class NewArray {
	
	
	//int[]a= {"15,5,10,15,20,30"};

	
	
	//
	
public static void main(String[] args){
		
	int[] num = new int[5];
	num[0]=15;
	num[1]=5;
	num[2]=10;
	num[3]=15;
	num[4]=20;

	int min=Arrays.stream(num).min().getAsInt();//minimum number
	int max1=Arrays.stream(num).max().getAsInt();//maximum number
	
	int sum= num[0]+num[1]+num[2]+num[3]+num[4];
		
	System.out.println(sum);
System.out.println(num);//kotogulo number nisi ta show korbe 
System.out.println(num.length);//dot use korte hobe
System.out.println(num[2]);//index number 2 te koto ache
	
	System.out.println(min);
	System.out.println(max1);
	
	}

}


import java.util.Scanner;

public class GradeDistribute{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入10位同學的成績：");
		int nhigh=0;
		int nmedium=0;
		int nlow=0;
		Double []grade = new Double[11]; 
		for (int i=1;i<=10;i++){
			System.out.print("第"+i+"位：");
			grade[i] = Double.parseDouble(input.next());
			if(grade[i]>=81&&grade[i]<=100) nhigh++;	
			if(grade[i]>=60&&grade[i]<=80) nmedium++;
			if(grade[i]>=0&&grade[i]<=59) nlow++;
		}		
		System.out.println("===================================");
		for(int i=1;i<=10;i++){
			System.out.println("第"+i+"位："+grade[i]);
		}
		System.out.println();
		System.out.printf("平均：%.1f分\n",average(grade));
		System.out.printf("變異數：%.2f\n",variance(grade));
		System.out.printf("最高分：%.1f分\n",max(grade));
		System.out.printf("最低分：%.1f分\n",min(grade));
		System.out.println("分數介於81-100人數："+nhigh+"人");
		System.out.println("分數介於60-80人數："+nmedium+"人");
		System.out.println("分數介於0-59人數："+nlow+"人");
	}
	static Double sum(Double a[]){
		Double sum=0.0;
		for(int i=1;i<=a.length-1;i++){
			sum+=a[i];	
		}
		return sum;
	}
	static Double average(Double a[]){
		Double average=sum(a)/(a.length-1);
		return average;
	}
	static Double variance(Double a[]){
		Double deviation=0.0;
		for(int i=1;i<=a.length-1;i++){
			deviation+=Math.pow(a[i]-average(a),2);
		}	
		Double variance=deviation/(a.length-1);
		return variance;
	}
	static Double max(Double a[]){
		Double max=a[1];
		for(int i=1;i<=a.length-1;i++){
			if (a[i]>max) max=a[i];
			}
		return max;
	}
	static Double min(Double a[]){
		Double min=a[1];
		for(int i=1;i<=a.length-1;i++){
			if (a[i]<min) min=a[i];
			}
		return min;
	}
}
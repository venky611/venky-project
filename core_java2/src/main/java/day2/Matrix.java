package day2;

public class Matrix {

	public static void main(String[] args) {
		int a[][]={{2,2,4},{2,5,3},{3,4,5}};    
		int b[][]={{1,2,4},{2,7,3},{1,2,4}};    
		    
		//creating matrix to store  
		int c[][]=new int[4][4];  //3 rows and 3 columns  
		    
		  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];   
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();
		}  

	}

}

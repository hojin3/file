
public class 이차반복문2 {
	public static void main(String[] args){
		/*
			*
			**
			***
			****

			i			j
			줄수			별표
			1			1
			2			2
			3			3
			4			4	  
			===============  i==j  j==i
			
			
		 */
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
			****
			***
			**
			*		  
 
 			i			j
 			줄수			별표
 			1			4
 			2			3
 			3			4
 			4			1		+
 			i + j =5 ===> j=5-i
		 */
		for(int i=1;i<=4;i++){				//줄수
			for(int j=1;j<=5-i;j++){		//별표
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
				   *
				  **
				 ***
				****
	  				i	j	k
	  				줄수	공백	별표
	  				1	3	1
	  				2	2	2
	  				3	1	3
	  				4	0	4
	  				
	  				i+j=4 ==> j=4-i
	  						  k==i
	  				
		 */
		for(int i=1;i<=4;i++){				//줄수
			for(int j=1;j<=4-i;j++){		//공백
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){			//별표
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
			****
			***
			**
			*
					
			i		j		k
			줄수		공백		별표
			1		0		4
			2		1		3
			3		2		2
			4		3		1
			i-1=j  j=i-1
					i+k=5 ==> k=5-i
		 */
		for(int i=1;i<=4;i++){			//줄수
			for(int j=1;j<=i-1;j++){	//공백
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++){	//별표
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
				   *
				  ***
				 *****
				*******		 
				i		j		k
				줄수		공백		별표
				1		3		1
				2		2		3
				3		1		5
				4		0		7
				=========
				i+j=4 ==> j=4-i
				2*i=k+1 ==> k=2*i-1			
		 */
		for(int i=1;i<=10;i++){			//줄수
			for(int j=1;j<=10-i;j++){	//공백
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){	//별표
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}


















public class �����ݺ���2 {
	public static void main(String[] args){
		/*
			*
			**
			***
			****

			i			j
			�ټ�			��ǥ
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
 			�ټ�			��ǥ
 			1			4
 			2			3
 			3			4
 			4			1		+
 			i + j =5 ===> j=5-i
		 */
		for(int i=1;i<=4;i++){				//�ټ�
			for(int j=1;j<=5-i;j++){		//��ǥ
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
	  				�ټ�	����	��ǥ
	  				1	3	1
	  				2	2	2
	  				3	1	3
	  				4	0	4
	  				
	  				i+j=4 ==> j=4-i
	  						  k==i
	  				
		 */
		for(int i=1;i<=4;i++){				//�ټ�
			for(int j=1;j<=4-i;j++){		//����
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){			//��ǥ
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
			�ټ�		����		��ǥ
			1		0		4
			2		1		3
			3		2		2
			4		3		1
			i-1=j  j=i-1
					i+k=5 ==> k=5-i
		 */
		for(int i=1;i<=4;i++){			//�ټ�
			for(int j=1;j<=i-1;j++){	//����
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++){	//��ǥ
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
				�ټ�		����		��ǥ
				1		3		1
				2		2		3
				3		1		5
				4		0		7
				=========
				i+j=4 ==> j=4-i
				2*i=k+1 ==> k=2*i-1			
		 */
		for(int i=1;i<=10;i++){			//�ټ�
			for(int j=1;j<=10-i;j++){	//����
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){	//��ǥ
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

















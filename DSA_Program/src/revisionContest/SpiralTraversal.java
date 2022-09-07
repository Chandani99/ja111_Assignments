package revisionContest;

import java.util.Scanner;

public class SpiralTraversal {
	 public static void spiralTraversal(int [][]mat,int r,int c){
	        int top=0, bottom=r-1;
	        int left=0, right=c-1;
	        int totalelem=r*c;
	        int count=0;
	        while(count<totalelem){
	            for(int i=top; i<=bottom && count<totalelem; i++){
	                System.out.print(mat[i][left]+" ");
	                count++;
	            }
	            left++;
	            
	            for(int i=left; i<=right && count<totalelem; i++){
	                System.out.print(mat[bottom][i]+" ");
	                count++;
	            }
	            bottom--;
	            
	            for(int i=bottom; i>=top && count<totalelem; i--){
	                System.out.print(mat[i][right]+" ");
	                count++;
	            }
	            right--;
	            
	            for(int i=right; i>=left && count<totalelem; i--){
	                System.out.print(mat[top][i]+" ");
	                count++;
	            }
	            top++;
	            //**************
	            
	            
	        }
	        System.out.println();
	    }
	    public static void main(String []args){
	        Scanner sc=new Scanner(System.in);
	        int tc=sc.nextInt();
	        while(tc--!=0){
	            int r=sc.nextInt();
	            int c=sc.nextInt();
	            int [][] mat=new int[r][c];
	            for(int i=0; i<r; i++){
	                for(int j=0; j<c; j++){
	                    mat[i][j]=sc.nextInt();
	                }
	            }
	            spiralTraversal(mat,r,c);
	        }
	    }
}

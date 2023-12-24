package revisionContest;

public class PrintText {
	public static String display(int n){
        String str = "";
        if(n%7 == 0 && n%5 == 0)
        {
           str = "Masai School";
        }else if(n%7 == 0){
           str = "Masai";
        }
        else if(n%5 == 0){
            str = "School";
        } 
        return str;
    }
	public static void main(String[] args) {
		 String result = display(7);
		    System.out.println(result);

	}

}


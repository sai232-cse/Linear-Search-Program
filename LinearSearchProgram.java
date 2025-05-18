import java.util.Scanner;

public class LinearSearchProgram{

    public static void main(String args[]){

        Scanner snr=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=snr.nextInt();
	int array[]=new int[size];
        System.out.println("enter the elements");
	    
        for(int i=0;i<size;i++){
            array[i]=snr.nextInt();
        }

	System.out.println("enter the value to be searched");
        int element=snr.nextInt();
        boolean found=false;
	    
        for(int i=0;i<size;i++){
            if(array[i]==element){
                System.out.println("the value is found at index "+i);
                found=true;
            }
        }

        if(!found){
            System.out.println("not found");
        }
    }
}

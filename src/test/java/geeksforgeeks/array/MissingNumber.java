package geeksforgeeks.array;

public class MissingNumber {
	
	int MissingNumber(int array[], int n) {
        // Your Code Here
        
        //n*(n+1)/2
        int sumOfNat = n*(n+1)/2;
        
        int sumOfArray = 0;
        for(int temp : array){
            sumOfArray+=temp;
        }
        
        return sumOfNat - sumOfArray;
    }

}

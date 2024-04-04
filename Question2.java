// Q2:Find maximum sum path involving elements of given arrays
// Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
// We can start from either array, but we can switch between arrays only through its common elements.

// For example,

// Input: X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 }
// Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 }
// The maximum sum path is: 1 —> 2 —> 3 —> 6 —> 7 —> 9 —> 10 —> 12 —> 15 —> 16 —> 18 —> 100 
// The maximum sum is 199

public class Question2 {

    public static void main(String[] args){
        int[] X={3,6,7,8,10,12,15,18,100};
        int[] Y={1,2,3,5,7,9,10,11,15,16,18,25,50};

        int maxX=X.length;
        int maxY=Y.length;
        int sumX=0;
        int sumY=0;
        int sum=0;
        int i=0;
        int j=0;
        StringBuilder sumPath = new StringBuilder();

        while (i<maxX && j<maxY){
            if (X[i]<Y[j]){
                sumX= sumX + X[i];
                sumPath.append(X[i]).append(" -> ");
                i++;
            } 
            else if (X[i]>Y[j]){
                sumY= sumY+Y[j];
                sumPath.append(Y[j]).append(" -> ");
                j++;
            } 
            else {
                sum += Math.max(sumX,sumY)+X[i];
                sumPath.append(X[i]).append(" -> ");
                sumX=0;
                sumY=0;
                i++;
                j++;
            }
        }
        while (i<maxX){
            sumX+=X[i];
            sumPath.append(X[i]).append(" -> ");
            i++;
        }
        while (j<maxY) {
            sumY+=Y[j];
            sumPath.append(Y[j]).append(" -> ");
            j++;
        }
        sum = sum +Math.max(sumX, sumY);
        sumPath.delete(sumPath.length()-4,sumPath.length());
        System.out.println("Maximum sum path:" + sumPath.toString());
        System.out.println("The maximum sum is:" + sum);
    }
}

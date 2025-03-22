public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {7,3,2,4,1,6,5};
        int num = 1; boolean isFound=false;
        int ans = 0;

        for(int i=0; i<=arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]==num){
                    isFound = true;
                    num++;
                    break;
                }
                else{
                    isFound = false;
                    ans = i +1;
                }
            }
            if(!isFound){
                System.out.println(ans);
                break;
            }
        }

    }
}


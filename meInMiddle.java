import java.util.*;

class meInMiddle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        // Arrays.toString(arr);
        for(int i = 0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int x = arr.length/2;

        System.out.println(arr[x]);
    }
}
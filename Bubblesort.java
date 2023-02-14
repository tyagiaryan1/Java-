public class Bubblesort {
      
    static void bubbleSort(int arr[]){
        int n=arr.length;
        
         for(int i=0;i<n-1;i++){
          int flag=0;
          for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=1;
            }
          }
          if(flag==0){
            return;
          }
        }
    }

    public static void main(String[] args) {
        int[] arr={5,7,9,3,1,8,12,45,56,23,3};
        bubbleSort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

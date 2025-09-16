import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] selectionArr ={ 2,3,5,7};
        selectionSort(selectionArr);

        int[] bubbleArr = {10,5,3,8};
        bubbleSort(bubbleArr);

        int[] insertionArr = {7,8,3,1};
        insertionSort(insertionArr);


        int[] arrr = {1, 2, 3};
        for (int i = 0; i < arrr.length; i++) {       //user Def functn
            System.out.print(arrr[i] + " ");
        }
        System.out.println();




        System.out.println(Arrays.toString(insertionArr));    // insertion Sort

        System.out.println(Arrays.toString(selectionArr));    //inbuilt function

        System.out.println(Arrays.toString(bubbleArr));    //Bubble Sort
    }
    public static void selectionSort(int[] nums) {                  //TC = O(n^2)
        for(int i =0;i<=nums.length-1;i++){
            int min = i;
            for(int j=i+1;j< nums.length;j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            swap(nums, i, min);
        }
    }

    public static void bubbleSort(int[] nums){                      //TC= O(n^2)     for worst and simetime average also
        for(int i =0;i< nums.length-1;i++){                         //but we can make TC = O(n) [best case ] by giving the if didSwap functn it will check doest it swap once also or not ..if not swap once also then it will be O(n) [ if not swap it means the array is sorted]
            int didSwap = 0;
            for(int j = 0;j< nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums ,j,j+1);
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
    }

    public static void  insertionSort(int[] nums){
        for(int i = 1; i<nums.length;i++){
            int current = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j]>current){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = current;
        }
    }


    public static void swap(int[] arr,int a, int b){


        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


}

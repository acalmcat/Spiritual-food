import java.util.Arrays;
//冒泡排序和快速排序
public class Sort {
    public static void main(String[] args) {
        //写一个没有排序的数组
        int[] arr ={23,45,9,6,34,56,12,25,16};
        int[] arr2 = arr.clone();
        System.out.println("排序前的数组：");
        //将数组arr打印出来
        System.out.println(Arrays.toString(arr));
        System.out.println("采用冒泡排序后：");
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("采用快速排序后：");
        QuickSort(arr2,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //冒泡排序
    public static void BubbleSort(int[] arr) {
        int i,j;
        for(i=0;i<arr.length;i++){
            //每轮
            for(j=0;j<arr.length-1-i;j++){
                //判断相邻左右那个数字大，做过左边数字大，那就交换位置
                if(arr[j]>arr[j+1]){
                    //不使用第三方变量交换位置
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]= arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
    }
    //快速排序（左右指针法）
    public static void QuickSort(int[] arr,int begin,int end) {
        if(begin>=end) {
            return;
        }
        int left=begin;
        int right=end;
        //数组最左边的值当key
        int key=arr[begin];
        while(begin<end){
            //从右边开始找，直到找到一个数小于key
            while(arr[end]>=key&&begin<end){
                end--;
            }
            //将这个数放到左边
            arr[begin]=arr[end];
            //从左边开始找，直到找到一个数大于key
            while(arr[begin]<=key&&begin<end){
                begin++;
            }
            //将这个数放到左边
            arr[end]=arr[begin];
        }
        arr[begin]=key;
        int key_index=begin;
        //[left,key_index-1]key_index[key_index+1,right]
        QuickSort(arr,left,key_index-1);
        QuickSort(arr,key_index+1,right);
    }
}

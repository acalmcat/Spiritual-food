import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        //二分查找
        int[] arr = {6, 9, 12, 16, 23, 25, 34, 45, 56};
        //用户输入需要查找的数字
        System.out.println("请用户输入要查找的数字：");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        try {
            num = scanner.nextInt();
            //初始化获取数组的其实位置
        } catch (Exception e) {
            //报错给出提示
            System.out.println("你输入的数字不合法");
        }
        System.out.println("二分查找结果如下：");
        int result = BinarySearch(arr, num);
        if(result!=-1){
            System.out.println("找到了，下标为："+result);
        }else{
            System.out.println("数组中没有这个数字");
        }

    }

    public static int BinarySearch(int[] arr,int num) {
        int left=0;
        //初始化获取数组的终止位置
        int right=arr.length-1;
        //定义中间值mid
        int mid;
        while(left<=right){
            //如果输入值大于中间值，就在右半部分找，小于就在左半找
            mid=left+(right-left)/2;
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid]>num){
                right=mid-1;
            }else{
                left=mid+1;
            }

        }
        return -1;
    }
}

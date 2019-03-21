public class mppx {
    public static void main(String args[]) {

        int[] arr = {5, 8, 3, 6, 7, 2, 4, 15, 13, 12, 1, 29, 35, 48, 76, 18};

        for (int i = 0; i <= arr.length; i++) {//控制次数，n-1次
            for (int j = 0; j <= arr.length - i - 2; j++) {//第一次n-1次，i增大，次数变小
                if (arr[j] > arr[j + 1]) {//第一次结束后最大值到了最后
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
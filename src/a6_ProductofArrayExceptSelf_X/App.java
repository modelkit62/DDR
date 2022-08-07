package a6_ProductofArrayExceptSelf_X;

public class App {

    public static int[] productExceptSelf(int[] array) {
        int[] resultado = new int[array.length];
        resultado[0] = 1;
        for (int i = 1; i < array.length; i++) {
            resultado[i] = resultado[i - 1] * array[i - 1];
        }
        int right = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            resultado[i] *= right;
            right *= array[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        for(int i: productExceptSelf(nums)){
            System.out.println(i);
        }
    }

    public int[] productExceptSelf_2(int[] nums) {
        int[] res = new int[nums.length];

        res[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            res[i] = 1;
            res[i] *= nums[i + 1] * res[i + 1];
        }

        int pre = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] *= nums[i - 1] * pre;
            pre *= nums[i - 1];
        }

        return res;
    }

    public static int[] productExceptSelf_3(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i]=1;
            for (int j = 0; j < nums.length; j++) {
                if (i==j){
                    continue;
                } else {
                    array[i] *= nums[j];
                }
            }
        }
        return array;
    }
}

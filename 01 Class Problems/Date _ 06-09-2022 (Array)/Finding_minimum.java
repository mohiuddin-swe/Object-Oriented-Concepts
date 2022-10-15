public class Finding_minimum {
    public static void main(String[] args) {
        int[] arr = {1,100,5,99,0};

        int min = arr[0];

        for (int i=1; i<arr.length ;i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }

        System.out.println("The minimum value is : " + min);
    }
}

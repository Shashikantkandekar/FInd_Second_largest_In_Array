public class Second_largest {
    public static void main(String[] args) {

        int arr[] = {10, 12, 13, 14, 15, 16,17};
        int largest = 0;
        int sl=0;

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"\t");
        }
        for(int i=0; i<arr.length;i++)
        {
            if (arr[i]>largest){
                sl=largest;
                largest=arr[i];
            } else if (arr[i]>sl) {
                sl=arr[i];
            }
        }
        System.out.println("Second largest number is "+sl);
    }
}


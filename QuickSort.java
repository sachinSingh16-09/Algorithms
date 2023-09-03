
public class QuickSort {
    public static void main(String[] args) {
        int[] a={1,5,13,34,7,8,9,10};
        quicksort(a,0,a.length);
        System.out.println(Arrays.toString(a));


    }
    public static void quicksort(int a[], int low, int high){
        int s;
        s= partition(a, low, high);
        quicksort(a, low, s-1);
        quicksort(a, s+1, high);

    }
    public static int partition(int a[], int low, int high){
        int i=1,j=high,p,temp;
        p= a[low];
        while(low<high){
            while(a[i]<p){
                i++;
            }
            while(a[i]>p){
                j--;
            }
            if(i<j){
                temp= a[i];
                a[i]= a[j];
                a[j]= temp;

            }else{
                temp= a[low];
                a[low]= a[j];
                a[j]= temp;
                return j;
            }

        }
        return j;
    }
}

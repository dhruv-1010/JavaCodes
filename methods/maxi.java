//package area




public class maxi{
    static void maximum(int[] a){
        int max = a[0];
        for(int i:a){
            if(i>max){
                max = i; 
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        maximum(a);
    }
}
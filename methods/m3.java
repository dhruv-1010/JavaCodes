//package will be learning this after OOPs



// m3 -- passing objects as parameters
// objects are created in heap 
// only the refrence/object name is in stack so they are modifiable.
// string and other primitive data types are created in Stack so they are immutable at least by other functions 
//  but their values can be changed as content of actual parameters are copied in formal parameters.
//  when we pass p. datatypes are passed their copies are sent not actual variables.
// while when we pass objects their refrences are also sent.
public class m3 {
    static void m(int[] a){
        a[0] = 25;
    }
    static void change(int[] a,int index , int value){
        a[index-1] = value;
    }
    public static void main(String[] args) {
        int[] b = {0,25,25,25};
        System.out.println(b[0]); // 0
        m(b);
        System.out.println(b[0]); // 25
        // 
        change(b,2,50);
        for(int x:b){
            System.out.print(x+" ");
        }
    }
}
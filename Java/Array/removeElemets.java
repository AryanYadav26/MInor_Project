import java.util.*;
class removeElement {
    public static void main(String[] args) {
        removeElement rem = new removeElement();
        Scanner sc = new Scanner
        int size = sc.nextInt(); 
        int v =  
        int[] arr = new int[size];  
        System.out.println("Enter the elements of the array ::");  
    
        for(int i=0; i<size; i++) {  
           arr[i] = sc.nextInt();  
        }  
         rem.removeElement(arr);
        
    }
    public int removeElement(int[] nums, int val) {
        
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[c] = nums[i];
                c++;
                
            }
            
        }
        
        return c;
    }
    ,
}
import java.util.Arrays;

public class ShiftArray {

    public static void main(String[] args) {
        int n=10;
        int [] array = new int[n];
        int [] po= new int[n];
        int [] ne= new int[n];
        int co_po=0;
        int co_ne=0;


        for(int i=0;i<10;i++){
            array[i]= (int)(Math.random()*(-200))-1+100;
            if(array[i]>0){
                po[co_po]=i;
                co_po++;
            }
            else{
                ne[co_ne]=i;
                co_ne++;
            }
        }



        System.out.printf("Initial array: %s\n",Arrays.toString(array));



        int temp=array[po[co_po-1]];

        for(int i=co_po-1;i>=1;i--){

            array[po[i]]=array[po[i-1]];
        }
        array[po[0]]=temp;




        ///////////////////////////

       temp=array[ne[0]];

        for(int i=0;i<co_ne;i++){
            array[ne[i]]=array[ne[i+1]];
        }
       array[ne[co_ne-1]]=temp;

        System.out.printf("Final array:  %s",Arrays.toString(array));



    }


}

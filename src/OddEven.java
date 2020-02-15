public class OddEven {

    public static void combine(int [] odds, int[] evens, int [] mixed ){


        int j=0;

        for(int i=0;i<odds.length;i++){
            mixed[j]=odds[i];
            j++;
            mixed[j]=evens[i];
            j++;
        }


    }

    public static void fill(int[] array, boolean oddOrNot){
            int control=0;
            if(oddOrNot){
                control=1;
            }

            for(int i=0;i<array.length;i++){
                int x=(int)(Math.random()*100);
                if(x%2==control){

                    array[i]= x;

                }
                else{
                    array[i]=x+1;
                }


            }



        }




    public static void main(String[] args) {
        int n=10;int j;

        int [] even=new int[n];
        int [] odd=new int[n];
        int [] mixed= new int[2*n];



        fill(odd,true);
        fill(even, false);
        combine(odd,even, mixed);

        for(int i=0;i<2*n;i++){
            System.out.print(mixed[i]+" ");
        }



        }
    }



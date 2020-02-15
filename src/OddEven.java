public class OddEven {

    public static void main(String[] args) {
        int n=10;int j;

        int [] even=new int[n];
        int [] odd=new int[n];
        int [] mixed= new int[n*2];

        for(int i=0;i<n;i++){
            int x=(int)(Math.random()*100);
            if(x%2==0){

                even[i]= x;

            }
            else{
                even[i]=x+1;
            }


        }

        for(int i=0;i<n;i++) {
            int x=(int)(Math.random()*100);
               if(x%2==1){

                odd[i]=x;

            }
               else{
                   odd[i]=x+1;
               }


        }

        for(int i=0;i<n;i++){
            mixed[i]=odd[i];
            System.out.print(mixed[i]+" ");
            j=i+1;
            mixed[j]=even[i];
            System.out.print(mixed[j]+" ");



        }





        }
    }



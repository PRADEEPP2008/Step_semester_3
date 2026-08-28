public class M4{
    public static void printSkippingMultiplesOfThree(){
        for(int i=1;i<=20;i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i + " ");
        }
        Systeem.out.println();
    }
    public static void main(Strings[] args){
        printSkippingMultiplesOfThree();
    }
}
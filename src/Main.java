
public class Main {
    public static void main(String[] args) {

        int n= args.length,input=0,s=0;
        double avg;
        for(int i=0;i<n;i++){
            s+=Integer.parseInt(args[i]);
        }
        avg=s/n;
        System.out.println(s+"\nThe Average is : " +avg);
    }
}
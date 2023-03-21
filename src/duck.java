public class duck {
    final static int count ;
    static {
        count =  (int)(Math.random() * 10);   //
    }

    public duck(){
//        count++;
        System.out.println(count);
    }
}

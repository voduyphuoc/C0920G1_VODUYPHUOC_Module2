package Test;

public class X {
    public static void main(String [] args) {
        try {
            badMethod();
            System.out.print("A");
        }  catch (Exception ex)  {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void badMethod(){
        throw new Error();
    }
//public static void main(String [] args)     {
//    try {
//        badMethod();
//        System.out.print("A");
//    }catch (RuntimeException ex){
//        System.out.print("B");
//    }catch (Exception ex1){
//        System.out.print("C");
//    }finally{
//        System.out.print("D");
//    }
//    System.out.print("E");
//}
//    public static void badMethod(){
//        throw new RuntimeException();
//    }
}

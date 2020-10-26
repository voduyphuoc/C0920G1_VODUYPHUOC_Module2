package access_modifier.thuc_hanh;

public class Default {
    static class A{

        void msg(){System.out.println("Hello");}

    }
    static class B{

        public static void main(String args[]){

            A obj = new A();//Compile Time Error

            obj.msg();//Compile Time Error

        }

    }
}

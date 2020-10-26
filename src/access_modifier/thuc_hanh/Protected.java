package access_modifier.thuc_hanh;

public class Protected {
    public static class A{

        protected void msg(){System.out.println("Hello");}

    }
    static class B extends A{

        public static void main(String args[]){

            B obj = new B();

            obj.msg();

        }

    }
}

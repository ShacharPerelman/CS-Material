package Inheritance;

public class B extends A{
    public void func(){
        System.out.println("I am B");
    }
    public boolean isEqual(B other){
        return (this==other);
    }
}

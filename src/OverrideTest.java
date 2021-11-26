class A
{
    public void m(int v)
    {
        System.out.println(v);
    }
}

class B extends A
{
    @Override
    public void m(int v)
    {
        System.out.println(v+1);
    }
}

public class OverrideTest {
    public static void main(String argv[])
    {
        A a = new A();
        B b = new B();

        a.m(1);
        b.m(1);
    }
}

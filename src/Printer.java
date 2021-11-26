class GenericPrinter {
    public void print()
    {
        System.out.println("generic printer");
    }
}

class ColourPrinter extends GenericPrinter{
    @Override
    public void print()
    {
        System.out.println("color printer");
    }
}

class BWPrinter extends GenericPrinter{
    @Override
    public void print()
    {
        System.out.println("BW printer");
    }
}

public class Printer
{
    public static void main(String argv[])
    {
        GenericPrinter gp = new GenericPrinter();
        ColourPrinter cp = new ColourPrinter();
        BWPrinter bwp = new BWPrinter();

        gp.print();
        cp.print();
        bwp.print();
    }
}
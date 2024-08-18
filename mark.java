class mark
{
    public static void main(String args[])
    {
    int mark=101;
    if(mark<50)
    {
        System.out.println("5");
    }
    else if(mark>=50 && mark<=59)
    {
        System.out.println("d grade");
    }
    else if(mark>=60 && mark<=69)
    {
    System.out.println("c grade");
    }
    else if(mark>=70 && mark<=79)
    {
        System.out.println("b grade");
    }
    else if(mark>=80 && mark<=89)
    {
        System.out.println("a grade");
    }
    else if(mark>=90 && mark<=99)
    {
        System.out.println("a+ grade");
    }
    else
    {
        System.out.println("invalid number");
    }

}}
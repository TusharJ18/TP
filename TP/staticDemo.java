class Demo
{
    final int fina;
    private int a= 10;

    Demo()
    {
        fina=5;
         System.out.println("In the Demo()");
    }

    public void print()
    {
        System.out.println(a);
    }

}

class staticDemo
{
    public static void main(String args[])
    {

        Demo d1= new Demo();
       
        int b;
        d1.print();
        




    }


}
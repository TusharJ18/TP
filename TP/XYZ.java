
class OneBHK
{
    private double roomArea;
    private double hallArea;
    private double price;


    OneBHK(){}

    OneBHK( double roomArea, double hallArea, double price )
    {
        this.roomArea= roomArea;
        this.hallArea= hallArea;
        this.price= price;
    }

    public void show()
    {
        System.out.println("roomArea= "+roomArea+ "\nhallArea= "+hallArea+ "\nprice= "+price);

    }

        public double getPrice()
    {
        return this.price;
    }
}

class TwoBHK extends OneBHK
{
    private double room2Area;


    TwoBHK(){}

    TwoBHK( double roomArea, double hallArea, double price, double room2Area )
    {
        super(roomArea, hallArea, price);
        this.room2Area= room2Area;
   
    }

    public void show()
    {
        super.show();
        System.out.println("room2Area= "+room2Area);
        System.out.println();
    }

}

class XYZ
{
    public static void main(String args[])
    {

        OneBHK t1= new TwoBHK(400, 200, 80000, 320);
        OneBHK t2= new TwoBHK(420, 250, 85000, 480);
        OneBHK t3= new TwoBHK(540, 290, 90270.55, 720);

        System.out.println("Info of the First Flat  : ");
        t1.show();
        
        System.out.println("Info of the Second Flat  : ");
        t2.show();

        System.out.println("Info of the Third Flat  : ");
        t3.show();
        

        System.out.println("Sum of price of all 3 flats is  : " +( t1.getPrice() + t2.getPrice() + t3.getPrice() ) );
        System.out.println();

    }

}
public class Square extends Rectangle{
    int side=5;
    public void area(int side){
        int res=side*side;
        System.out.println("Area of side = "+res);
    }
    public void perimeter(int side){
        int res=4*side;
        System.out.println("Perimeter of side = "+res);
    }
}

package OOPS;

class Rectangle {
    int width,height;
    Rectangle(int height, int width){
        this.height=height;
        this.width=width;
    }
    public int getArea(){
        return 2*(height+width);
    }
    public int getPerimeter(){
        return height*width;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}


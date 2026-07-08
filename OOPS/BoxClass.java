class Box{
    int width, height, depth;
    Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }
    int volume(){
        return width*height*depth;
    }
}
public class BoxClass{
    public static void main(String[] args){
        Box b = new Box(5, 4, 3);
        System.out.println("Width: "+b.width);
        System.out.println("Height: "+b.height);
        System.out.println("Depth: "+b.depth);
        System.out.println("Volume: "+ b.volume());
    }
}
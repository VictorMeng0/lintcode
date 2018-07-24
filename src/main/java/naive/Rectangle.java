package naive;

/**
 * Created by menghan on 2018/7/24.
 */
public class Rectangle {
    private int height;
    private int width;
    public Rectangle(int h, int w){
        this.height = h;
        this.width = w;
    }
    public int getArea(){return this.height*this.width;}
}

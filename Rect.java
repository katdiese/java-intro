public class Rect {
  public int height;
  public int width;

  public Rect(int height, int width) {
    this.height = height;
    this.width = width;
  }

  public int area() {
    return height * width;
  }

  public static void main(String [] args) {
    Rect myRect = new Rect(100,100);
    System.out.println(myRect.area());
  }
}
public class Ops {
  public static int sum(int x, int y) {
    return x + y;
  }

  public static int multiply(int x, int y, int z) {
    return x * y * z;
  }

  public static int power(int x) {
    int y = 2;

    for(int i = 0; i < y; i++) {
      x = x * x;
    }

    return x;
  }

  public static void main(String [] args) {
    int ans = power(2);

    System.out.println(ans);

  }
}


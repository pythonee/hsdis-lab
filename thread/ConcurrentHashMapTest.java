package thread;


public class ConcurrentHashMapTest {

  Entity e = new Entity();
  VolatitleEntity ve = new VolatitleEntity();
  
  public void update1() {
    e.i = 2;
  }
  
  public void update2() {
    (ve.i)++;
  }

  public static void main(String[] args) {
    final ConcurrentHashMapTest test = new ConcurrentHashMapTest();

    test.update1();
    test.update2();
  }
}

package may20;

public class MyRunnable implements Runnable {

  private int nubmber;

  public MyRunnable(int nubmber) {
    this.nubmber = nubmber;
  }

  @Override
  public void run() {
    System.out.println(this.nubmber);
  }
}

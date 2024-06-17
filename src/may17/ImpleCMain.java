package may17;

public class ImpleCMain {
  public static void main(String[] args) {
    InterfaceC impleC1 = new ImpleC();
    InterfaceA impleC2 = new ImpleC();
    InterfaceB impleC3 = new ImpleC();

    impleC1.methodA();
    impleC1.methodB();
    impleC1.methodC();

    impleC2.methodA();
    impleC3.methodB();
  }
}

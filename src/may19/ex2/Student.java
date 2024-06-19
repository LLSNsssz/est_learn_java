package may19.ex2;

import java.util.Objects;

public class Student {
  private int no;
  private String name;

  public Student(int no, String name) {
    this.no = no;
    this.name = name;
  }

  public int getNo() {
    return no;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student student)) return false;
    return no == student.no && Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    System.out.println(name.hashCode() + no);
    return Objects.hash(no, name);
  }
}

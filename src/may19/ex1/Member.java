package may19.ex1;

import java.util.Objects;

public class Member {
  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Member) {
      Member m = (Member) o;
      return m.name.equals(this.name) && m.age == this.age;
    } else return false;
  }

  @Override
  public int hashCode() {
    System.out.println(name.hashCode() + age);
    return name.hashCode() + age;
  }
}

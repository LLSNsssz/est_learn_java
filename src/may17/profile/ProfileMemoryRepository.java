package may17.profile;

public class ProfileMemoryRepository implements ProfileRepository {

  @Override
  public void save() {
    System.out.println("메모리를 프로필에 저장");
  }
}

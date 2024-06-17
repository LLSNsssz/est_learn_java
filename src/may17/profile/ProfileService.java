package may17.profile;

public class ProfileService {

  public void saveProfile(ProfileRepository profileRepository) {
    ProfileRepository profileMemoryRepository = new ProfileMemoryRepository();
    System.out.println(profileMemoryRepository instanceof ProfileRepository);
  }
}

import org.scalatest.mockito._

trait TestEnvironment extends UserServiceComponent with UserRepositoryComponent with MockitoSugar {
  val userRepository = mock[UserRepository]
  val userService = mock[UserService]
}

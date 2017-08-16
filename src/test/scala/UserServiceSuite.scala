import org.scalatest._
import org.mockito.Mockito._

class UserServiceSuite extends FlatSpec with TestEnvironment {

  "Authenticating a User" should "return a User" in {
    val userService = new UserService
    val user = new User("test", "test")
    when(userRepository.authenticate(user)).thenReturn(user)
    assert(User("test", "test") == userRepository.authenticate(user))
  }
}

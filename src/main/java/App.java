/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

  public String getGreeting() {
    return "Hello".repeat(2) + " world.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}

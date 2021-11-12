public class MailService {
  public void sendEmail(int id) {
    connect(id);
    authenticate();
    // Send email
    disconnect();
  }

  private void connect(int id) {
    System.out.println("Connect" + id);

  }

  private void disconnect() {
    System.out.println("Disconnect");
  }

  private void authenticate() {
    System.out.println("Authenticate");
  }
}

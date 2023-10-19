public class App {

  public static void main(String[] args) {

    String info = "notreply@mycompany.com;onetaxi@company.com;b;De {de} para {para};Bom dia amigo!";
    Email email = new Email();
    email.enviar(info);
  }
}
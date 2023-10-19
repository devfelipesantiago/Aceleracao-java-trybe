public class Email {
  public void enviar(String email) {
     String[] campos = email.split(";");

     String de = campos[0];
     String para = campos[1];
     String copiaOcultaPara = "";
     String assunto = campos[3];
     String mensagem = campos[4];

    if ("AEIOU".contains(campos[2].toUpperCase())) {
      copiaOcultaPara = "diretor@mycompany.com";
    }

    assunto = assunto.replace("{de}", de);
    assunto = assunto.replace("{para}", para);

    System.out.println("De: " + de + "\n" +
        "Para: " + para + "\n" +
        "CC: " + copiaOcultaPara + "\n" +
        "Assunto: " + assunto + "\n" +
        "Mensagem: " + mensagem);
  }
}

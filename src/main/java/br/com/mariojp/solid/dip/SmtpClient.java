package br.com.mariojp.solid.dip;

public class SmtpClient implements MailSender {

    // Lógica para verificar a variável de ambiente, se necessário.
    private static final boolean SMTP_AVAILABLE = "true".equals(System.getenv("SMTP_AVAILABLE"));

    @Override
    public void send(String to, String subject, String body) {
        if (!SMTP_AVAILABLE) {
            throw new IllegalStateException("SMTP não está disponível.");
        }

        System.out.println("Enviando e-mail via SMTP...");
        System.out.println("Para: " + to);
        System.out.println("Assunto: " + subject);
        System.out.println("Corpo: " + body);
    }
}

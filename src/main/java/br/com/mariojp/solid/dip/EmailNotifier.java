package br.com.mariojp.solid.dip;



public class EmailNotifier {
    private final MailSender mailSender;

    public EmailNotifier(MailSender mailSender) {
        this.mailSender = mailSender;
    }


    public EmailNotifier() {
        this.mailSender = new DryRunMailSender();
    }


    public void notifyUser(String to, String subject, String body) {
        this.mailSender.send(to, subject, body);
    }


    public void welcome(User user) {
        String subject = "Bem-vindo(a) ao nosso serviço!";
        String body = "Olá, " + user.getName() + ",\n\nSeja bem-vindo(a)!";
        this.mailSender.send(user.getEmail(), subject, body);
    }
}
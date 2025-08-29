package br.com.mariojp.solid.dip;

public class DryRunMailSender implements MailSender{
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Modo Drt_Run :O e-mail não será enviado.Detalhe:");
        System.out.println("Para: " + to);
        System.out.println("Assunto: " + subject);
        System.out.println("Corp: " + body);
    }
}

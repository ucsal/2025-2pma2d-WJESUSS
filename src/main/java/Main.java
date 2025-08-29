import br.com.mariojp.solid.dip.*;

public class Main {
	public static void main(String[] args) {
		MailSender mailSender;
		if ("True".equalsIgnoreCase(System.getenv("DRY_RUN"))) {
			mailSender = new DryRunMailSender();
		} else {
			mailSender = new SmtpClient();
		}
		EmailNotifier notifier = new EmailNotifier(mailSender);
		notifier.notifyUser("Washquesia@gmai.com","Atividade Realizada","Pronto");
	}
}

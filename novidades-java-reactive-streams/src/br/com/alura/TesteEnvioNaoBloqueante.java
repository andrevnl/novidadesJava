package br.com.alura;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

import br.com.alura.model.NotaFiscal;
import br.com.alura.subscriber.NotaFiscalSubscriber;
import br.com.alura.wsclient.NotaFiscalWSClient;

public class TesteEnvioNaoBloqueante {
	//Java 9
	public static void main(String[] args) {
		System.out.println("A thread do TesteEnvioNaoBloqueante é: " + Thread.currentThread().getName());
		NotaFiscal primeiraNotaFiscal = new NotaFiscal("João", 39.99, LocalDate.now());
		NotaFiscal segundaNotaFiscal = new NotaFiscal("Renata", 41.20, LocalDate.now());
		NotaFiscal terceiraNotaFiscal = new NotaFiscal("Paulo", 32.10, LocalDate.now());
		NotaFiscalSubscriber subscriber = new NotaFiscalSubscriber();

		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
		publisher.subscribe(subscriber);
		publisher.submit(primeiraNotaFiscal);
		publisher.submit(segundaNotaFiscal);
		publisher.submit(terceiraNotaFiscal);
		publisher.close();

		System.out.println("Você irá receber a nota fiscal no seu e-mail");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();

	}
}

package ashokit;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class QuoteService {
	private static final String QUOTE_ENDPOINT = "https://type.fit/api/quotes";

	public void getQuoteV1() {
		System.out.println("Rest Api() is called...! ");
		WebClient webClient = WebClient.create();
		webClient.get().uri(QUOTE_ENDPOINT).retrieve().bodyToMono(String.class).subscribe(QuoteService::handleResponse);

		System.out.println("Rest Api() is ended...!");
	}

	public static void handleResponse(String s) {
		System.out.println(s);

	}

	public void getQuoteV2() {
		System.out.println("Rest Api() is called...!");
		WebClient client = WebClient.create();
		Mono<String> bodyToMono = client.get().uri(QUOTE_ENDPOINT).retrieve().bodyToMono(String.class);

		System.out.println(bodyToMono.block());
		System.out.println("Rest Api() is ended...!");
	}

}
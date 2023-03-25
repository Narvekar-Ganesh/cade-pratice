
public class ServiceFeedbackSender {

	public void send(PositiveFeedback positiveFeedbak) {
		System.out.println("Your services are preety!");
	}

	public void send(NegativeFeedback negativeFeedback) {
		System.out.println("Is this joke? Your services are ridiculous");
	}

	public void send(DefaultFeedback defoultFeedback) {
		System.out.println("Your services are ok ....");
	}

	public static void main(String args[]) {
		ServiceFeedbackSender serviceFeedbackSender = new ServiceFeedbackSender();
		PositiveFeedback positiveFeedback = new PositiveFeedback();
		NegativeFeedback negativeFeedback = new NegativeFeedback();
		DefaultFeedback defoultFeedback = new DefaultFeedback();
		serviceFeedbackSender.send(defoultFeedback);
	}

}

package day2121;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {
		super();
	}

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String analyseability() {
		if (message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}
}
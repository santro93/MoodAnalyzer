package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	public static void main(String[] args) {
		System.out.println("Welcome To Mood Analyser Program!");

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = moodAnalyzer.analyseMood("This is Happy message");
		System.out.println(message);
		message = moodAnalyzer.analyseMood("This is Sad message");
		System.out.println(message);
	}

	private String analyseMood(String message) {
		if (message.contains("Sad")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}
}

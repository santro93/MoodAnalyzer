package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	public String message;

	public MoodAnalyzer() {
		message = null;
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Mood Analyser Program!");
	}
}

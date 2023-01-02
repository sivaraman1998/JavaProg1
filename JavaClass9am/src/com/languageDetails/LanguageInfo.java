package com.languageDetails;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("Tamil is my mother tongue");
	}
	public void EnglishLanguage() {
		System.out.println("English is my second language");
	}
	public void HindiLanguage() {
		System.out.println("North indians speaks Hindi");
	}
	public static void main(String[] args) {
		LanguageInfo obj=new LanguageInfo();
		obj.tamilLanguage();
		obj.EnglishLanguage();
		obj.HindiLanguage();
		obj.southIndia();
		obj.northIndia();
	}
}

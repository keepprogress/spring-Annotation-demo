package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class COMPUTFortuneService implements FortuneService {
	
	private String fileName = "C:/workspace_for_javaEEEclipse/spring-demo-annotations/src/sport-fortune";
	private List<String> theFortunes;
	
	// create a random number generator
	Random myRandom = new Random();
	
	public COMPUTFortuneService() {
		
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " +theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		//read fortune from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {
			
			String tempLine;
			
			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());
		
		String tempFortune = theFortunes.get(index);
		
		return tempFortune;
	}

}

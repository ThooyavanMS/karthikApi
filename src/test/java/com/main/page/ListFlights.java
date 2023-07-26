package com.main.page;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Details;
import com.pojo.Page;
import com.pojo.Support;

public class ListFlights {

	public static void main(String[] args) throws IOException {
		File file = new File(
				"C:\\Users\\Thooyavan\\eclipse-workspace\\ApiJsonObject\\src\\test\\resources\\ListFlights.json");

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Page page = mapper.readValue(file, Page.class);
		System.out.println(page.getPage());
		System.out.println(page.getPer_page());
		System.out.println(page.getTotal());
		System.out.println(page.getTotal_pages());
		ArrayList<Details> details = page.getData();
		for (Details obj : details) {
			System.out.println(obj.getId());
			System.out.println(obj.getFlightName());
			System.out.println(obj.getCountry());
			System.out.println(obj.getDestinations());
			System.out.println(obj.getURL());
		}
		Support support = page.getSupport();
		System.out.println(support.getUrl());
		System.out.println(support.getText());

	}

}
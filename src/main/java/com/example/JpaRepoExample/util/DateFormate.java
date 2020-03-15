package com.example.JpaRepoExample.util;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class DateFormate extends StdDeserializer<Date> {

	protected DateFormate(StdDeserializer<?> src) {
		super(src);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		Date date=null;
		String inDate=p.getText();
		try {
			DateTimeFormatter dt= DateTimeFormatter.ofPattern("dd/MM/YYYY");
			date=new Date(dt.format(LocalDateTime.parse(inDate)));
		}
		catch(Exception e)
		{
			e.getCause();
		}
		return date;
	}

}

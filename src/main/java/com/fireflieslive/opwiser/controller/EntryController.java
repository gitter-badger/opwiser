package com.fireflieslive.opwiser.controller;

import java.math.BigDecimal;
import java.sql.Time;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fireflieslive.opwiser.domain.Entry;

@Controller
public class EntryController {

	@RequestMapping( "/entries" )
	public String list( Model model ) {
		
		Entry groceries = new Entry( "G!", "groceries", 293, 168, new Time( 140000 ));
		groceries.setCategory( "food" );
		
		model.addAttribute( "entry", groceries );
		
		return "entries";
	}
}

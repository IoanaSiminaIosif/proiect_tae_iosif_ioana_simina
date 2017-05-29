package com.example.myproject.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.websocket.server.PathParam;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.model.CentruDonare;
import com.example.myproject.service.CentruDonareService;

import antlr.collections.List;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONValue;
import net.minidev.json.parser.JSONParser;

@RestController
@RequestMapping("/centre")
public class CentruController {
	@Autowired
	CentruDonareService cds = new CentruDonareService();
	
	@RequestMapping("/all")
	public Hashtable<String, CentruDonare> getALL(){
		return cds.getAll();
	}
	
	@RequestMapping("{id}")
	public CentruDonare getCentru(@PathVariable("id") String id){
		return cds.getCentru(id);
	}
	
}

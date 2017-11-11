package wordcount.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wordcount.service.IWordCount;
import wordcount.service.impl.WordCountBrut;
import wordcount.util.PropertiesLoader;

public class GetTextController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public IWordCount wordCountTextBrut;
	
	@Override
	public void init() throws ServletException {
		super.init();
		String textPathFile = PropertiesLoader.getProperties().getProperty("textPathFile");
		wordCountTextBrut = new WordCountBrut(textPathFile);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String texteBrut = wordCountTextBrut.getText();

	    resp.setContentType("text/plain");
	    resp.setCharacterEncoding("UTF-8");
	    resp.getWriter().write(texteBrut); 
	}
	
	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		this.doPost(arg0, arg1);
	}

}

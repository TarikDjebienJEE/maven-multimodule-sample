package wordcount.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wordcount.service.IWordCount;
import wordcount.service.impl.WordCountBrut;
import wordcount.util.PropertiesLoader;

public class WordCountController extends HttpServlet {

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
		
		// On récupère le texte pour l'afficher au client
		req.setAttribute("texte", wordCountTextBrut.getText());
		
		// Compter le nombre d'occurences de chaque mot dans un texte brut
		req.setAttribute("countAllWordInTextResponse", wordCountTextBrut.countAllWordInText().toString());
		
		// Compter le nombre d'occurences d'un mot particulier dans un texte brut
		req.setAttribute("countOneWordInTextResponse", wordCountTextBrut.countOneWordInText(req.getParameter("countOneWordInTextValue")));
		
		// Déterminer si un mot particulier est présent dans un texte brut
		req.setAttribute("isWordInTextResponse", Boolean.toString(wordCountTextBrut.isWordInText(req.getParameter("isWordInTextValue"))));
		
		// Retourner la liste des n mots les plus fréquents dans un texte brut et qui ne sont pas dans une liste de mots interdits
		List<String> forbiddenWords = new ArrayList<String>();
		forbiddenWords.add(req.getParameter("forbiddenValue"));
		req.setAttribute("getAllFrequentWordsInTextResponse", wordCountTextBrut.getAllFrequentWordsInText(forbiddenWords, Integer.parseInt(  ((String)req.getParameter("NValue")).isEmpty() ? "0" : (String) req.getParameter("NValue")  )).toString());
		
		req.getRequestDispatcher("WEB-INF/jsp/home.jsp").forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

}

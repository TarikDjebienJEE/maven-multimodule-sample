package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wordcount.service.IWordCount;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

	String countAllWordInTextResponse = (String) request
			.getAttribute("countAllWordInTextResponse");
	Integer countOneWordInTextResponse = (Integer) request
			.getAttribute("countOneWordInTextResponse");
	String isWordInTextResponse = (String) request
			.getAttribute("isWordInTextResponse");
	String getAllFrequentWordsInTextResponse = (String) request
			.getAttribute("getAllFrequentWordsInTextResponse");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"main_wrapper\">\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<h1>Qualité du logiciel - TP Test d'intégration et déploiement</h1>\n");
      out.write("\t\t</header>\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t<section id=\"sectionMain\">\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t<h2>Service WordCount</h2>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t<div id=\"texte\">\n");
      out.write("\t\t\t\t<h4>Le texte cible :</h4>\n");
      out.write("\t\t\t\t<div id=\"texteBrut\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<hr />\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t<form action=\"wordCount.do\" method=\"post\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"menu\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h4>Map&lt;String, Integer&gt; countAllWordInText()</h4>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<h5>countAllWordInText()</h5>\n");
      out.write("\t\t\t\t\t\t");

							if (countAllWordInTextResponse != null) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<label>Result : ");
      out.print(countAllWordInTextResponse);
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h4>int countOneWordInText(String word)</h4>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<h5>\n");
      out.write("\t\t\t\t\t\t\tcountOneWordInText(<input id=\"paramCountOneWordInText\"\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" value=\"Tarik\" name=\"countOneWordInTextValue\" />)\n");
      out.write("\t\t\t\t\t\t</h5>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

							if (countOneWordInTextResponse != null) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<label>Result : ");
      out.print(countOneWordInTextResponse);
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h4>boolean isWordInText(String word)</h4>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<h5>\n");
      out.write("\t\t\t\t\t\t\tisWordInText(<input id=\"paramIsWordInText\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"Tarik\" name=\"isWordInTextValue\" />)\n");
      out.write("\t\t\t\t\t\t</h5>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

							if (isWordInTextResponse != null) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<label>Result : ");
      out.print(isWordInTextResponse);
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h4>List&lt;String&gt;\n");
      out.write("\t\t\t\t\t\tgetAllFrequentWordsInText(List&lt;String&gt; words, int N)</h4>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<h5>\n");
      out.write("\t\t\t\t\t\t\tgetAllFrequentWordsInText(<input\n");
      out.write("\t\t\t\t\t\t\t\tid=\"paramForbiddenValueGetAllFrequentWordsInText\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"Tarik\" name=\"forbiddenValue\" />,<input\n");
      out.write("\t\t\t\t\t\t\t\tid=\"paramNValueGetAllFrequentWordsInText\" type=\"text\" value=\"1\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"NValue\" />)\n");
      out.write("\t\t\t\t\t\t</h5>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

							if (getAllFrequentWordsInTextResponse != null) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<label>Result : ");
      out.print(getAllFrequentWordsInTextResponse);
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<hr />\n");
      out.write("\n");
      out.write("\t\t\t\t<input class=\"tarikButton\" value=\"Call All Service\" type=\"submit\" />\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="wordcount.service.IWordCount"%>


<%-- VARIABLES --%>
<%
	String countAllWordInTextResponse = (String) request
			.getAttribute("countAllWordInTextResponse");
	Integer countOneWordInTextResponse = (Integer) request
			.getAttribute("countOneWordInTextResponse");
	String isWordInTextResponse = (String) request
			.getAttribute("isWordInTextResponse");
	String getAllFrequentWordsInTextResponse = (String) request
			.getAttribute("getAllFrequentWordsInTextResponse");
%>

<%-- HTML5 --%>
<!DOCTYPE html>
<html>

<%-- HEAD --%>
<jsp:include page="head.jsp" />

<%-- BODY --%>
<body>
	<div id="main_wrapper">
		<%-- HEADER --%>
		<header>
			<h1>Qualité du logiciel - TP Test d'intégration et déploiement</h1>
		</header>

		<%-- CONTENU --%>
		<section id="sectionMain">
			<%-- SERVICE TESTE AVEC SELENIUM --%>
			<h2>Service WordCount</h2>
			
			<%-- TEXTE TESTE PAR LE SERVICE --%>
			<div id="texte">
				<h4>Le texte cible :</h4>
				<div id="texteBrut"></div>
			</div>
			
			<hr />
			
			<%-- FORMULAIRE D'APPEL DU SERVICE --%>
			<form action="wordCount.do" method="post">

				<div id="menu">
					
					<h4>Map&lt;String, Integer&gt; countAllWordInText()</h4>
					<div>
						<h5>countAllWordInText()</h5>
						<%
							if (countAllWordInTextResponse != null) {
						%>
						<label>Result : <%=countAllWordInTextResponse%></label>
						<%
							}
						%>
					</div>

					<h4>int countOneWordInText(String word)</h4>
					<div>
						<h5>
							countOneWordInText(<input id="paramCountOneWordInText"
								type="text" value="Tarik" name="countOneWordInTextValue" />)
						</h5>

						<%
							if (countOneWordInTextResponse != null) {
						%>
						<label>Result : <%=countOneWordInTextResponse%></label>
						<%
							}
						%>
					</div>

					<h4>boolean isWordInText(String word)</h4>
					<div>
						<h5>
							isWordInText(<input id="paramIsWordInText" type="text"
								value="Tarik" name="isWordInTextValue" />)
						</h5>

						<%
							if (isWordInTextResponse != null) {
						%>
						<label>Result : <%=isWordInTextResponse%></label>
						<%
							}
						%>
					</div>

					<h4>List&lt;String&gt;
						getAllFrequentWordsInText(List&lt;String&gt; words, int N)</h4>
					<div>
						<h5>
							getAllFrequentWordsInText(<input
								id="paramForbiddenValueGetAllFrequentWordsInText" type="text"
								value="Tarik" name="forbiddenValue" />,<input
								id="paramNValueGetAllFrequentWordsInText" type="text" value="1"
								name="NValue" />)
						</h5>

						<%
							if (getAllFrequentWordsInTextResponse != null) {
						%>
						<label>Result : <%=getAllFrequentWordsInTextResponse%></label>
						<%
							}
						%>
					</div>
				</div>
				
				<hr />

				<input class="tarikButton" value="Call All Service" type="submit" />
			</form>
		</section>

		<%-- FOOTER --%>
		<jsp:include page="footer.jsp" />
	</div>
</body>
</html>
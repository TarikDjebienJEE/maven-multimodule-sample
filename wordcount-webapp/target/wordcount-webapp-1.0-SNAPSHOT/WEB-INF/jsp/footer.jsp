<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%-- HTML5 --%>
<footer>
	<span id="copyright">© Copyright DJEBIEN Tarik</span>
	<span id="appVersion">Version : 2.0</span>
	<span id="language">FR</span>
</footer>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		$(".tarikButton").button();
		$("#menu").accordion({
			collapsible: true
		});
		$("#texte").live("click",function(){
			$("#texteBrut").toggle("slow");
		});
		$("#texteBrut").show();
		$.get('wordCount.downLoadText',function(texteBrut) { 
            $('#texteBrut').text(texteBrut);       
        });
	});
</script>
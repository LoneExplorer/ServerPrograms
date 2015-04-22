<%-- 
    Document   : stockJSP
    Created on : Apr 4, 2015, 7:57:32 PM
    Author     : walterrada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!--used stockquote found here: http://www.webservicex.net/ws/WSDetails.aspx?CATID=2&WSID=9-->
    <%-- start web service invocation --%><hr/>
    <%
    try {
	net.webservicex.StockQuote service = new net.webservicex.StockQuote();
	net.webservicex.StockQuoteSoap port = service.getStockQuoteSoap();
	 // TODO initialize WS operation arguments here
	java.lang.String symbol = request.getParameter("word");
	// TODO process result here
	java.lang.String result = port.getQuote(symbol);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>

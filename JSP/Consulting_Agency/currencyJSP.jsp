<%-- 
    Document   : currencyJSP
    Created on : Apr 4, 2015, 8:07:59 PM
    Author     : walterrada
--%>

<%@page import="java.util.Currency"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!--used currency converter found here: http://www.webservicex.net/ws/WSDetails.aspx?CATID=2&WSID=10-->
    <%-- start web service invocation --%><hr/>
    <%
    try {
	net.webservicex.CurrencyConvertor service = new net.webservicex.CurrencyConvertor();
	net.webservicex.CurrencyConvertorSoap port = service.getCurrencyConvertorSoap();
	 // TODO initialize WS operation arguments here
        net.webservicex.Currency fromCurrency;
        net.webservicex.Currency toCurrency;
        String con1 = request.getParameter("country");
        
        if (con1.equalsIgnoreCase("afa")){
            fromCurrency = net.webservicex.Currency.AFA;
        } else if (con1.equalsIgnoreCase("bsd")){
            fromCurrency = net.webservicex.Currency.BSD;
        } else if (con1.equalsIgnoreCase("brl")){
            fromCurrency = net.webservicex.Currency.BRL;
        } else if (con1.equalsIgnoreCase("khr")){
            fromCurrency = net.webservicex.Currency.KHR;
        } else if (con1.equalsIgnoreCase("cny")){
            fromCurrency = net.webservicex.Currency.CNY;
        } else if (con1.equalsIgnoreCase("cop")){
            fromCurrency = net.webservicex.Currency.COP;
        } else if (con1.equalsIgnoreCase("uah")){
            fromCurrency = net.webservicex.Currency.UAH;
        } else if (con1.equalsIgnoreCase("usd")){
            fromCurrency = net.webservicex.Currency.USD;
        } else {
            fromCurrency = null;
        }

        String con2 = request.getParameter("country2");
        
        if (con2.equalsIgnoreCase("afa")){
            toCurrency = net.webservicex.Currency.AFA;
        } else if (con2.equalsIgnoreCase("bsd")){
            toCurrency = net.webservicex.Currency.BSD;
        } else if (con2.equalsIgnoreCase("brl")){
            toCurrency = net.webservicex.Currency.BRL;
        } else if (con2.equalsIgnoreCase("khr")){
            toCurrency = net.webservicex.Currency.KHR;
        } else if (con2.equalsIgnoreCase("cny")){
            toCurrency = net.webservicex.Currency.CNY;
        } else if (con2.equalsIgnoreCase("cop")){
            toCurrency = net.webservicex.Currency.COP;
        } else if (con2.equalsIgnoreCase("uah")){
            toCurrency = net.webservicex.Currency.UAH;
        } else if (con2.equalsIgnoreCase("usd")){
            toCurrency = net.webservicex.Currency.USD;
        } else {
            toCurrency = null;
        }
	// TODO process result here
	double result = port.conversionRate(fromCurrency, toCurrency);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>

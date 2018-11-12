<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Select action</title>
            <link rel="stylesheet" type="text/css" href="jsfcrud.css" />
        </head>
        <body>
            <h1>Show customer details</h1>


            <h:messages style="color: red"
                        showDetail="true"/>
            <h:form id="select">
                <h:panelGrid columns="2" border="0">
                    Input customer's id: <h:inputText id="id" 
                                 value="#{customermanager.id}"/>        

                </h:panelGrid>
                <h:commandButton id="submit" 
                                 type="submit"
                                 value="Show customer"
                                 action="#{customermanager.showCustomer}"/>

            </h:form>


        </body>
    </html>
</f:view>


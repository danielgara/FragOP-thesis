<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<html>
  <head>
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="<c:url value = "/assets/css/bootstrap.min.css"/>" />
    <link rel="stylesheet" type="text/css" href="<c:url value = "/assets/css/style.css"/>" />
  </head>

  <body>
      
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">

      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="<c:url value='Home'/>">Home <span class="sr-only">(current)</span></a>
          </li>
          <!--B-menu-modificator-->

        </ul>
      </div>
    </nav>
    
   <div>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib  prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>
            <tiles:insertAttribute name="head-title" /> 
        </title>
        <link href="<s:url value="/statics/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<s:url value="/statics/metisMenu/dist/metisMenu.min.css" />" rel="stylesheet">
        <link href="<s:url value="/statics/sbadmin/css/timeline.css" />" rel="stylesheet">
        <link href="<s:url value="/statics/sbadmin/css/sb-admin-2.css" />" rel="stylesheet">
        <link href="<s:url value="/statics/morrisjs/morris.css" />" rel="stylesheet">
        <link href="<s:url value="/statics/font-awesome/css/font-awesome.min.css" />" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div id="wrapper">
            <!-- Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html">Student Log</a>
                </div>
                <!-- /.navbar-header -->

                <tiles:insertTemplate template="/common/nav-top-bar.jsp" flush="true" />
                <tiles:insertTemplate template="/common/nav-side-bar.jsp" flush="true" />
            </nav>

            <div id="page-wrapper">

                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header"><tiles:insertAttribute name="page-header" /></h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                    <tiles:insertAttribute name="content"  />
                </div>
                <!-- /#page-wrapper -->

            </div>
            <!-- /#wrapper -->

            <tiles:insertTemplate  template="/common/inc-bottom.jsp"/>
        </body>
    </html>

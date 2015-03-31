<%@page pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <tiles:insertAttribute name="head-common" />
        <title>
            <tiles:insertAttribute name="head-title" />
        </title>
        <link href="<s:url value="/assets/css/login.css" />" rel="stylesheet">

    </head>

    <body>

        <div class="container">

            <s:form action="loginCheck" cssClass="form-signin">
                <h2 class="form-signin-heading">Vui lòng đăng nhập</h2>
                <label for="inputEmail" class="sr-only">Email address</label>
                <input
                    name="internalEmail"
                    type="email"
                    id="inputEmail"
                    class="form-control"
                    placeholder="Email"
                    value="<s:property value="internalEmail" />"
                    required autofocus />



                <label for="inputPassword" class="sr-only">Password</label>
                <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>

                <div class="checkbox">
                    <label><input type="checkbox" value="remember-me"> Remember me</label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Đăng nhập</button>
            </s:form>

        </div> <!-- /container -->


        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="<s:url value="/assets/js/ie10-viewport-bug-workaround.js"/>"></script>
    </body>
</html>

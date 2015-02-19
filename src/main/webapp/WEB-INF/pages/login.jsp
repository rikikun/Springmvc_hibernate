<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<div class="row">
    <div class="col-md-12">
        <!-- Header -->
        <div class="row">
            <div class="col-md-12"></div>
        </div>
        <!-- Body -->
        <div class="row">
            <div class="col-md-10 col-md-offset-1">
                <br/>

                <form class="form-signin" action="j_spring_security_check"
                      method="post" class="form-signin">
                    Username<input type="text" name="j_username"/><br/> Password<input
                        type="text" name="j_password"/><br/>
                    <button class="btn btn-md btn-primary btn-block" type="submit">Login</button>
                </form>
            </div>
        </div>

        <!-- Footer -->
        <div class="row">
            <div class="col-md-12"></div>
        </div>
    </div>
</div>

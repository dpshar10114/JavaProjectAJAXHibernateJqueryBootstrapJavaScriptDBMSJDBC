<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <link rel = "icon" href ="images/try.png" type = "image/x-icon">
        <title>NEWGEN | Login </title>

        <!--Bootstrap CSS-->
        <link href="style/bootstrap.min.css" rel="stylesheet" type="text/css">

        <!--Custom CSS-->
        <link href="style/login-style.css" rel="stylesheet" type="text/css">

</head>
<body>

    <!--Bootstrap structure-->
    <section class="container-fluid bg">
        <section class="row justify-content-center">
            <section class="col-12 col-sm-6 col-md-3">

                <!--Bootstrap form-->
                <form class="form-container">
                    <div class="mb-3">
                      <label for="eMail" class="form-label">Newgen Login Id</label>
                      <input type="email" class="form-control" id="eMail" aria-describedby="emailHelp" name="eMail">
                      <div id="emailHelp" class="form-text">Authorised NEWGEN employee access only.</div>
                    </div>
                    <div class="mb-3" id="pass">
                      <label for="passwordLogin" class="form-label">Password</label>
                      <input type="password" class="form-control" id="passwordLogin">
                    </div>
                    <span id="error-message"></span>
                    <button id="submit" type="submit" class="btn btn-primary col-12">Login</button>
                    <div class="form-text" style="color:black; margin-top: 10px;">New User? <a href="register.jsp">Register Here</a></div>
                  </form>

            </section>
        </section>

    </section>

    <!--JQuery-->
    <script type="text/javascript" src="JS/jquery-3.6.0.js"></script>
    <script type="text/javascript" src="JS/jquery-ui-1.12.1/jquery-ui.js"></script>

    <script type="text/javascript" src="JS/interact.js"></script>
    

    <!--Bootstrap JS-->
    <script src="JS/Bootstrap/bootstrap.bundle.min.js" type="text/javascript"></script>
    <script src="JS/Bootstrap/popper.min.js" type="text/javascript"></script>
    <script src="JS/Bootstrap/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
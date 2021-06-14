<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="style/bootstrap.min.css" rel="stylesheet" type="text/css">

    <link rel = "icon" href ="images/try.png" type = "image/x-icon">
    <link rel="stylesheet" type="text/css" href="style/register.css">
    <title>NEWGEN | Register Page </title>

  </head>
  <body>

    <section class="Form my-5 mx-5">
        <div class="container">
            <div class="row g-0" id="main">

                <div class="col-lg-5">
                    <img src="images/try.png" class="img-fluid">
                </div>

                <div class="col-lg-7 px-5 pt-5">
                    <h4>Register your account.</h4>
                    <h6>Newgen E-Mail Pre-requisite.</h6>
                    <form action="/newgenform/RegisterServlet" method="POST">
                        <div class="col-12">
                           
                                <input name="email" id="email" type="email" placeholder="Newgen E-Mail Address"class="form-control my-3 p-2">
                          
                        </div>
                        <div class="row g-3">
                            <div class="col-md-4">
                                <input name="fname" type="text" placeholder="First Name"class="form-control my-3 p-2">
                                
                            </div>
                            <div class="col-md-4">
                                <input name="mname" type="text" id="not-mand" placeholder="Middle Name"class="form-control my-3 p-2">
                                
                            </div>
                            <div class="col-md-4">
                                <input name="lname" type="text" placeholder="Last Name"class="form-control my-3 p-2">
                                
                            </div>
                        </div>

                        <div class="row g-3">
                            <div class="col-md-6">
                                <input name="dob" type="text" placeholder="Date Of Birth" onfocus="(this.type='date')" class="form-control my-3 p-2">
                                
                            </div>
                            <div class="col-md-6">
                                <input name="doj" type="text" placeholder="Date Of Joining" onfocus="(this.type='date')" class="form-control my-3 p-2">
                                
                            </div>
                        </div>

                        <div class="row g-3">
                            <div class="col-md-6">
                                <input name="pass" id="passwordType" type="password" placeholder="Enter Password" class="form-control my-3 p-2">
                                
                            </div>
                            <div class="col-md-6">
                                <input id="passwordReType" type="password" placeholder="Re-Enter Password" class="form-control my-3 p-2">
                                
                            </div>
                        </div>
                        <span id="errorMessageRegister"></span>
                        <div>
                            <h6>Password Policy:</h6>
                            <ul>
                                <li>
                                    Password should be minimum of 8 alphabets.
                                </li>
                                <li>
                                    Password should be maximum of 15 alphabets.
                                </li>
                                <li>
                                    Password should be alphanumeric.
                                </li>
                                <li>
                                    Password should begin with an uppercase alphabet.
                                </li>
                                <li>
                                    Password must contain one special character out of: "@!#,."
                                </li>
                            </ul>

                        </div>

                        <div class="form-row">
                            <div class="col-12">
                                <button type="submit" class="btn1 my-3 p-2" id="btn1">Register</button>
                            </div>
                        </div>

                    </form>
                    
                </div>
                
            </div>
        </div>
    </section>
    







    <script type="text/javascript" src="JS/Bootstrap/bootstrap.bundle.min.js" ></script>
    <script type="text/javascript" src="JS/jquery-3.6.0.js"></script>
    <script type="text/javascript" src="JS/register.js"></script>
    
    
  </body>
</html>
<html>
<head>
	<link rel = "icon" href ="images/try.png" type = "image/x-icon">
    <link rel="stylesheet" type="text/css" href="style/style.css">
    
    <link rel="stylesheet" type="text/css" href="JS/jquery-ui-1.12.1/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="JS/jquery-ui-1.12.1/jquery-ui.structure.css">
    <link rel="stylesheet" type="text/css" href="JS/jquery-ui-1.12.1/jquery-ui.theme.css">
    
    
    <title>Newgen</title>
</head>
<body>
<div id="container">
    
    <img src="images/download.png" height="50px" width="81.25px" align="right">

	<div id="main">
		<form action="/newgenform/DemoServelet" method="POST" class="ui-widget">
			<div>
                <label for="eMail">Newgen Mail ID</label><br>
			    <input type="email" name="eMail" id="eMail" placeholder="Employee Mail">   

            </div>
			<div>
                <label for="name">Name</label><br>
			    <input type="text" name="name" id="name" placeholder="Employee Name">


            </div>

            <div>

                <label for="loc">Location</label><br>
			    <input type="text" name="loc" id="loc" placeholder="Choose Your Location">


            </div>
			
			
			
			<div>
                <label for="dept">Department</label><br>
			    <input type="text" name="Department" id="dept" placeholder="Enter Employee Department">


            </div>
			
			<div>

                <label for="contact">Contact Number</label><br>
			    <input type="number" name="contact" id="contact" placeholder="Enter Contact Number">


            </div>
			
			
			<button type="submit" value="Submit">Submit Details</button>
			

		</form>
	</div>
    <p align="center" id="error-message"></p>
</div>
</body>
<script type="text/javascript" src="JS/jquery-3.6.0.js"></script>
<script type="text/javascript" src="JS/jquery-ui-1.12.1/jquery-ui.js"></script>

<script type="text/javascript" src="JS/interact.js"></script>

</html>


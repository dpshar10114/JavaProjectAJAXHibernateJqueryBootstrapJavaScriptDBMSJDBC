$("document").ready(function (){
    
    
    var p1 = "";
    $("#email").change(function() {

        $("#errorMessageRegister").html("");
        
        var p2 = $("#email").val();
        if(!(/@newgen.co.in/).test(p2)){
            $("#errorMessageRegister").html("<b>Not a newgen email id.</b>");
            $("#errorMessageRegister").css("color","red");
        }
    });
    

    $("#passwordReType").attr("disabled","disabled");
    
    $("input").prop('required',true);
    $("#not-mand").prop('required',false);

    $("#passwordType").change(function(){
        var validFlag = 0;
        $("#passwordReType").val("");
        $("#passwordReType").attr("disabled","disabled");
        $("#errorMessageRegister").html("");

        p1 = $("#passwordType").val();      

        if(p1.length<8){
            $("#errorMessageRegister").html("<b>Password length should be greater then 8. </b>");
            $("#errorMessageRegister").css("color","red");
            validFlag = 1;

        }

        else if(p1.length>15){
            $("#errorMessageRegister").html("<b>Password length should be less then 15. </b>");
            $("#errorMessageRegister").css("color","red");
            validFlag = 1;
        }

        else if(!(/^[A-Z]/).test(p1)) {
            $("#errorMessageRegister").html("<b>First alphabet should be capital. </b>");
            $("#errorMessageRegister").css("color","red");
            validFlag = 1;

        }
        else if(!(/[0-9]/).test(p1)){
            $("#errorMessageRegister").html("<b>Password shoulb be alphanumeric");
            $("#errorMessageRegister").css("color","red");
            validFlag = 1;


        }

        else if(!(/[@!#,.]/).test(p1)){
            $("#errorMessageRegister").html("<b>One Specail Character Mandatory out of: @!#,.  </b>");
            $("#errorMessageRegister").css("color","red");
            validFlag = 1;


        }

        else if(validFlag ==0 && p1.length>=8 && p1.length<=10){
            $("#errorMessageRegister").html("<b>Password Valid But Week!</b>");
            $("#errorMessageRegister").css("color", "orange");
            $("#passwordReType").removeAttr("disabled");

        }

        else if(validFlag ==0 && p1.length>10 && p1.length<=15){
            $("#errorMessageRegister").html("<b>Strong Password!</b>");
            $("#errorMessageRegister").css("color", "green");
            $("#passwordReType").removeAttr("disabled");

        }

     




       

    });
    
    $("#passwordReType").change(function() {

        var p2 = $("#passwordReType").val();
    
        if (p1===p2){
          $("#errorMessageRegister").html("<b>Passwords Match!</b>");
          $("#errorMessageRegister").css("color", "green");
          flag=1;
          
        }
    
        else{
            $("#errorMessageRegister").html("<b>Those Passwords Did Not Match!</b>");
            $("#errorMessageRegister").css("color","red");
           


        }
    
      });


});



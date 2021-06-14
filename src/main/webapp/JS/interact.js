$("document").ready(function(){
    $("input").prop('required',true);
    $("#pass").hide();
    

    $("#eMail").change(function(){
        $.ajax({
            url: '/newgenform/ActionServlet',
            
            data: {
              eMail : $("#eMail").val(),
             
            },
            type: 'POST',
            crossDomain: true,
            success: function(data,textStatus,jqXHR){
              
              if(data.trim()==="true"){
                  $("#pass").slideDown();
                  $("#error-message").html("Valid Login ID");
                  $("#error-message").css("color","green");
                  
              }
              else{
              
                $("#error-message").html("Invalid Login ID");
                $("#error-message").css("color","red");
               
              }

            }

        });
    });

    $("#submit").click(function(event){
      event.preventDefault();

      $.ajax({

        url: '/newgenform/LoginServlet',
        data: {
          eMail : $("#eMail").val(),
          passwordLogin: $("#passwordLogin").val()
        },
        type: 'POST',
        crossDomain: true,
        success: function(data,textStatus,jqXHR){
        
        	console.log(data);

            if(data.trim()==="true"){
             
              window.location.href = 'index.jsp';
            }
            else{
              
              $("#error-message").html("Wrong Password");
              $("#error-message").css("color","red");
              
            }
            
          }
        
      });


    });

    
    

  
    
   // $("#dialog").hide();
    
});
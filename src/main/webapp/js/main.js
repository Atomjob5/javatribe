require("../css/same.css");
// require("../css/");
$(function(){
    $(".clearfix a").each(function(){  
        $(this).click(function(){  
            $(".clearfix .underliner").removeClass("underliner");  
            $(this).addClass("underliner");    
            // return false;//防止页面跳转  
        });  
    });  
})
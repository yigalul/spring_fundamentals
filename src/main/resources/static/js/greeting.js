function firstTable(){
    $(document).ready(function(){
        $("#btn").click(function(){
            $.get("/getTable", function(data){
                var content = "<table>"
                for(i=0; i<data.length; i++){
                    content += '<tr><td>' + data[i] +' ' +  i + '</td></tr>';
                }
                content += "</table>"

                $('#here_table').addClass("important blue").append(content);

            });
        });
    });
}

function saveToDb() {
    $(document).ready(function(){
        $.ajax({
            url : "/saveUserToDb",
            type: "GET",
            dataType: "text",
            contentType: false,
            processData: false,
            success :
                function(response) {
                    $('#response').html(response);
                }
        });
    });
}

function saveToDb2() {
    $(document).ready(function(){
        debugger;
        $("#save_btn").click(function(){
            $.get("/save_btn", function(data){
                var name = $("name_ipt").innerText;
                var email = $("email_ipt").innerText;

            });
        });
    });
}

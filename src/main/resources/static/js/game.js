$(document).ready(function() {
    var rows = 4;
    var cols = 4;
    var clickCount = 1;


    for (var i=0; i<rows; i++){
        $("<div class='container board'></div>").appendTo("#board");
        }
    $("<div class='btn-group btn-group-justified' role='group' aria-label='...'></div>").appendTo(".container");
    for (var j=0; j<rows; j++){
         $("<div class='btn-group btn-group-lower-class' role='group'></div>").appendTo(".btn-group-justified");
    }
    $("<button class='btn btn-default game' data-row='' data-col='' symbol=''/>").appendTo(".btn-group-lower-class");


    $('.game').click(function() {
          var XOToWin="";
          clickCount++;
          var chr = clickCount%2 == 0 ? 'X' : 'O';
          $(this).text(chr);
          $(this).attr("symbol", chr);
          $(this).text(chr).attr('disabled','disabled');
          $('.game').each(function(index) {
                     var symbol = $(this).attr("symbol");
                     XOToWin += (symbol == 'X' || symbol == 'O') ? symbol : ' ';
          });
          console.log(XOToWin);
          var model = { boardSymbols : XOToWin, rows : rows, cols: cols };
          $.ajax({
          headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                    },
                    'type': 'POST',
                    'url': '/',
                    'data': JSON.stringify(model),
                    'dataType': 'json',
                    'success' : function(data) {
                    console.log(data);
                    if(data.winner === true ){
                        alert("winner is " + data.winSymbol);
                        location.reload();
                    }
                    },
                    'error' :  function (xhr, ajaxOptions, thrownError) {
                                      alert(thrownError);
                                    }
           });
    });
    $('.game').each(function(index) {
        var button = $($(this)[0]);
        button.attr("data-row", parseInt(index/3));
        button.attr("data-col", index%3);
    });

});

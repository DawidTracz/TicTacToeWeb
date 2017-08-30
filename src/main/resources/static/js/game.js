$(document).ready(function() {
    var clickCount = 1;
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
          var model = { winner : XOToWin };
               $.ajax({
                headers: {
                       'Accept': 'application/json',
                       'Content-Type': 'application/json'
                        },
                'type': 'POST',
                'url': '/',
                'data': JSON.stringify(model),
                'dataType': 'json'
          });
    });


    $('.game').each(function(index) {
        var button = $($(this)[0]);
        button.attr("data-row", parseInt(index/3));
        button.attr("data-col", index%3);
    });

});

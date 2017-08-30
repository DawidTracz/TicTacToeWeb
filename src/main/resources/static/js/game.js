$(document).ready(function() {
    var clickCount = 1;
    $('.game').click(function() {
          var XOToWin="";
          clickCount++;
          var chr = clickCount%2 == 0 ? 'X' : 'O';
          var symbol = $(this).attr("symbol");
          $(this).text(chr);
          $(this).attr("symbol", chr);
          $(this).text(chr).attr('disabled','disabled');
          XOToWin += (symbol == 'X' || symbol == 'O') ? symbol : ' ';
          console.log(XOToWin);
    });

    $('.game').each(function(index) {
        var button = $($(this)[0]);
        button.attr("data-row", parseInt(index/3));
        button.attr("data-col", index%3);
    });


//    $.ajax({
//
//        }
//    });
});

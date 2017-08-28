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
                    if( $(this).attr("symbol")=='X'||$(this).attr("symbol")=='O'){
                        XOToWin+=$(this).attr("symbol");
                    } else{
                           XOToWin+=" ";}
                           });
        console.log(XOToWin);
     });
    $('.game').each(function(index) {
        var button = $($(this)[0]);
        button.attr("data-row", parseInt(index/3));
        button.attr("data-col", index%3);
    });

});

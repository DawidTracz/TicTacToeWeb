$(document).ready(function() {
    var clickCount = 1;
    $('.game').click(function() {
        clickCount++;
        var chr = clickCount%2 == 0 ? 'X' : 'O';
        $(this).text(chr).attr('disabled','disabled');
    });
    $('.game').each(function(index) {
        console.log(index)
        var btn = $($(this)[0]);
        btn.attr("data-row", parseInt(index/3));
        btn.attr("data-col", index%3);
    });

});

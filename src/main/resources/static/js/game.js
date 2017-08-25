$(document).ready(function() {
    var clickCount = 1;
    $('.game').click(function() {
        clickCount++;
        var chr = clickCount%2 == 0 ? 'X' : 'O';
        $(this).text(chr).attr('disabled','disabled');

    });
});

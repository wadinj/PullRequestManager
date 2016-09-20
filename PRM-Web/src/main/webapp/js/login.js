/**
 * 
 */

$("#butSignUp").on("click", function(){
	$('#formSignIn').hide();
	$('#formSignUp').show();	

});

jQuery(document).ready(function(){
    jQuery('clientId').change(function(){
        var tmpVal = jQuery('#clientId').val();
        var tmphref = jQuery('#githubLink').attr('href');
        tmphref = tmphref+tmpVal;
        jQuery('#githubLink').attr('href',tmphref);
    });
});

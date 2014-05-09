//add new file transfer
//function add_consumer() {
//	var newPropertyContainer = $('#consumer-group');
//	var newPropertyElement = $('<div class="form-group" id="consumer-group"><div class="field"><input class="form-control" type="text" pattern=".+" required placeholder="Consumer" name="consumer"><Label>Consumer</Label></div> <div class="field"><form:select class="form-control" path="protocolIdFk" required="true" itemValues="id"><form:option value="${null}" label="-- Select Protocol --"></form:option><c:forEach var="protocol" items="${listProtocolName}"><form:option value="${protocol.id}">${protocol.name}</form:option></c:forEach></form:select></div> <div class="field"><button type="text" class="btn icon save" onclick="add_property();">Save</button></div> <div class="field"><button type="button" class="btn icon delete">Delete</button></div></div>');
//	newPropertyContainer.append(newPropertyElement);
//}
function add_property() {
	var newPropertyContainer = $('#property-group');
	var newPropertyElement = $('<div class="form-group" id="property-group"> <div class="field">	<input class="form-control" type="text" required placeholder="Property" name="property" /><label for="property">Property</label></div> <div class="field"> <input class="form-control" type="text" required placeholder="Value" name="value" id="property_2" /> <label for="value">Value</label></div> <div class="field">	<button type="text" name="add-property" class="btn icon add-property" onclick="add_new_property();">Add Property</button></div></div>');
	newPropertyContainer.append(newPropertyElement);
}
function add_new_property() {
	var newPropertyContainer = $('#property-group');
	var newPropertyElement = $('<div class="form-group"> <div class="field"><input class="form-control"  type="text" required placeholder="Property" name="property" /><label for="property">Property</label></div> <div class="field"><input class="form-control" type="text" required placeholder="Value" name="value" id="property_2" /> <label for="value">Value</label> </div> </div>');
	newPropertyContainer.append(newPropertyElement);
}

//Add new parameter page
function add_parameter() {
	var newPropertyContainer = $('#parameter-group');
	var newPropertyElement = $('<div class="form-group" id="parameter-group"> <div class="field">	<input class="form-control" type="text" required placeholder="Parameter" name="parameter" /><label for="paramater">Parameter</label></div> <div class="field">  <div class="field">	<button type="text" name="add-property" class="btn icon add-property" onclick="add_new_parameter();">Add Parameter</button></div></div>');
	newPropertyContainer.append(newPropertyElement);
}
function add_new_parameter() {
	var newPropertyContainer = $('#parameter-group');
	var newPropertyElement = $('<div class="form-group"> <div class="field"><input class="form-control"  type="text" required placeholder="Parameter" name="new_parameter" /><label for="new_parameter">Paramater</label></div> </div>');
	newPropertyContainer.append(newPropertyElement);
}




$('.form-group').each(function() {
    var $wrapper = $('.multi-fields', this);
    $(".add-field", $(this)).click(function(e) {
        $('.multi-field:first-child', $wrapper).clone(true).appendTo($wrapper).find('input').val('').focus();
    });
    $('.multi-field .remove-field', $wrapper).click(function() {
        if ($('.multi-field', $wrapper).length > 1)
            $(this).parent('.multi-field').remove();
    });
});

function showstuff(element) {
    // first hide everything
    document.getElementById("from").style.visibility = 'hidden';
    document.getElementById("to").style.visibility = 'hidden';
    document.getElementById("from_field").style.visibility = 'hidden';
    document.getElementById("to_field").style.visibility = 'hidden';
    var targets;
    // select the IDs that should be unhidden based on element
    switch (element) {
      case 'in_use': targets = ['from', 'from_field']; break;
      case 'relocated': targets = ['to', 'to_field']; break;

    }
    // now unhide the selected IDs.
    for (var i = 0; i < targets.length; i++) {
      document.getElementById(targets[i]).style.visibility = 'visible';
    }
}
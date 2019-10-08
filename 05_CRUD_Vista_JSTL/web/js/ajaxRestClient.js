const form = document.getElementById("formRegister");
var deleteButton;
let ajaxObj = new XMLHttpRequest();

window.onload = function () {

    form.addEventListener('submit', handleFormSubmit);

    let data_table = document.getElementById("data_table");

    ajaxObj.onreadystatechange = function () {
//        alert("State changed: " + this.readyState
//                + ",status: " + this.status);
        if (this.readyState == 4 && this.status == 200) {
            let jsonResp = this.responseText;
            let objRespListUsers = JSON.parse(jsonResp);
            data_table.innerHTML = "";
            for (let user of objRespListUsers) {
                data_table.innerHTML +=
                        `<tr> <td>${user.id} - </td> 
                         <td>${user.email}</td>
                         <td><button onclick="deleteUser(${user.id})"  method="delete" />Delete</button</td></tr>`;
//                deleteButton = document.getElementById("deleteButton"+user.id);
//                deleteButton.addEventListener("onclick",deleteUser);
            }
        }
    };

    ajaxObj.open("GET", "api/users");
    ajaxObj.send();
};

const formToJSON = elements => [].reduce.call(elements, (data, element) => {

        if (isValidElement(element)) {
            data[element.name] = element.value;

        }
        return data;

    }, {});
function send(user) {
    $.ajax({
        url: 'api/users',
        type: 'post',
        dataType: 'json',
        data: JSON.stringify(user),
        contentType: 'application/json',
        success: function (data) {
            let data_table = document.getElementById("data_table");
//            $("#data_table").val(data.id);
//            $("#name").val(data.id);
//            $("#email").val(data.email);

//            let jsonResp = data;
//            let userResp = JSON.parse(jsonResp);
            data_table.innerHTML = "";
            data_table.innerHTML +=
                    `<tr> <td>${data.id} - </td> 
                         <td>${data.email}</td> 
                         <td><input id="deleteButton" type="submit" value="Delete"/></td></tr>`;
            deleteButton = document.getElementById("deleteButton");

        }
    });
}
const isValidElement = element => {
    return element.name && element.value;
}
const handleFormSubmit = event => {
    event.preventDefault();
    const user = formToJSON(form.elements);
    send(user);

};

const deleteUser = userId => {
    $.ajax({
        url: 'api/users',
        type: 'DELETE',
        dataType: 'text',
        data: {"id": userId},
        contentType: 'application/x-www-form-urlencoded;charset=UTF-8',
        success: function(result)  {
            
        }
    });
};
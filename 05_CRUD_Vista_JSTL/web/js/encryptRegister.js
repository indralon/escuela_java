function encrypt(valor) {
    md5(valor);
    var hash = md5.create();
    hash.update(valor);
    return hash.hex();
}
window.onload = function () {
    let beforeSend = function (event) {
        let form = event.target()
        let password = document.getElementById("password");
        let passwdEncrypt = encrypt(password.value);
        let inputHiddenPasswd = document.createElement("input");
        inputHiddenPasswd.setAttribute("type", "hidden");
        inputHiddenPasswd.setAttribute("name", "password_encript");
        inputHiddenPasswd.setAttribute("value", passwdEncrypt);
        document.forms.form.appendChild(inputHiddenPasswd);
        document.forms.form.removeChild(
                document.forms.form.password);
        document.forms.form.submit();
    }
    document.forms.form.addEventListener("submit", beforeSend);
};
function encrypt(valor) {
    md5(valor);
    var hash = md5.create();
    hash.update(valor);
    return hash.hex();
}
window.onload = function () {
    let beforeSend = function () {
        let password = document.getElementById("password");
        let passwdEncrypt = encrypt(password.value);
        let inputHiddenPasswd = document.createElement("input");
        inputHiddenPasswd.setAttribute("type", "hidden");
        inputHiddenPasswd.setAttribute("name", "password_encript");
        inputHiddenPasswd.setAttribute("value", passwdEncrypt);
        document.forms.formLogin.appendChild(inputHiddenPasswd);
        document.forms.formLogin.removeChild(
                documents.forms.formLogin.password);
        documents.forms.formLogin.submit();
    }
    document.forms.formLogin.addEventListener("submit", beforeSend);
};
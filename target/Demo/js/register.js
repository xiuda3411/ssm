function check() {
    alert("您需要仔细阅读并同意接受用户使用协议！");
    var userName = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var userEmail = document.getElementById("UserEmail").value;
    var accept = document.getElementById("accept").checked;
    var reg = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;//邮箱
    var patten = /^[a-zA-Z]\w{3,15}$/g;//用户名
    var patrn=/^(\w){6,20}$/;//密码
    if (userName.length<=0){
        alert("用户名不能为空！");
        document.getElementById("username").focus();
        return false;
    }else if(!patten.test(userName)) {
        alert("请输入正确的用户名！");
        document.getElementById("username").focus();
        return false;
    }else if (password.length<6) {
        alert("密码长度必须大于等于6！");
        document.getElementById("password").focus();
        return false;
    } else if (!patrn.test(password)){
        alert("密码有误，请重新输入！");
        document.getElementById("password").focus();
        return false;
    }else if(!reg.test(userEmail)){
        alert("邮箱格式错误！请重新输入！");
        document.getElementById("UserEmail").focus();
        return false;
    }else if (accept == false){
        alert("您需要仔细阅读并同意接受用户使用协议！");
        document.getElementById("accept").focus();
        return false;
    }
    return false;
}
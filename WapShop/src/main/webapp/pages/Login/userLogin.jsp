<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="yes" name="apple-mobile-web-app-capable">
<meta content="yes" name="apple-touch-fullscreen">
<meta content="telephone=no" name="format-detection">
<meta content="black" name="apple-mobile-web-app-status-bar-style">
<meta name="viewport" content="width=device-width, minimum-scale=1, maximum-scale=1;user-scalable=no;">
<%@ include file="../common/base.jsp" %>
<base href="<%=tBasePath%>"></base>
<title>会员登录</title>
<link rel="stylesheet" href="css/bootstrap.css?v=01291">
<link rel="stylesheet" href="css/style.css?v=1?v=01291">
<link rel="stylesheet" href="css/member.css?v=01291">
<link rel="stylesheet" href="css/order3.css?v=01291">
<script charset="utf-8" src="js/global.js?v=01291"></script>
<script charset="utf-8" src="js/bootstrap.min.js?v=01291"></script>
<script charset="utf-8" src="js/template.js?v=01291"></script>
<script charset="utf-8" src="js/randomimage.js?v=01291"></script>
<script charset="utf-8" src="js/login.js?v=01291"></script>
<script type="text/javascript">
		var error = '';
</script>
</head>
<body class="" style="background-color:#fff">
<header class="header">
    <div class="fix_nav">
        <div style="max-width:768px;margin:0 auto;background:#000000;position: relative;">
            <a class="nav-left back-icon" href="javascript:history.back();">返回</a>
            <div class="tit" style="font-size:18px;">会员登陆</div>
        </div>
    </div>
</header>
<div class="maincontainer">
   <div class="container">
    <div class="row">
        <div class="col-md-12 tal mt20">
			<form id="theForm" name="theForm" class="form-signin"
				action="user/Login.action" method="POST">
				<input name="username" id="username" type="text"
					style="margin-bottom: -2px; -webkit-appearance: none;"
					class="form-control" placeholder="帐户名/手机号码" message="账号"
					required="true" autofocus="" tabindex="1"> <br>
			    <input
					id="pwd" name="password" type="password" class="form-control"
					placeholder="请输入密码" message="密码" required="true"
					style="-webkit-appearance: none;" autocomplete="off" tabindex="2">
				<label class="checkbox">
				<input id="_spring_security_remember_me"
					name="_spring_security_remember_me" type="checkbox" tabindex="4" />
					记住我
				<a style="float: right">忘记密码</a>
				</label>
				<div class="clear"></div>
				<div style="text-align: center;">
					<button type="button" class="btn btn-info btn-block"
						onclick="userLogin();" tabindex="5">登 录</button>
					<button type="button" class="btn btn-default btn-block"
						onclick="userReg()" tabindex="6">注
						册</button>
				</div>
			</form>
		</div>
     </div>
	</div>
</div>
</body>
</html>
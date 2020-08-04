<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../top.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>title</title>
<script type="text/javascript">
function changeStyle(id) {
	var lis = document.getElementsByTagName("li");
	for(var i=0;i<lis.length;i++){
		lis[i].className = "";
	}
   	var obj = document.getElementById(id);
	obj.className = "active";
}
/* 第一个参数为要该改变样式的id， 第二个参数为模块名*/
function toModule(id, moduleName){
	changeStyle(id);
	top.leftFrame.location.href = 'homeAction_toLeft.action?moduleName=' + moduleName;
	top.mainFrame.location.href = 'homeAction_toMain.action?moduleName=' + moduleName;
}
</script>
</head>
<body>
<div style="padding-left: 20px">
	<ul class="nav nav-tabs">
		<li id="li1" class="active" onclick="toModule('li1', 'home')"><a href="#">基本信息表</a></li>
		<li id="li2" onclick="toModule('li2', 'supple')"><a href="#">采购</a></li>
		<li id="li3" onclick="toModule('li3', 'transfer')"><a href="#">调配</a></li>
		<li id="li4" onclick="toModule('li4', 'stock')"><a href="#">库存</a></li>
		<li id="li5" onclick="toModule('li5', 'sale')"><a href="#">销售</a></li>
		<li id="li6" onclick="toModule('li6', 'presale')"><a href="#">预售</a></li>
		<li id="li7" onclick="toModule('li7', 'vipmanage')"><a href="#">会员管理</a></li>
		<li id="li8" onclick="toModule('li8', 'user')"><a href="#">用户管理</a></li>
	</ul>
</div>
</body>
</html>
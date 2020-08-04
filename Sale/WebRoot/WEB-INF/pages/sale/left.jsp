<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../base.jsp"%>
<html>
<head>
<script type="text/javascript">
function changeStyle(id) {
	var lis = document.getElementsByTagName("li");
	for(var i=0;i<lis.length;i++){
		lis[i].className = "";
	}
   	var obj = document.getElementById(id);
	obj.className = "active";
}
</script>
</head>
<body>
<div style="padding: 10px">
	<ul class="nav nav-pills nav-stacked">
		<li id="li1" onclick="changeStyle('li1')" class="active"><a href="sale/saleAction_list" target="mainFrame">销售信息</a></li>
		<li id="li2" onclick="changeStyle('li2')"><a href="sale/statisticAction_list" target="mainFrame">门店销售统计信息</a></li>
		<li id="li3" onclick="changeStyle('li3')"><a href="sale/temporaryAction_list" target="mainFrame">临时记录表</a></li>
	</ul>
</div>
</body>
</html>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%>
<html>
<head>
</head>
<body>
<form action="user/itemAction_update" class="form-horizontal" role="form" method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('itemAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	  <li><a href="#" onclick="formSubmit('itemAction_update','_self')"><img alt="modify" src="${ctx }/img/save.png"></a></li>
	</ul>
</div>

<!-- 隐藏于：商品id -->
<input type="hidden" name="itemNo" value="${itemNo }">

<div style="margin: 10px">
<div class="col-md-4" style="margin-top: 30px">

	<div class="form-group">
		<label for="firstname" class="col-md-2 control-label">名称</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="firstname" 
				   name="itemName" placeholder="请输入商品名称" value="${itemName }">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-md-2 control-label">类别</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="firstname" 
				   name="itemType" placeholder="请输入所属分类" value="${itemType }">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-md-2 control-label">单位</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="firstname" 
				   name="unit" placeholder="请输入单位" value="${unit }">
		</div>
	</div>
</div>
</div>
</form>
</body>
</html>
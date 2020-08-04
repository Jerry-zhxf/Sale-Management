<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%>
<html>
<head>

</head>
<body>
<form action="staff/staffAction_update" class="form-horizontal" role="form" method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('staffAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	  <li><a href="#" onclick="formSubmit('staffAction_update','_self')"><img alt="modify" src="${ctx }/img/save.png"></a></li>
	</ul>
</div>

<!-- 隐藏域 userid -->
<input type="hidden" name="staffNo" value="${staffNo }">

<div style="margin: 10px">
<div class="col-md-4" style="margin-top: 30px">

	<div class="form-group">
		<label for="firstname" class="col-md-2 control-label">姓名</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="firstname" 
				   name="staffName" placeholder="请输入员工姓名" value="${staffName }">
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label">所属门店</label>
		<div class="col-md-10">
			<s:select cssClass="form-control" name="storeInfo.storeNo" list="#storeInfo" headerKey="" headerValue="--请选择--" listKey="storeNo" listValue="storeName"></s:select>
		</div>
  </div>
	<div class="form-group">
		<label for="firstname" class="col-md-2 control-label">基础工资</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="firstname" 
				   name="basicSalary" placeholder="请输入基础工资" value="${basicSalary }">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-md-2 control-label">提成</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="firstname" 
				   name="commission" placeholder="请输入提成数额" value="${commission }">
		</div>
	</div>
</div>
</div>
</form>
</body>
</html>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%>
<html>
<head>
</head>
<body>
<form action="icform" class="form-horizontal"  method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('temporaryAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	  <li><a href="#" onclick="formSubmit('temporaryAction_insert','_self')"><img alt="modify" src="${ctx }/img/save.png"></a></li>
	</ul>
</div>

<div style="margin: 10px">
<div class="col-md-6">
	<div class="form-group">
    <label class="col-md-2 control-label">订单编号</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="orderNo" placeholder="请输入订单单号，示例：1CHN300000001190522172815">
    </div>
  </div>
  <div class="form-group">
		<label class="col-md-2 control-label">会员号</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="vipNo" placeholder="请输入会员编号，即手机号，示例：15608460296">
		</div>
  </div>
  
  <div class="form-group">
		<label class="col-md-2 control-label">消费所得积分</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="accuPoints" placeholder="请输入消费所得积分">
		</div>
  </div>
</div>
</div>
</form>
</body>
</html>
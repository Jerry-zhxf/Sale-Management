<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%>
<html>
<head>
</head>
<body>
<form action="icform" class="form-horizontal"  method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('vipdegreeAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	  <li><a href="#" onclick="formSubmit('vipdegreeAction_insert','_self')"><img alt="modify" src="${ctx }/img/save.png"></a></li>
	</ul>
</div>

<div style="margin: 10px">
<div class="col-md-6">
  <div class="form-group">
    <label class="col-md-2 control-label">会员等级</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="degree" placeholder="请输入会员等级">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">可享受折扣</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="discount" placeholder="请输入可享受折扣">
    </div>
  </div>
</div>
</div>
</form>
</body>
</html>
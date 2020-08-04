<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%>
<html>
<head>
<script type="text/javascript">
function checkno() {
	var telenum = document.getElementById("storeNo");
	var telenumText = telenum.value;
	var reg3=new RegExp("\\S");
	if(!(/^[A-Za-z0-9]{13}$/g.test(telenumText))){
		alert("门店编号必须为13位组合！");
	}
	else if(telenumText[0]!="0"&&telenumText[0]!="1"){
		alert("门店编号首位必须为0（线上）或1（线下）！");
	}
	else{
		formSubmit('storeAction_insert','_self');
	}
}
</script>
</head>
<body>
<form action="icform" class="form-horizontal"  method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('storeAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	  <li><a href="#" onclick="checkno()"><img alt="modify" src="${ctx }/img/save.png"></a></li>
	</ul>
</div>

<div style="margin: 10px">
<div class="col-md-6">
  <div class="form-group">
    <label class="col-md-2 control-label">门店编号</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="storeNo" name="storeNo" placeholder="请输入门店编号(示例：0CHN410000001，首位0为线上，1位实体店)" onkeyup="value=value.replace(/[^\a-\z\A-\Z0-9]/g,'')">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">门店名称</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="storeName" placeholder="请输入门店名称">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">地址</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="storeAddr" placeholder="请输入门店地址">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">负责人</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="manager" placeholder="请输入负责人姓名">
    </div>
  </div>
    <div class="form-group">
    <label class="col-md-2 control-label">电话</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="tel" placeholder="请输入门店电话，多个可用分号隔开">
    </div>
  </div>
</div>
</div>
</form>
</body>
</html>
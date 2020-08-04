<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%>
<html>
<head>
<script type="text/javascript">
function checkno() {
	var telenum = document.getElementById("itemNo");
	var telenumText = telenum.value;
	var reg3=new RegExp("\\S");
	if(!(/^\d{13}$/g.test(telenumText))){
		alert("商品编号必须为13位数字！");
	}
	
	else{
		formSubmit('itemAction_insert','_self');
	}

}

</script>
</head>
<body>
<form action="icform" class="form-horizontal"  method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('itemAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	  <li><a href="#" onclick="checkno()"><img alt="modify" src="${ctx }/img/save.png"></a></li>
	</ul>
</div>

<div style="margin: 10px">
<div class="col-md-6">
  <div class="form-group">
    <label class="col-md-2 control-label">编号</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="itemNo"  name="itemNo" placeholder="请输入商品编号(示例：6904231013294，13位)" onkeyup="this.value=this.value.replace(/\D/g,'')" onkeydown="if(event.keyCode==32) return false">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">名称</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="itemName" placeholder="请输入商品名称">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">类别</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="itemType" placeholder="请输入所属分类">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">单位</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="unit" placeholder="请输入单位">
    </div>
  </div>
</div>
</div>
</form>
</body>
</html>
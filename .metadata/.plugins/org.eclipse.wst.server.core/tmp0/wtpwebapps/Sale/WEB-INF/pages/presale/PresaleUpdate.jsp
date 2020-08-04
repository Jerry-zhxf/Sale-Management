<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../base.jsp"%>
<html>
<head>

</head>
<body>
<form action="presale/presaleAction_update" class="form-horizontal" role="form" method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('presaleAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	  <li><a href="#" onclick="formSubmit('presaleAction_update','_self')"><img alt="modify" src="${ctx }/img/save.png"></a></li>
	</ul>
</div>

<!-- 隐藏域 userid -->
<input type="hidden" name="presale" value="${presale }">

<div style="margin: 10px">
  <div class="form-group">
		<label class="col-md-2 control-label">会员号</label>
		<div class="col-md-10">
			<s:select cssClass="form-control" name="vip.vipNo" list="#vip" headerKey="" headerValue="--请选择--" listKey="vipNo" listValue="vipNo"></s:select>
		</div>
  </div>
  <div class="form-group">
		<label class="col-md-2 control-label">预售门店</label>
		<div class="col-md-10">
			<s:select cssClass="form-control" name="storeInfo.storeNo" list="#storeInfo" headerKey="" headerValue="--请选择--" listKey="storeNo" listValue="storeName"></s:select>
		</div>
  </div>
  <div class="form-group">
		<label class="col-md-2 control-label">预售商品名称</label>
		<div class="col-md-10">
			<s:select cssClass="form-control" name="itemInfo.itemNo" list="#itemInfo" headerKey="" headerValue="--请选择--" listKey="itemNo" listValue="itemName"></s:select>
		</div>
  </div>
  <div class="form-group">
		<label for="firstname" class="col-md-2 control-label">定金</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="firstname" 
				   name="subscription" placeholder="请输入定金数额" value="${subscription }">
		</div>
  </div>
    <div class="form-group">
		<label for="firstname" class="col-md-2 control-label">预售日期</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="firstname" 
				   name="reserveDate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" placeholder="请选择预售时间" value="${reserveDate }">
		</div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">是否支付尾款</label>
    <div class="col-md-10">
      <!-- <input type="number" class="form-control" name="isRemainder" placeholder="请确定其是否支付尾款">  -->
      <select cssClass="form-control" name="isRemainder"  value="${isRemainder}">     
  		<option value="0">-请选择-</option>     
  		<option value="是" <c:if test="${'是' eq isRemainder}">selected</c:if> >是</option>     
  		<option value="否" <c:if test="${'否' eq isRemainder}">selected</c:if> >否</option>  
 	</select>  
    </div>
  </div>
</div>
</div>
</form>
</body>
</html>
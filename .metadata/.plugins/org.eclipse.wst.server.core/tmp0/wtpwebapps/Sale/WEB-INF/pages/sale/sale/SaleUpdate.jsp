<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%>
<html>
<head>

</head>
<body>
<form action="sale/saleAction_update" class="form-horizontal" role="form" method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('saleAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	  <li><a href="#" onclick="formSubmit('saleAction_update','_self')"><img alt="modify" src="${ctx }/img/save.png"></a></li>
	</ul>
</div>

<!-- 隐藏域 userid -->
<input type="hidden" name=orderNo value="${orderNo }">

<div style="margin: 10px">
  <div class="form-group">
		<label for="firstname" class="col-md-2 control-label">订单编号</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="firstname" 
				   name="orderNo" placeholder="请输入订单编号" value="${orderNo }">
		</div>
  </div>
    <div class="form-group">
		<label class="col-md-2 control-label">预售门店</label>
		<div class="col-md-10">
			<s:select cssClass="form-control" name="storeInfo.storeNo" list="#storeInfo" headerKey="" headerValue="--请选择--" listKey="storeNo" listValue="storeName"></s:select>
		</div>
  </div>
  <div class="form-group">
		<label class="col-md-2 control-label">会员编号</label>
		<div class="col-md-10">
			<s:select cssClass="form-control" name="vip.vipNo" list="#vip" headerKey="" headerValue="--请选择--" listKey="vipNo" listValue="vipNo"></s:select>
		</div>
  </div>
  <div class="form-group">
		<label class="col-md-2 control-label">导购编号</label>
		<div class="col-md-10">
			<s:select cssClass="form-control"  name="staffInfo.staffNo" list="#staffInfo" headerKey="" headerValue="--请选择--" listKey="staffNo" listValue="staffName"></s:select>
		</div>
  </div>
  <div class="form-group">
		<label class="col-md-2 control-label">商品名称</label>
		<div class="col-md-10">
			<s:select cssClass="form-control" id="itemno" name="itemNo" list="#itemInfo" headerKey="" headerValue="--请选择--" listKey="itemNo" listValue="itemName"></s:select>
		</div>
  </div>
    <div class="form-group">
    <label class="col-md-2 control-label">销售日期</label>
    <div class="col-md-10">
      <input type="text" name="saleDate" id="saledate" class="form-control" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" placeholder="请选择销售时间">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">购买数量</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="text1" name="itemQty" placeholder="请输入购买数量" onkeyup="jisuan();">
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
    <label class="col-md-2 control-label">商品单价</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="text2" name="itemPrice" placeholder="请输入商品单价" onkeyup="jisuan();">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">总金额</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="text3" name="totalAmount" placeholder="请输入总数额" readonly onkeyup="jisuan1();">
    </div>
  </div>
  <div class="form-group">
		<label class="col-md-2 control-label">折扣</label>
		<div class="col-md-10">
			<input type="text" class="form-control" id="discount" name="discount" placeholder="请输入折扣" onkeyup="jisuan1();">
		</div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">实付金额</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="payamount" name="payAmount" placeholder="请输入实付数额" readonly>
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
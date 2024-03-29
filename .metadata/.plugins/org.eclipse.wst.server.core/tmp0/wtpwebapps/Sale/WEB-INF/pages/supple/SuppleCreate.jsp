<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../base.jsp"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<script language="javascript" src="${ctx}/js/calendar.js"></script>
	<script language="javascript" src="${ctx}/js/WdatePicker.js"></script>

</head>
<body>
<form action="icform" class="form-horizontal"  method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('suppleAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	  <li><a href="#" onclick="formSubmit('suppleAction_insert','_self')"><img alt="modify" src="${ctx }/img/save.png"></a></li>
	</ul>
</div>

<div style="margin: 10px">
<div class="col-md-6">
  <div class="form-group">
		<label class="col-md-2 control-label">供应商名称</label>
		<div class="col-md-10">
			<s:select cssClass="form-control" name="id.vendorNo" list="#supplyInfo" headerKey="" headerValue="--请选择--" listKey="vendorNo" listValue="vendorName"></s:select>
		</div>
  </div>
  <div class="form-group">
		<label class="col-md-2 control-label">商品名称</label>
		<div class="col-md-10">
			<s:select cssClass="form-control" name="id.itemNo" list="#itemInfo" headerKey="" headerValue="--请选择--" listKey="itemNo" listValue="itemName"></s:select>
		</div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">供应日期</label>
    <div class="col-md-10">
      <input type="text" name="supplyDate"  class="form-control" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" placeholder="请选择供应时间">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">供应数量</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="supplyQuality"  placeholder="请输入供应数量">
    </div>
  </div>
  <div class="form-group">
    <label class="col-md-2 control-label">供应价格</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="supplyPrice"  placeholder="请输入供应价格">
    </div>
  </div>
</div>
</div>
</form>
</body>
</html>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%>
<html>
<head>
<script>
	 var count;
     function isOnlyChecked(){
    	 var checkBoxArray = document.getElementsByName('id');
			count=0;
			for(var index=0; index<checkBoxArray.length; index++) {
				if (checkBoxArray[index].checked) {
					count++;
				}	
			}
		//jquery
		//var count = $("[input name='id']:checked").size();
		if(count==1)
			return true;
		else
			return false;
     }
     function deleteById(){
     	 isOnlyChecked();
    	 if(count > 0){
    	 	 alert("确认删除？");
    		 formSubmit('saleAction_delete','_self');
    	 }else{
    		 alert("请先选择一项以上，再进行操作！");
    	 }
     }
     //实现更新
     function toUpdate(){
    	 if(isOnlyChecked()){
    		 formSubmit('saleAction_toupdate','_self')
    	 }else{
    		 alert("请先选择一项并且只能选择一项，再进行操作！");
    	 }
     }
</script>
</head>
<body>
<form name="icform" method="post">
<div>
	<ul class="nav nav-pills">
	  <li><a href="#" onclick="formSubmit('saleAction_list','_self')"><img alt="add" src="${ctx }/img/back.png"></a></li>
	</ul>
</div>

<div>
	<h4>快递单详情:</h4>
	<table class="table table-hover">
	  <thead>
	    <tr>
	   	  <th>订单编号</th>
	   	  <th>序号</th>
	      <th>快递单号</th>
	    </tr>
	  </thead>
	 
	  <tbody>
	    <c:forEach items="${results}" var="o" varStatus="status">
	    <tr>
	      <td>${o.orderNo}</td>
	      <td></td>
	      <td></td>
	    </tr>
	    <c:forEach items="${o.deliveries}" var="sg" varStatus="status_sg">
	    <tr style="color: #007fff;">
	      <td style="width: 60px"><input type="hidden" value="${sg.deliveryNo}"/></td>
	      <td>${status_sg.index+1}</td>
	      <td>${sg.deliveryNo }</td>
	      <td></td>
	    </tr>
	    </c:forEach>
	    </c:forEach>
	  </tbody>
	</table>
	<div style="text-align:center; height: 40px">${links }</div> 
</div>
</form>
</body>
</html>
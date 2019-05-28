//写一个文档就绪函数
$(function(){
	/*//实现注销功能
	$("input[value='注销登录']").click(function(){
		location.href="/ssh_04/remove.action";
	});*/
	
	//实现删除功能
	$("input[value='删除']").click(function(){
		var eid=$(this).prev().val();
		if(confirm("你确定要删除"+eid+"的信息吗?")){
			$.ajax({
				type:"post",//提交方式
				url:"/ssm_crud/pldelete.do",//提交路径
				dataType:"json",//预期服务器返回的数据类型
				data:{
					eid:eid
				},//提交数据
				success:function(obj){
					if(obj){
						alert("删除成功!");
						location.href="/ssm_crud/listemp.do";
					}else{
						alert("删除失败!");
						location.href="/ssm_crud/listemp.do";
					}
				}
			});
		}		
	});
	
	//实现添加功能
	$("input[value='修改']").click(function(){
		location.href="page/update.jsp?eid="+$(this).next().val();
	});
	
	//实现批量删除功能
	$("input[value='批量删除']").click(function(){
		//获取复选框
		var x=$("input[name='eid']:checked");
		if(x.length>0){
			//写一个变量
			var str="";
			for(var i=0;i<x.length;i++){
				str+=x[i].value+",";
			}
			//去掉最后一位逗号
			var eid=str.substring(0,str.length-1);
			if(confirm("你确定要删除"+eid+"的信息吗?")){
				$.ajax({
					type:"post",//提交方式
					url:"/ssm_crud/pldelete.do",//提交路径
					dataType:"json",//预期服务器返回的数据类型
					data:{
						eid:eid
					},//提交数据
					success:function(obj){
						if(obj){
							alert("删除成功!");
							location.href="/ssm_crud/listemp.do";
						}else{
							alert("删除失败!");
							location.href="/ssm_crud/listemp.do";
						}
					}
				});
			}
		}else{
			alert("对不起，必须选中一条数据!");
		}		
	});
	
	//实现添加功能
	$("input[value='添加']").click(function(){
		location.href="page/add.jsp";
	});
	
	//实现模糊查询
	$("input[value='查询']").click(function(){
		var ename=$("#ename").val();
		var mindate=$("#mindate").val();
		var maxdate=$("#maxdate").val();
		location.href="/ssm_crud/listemp.do?ename="+ename+"&&mindate="+mindate+"&&maxdate="+maxdate;
	});
	
	//实现复选框全选全不选
	$("input[name='checkall']").click(function(){
		if($(this).is(":checked")){
			$("input[name='eid']").each(function(){
				this.checked=true;
			});
		}else{
			$("input[name='eid']").each(function(){
				this.checked=false;
			});
		}
	});
	
	//实现全选功能
	$("input[value='全选']").click(function(){
		$("input[name='eid']").each(function(){
			this.checked=true;
		});
	});
	
	//实现全不选功能
	$("input[value='全不选']").click(function(){
		$("input[name='eid']").each(function(){
			this.checked=false;
		});
	});
	
	//实现反选功能
	$("input[value='反选']").click(function(){
		$("input[name='eid']").each(function(){
			this.checked=!this.checked;
		});
	});
	
	//给h1添加样式
	$("h1").css({"font-size":"30px","text-align":"center"});
});

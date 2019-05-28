//写一个文档就绪函数
$(function(){	
	//实现下拉框功能
	$.ajax({
		type:"post",//提交方式
		url:"/ssm_crud/xiala.do",//提交路径
		dataType:"json",//预期服务器返回的数据类型
		data:{},//提交的数据
		success:function(obj){
			for(var i=0;i<obj.length;i++){
			    alert(obj[i].did);
				$("#did").append("<option value='"+obj[i].did+"'>"+obj[i].dname+"</option>");
			}
		}
	});

	//实现添加功能
	$("input[value='添加']").click(function(){
		$.ajax({
			type:"post",//提交方式
			url:"/ssm_crud/add.do",//提交路径
			dataType:"json",//预期服务器返回的数据类型
			data:$("form").serialize(),//提交的数据
			success:function(obj){
				if(obj){
					alert("添加成功!");
					location.href="/ssm_crud/listemp.do";
				}else{
					alert("添加失败!");
					location.href="page/add.jsp";
				}
			}
		});
	});
	
	//给h1添加样式
	$("h1").css({"font-size":"30px","text-align":"center"});
});

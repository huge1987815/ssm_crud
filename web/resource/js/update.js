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
				$("#did").append("<option value='"+obj[i].did+"'>"+obj[i].dname+"</option>");
			}
		}
	});

	//实现回显功能
	$.ajax({
		type:"post",//提交方式
		url:"/ssm_crud/show.do",//提交路径
		dataType:"json",//预期服务器返回的数据类型
		data:{
			eid:$("#eid").val()
		},//提交的数据
		success:function(obj){
			$("#ename").val(obj.ename);
			$(":radio[value='"+obj.sex+"']").attr({"checked":true});
			$("#birthdate").val(obj.birthdate)
			var x=obj.hobby.split(",");
			for (var i = 0; i < x.length; i++) {
				alert(x[i]);
				$(":checkbox[value='"+x[i]+"']").attr({"checked":true});
			}
			$("#did option[value='"+obj.did+"']").attr({"selected":true});
		}
	});

	//实现修改功能
	$("input[value='修改']").click(function(){
		$.ajax({
			type:"post",//提交方式
			url:"/ssm_crud/update.do",//提交路径
			dataType:"json",//预期服务器返回的数据类型
			data:$("form").serialize(),//提交的数据
			success:function(obj){
				if(obj){
					alert("修改成功!");
					location.href="/ssm_crud/listemp.do";
				}else{
					alert("修改失败!");
					location.href="/ssm_crud/listemp.do";
				}
			}
		});
	});
	
	//给h1添加样式
	$("h1").css({"font-size":"30px","text-align":"center"});
});

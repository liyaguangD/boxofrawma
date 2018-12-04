<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%@include file="/common/mystyle.jsp" %>
</head>
<body>



<table id="log">

</table>






</body>
<script type="text/javascript">

    $().ready(function(){

        $("#log").bootstrapTable({
            url:"http://localhost:8765/good/queryGoods",
            method:"GET",
            dataType: "jsonp",  //指定服务器返回的数据类型
             success: function (data) {
                    console.info("调用success");
                },
            striped: true,  	// 斑马线效果     默认false
            //只允许选中一行
            singleSelect:true,
            //选中行是不选中复选框或者单选按钮
            clickToSelect:true,
            showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            uniqueId: "bookId",                 //每一行的唯一标识，一般为主键列
            showColumns: true,                  //是否显示所有的列
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,     //  最少留两列
            detailView: false,                  //是否显示父子表

            //发送到服务器的数据编码类型
            contentType:'application/x-www-form-urlencoded;charset=UTF-8',   //数据编码纯文本  offset=0&limit=5
            toolbar:'#tabToolBar',   //  工具定义位置
            columns:[

                {field:'goodId',title:'商品Id',width:50},
                {field:'goodName',title:'商品名称',width:100},

                {field:'goodPrice',title:'商品价格',width:100},
                {field:'goodType',title:'商品类型',width:100} ,

                {field:'sales',title:'销量',width:100},
                {field:'inventory',title:'库存',width:100},
                {
                    field: 'status', title: '是否上架', width: 100,
                    formatter: function (value, row, index) {
                        if (row.status = 1) {
                            return "上架";
                        } else {
                            return "下架";
                        }
                    }
                },
                {field:'goodimg',title:'商品图片',width:100,
                    formatter:function(value,row,index){
                        return "<img class='img-responsive img-square' width='100' height='100' src='<%=request.getContextPath()%>/good/querybookimg.do?id="+value+"'>";
                    }
                },

            ],

            //传递参数（*）
            queryParams: function(params) {
                var whereParams = {
                    /*
                        分页  自定义的参数         默认传 limit（展示几条）    offset（从第几条开始    起始条数）
                    */
                    "pageSize":params.limit,
                    "start":params.offset,

                }
                return whereParams;
            },
            //前台--排序字段
            //sortName:'proPrice',
            //sortOrder:'desc',
            //前台--搜索框
            search:true,
            //启动回车键做搜索功能
            searchOnEnterKey:true,
            //分页方式   后台请求的分页方式
            sidePagination:'server',
            pagination: true,                   //是否显示分页（*）
            pageNum: 1,                       //每页的记录行数（*）
            pageSize: 3,                       //每页的记录行数（*）
            pageList: [3, 6, 9,12],        //可供选择的每页的行数（*）
        });

    })







</script>

</html>

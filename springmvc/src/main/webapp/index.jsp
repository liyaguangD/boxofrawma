<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<body>
<h2>Hello World!</h2>
<input id="btn" type="button" value="跨域获取数据"/>
<textarea id="text" style="width: 400px; height: 100px;"></textarea>
</body>
<script>
    $(document).ready(function () {
        $("#btn").click(function () {
            $.ajax({
                url: "http://localhost:8765/good/queryGoods",
                type: "GET",
                dataType: "jsonp",  //指定服务器返回的数据类型
                success: function (data) {
                    console.info("调用success");
                }
            });
        });
    });
</script>
</html>

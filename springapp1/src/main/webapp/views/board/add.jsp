<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>글 작성</h3>
<form action = "/board/add" method = "post">
<table border = "1" cellpadding="3" style = "border-collapse:collapse">
<tr><th>작성자</th><td><input type = "text" name ="writer"></td></tr>
<tr><th>제목</th><td><input type = "text" name = "title"></td></tr>
<tr><th>글내용</th><td><textarea rows = "20" cols = "40" name = "content"></textarea></td></tr>
<tr><th>작성</th><td><input type = "submit" value = "작성완료"></td></tr>
</table>
</form>
</body>
</html>
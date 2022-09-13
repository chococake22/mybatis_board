<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>글 수정</title>
</head>
<body>

<h1>글 수정</h1>

    <form action="/board/update/check" method="post">
        제목 : <input type="text" value="${board.title}" id="title" name="title"> <br>
        번호 :  <input type="text" value="${board.board_idx}" id="board_idx" name="board_idx" readonly> <br>
        작성자 : <input type="text" value="${board.writer}" id="writer" name="writer" readonly> <br>
        내용 : <input type="text" value="${board.content}" id="content" name="content"> <br>
        분류 : <input type="text" value="${board.type}" id="type" name="type"> <br>
        <input type="submit" value="수정">

    </form>






</body>
</html>
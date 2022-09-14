<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>상세보기</title>
</head>
<body>

<h1>sdfs</h1>

    번호 : <c:out value="${board.boardIdx}"></c:out> <br>
    제목 : <c:out value="${board.title}"></c:out> <br>
    작성자 : <c:out value="${board.writer}"></c:out> <br>
    내용 : <c:out value="${board.content}"></c:out> <br>

    <a href="/board/delete?boardIdx=${board.boardIdx}">삭제</a> <br>
    <a href="/board/update?boardIdx=${board.boardIdx}">수정</a>





</body>
</html>
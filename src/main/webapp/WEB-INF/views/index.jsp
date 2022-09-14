<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>테스트</title>
</head>
<body>
    <h1>
        전체 개수 : <c:out value="${count}"></c:out>
    </h1>
    <table border="1">
        <thead>
            <tr>
                <td>번호</td>
                <td>제목</td>
                <td>작성자</td>
                <td>내용</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${boards}" var="board">
                <tr>
                    <td><c:out value="${board.boardIdx}"></c:out></td>
                    <td><a href="/board/detail?boardIdx=${board.boardIdx}">${board.title}</a></td>
                    <td><c:out value="${board.writer}"></c:out></td>
                    <td><c:out value="${board.content}"></c:out></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <form action="/board/save" method="post">
        제목 <input id="title" name="title"> <br>
        작성자 <input id="writer" name="writer"> <br>
        내용 <input id="content" name="content"> <br>
        분류 <input id="type" name="type"> <br>
        <input type="submit" value="저장">
    </form>
</body>
</html>
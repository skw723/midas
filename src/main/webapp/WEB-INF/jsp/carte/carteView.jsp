<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<style>
label {
	display: flex;
}
</style>
</head>
<body>
	
<form action="/modifyCarte" method="post" enctype="multipart/upload" id="addForm" onsubmit="return false;">
  <div class="form-group">
    <label for="ymd">선택일</label>
    <input type="text" class="form-control" id="ymd" name="ymd" value="${ymd}" readonly="readonly">
  </div>
  <div class="form-group">
    <label for="type">선택일</label>
    <select id="type" name="type" class="form-control">
    	<option value="1">아침</option>
    	<option value="2">점심</option>
    	<option value="3">저녁</option>
    </select>
  </div>
  <div class="form-group">
    <label for="col1">식단1</label>
    <input type="text" class="form-control" id="col1" name="col1" placeholder="식단1" value="#{carte.col1}">
  </div>
    <div class="form-group">
    <label for="col1">식단2</label>
    <input type="text" class="form-control" id="col2" name="col2" placeholder="식단2" value="#{carte.col2}">
  </div>
    <div class="form-group">
    <label for="col1">식단3</label>
    <input type="text" class="form-control" id="col3" name="col3" placeholder="식단3" value="#{carte.col3}">
  </div>
    <div class="form-group">
    <label for="col1">식단4</label>
    <input type="text" class="form-control" id="col4" name="col4" placeholder="식단4" value="#{carte.col4}">
  </div>
    <div class="form-group">
    <label for="col1">식단5</label>
    <input type="text" class="form-control" id="col5" name="col5" placeholder="식단5" value="#{carte.col5}">
  </div>
    <div class="form-group">
    <label for="col1">식단6</label>
    <input type="text" class="form-control" id="col6" name="col6" placeholder="식단6" value="#{carte.col6}">
  </div>
  <div class="form-group">
    <label for="kcal">kcal</label>
    <input type="text" class="form-control" id="kcal" name="kcal" placeholder="kcal" value="#{carte.kcal}">
  </div>
  <div class="form-group">
    <label for="upliad">파일 업로드</label>
    <input type="file" id="upliad" name="upload">
  </div>
  <button type="button" class="btn btn-default" id="save">수정</button>
</form>
<div id="imageArea"></div>
<script>
$(function() {
	var $img = $("<img />").prop("src", "#{carte.imgPath}").on("load", function() {
		$("#imageArea").html("");
		$("#imageArea").append($img);
	});
});
</script>
</body>
</html>
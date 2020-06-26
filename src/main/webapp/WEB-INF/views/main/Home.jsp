<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div>
	<table class="searches">
		<tr>
			<td><h5 class="introduction">🐈 고양시 공공자전거 서비스 🚴</h5>
				<h5 class="introduction">피프틴 스테이션에 자전거가 몇 개 남았는지 확인하자</h5>
				<br>
			<td></td>
		</tr>
		<tr>
			<td><input id="search" type="text" value="주소 입력"><input id="search_bar" type="button" value="검색"></td>
			<td></td>
		</tr>
	</table>
</div>


<script>
	$('#join_btn').click(function(e) {
		e.preventDefault()
		location.href = "${context}/member/join/form"
	})
</script>


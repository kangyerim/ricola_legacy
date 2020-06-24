<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="Header.jsp"/>
<body>
  <div id="background">
        <div>
        <table class="header">
            <tr>
                <td><h1 class="project_name">FIF TEEN🚴</h1></td>
                <td class="td2"></td>
                <td>
                    <div class="top">
                        <a @click="Join" id="join_btn">회원가입</a>
                        <a>로그인</a>
                    </div>
                </td>
            </tr>
        </table>
        </div>
  
  
    <div>
      <table class="searches">
        <tr>
          <td></td>
          <td><a class="introduction">🐈 고양시 공공자전거 서비스 🚴</a><br>
            <a class="introduction">피프틴 스테이션에 자전거가 몇 개 남았는지 확인하자</a><br>
            <a  class="introduction">전체 스테이션 보기</a></td>
          <td></td>
        </tr>
        <tr>
          <td><span style="padding-right : 300px;"></span></td>
          <td><input id="search" type="text" value="주소 입력"></td>
          <td><input id="search_bar" type="button" value="검색"></td>
        </tr>
      </table>
    </div>
    
        <table class="footer">
            <a>2020.06.22 FIF TEEN project</a>
        </table>
        
  </div>
</body>
</html>


<script>
	$('#join_btn').click(function(e) {
		e.preventDefault()
		alert('야옹')
		location.href="<%=application.getContextPath()%>/member/join/form"
	})
</script>


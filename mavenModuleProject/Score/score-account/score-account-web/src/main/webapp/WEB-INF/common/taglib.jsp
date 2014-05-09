<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<c:set var="global_url" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
<c:set var="global_css_url" value="${pageContext.request.contextPath}/WEB-INF/css"/>
<c:set var="global_js_url" value="${pageContext.request.contextPath}/static"/>
<c:set var="global_image_url" value="${pageContext.request.contextPath}/WEB-INF/image"/>
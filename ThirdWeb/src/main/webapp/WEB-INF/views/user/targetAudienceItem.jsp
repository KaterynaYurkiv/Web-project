<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>Target Audience: ${targetAudience.category}</h2>
<c:forEach items="${itemsOfClothing}" var="itemOfClothing">
	<div>${itemOfClothing.brand.brandName} ${itemOfClothing.itemName.name} in ${itemOfClothing.color.color} color costs ${itemOfClothing.price} $</div>
</c:forEach>
<c:if test="${empty itemsOfClothing}">
	<h3>There are no clothes in this category</h3>
</c:if>
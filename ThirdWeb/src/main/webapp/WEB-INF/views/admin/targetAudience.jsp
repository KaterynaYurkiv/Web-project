<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
				    <li><a href="/admin/itemName">Item Name</a></li>
					<li><a href="/admin/brand">Brand</a></li>
					<li><a href="/admin/toc">Type of clothing</a></li>
					<li class="active"><a href="/admin/targeta">Target audience</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/color">Color</a></li>
					<li><a href="/admin/size">Size</a></li>
					<li><a href="/admin/ioc">Item of clothing</a></li>
					<li><a href="/admin/customer">Customer</a></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<div class="col-md-3 col-xs-12"></div>
	<div class="col-md-7 col-xs-12">
			<div class="row">
			<div class="col-md-12 col-xs-12">
				<form:form class="form-horizontal" action="/admin/targeta" method="POST" modelAttribute="targeta">
					<div class="form-group">
 						<label for="name" style="color:red;text-align:left;" class="col-sm-offset-2 col-sm-10 control-label"><form:errors path="category"/></label>
 					</div>
					<div class="form-group">
    					<label for="name" class="col-sm-2 control-label">Target Audience</label>
    					<div class="col-sm-10">
      						<form:input class="form-control" path="category" id="name"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-default">Create</button>
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-xs-4"><h3>Target audience</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Update</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Delete</h3></div>
		</div>
<!-- 		спеціальний тег для роботи з всім що можна прогорнути а точніше з тим що імплементує Iterator<T> -->
<!-- 		items -- це посилання на колекцію, ім'я потрібно  вказувати те яке ви передали в метод addAttribute першим параметром (в BrandController.java)-->
<!-- 		var -- це назва одного елемента колекції доступна лише в середині парного тегу c:forEach -->
			<c:forEach items="${targetAudiences}" var="audience">
				<div class="row">
<!-- 					тут все так само як на сервлетах -->
					<div class="col-md-4 col-xs-4">${audience.category}</div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-warning" href="/admin/targeta/update/${audience.id}">update</a></div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-danger" href="/admin/targeta/delete/${audience.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>
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
					<li class="active"><a href="/admin/brand">Brand</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/toc">Type of clothing</a></li>
					<li><a href="/admin/targeta">Target audience</a></li>
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
				<form:form class="form-horizontal" action="/admin/brand" method="POST" modelAttribute="brand">
					<div class="form-group">
						<label for="name" style="color:red;text-align:left;" class="col-sm-offset-2 col-sm-10 control-label"><form:errors path="brandName"/></label>
					</div>
					<div class="form-group">
    					<label for="name" class="col-sm-2 control-label">Brand</label>
    					<div class="col-sm-10">
      						<form:input class="form-control" path="brandName" id="name"/>
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
			<div class="col-md-4 col-xs-4"><h3>Brand name</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Update</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${brands}" var="brand">
				<div class="row">
<!-- 					тут все так само як на сервлетах -->
					<div class="col-md-4 col-xs-4">${brand.brandName}</div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-warning" href="/admin/brand/update/${brand.id}">update</a></div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-danger" href="/admin/brand/delete/${brand.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>
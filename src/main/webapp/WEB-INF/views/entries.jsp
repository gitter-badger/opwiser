<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<title>Products</title>
</head>
<body>
	<section>
	<div class="jumbotron">
		<div class="container">
			<h1>Entries</h1>
			<p>List of entries</p>
		</div>
	</div>
	</section>

	<section class="container">
	<div class="row">
		<div class="col-sm-6 col-md-3" style="padding-botomm: 15px">
			<div class="thumbnail">
				<div class="caption">
					<h3>${ entry.name }</h3>
					<p>${ entry.category }</p>
					<p>${ entry.amount  }USD</p>
					<p>This entry will last for ${ entry.duration }</p>
				</div>
			</div>
		</div>
	</div>
	</section>
</body>
</html>
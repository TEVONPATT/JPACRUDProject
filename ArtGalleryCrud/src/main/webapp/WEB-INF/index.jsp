<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Artist Gallery</title>
</head>
<body>

<div class="container-fluid">
<h1>Welcome to The Artist Gallery</h1>
<h3>Search by Artist Id</h3>
	<form action="getArtGallery.do" method="GET">
		Artist Gallery ID: <input type="text" name="fid" /> <input type="submit"
			value="Show Gallery" />
	</form>
	<table class="table table-striped table-hover">
		<thead class="thead thead-dark">
			<tr>
			<th>Artist ID</th>
			<th>Title</th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${artists}" var="theArtGallery">
				<tr>
					<td>${theArtGallery.id}</td>
					<td><a href="getArtGallery.do?id=${theArtGallery.id}">${theArtGallery.firstName}</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</body>
</html>
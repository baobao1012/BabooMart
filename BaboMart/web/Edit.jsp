<%-- 
    Document   : ManagerProduct
    Created on : Dec 28, 2020, 5:19:02 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Edit</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Edit <b>Product</b></h2>
                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>
            </div>
            <div id="editEmployeeModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="edit" method="post">
                            <div class="modal-header">						
                                <h4 class="modal-title">Add Product</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="modal-body">					
                                <div class="form-group">
                                    <label>Mã sản phẩm</label>
                                    <input value="${sanpham.getMasanpham()}" name="id" type="text" class="form-control" readonly required>
                                </div>
                                <div class="form-group">
                                    <label>Tên sản phẩm</label>
                                    <input value="${sanpham.getTensanpham()}" name="name" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Ảnh</label>
                                    <input value="${sanpham.getImgUrl()}" name="image" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Gía gốc</label>
                                    <input value="${sanpham.getGiagoc()}" name="price" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Khuyến Mãi</label>
                                    <input value="${sanpham.getKhuyenmai()}" name="sale" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Mô tả ngắn</label>
                                    <textarea name="title1" class="form-control" required>${sanpham.getMotangan()}</textarea>
                                </div>
                                <div class="form-group">
                                    <label>Mô tả chi tiết</label>
                                    <textarea name="title2" class="form-control" required>${sanpham.getMotachitiet()}</textarea>
                                </div>
                                <div class="form-group">
                                    <label>Số Lượng</label>
                                    <input value="${sanpham.getSoluong()}" name="quantity" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                <label>Danh Mục</label>
                                <select name="category" class="form-select" aria-label="Default select example">
                                    <c:forEach items="${listDanhMucSanPham}" var="o">
                                        <option value="${o.getMadanhmuc()}">${o.getTendanhmuc()}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            </div>
                            <div class="modal-footer">
                                <input type="submit" class="btn btn-success" value="Edit">
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>


        <script src="js/manager.js" type="text/javascript"></script>
    </body>
</html>
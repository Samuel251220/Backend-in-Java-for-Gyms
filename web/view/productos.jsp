<%-- 
    Document   : articulos
    Created on : 03/06/2018, 04:34:25 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/producto.css">
  </head>
  <body>
    <div class="container">
      <div class="speed">
        <div class="input-group stylish-input-group cont">
          <input type="text" placeholder="Busca por codigo" class="form-control">
          <span class="input-group-addon">
            <button type="submit">
              <i class="fas fa-search"></i>
            </button>  
          </span>
        </div>
        <hr>
        <ul class="opciones">
          <li class="opc"><a href="#">NEW</a></li>
          <li class="opc"><a href="#">TODO</a></li>
        </ul>
      </div>
      <div class="prod">
        <ul class="productos">
          <li class="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro new"><img src="../img/prod1.jpg"></div>
          </li>
          <li class="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro"><img src="../img/prod1.jpg"></div>
          </li>
          <li class="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro"><img src="../img/prod1.jpg"></div>
          </li>
          <li class="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro"><img src="../img/prod1.jpg"></div>
          </li>
          <li class="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro"><img src="../img/prod1.jpg"></div>
          </li>
        </ul>
      </div>
    </div>
    <script src="../js/fontawesome-all.js"></script>
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
  </body>
</html>

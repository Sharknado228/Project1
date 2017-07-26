<%--
  Created by IntelliJ IDEA.
  User: Ігор
  Date: 26.07.2017
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/post" method="post">
    <p>Введіть анкетні данні</p>
    <p><input placeholder="Ім'я" name="name"></p>
    <p><input placeholder="Фамілія" name="surname"></p>
    <p><input placeholder="Номер телефону" name="phone"></p>
    <p><input placeholder="Електронна пошта" name="email"></p>
    <p><input placeholder="Skype" name="skype"></p>
    <p><input value="Відправити" type="submit"></p>
  </form>
  <form action="/find" method="post">
      <p>Введіть анкетні данні</p>
      <p><input placeholder="Phone number" name="phone"></p>
      <p><input value="Відправити" type="submit"></p>
  </form>
  <div >
      <p>${name}</p>
      <p>${surname}</p>
      <p>${phone}</p>
      <p>${email}</p>
      <p>${skype}</p>
  </div>
  </body>
</html>

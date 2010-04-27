<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head><title>MAIN</title>
  <link href="/layouts/css/deviation/style.css" rel="stylesheet" type="text/css" media="screen" />
  </head>
  <body>
    <table cellspacing="0" cellpadding="0" border="0">
      <tr>
        <td colspan="2">
          <tiles:insertAttribute name="head-position"/>
        </td>
      </tr>
      <tr>
      	<td width="75%">
          <tiles:insertAttribute name="body-position"/>
        </td>
        <td width="25%">
          <tiles:insertAttribute name="right-nav-position"/>
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <tiles:insertAttribute name="foot-position"/>
        </td>
      </tr>
    </table>
  </body>
</html>
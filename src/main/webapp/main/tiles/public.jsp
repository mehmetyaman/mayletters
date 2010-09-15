<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head><title><tiles:insertAttribute name="title" ignore="true"/></title>
  <link href="<%=request.getContextPath()%>/layouts/css/deviation/style.css" rel="stylesheet" type="text/css" media="screen" />
  </head>
  <body>
    <table border="0" cellpadding="2" cellspacing="2" align="center">
      <tr>
        <td colspan="2" height="30" class="bottomline linecolor">
          <tiles:insertDefinition name="head" />
        </td>
      </tr>
      <tr>
      	<td width="550" valign="top">
          <tiles:insertDefinition name="body"/>
        </td>
        <td  width="150" height="500" valign="top"  class="leftline linecolor">
          <tiles:insertDefinition name="right-nav"/>
        </td>
      </tr>
      <tr>
        <td colspan="2" height="30" align="center">
          <tiles:insertDefinition  name="foot" />
        </td>
      </tr>
    </table>
  </body>
</html>
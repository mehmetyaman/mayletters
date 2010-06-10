<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<head>
<title><tiles:insertAttribute name="title" ignore="true"/></title>
  <link href="<%=request.getContextPath()%>/layouts/css/deviation/style.css" rel="stylesheet" type="text/css" media="screen" />
 </head>
 
<html>
  
  <body>
    <table border="0" cellpadding="2" cellspacing="2" align="center">
    
      <tr>
        <td colspan="2" height="30" class="bottomline linecolor">
          <tiles:insertAttribute name="head-position"/>
        </td>
      </tr>
      <tr>
        <td  width="150" height="450" valign="top"  class="rightline linecolor">
          <tiles:insertAttribute name="left-nav-position"/>
        </td>
        <td width="550" valign="top">
          <tiles:insertAttribute name="body-position"/>
        </td>
      </tr>
      <tr>
        <td colspan="2" height="30" align="center">
          <tiles:insertAttribute name="foot-position"/>
        </td>
      </tr>
	  
      
    </table>
  </body>
</html>
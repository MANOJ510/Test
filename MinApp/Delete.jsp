<html>
<script language="javascript">
function isValid()
{
if(f.stu_id.value=""){
alert(f.stu_id.name+""+"field missed");
f.stu_id.focus();
return false();
}
if(isNaN(f.stu_id.value)
{alert("stu_id should be number");
f.stu_id.focus();
return false;
}
return true;
}
</script>
<form name=f action='./delete' method='post' onSubmit='return isValid()')>
<table border=1 celipading=7 cellspacing=7 align=center>
<caption><font size=4><u>Delete Records</caption>
<tr>
<th>Student ID<th><input type="text" name="stu_id"></tr>
<tr>
<th>click<th><input type="submit" value="Delete"></tr>
</table>
</form>
</body>
</html>
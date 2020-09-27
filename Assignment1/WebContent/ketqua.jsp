
<%
	String kq = request.getParameter("pt");
int a = Integer.parseInt(request.getParameter("a"));
int b = Integer.parseInt(request.getParameter("b"));
if (kq.equals("+")) {
	out.print("ket qua: " + (a + b));
}
if (kq.equals("-")) {
	out.print("ket qua: " + (a - b));
}
if (kq.equals("*")) {
	out.print("ket qua: " + ((float)a * b));
}
if (kq.equals("/")) {
	out.print("ket qua: " + ((float)a / b));
}
%>
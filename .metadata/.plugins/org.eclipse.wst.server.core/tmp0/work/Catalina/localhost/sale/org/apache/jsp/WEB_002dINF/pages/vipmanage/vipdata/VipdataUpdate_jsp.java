/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.20
 * Generated at: 2019-06-14 03:33:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.vipmanage.vipdata;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VipdataUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Program%20Files/Apache%20Software%20Foundation/Tomcat%209.0/lib/standard-1.1.0.jar!/META-INF/c.tld", Long.valueOf(1075174902000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.15.3.jar", Long.valueOf(1505468953000L));
    _jspx_dependants.put("jar:file:/C:/Users/zh200/Desktop/sale-management/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Sale/WEB-INF/lib/struts2-core-2.3.15.3.jar!/META-INF/struts-tags.tld", Long.valueOf(1381842372000L));
    _jspx_dependants.put("/WEB-INF/pages/vipmanage/vipdata/../../base.jsp", Long.valueOf(1560175203866L));
    _jspx_dependants.put("file:/C:/Program%20Files/Apache%20Software%20Foundation/Tomcat%209.0/lib/standard-1.1.0.jar", Long.valueOf(1554807352000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\"> \n");
      out.write("\t<title></title>\n");
      out.write("\t\n");
      out.write("\t<!-- bootstrap -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css\">  \n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- 自定义的js -->\n");
      out.write("\t<script language=\"javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/common.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("</head>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\tfunction calCulate(val){\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar num = document.getElementById(\"t\");\n");
      out.write("\t\t\tswitch(val){\n");
      out.write("\t\t\t\tcase \"=\":\n");
      out.write("\t\t\t\tnum.value = eval(num.value);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tcase \"C\":\n");
      out.write("\t\t\t\tnum.value = \"\";\n");
      out.write("\t\t\t\tbreak;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tdefault:\n");
      out.write("\t\t\t\t  num.value =num.value+val;\n");
      out.write("\t\t\t\tbreak;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t\t#sDiv{\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tborder: solid 1px;\n");
      out.write("\t\t\twidth: 300px;\n");
      out.write("\t\t\tborder-radius: 10px;\n");
      out.write("\t\t\tbackground-color: aqua;\n");
      out.write("\t\t}\n");
      out.write("\t\t#t{\n");
      out.write("\t\t\tborder:solid 1px ;\n");
      out.write("\t\t\twidth: 260px;\n");
      out.write("\t\t\tborder-radius: 10px;\n");
      out.write("\t\t\tmargin-top: 10px;\n");
      out.write("\t\t\tmargin-bottom: 10px;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t}\n");
      out.write("\t\tinput[type=button]{\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\twidth: 55px;\n");
      out.write("\t\t\theight: 30px;\n");
      out.write("\t\t\tmargin: 2px;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#equ{\n");
      out.write("\t\t\twidth: 260px;\n");
      out.write("\t\t\tfont - size: 30px;\n");
      out.write("\t\t\tmargin-bottom: 10px;\n");
      out.write("\t\t}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<form action=\"vipdata/vipdataAction_update\" class=\"form-horizontal\" role=\"form\" method=\"post\">\n");
      out.write("<div>\n");
      out.write("\t<ul class=\"nav nav-pills\">\n");
      out.write("\t  <li><a href=\"#\" onclick=\"formSubmit('vipdataAction_list','_self')\"><img alt=\"add\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/back.png\"></a></li>\n");
      out.write("\t  <li><a href=\"#\" onclick=\"formSubmit('vipdataAction_update','_self')\"><img alt=\"modify\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/save.png\"></a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 隐藏域 userid -->\n");
      out.write("<input type=\"hidden\" name=\"vipNo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vipNo }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("<div style=\"margin: 10px\">\n");
      out.write("<div class=\"col-md-6\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("\t\t<label for=\"firstname\" class=\"col-md-2 control-label\">当前积分</label>\n");
      out.write("\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control\" id=\"firstname\" \n");
      out.write("\t\t\t\t   name=\"currentPoint\" placeholder=\"请修改当前积分\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPoint }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t</div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("\t\t<label for=\"firstname\" class=\"col-md-2 control-label\">总积分</label>\n");
      out.write("\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control\" id=\"firstname\" \n");
      out.write("\t\t\t\t   name=\"totalPoint\" placeholder=\"请修改总积分\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalPoint }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t</div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"sDiv\">\n");
      out.write("\t<input type=\"text\" name=\"t\" id=\"t\" value=\"\" /><br/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"1\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"2\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"3\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"4\" onclick=\"calCulate(this.value)\"/><br />\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"5\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"6\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"7\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"8\" onclick=\"calCulate(this.value)\"/><br />\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"9\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"0\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\".\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"C\" onclick=\"calCulate(this.value)\"/><br/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"+\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"-\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"*\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"\" value=\"/\" onclick=\"calCulate(this.value)\"/><br/>\n");
      out.write("\t<input type=\"button\" name=\"\" id=\"equ\" value=\"=\" onclick=\"calCulate(this.value)\"/>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/pages/vipmanage/vipdata/../../base.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /WEB-INF/pages/vipmanage/vipdata/../../base.jsp(4,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /WEB-INF/pages/vipmanage/vipdata/VipdataUpdate.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("ctx");
      // /WEB-INF/pages/vipmanage/vipdata/VipdataUpdate.jsp(3,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
    }
    return false;
  }
}

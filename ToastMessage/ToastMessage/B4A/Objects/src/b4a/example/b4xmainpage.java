package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlabel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mtarget = null;
public int _durationms = 0;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public b4a.example.toastmessage _tmsg = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Tmsg.Initialize(Me, \"Tmsg\", Root)";
__ref._tmsg /*b4a.example.toastmessage*/ ._initialize /*String*/ (null,ba,this,"Tmsg",(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Tmsg.MakeText(\"This event will be called once\", T";
__ref._tmsg /*b4a.example.toastmessage*/ ._maketext /*String*/ (null,"This event will be called once",__ref._tmsg /*b4a.example.toastmessage*/ ._type_error /*int*/ );
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Tmsg.Show(500)";
__ref._tmsg /*b4a.example.toastmessage*/ ._show /*void*/ (null,(int) (500));
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return "";
}
public String  _button2_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button2_click", false))
	 {return ((String) Debug.delegate(ba, "button2_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub Button2_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Tmsg.MakeText(\"Design Toast is a custom Toast Lib";
__ref._tmsg /*b4a.example.toastmessage*/ ._maketext /*String*/ (null,"Design Toast is a custom Toast Library in Android using B4X",__ref._tmsg /*b4a.example.toastmessage*/ ._type_info /*int*/ );
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Tmsg.Show(500)";
__ref._tmsg /*b4a.example.toastmessage*/ ._show /*void*/ (null,(int) (500));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
return "";
}
public String  _button3_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button3_click", false))
	 {return ((String) Debug.delegate(ba, "button3_click", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub Button3_Click";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Tmsg.MakeText(\"This is a SUCCESS Toast\", Tmsg.TYP";
__ref._tmsg /*b4a.example.toastmessage*/ ._maketext /*String*/ (null,"This is a SUCCESS Toast",__ref._tmsg /*b4a.example.toastmessage*/ ._type_success /*int*/ );
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Tmsg.Show(500)";
__ref._tmsg /*b4a.example.toastmessage*/ ._show /*void*/ (null,(int) (500));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="End Sub";
return "";
}
public String  _button4_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button4_click", false))
	 {return ((String) Debug.delegate(ba, "button4_click", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub Button4_Click";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Tmsg.MakeText(\"This is a WARNING Toast\", Tmsg.TYP";
__ref._tmsg /*b4a.example.toastmessage*/ ._maketext /*String*/ (null,"This is a WARNING Toast",__ref._tmsg /*b4a.example.toastmessage*/ ._type_warning /*int*/ );
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Tmsg.Show(500)";
__ref._tmsg /*b4a.example.toastmessage*/ ._show /*void*/ (null,(int) (500));
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private mPanel As B4XView";
_mpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private mLabel As B4XView";
_mlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private mTarget As B4XView";
_mtarget = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Private DurationMs As Int = 3000";
_durationms = (int) (3000);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Private Tmsg As ToastMessage";
_tmsg = new b4a.example.toastmessage();
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
}
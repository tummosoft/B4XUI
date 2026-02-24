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
public b4a.example.roundbutton _roundbutton1 = null;
public b4a.example.roundbutton _roundbutton2 = null;
public b4a.example.bitmapbutton _bitmapbutton2 = null;
public b4a.example.roundbutton _roundbutton3 = null;
public b4a.example.bitmapbutton _bitmapbutton1 = null;
public b4a.example.bitmapbutton _bitmapbutton3 = null;
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
 //BA.debugLineNum = 720900;BA.debugLine="RoundButton1.SetIcon(\"\")";
__ref._roundbutton1 /*b4a.example.roundbutton*/ ._seticon /*String*/ (null,"");
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="RoundButton2.SetFont(Typeface.MATERIALICONS)";
__ref._roundbutton2 /*b4a.example.roundbutton*/ ._setfont /*String*/ (null,(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getMATERIALICONS())));
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="RoundButton2.SetIcon(Chr(0xE145))";
__ref._roundbutton2 /*b4a.example.roundbutton*/ ._seticon /*String*/ (null,BA.ObjectToString(__c.Chr(((int)0xe145))));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="RoundButton2.SetColor(Colors.ARGB(255,40, 69, 214";
__ref._roundbutton2 /*b4a.example.roundbutton*/ ._setcolor /*String*/ (null,__c.Colors.ARGB((int) (255),(int) (40),(int) (69),(int) (214)));
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="RoundButton2.SetTextColor(Colors.White)";
__ref._roundbutton2 /*b4a.example.roundbutton*/ ._settextcolor /*String*/ (null,__c.Colors.White);
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="RoundButton2.SetIconColor(Colors.White)";
__ref._roundbutton2 /*b4a.example.roundbutton*/ ._seticoncolor /*String*/ (null,__c.Colors.White);
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="RoundButton3.SetColor(Colors.ARGB(255,199, 234, 1";
__ref._roundbutton3 /*b4a.example.roundbutton*/ ._setcolor /*String*/ (null,__c.Colors.ARGB((int) (255),(int) (199),(int) (234),(int) (187)));
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="RoundButton3.SetTextColor(Colors.White)";
__ref._roundbutton3 /*b4a.example.roundbutton*/ ._settextcolor /*String*/ (null,__c.Colors.White);
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="RoundButton3.Disabled = True";
__ref._roundbutton3 /*b4a.example.roundbutton*/ ._setdisabled /*boolean*/ (null,__c.True);
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="BitmapButton1.Text = \"Photos\"";
__ref._bitmapbutton1 /*b4a.example.bitmapbutton*/ ._settext(null,"Photos");
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="BitmapButton1.TextSize = 10";
__ref._bitmapbutton1 /*b4a.example.bitmapbutton*/ ._settextsize(null,(int) (10));
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="BitmapButton1.TextColor = Colors.Gray";
__ref._bitmapbutton1 /*b4a.example.bitmapbutton*/ ._settextcolor(null,__c.Colors.Gray);
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="BitmapButton2.SetBitmap(File.DirAssets, \"icons8-p";
__ref._bitmapbutton2 /*b4a.example.bitmapbutton*/ ._setbitmap /*String*/ (null,__c.File.getDirAssets(),"icons8-pdf-48.png");
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="BitmapButton2.BackgroundColor = Colors.ARGB(255,2";
__ref._bitmapbutton2 /*b4a.example.bitmapbutton*/ ._setbackgroundcolor(null,__c.Colors.ARGB((int) (255),(int) (244),(int) (240),(int) (228)));
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="BitmapButton2.Text = \"PDF Files\"";
__ref._bitmapbutton2 /*b4a.example.bitmapbutton*/ ._settext(null,"PDF Files");
RDebugUtils.currentLine=720919;
 //BA.debugLineNum = 720919;BA.debugLine="BitmapButton2.TextSize = 10";
__ref._bitmapbutton2 /*b4a.example.bitmapbutton*/ ._settextsize(null,(int) (10));
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="BitmapButton2.TextColor = Colors.Gray";
__ref._bitmapbutton2 /*b4a.example.bitmapbutton*/ ._settextcolor(null,__c.Colors.Gray);
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="BitmapButton3.SetBitmap(File.DirAssets, \"cloud-se";
__ref._bitmapbutton3 /*b4a.example.bitmapbutton*/ ._setbitmap /*String*/ (null,__c.File.getDirAssets(),"cloud-server.png");
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="BitmapButton3.BackgroundColor = Colors.ARGB(255,2";
__ref._bitmapbutton3 /*b4a.example.bitmapbutton*/ ._setbackgroundcolor(null,__c.Colors.ARGB((int) (255),(int) (240),(int) (117),(int) (174)));
RDebugUtils.currentLine=720924;
 //BA.debugLineNum = 720924;BA.debugLine="BitmapButton3.Text = \"Clouds\"";
__ref._bitmapbutton3 /*b4a.example.bitmapbutton*/ ._settext(null,"Clouds");
RDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="BitmapButton3.TextSize = 10";
__ref._bitmapbutton3 /*b4a.example.bitmapbutton*/ ._settextsize(null,(int) (10));
RDebugUtils.currentLine=720926;
 //BA.debugLineNum = 720926;BA.debugLine="BitmapButton3.TextColor = Colors.Gray";
__ref._bitmapbutton3 /*b4a.example.bitmapbutton*/ ._settextcolor(null,__c.Colors.Gray);
RDebugUtils.currentLine=720927;
 //BA.debugLineNum = 720927;BA.debugLine="End Sub";
return "";
}
public String  _bitmapbutton3_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "bitmapbutton3_click", false))
	 {return ((String) Debug.delegate(ba, "bitmapbutton3_click", null));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub BitmapButton3_Click";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Hello world!"),BA.ObjectToCharSequence("B4X"));
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private RoundButton1 As RoundButton";
_roundbutton1 = new b4a.example.roundbutton();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private RoundButton2 As RoundButton";
_roundbutton2 = new b4a.example.roundbutton();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private BitmapButton2 As BitmapButton";
_bitmapbutton2 = new b4a.example.bitmapbutton();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private RoundButton3 As RoundButton";
_roundbutton3 = new b4a.example.roundbutton();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Private BitmapButton1 As BitmapButton";
_bitmapbutton1 = new b4a.example.bitmapbutton();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Private BitmapButton3 As BitmapButton";
_bitmapbutton3 = new b4a.example.bitmapbutton();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="End Sub";
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
public String  _roundbutton2_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "roundbutton2_click", false))
	 {return ((String) Debug.delegate(ba, "roundbutton2_click", null));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub RoundButton2_Click";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Hello world!"),BA.ObjectToCharSequence("B4X"));
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="End Sub";
return "";
}
}
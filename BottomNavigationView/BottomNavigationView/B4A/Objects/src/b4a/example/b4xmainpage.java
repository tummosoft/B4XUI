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
public b4a.example.bottomnavigationview _bottomnavigationview1 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
b4a.example.bottomnavigationview._clsnavibutton[] _nvbutton = null;
int _basewidth = 0;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim nvButton(5) As clsNaviButton";
_nvbutton = new b4a.example.bottomnavigationview._clsnavibutton[(int) (5)];
{
int d0 = _nvbutton.length;
for (int i0 = 0;i0 < d0;i0++) {
_nvbutton[i0] = new b4a.example.bottomnavigationview._clsnavibutton();
}
}
;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Dim baseWidth As Int = 100%x / nvButton.Length";
_basewidth = (int) (__c.PerXToCurrent((float) (100),ba)/(double)_nvbutton.length /*int*/ );
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="nvButton(0).Initialize";
_nvbutton[(int) (0)].Initialize();
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="nvButton(0).Icon = Chr(0xF015)";
_nvbutton[(int) (0)].Icon /*String*/  = BA.ObjectToString(__c.Chr(((int)0xf015)));
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="nvButton(0).Font = Typeface.FONTAWESOME";
_nvbutton[(int) (0)].Font /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME()));
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="nvButton(0).Text = \"Home\"";
_nvbutton[(int) (0)].Text /*String*/  = "Home";
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="BottomNavigationView1.AddButton(nvButton(0))";
__ref._bottomnavigationview1 /*b4a.example.bottomnavigationview*/ ._addbutton /*String*/ (null,_nvbutton[(int) (0)]);
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="nvButton(1).Initialize";
_nvbutton[(int) (1)].Initialize();
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="nvButton(1).Icon =Chr(0xF073)";
_nvbutton[(int) (1)].Icon /*String*/  = BA.ObjectToString(__c.Chr(((int)0xf073)));
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="nvButton(1).Font = Typeface.FONTAWESOME";
_nvbutton[(int) (1)].Font /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME()));
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="nvButton(1).Text =\"Calendar\"";
_nvbutton[(int) (1)].Text /*String*/  = "Calendar";
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="BottomNavigationView1.AddButton(nvButton(1))";
__ref._bottomnavigationview1 /*b4a.example.bottomnavigationview*/ ._addbutton /*String*/ (null,_nvbutton[(int) (1)]);
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="nvButton(2).Initialize";
_nvbutton[(int) (2)].Initialize();
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="nvButton(2).Font = Typeface.FONTAWESOME";
_nvbutton[(int) (2)].Font /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME()));
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="nvButton(2).Icon = Chr(0xF02B)";
_nvbutton[(int) (2)].Icon /*String*/  = BA.ObjectToString(__c.Chr(((int)0xf02b)));
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="nvButton(2).Text =\"Category\"";
_nvbutton[(int) (2)].Text /*String*/  = "Category";
RDebugUtils.currentLine=720919;
 //BA.debugLineNum = 720919;BA.debugLine="BottomNavigationView1.AddButton(nvButton(2))";
__ref._bottomnavigationview1 /*b4a.example.bottomnavigationview*/ ._addbutton /*String*/ (null,_nvbutton[(int) (2)]);
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="nvButton(3).Initialize";
_nvbutton[(int) (3)].Initialize();
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="nvButton(3).Font = Typeface.MATERIALICONS";
_nvbutton[(int) (3)].Font /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getMATERIALICONS()));
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="nvButton(3).Icon = Chr(0xE0C8)";
_nvbutton[(int) (3)].Icon /*String*/  = BA.ObjectToString(__c.Chr(((int)0xe0c8)));
RDebugUtils.currentLine=720924;
 //BA.debugLineNum = 720924;BA.debugLine="nvButton(3).Text =\"Location\"";
_nvbutton[(int) (3)].Text /*String*/  = "Location";
RDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="BottomNavigationView1.AddButton(nvButton(3))";
__ref._bottomnavigationview1 /*b4a.example.bottomnavigationview*/ ._addbutton /*String*/ (null,_nvbutton[(int) (3)]);
RDebugUtils.currentLine=720927;
 //BA.debugLineNum = 720927;BA.debugLine="nvButton(4).Initialize";
_nvbutton[(int) (4)].Initialize();
RDebugUtils.currentLine=720928;
 //BA.debugLineNum = 720928;BA.debugLine="nvButton(4).Font = Typeface.MATERIALICONS";
_nvbutton[(int) (4)].Font /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getMATERIALICONS()));
RDebugUtils.currentLine=720929;
 //BA.debugLineNum = 720929;BA.debugLine="nvButton(4).Icon =Chr(0xE7F4)";
_nvbutton[(int) (4)].Icon /*String*/  = BA.ObjectToString(__c.Chr(((int)0xe7f4)));
RDebugUtils.currentLine=720930;
 //BA.debugLineNum = 720930;BA.debugLine="nvButton(4).Text =\"Notification\"";
_nvbutton[(int) (4)].Text /*String*/  = "Notification";
RDebugUtils.currentLine=720931;
 //BA.debugLineNum = 720931;BA.debugLine="nvButton(4).Badge = \"5\"";
_nvbutton[(int) (4)].Badge /*String*/  = "5";
RDebugUtils.currentLine=720933;
 //BA.debugLineNum = 720933;BA.debugLine="BottomNavigationView1.AddButton(nvButton(4))";
__ref._bottomnavigationview1 /*b4a.example.bottomnavigationview*/ ._addbutton /*String*/ (null,_nvbutton[(int) (4)]);
RDebugUtils.currentLine=720935;
 //BA.debugLineNum = 720935;BA.debugLine="BottomNavigationView1.Build";
__ref._bottomnavigationview1 /*b4a.example.bottomnavigationview*/ ._build /*String*/ (null);
RDebugUtils.currentLine=720937;
 //BA.debugLineNum = 720937;BA.debugLine="BottomNavigationView1.Acticve(1, True)";
__ref._bottomnavigationview1 /*b4a.example.bottomnavigationview*/ ._acticve /*String*/ (null,(int) (1),__c.True);
RDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="End Sub";
return "";
}
public String  _bottomnavigationview1_itemclick(b4a.example.b4xmainpage __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "bottomnavigationview1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "bottomnavigationview1_itemclick", new Object[] {_position}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub BottomNavigationView1_ItemClick(position As In";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Log(\"position=\" & position)";
__c.LogImpl("2851969","position="+BA.NumberToString(_position),0);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="BottomNavigationView1.Acticve(position, True)";
__ref._bottomnavigationview1 /*b4a.example.bottomnavigationview*/ ._acticve /*String*/ (null,_position,__c.True);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 589827;BA.debugLine="Private BottomNavigationView1 As BottomNavigation";
_bottomnavigationview1 = new b4a.example.bottomnavigationview();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="End Sub";
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
public String  _nvbutton_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "nvbutton_click", false))
	 {return ((String) Debug.delegate(ba, "nvbutton_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub nvButton_Click";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
}
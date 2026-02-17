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
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public b4a.example.calendarview _calendarview1 = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bairplane = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmeeting = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bteam = null;
int _color1 = 0;
int _color2 = 0;
int _color3 = 0;
int _color4 = 0;
int _color5 = 0;
int _color6 = 0;
int _color7 = 0;
int _color8 = 0;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Dim bAirplane As B4XBitmap=LoadBitmapResize(File.";
_bairplane = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bairplane = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"airplane.png",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),__c.True).getObject()));
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Dim bMeeting As B4XBitmap=LoadBitmapResize(File.D";
_bmeeting = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmeeting = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"hangouts-meet.png",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),__c.True).getObject()));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="Dim bTeam As B4XBitmap=LoadBitmapResize(File.DirA";
_bteam = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bteam = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"team.png",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),__c.True).getObject()));
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="Log(DateTime.Now)";
__c.LogImpl("0720909",BA.NumberToString(__c.DateTime.getNow()),0);
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="Dim color1 As Int = Colors.ARGB(255,91, 35, 255)";
_color1 = __c.Colors.ARGB((int) (255),(int) (91),(int) (35),(int) (255));
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="Dim color2 As Int = Colors.ARGB(255,0, 139, 255)";
_color2 = __c.Colors.ARGB((int) (255),(int) (0),(int) (139),(int) (255));
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="Dim color3 As Int = Colors.ARGB(255,228, 255, 48)";
_color3 = __c.Colors.ARGB((int) (255),(int) (228),(int) (255),(int) (48));
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="Dim color4 As Int = Colors.ARGB(255,54, 47, 79)";
_color4 = __c.Colors.ARGB((int) (255),(int) (54),(int) (47),(int) (79));
RDebugUtils.currentLine=720919;
 //BA.debugLineNum = 720919;BA.debugLine="Dim color5 As Int = Colors.ARGB(255, 246, 48, 73)";
_color5 = __c.Colors.ARGB((int) (255),(int) (246),(int) (48),(int) (73));
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="Dim color6 As Int = Colors.ARGB(255,251, 239, 118";
_color6 = __c.Colors.ARGB((int) (255),(int) (251),(int) (239),(int) (118));
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="Dim color7 As Int = Colors.ARGB(255, 254, 194, 13";
_color7 = __c.Colors.ARGB((int) (255),(int) (254),(int) (194),(int) (136));
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="Dim color8 As Int = Colors.ARGB(255, 250, 92, 92)";
_color8 = __c.Colors.ARGB((int) (255),(int) (250),(int) (92),(int) (92));
RDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="CalendarView1.AddBitmap(DateTime.Now, bAirplane)";
__ref._calendarview1 /*b4a.example.calendarview*/ ._addbitmap /*String*/ (null,__c.DateTime.getNow(),(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_bairplane.getObject())));
RDebugUtils.currentLine=720926;
 //BA.debugLineNum = 720926;BA.debugLine="CalendarView1.AddBitmap(DateTime.DateParse(\"4/13/";
__ref._calendarview1 /*b4a.example.calendarview*/ ._addbitmap /*String*/ (null,__c.DateTime.DateParse("4/13/2026"),(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_bmeeting.getObject())));
RDebugUtils.currentLine=720927;
 //BA.debugLineNum = 720927;BA.debugLine="CalendarView1.AddBitmap(DateTime.DateParse(\"4/24/";
__ref._calendarview1 /*b4a.example.calendarview*/ ._addbitmap /*String*/ (null,__c.DateTime.DateParse("4/24/2026"),(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_bteam.getObject())));
RDebugUtils.currentLine=720929;
 //BA.debugLineNum = 720929;BA.debugLine="CalendarView1.DrawCalendar(DateTime.DateParse(\"4/";
__ref._calendarview1 /*b4a.example.calendarview*/ ._drawcalendar /*String*/ (null,__c.DateTime.DateParse("4/1/2026"));
RDebugUtils.currentLine=720932;
 //BA.debugLineNum = 720932;BA.debugLine="CalendarView1.AddEvent(color1, \"Add event\", DateT";
__ref._calendarview1 /*b4a.example.calendarview*/ ._addevent /*String*/ (null,_color1,"Add event",__c.DateTime.DateParse("4/21/2026"));
RDebugUtils.currentLine=720933;
 //BA.debugLineNum = 720933;BA.debugLine="CalendarView1.AddEvent(color2, \"Add event\", DateT";
__ref._calendarview1 /*b4a.example.calendarview*/ ._addevent /*String*/ (null,_color2,"Add event",__c.DateTime.DateParse("4/21/2026"));
RDebugUtils.currentLine=720934;
 //BA.debugLineNum = 720934;BA.debugLine="CalendarView1.AddEvent(color3, \"Add event\", DateT";
__ref._calendarview1 /*b4a.example.calendarview*/ ._addevent /*String*/ (null,_color3,"Add event",__c.DateTime.DateParse("4/21/2026"));
RDebugUtils.currentLine=720936;
 //BA.debugLineNum = 720936;BA.debugLine="CalendarView1.AddEvent(color5, \"Add event\", DateT";
__ref._calendarview1 /*b4a.example.calendarview*/ ._addevent /*String*/ (null,_color5,"Add event",__c.DateTime.DateParse("4/15/2026"));
RDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="CalendarView1.AddEvent(color6, \"Add event\", DateT";
__ref._calendarview1 /*b4a.example.calendarview*/ ._addevent /*String*/ (null,_color6,"Add event",__c.DateTime.DateParse("4/4/2026"));
RDebugUtils.currentLine=720939;
 //BA.debugLineNum = 720939;BA.debugLine="CalendarView1.AddEvent(color7, \"Add event\", DateT";
__ref._calendarview1 /*b4a.example.calendarview*/ ._addevent /*String*/ (null,_color7,"Add event",__c.DateTime.DateParse("4/4/2026"));
RDebugUtils.currentLine=720941;
 //BA.debugLineNum = 720941;BA.debugLine="End Sub";
return "";
}
public String  _calendarview1_itemclick(b4a.example.b4xmainpage __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "calendarview1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "calendarview1_itemclick", new Object[] {_date}));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Sub CalendarView1_ItemClick(date As Long)";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Log(\"--------------\")";
__c.LogImpl("015794177","--------------",0);
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="Log(date)";
__c.LogImpl("015794178",BA.NumberToString(_date),0);
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Private CalendarView1 As CalendarView";
_calendarview1 = new b4a.example.calendarview();
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
}
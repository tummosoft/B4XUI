package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _bairplane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _bmeeting = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _bteam = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _color1 = RemoteObject.createImmutable(0);
RemoteObject _color2 = RemoteObject.createImmutable(0);
RemoteObject _color3 = RemoteObject.createImmutable(0);
RemoteObject _color4 = RemoteObject.createImmutable(0);
RemoteObject _color5 = RemoteObject.createImmutable(0);
RemoteObject _color6 = RemoteObject.createImmutable(0);
RemoteObject _color7 = RemoteObject.createImmutable(0);
RemoteObject _color8 = RemoteObject.createImmutable(0);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Root = Root1";
Debug.ShouldStop(16777216);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="Dim bAirplane As B4XBitmap=LoadBitmapResize(File.";
Debug.ShouldStop(1);
_bairplane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bairplane = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), b4xmainpage.__c.runMethod(false,"LoadBitmapResize",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("airplane.png")),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.getField(true,"True"))).getObject());Debug.locals.put("bAirplane", _bairplane);Debug.locals.put("bAirplane", _bairplane);
 BA.debugLineNum = 34;BA.debugLine="Dim bMeeting As B4XBitmap=LoadBitmapResize(File.D";
Debug.ShouldStop(2);
_bmeeting = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmeeting = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), b4xmainpage.__c.runMethod(false,"LoadBitmapResize",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("hangouts-meet.png")),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.getField(true,"True"))).getObject());Debug.locals.put("bMeeting", _bmeeting);Debug.locals.put("bMeeting", _bmeeting);
 BA.debugLineNum = 35;BA.debugLine="Dim bTeam As B4XBitmap=LoadBitmapResize(File.DirA";
Debug.ShouldStop(4);
_bteam = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bteam = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), b4xmainpage.__c.runMethod(false,"LoadBitmapResize",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("team.png")),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.getField(true,"True"))).getObject());Debug.locals.put("bTeam", _bteam);Debug.locals.put("bTeam", _bteam);
 BA.debugLineNum = 37;BA.debugLine="Log(DateTime.Now)";
Debug.ShouldStop(16);
b4xmainpage.__c.runVoidMethod ("LogImpl","0720909",BA.NumberToString(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow")),0);
 BA.debugLineNum = 43;BA.debugLine="Dim color1 As Int = Colors.ARGB(255,91, 35, 255)";
Debug.ShouldStop(1024);
_color1 = b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 91)),(Object)(BA.numberCast(int.class, 35)),(Object)(BA.numberCast(int.class, 255)));Debug.locals.put("color1", _color1);Debug.locals.put("color1", _color1);
 BA.debugLineNum = 44;BA.debugLine="Dim color2 As Int = Colors.ARGB(255,0, 139, 255)";
Debug.ShouldStop(2048);
_color2 = b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 139)),(Object)(BA.numberCast(int.class, 255)));Debug.locals.put("color2", _color2);Debug.locals.put("color2", _color2);
 BA.debugLineNum = 45;BA.debugLine="Dim color3 As Int = Colors.ARGB(255,228, 255, 48)";
Debug.ShouldStop(4096);
_color3 = b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 228)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 48)));Debug.locals.put("color3", _color3);Debug.locals.put("color3", _color3);
 BA.debugLineNum = 46;BA.debugLine="Dim color4 As Int = Colors.ARGB(255,54, 47, 79)";
Debug.ShouldStop(8192);
_color4 = b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 54)),(Object)(BA.numberCast(int.class, 47)),(Object)(BA.numberCast(int.class, 79)));Debug.locals.put("color4", _color4);Debug.locals.put("color4", _color4);
 BA.debugLineNum = 47;BA.debugLine="Dim color5 As Int = Colors.ARGB(255, 246, 48, 73)";
Debug.ShouldStop(16384);
_color5 = b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 246)),(Object)(BA.numberCast(int.class, 48)),(Object)(BA.numberCast(int.class, 73)));Debug.locals.put("color5", _color5);Debug.locals.put("color5", _color5);
 BA.debugLineNum = 49;BA.debugLine="Dim color6 As Int = Colors.ARGB(255,251, 239, 118";
Debug.ShouldStop(65536);
_color6 = b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 251)),(Object)(BA.numberCast(int.class, 239)),(Object)(BA.numberCast(int.class, 118)));Debug.locals.put("color6", _color6);Debug.locals.put("color6", _color6);
 BA.debugLineNum = 50;BA.debugLine="Dim color7 As Int = Colors.ARGB(255, 254, 194, 13";
Debug.ShouldStop(131072);
_color7 = b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 254)),(Object)(BA.numberCast(int.class, 194)),(Object)(BA.numberCast(int.class, 136)));Debug.locals.put("color7", _color7);Debug.locals.put("color7", _color7);
 BA.debugLineNum = 51;BA.debugLine="Dim color8 As Int = Colors.ARGB(255, 250, 92, 92)";
Debug.ShouldStop(262144);
_color8 = b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 92)),(Object)(BA.numberCast(int.class, 92)));Debug.locals.put("color8", _color8);Debug.locals.put("color8", _color8);
 BA.debugLineNum = 53;BA.debugLine="CalendarView1.AddBitmap(DateTime.Now, bAirplane)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_addbitmap" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _bairplane.getObject()));
 BA.debugLineNum = 54;BA.debugLine="CalendarView1.AddBitmap(DateTime.DateParse(\"4/13/";
Debug.ShouldStop(2097152);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_addbitmap" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("4/13/2026")))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _bmeeting.getObject()));
 BA.debugLineNum = 55;BA.debugLine="CalendarView1.AddBitmap(DateTime.DateParse(\"4/24/";
Debug.ShouldStop(4194304);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_addbitmap" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("4/24/2026")))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _bteam.getObject()));
 BA.debugLineNum = 57;BA.debugLine="CalendarView1.DrawCalendar(DateTime.DateParse(\"4/";
Debug.ShouldStop(16777216);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_drawcalendar" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("4/1/2026")))));
 BA.debugLineNum = 60;BA.debugLine="CalendarView1.AddEvent(color1, \"Add event\", DateT";
Debug.ShouldStop(134217728);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_addevent" /*RemoteObject*/ ,(Object)(_color1),(Object)(BA.ObjectToString("Add event")),(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("4/21/2026")))));
 BA.debugLineNum = 61;BA.debugLine="CalendarView1.AddEvent(color2, \"Add event\", DateT";
Debug.ShouldStop(268435456);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_addevent" /*RemoteObject*/ ,(Object)(_color2),(Object)(BA.ObjectToString("Add event")),(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("4/21/2026")))));
 BA.debugLineNum = 62;BA.debugLine="CalendarView1.AddEvent(color3, \"Add event\", DateT";
Debug.ShouldStop(536870912);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_addevent" /*RemoteObject*/ ,(Object)(_color3),(Object)(BA.ObjectToString("Add event")),(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("4/21/2026")))));
 BA.debugLineNum = 64;BA.debugLine="CalendarView1.AddEvent(color5, \"Add event\", DateT";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_addevent" /*RemoteObject*/ ,(Object)(_color5),(Object)(BA.ObjectToString("Add event")),(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("4/15/2026")))));
 BA.debugLineNum = 66;BA.debugLine="CalendarView1.AddEvent(color6, \"Add event\", DateT";
Debug.ShouldStop(2);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_addevent" /*RemoteObject*/ ,(Object)(_color6),(Object)(BA.ObjectToString("Add event")),(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("4/4/2026")))));
 BA.debugLineNum = 67;BA.debugLine="CalendarView1.AddEvent(color7, \"Add event\", DateT";
Debug.ShouldStop(4);
__ref.getField(false,"_calendarview1" /*RemoteObject*/ ).runClassMethod (b4a.example.calendarview.class, "_addevent" /*RemoteObject*/ ,(Object)(_color7),(Object)(BA.ObjectToString("Add event")),(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("4/4/2026")))));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calendarview1_itemclick(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("CalendarView1_ItemClick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("calendarview1_itemclick")) { return __ref.runUserSub(false, "b4xmainpage","calendarview1_itemclick", __ref, _date);}
Debug.locals.put("date", _date);
 BA.debugLineNum = 71;BA.debugLine="Sub CalendarView1_ItemClick(date As Long)";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Log(\"--------------\")";
Debug.ShouldStop(128);
b4xmainpage.__c.runVoidMethod ("LogImpl","015794177",RemoteObject.createImmutable("--------------"),0);
 BA.debugLineNum = 73;BA.debugLine="Log(date)";
Debug.ShouldStop(256);
b4xmainpage.__c.runVoidMethod ("LogImpl","015794178",BA.NumberToString(_date),0);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 13;BA.debugLine="Private Button1 As Button";
b4xmainpage._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1",b4xmainpage._button1);
 //BA.debugLineNum = 16;BA.debugLine="Private CalendarView1 As CalendarView";
b4xmainpage._calendarview1 = RemoteObject.createNew ("b4a.example.calendarview");__ref.setField("_calendarview1",b4xmainpage._calendarview1);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
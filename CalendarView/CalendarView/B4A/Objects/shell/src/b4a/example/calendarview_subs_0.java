package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class calendarview_subs_0 {


public static RemoteObject  _addbitmap(RemoteObject __ref,RemoteObject _date,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("AddBitmap (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("addbitmap")) { return __ref.runUserSub(false, "calendarview","addbitmap", __ref, _date, _image);}
Debug.locals.put("date", _date);
Debug.locals.put("image", _image);
 BA.debugLineNum = 73;BA.debugLine="Public Sub AddBitmap(date As Long, image As Bitmap";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="lstBitmap.Put(date, image)";
Debug.ShouldStop(512);
__ref.getField(false,"_lstbitmap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_date)),(Object)((_image.getObject())));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addevent(RemoteObject __ref,RemoteObject _color,RemoteObject _content,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AddEvent (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("addevent")) { return __ref.runUserSub(false, "calendarview","addevent", __ref, _color, _content, _date);}
int _i = 0;
RemoteObject _ldt = RemoteObject.createImmutable(0L);
RemoteObject _m1 = RemoteObject.createImmutable(0);
RemoteObject _m2 = RemoteObject.createImmutable(0);
Debug.locals.put("color", _color);
Debug.locals.put("content", _content);
Debug.locals.put("date", _date);
 BA.debugLineNum = 217;BA.debugLine="Public Sub AddEvent(color As Int, content As Strin";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="For i=0 To lblDay.Length - 1";
Debug.ShouldStop(33554432);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblday" /*RemoteObject*/ ).getField(true,"length" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 219;BA.debugLine="Dim ldt As Long = lblDay(i).Date";
Debug.ShouldStop(67108864);
_ldt = __ref.getField(false,"_lblday" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.calendarbox.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("ldt", _ldt);Debug.locals.put("ldt", _ldt);
 BA.debugLineNum = 220;BA.debugLine="Dim m1 As Int = DateTime.GetDayOfMonth(ldt)";
Debug.ShouldStop(134217728);
_m1 = calendarview.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_ldt));Debug.locals.put("m1", _m1);Debug.locals.put("m1", _m1);
 BA.debugLineNum = 221;BA.debugLine="Dim m2 As Int = DateTime.GetDayOfMonth(date)";
Debug.ShouldStop(268435456);
_m2 = calendarview.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_date));Debug.locals.put("m2", _m2);Debug.locals.put("m2", _m2);
 BA.debugLineNum = 222;BA.debugLine="If m1 = m2 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_m1,BA.numberCast(double.class, _m2))) { 
 BA.debugLineNum = 223;BA.debugLine="lblDay(i).AddEvent(color, content, date)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblday" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.calendarbox.class, "_addevent" /*RemoteObject*/ ,(Object)(_color),(Object)(_content),(Object)(_date));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "calendarview","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 68;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "calendarview","button1_click", __ref);}
RemoteObject _event_time = RemoteObject.createImmutable(0L);
RemoteObject _color = RemoteObject.createImmutable(0);
 BA.debugLineNum = 210;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Dim event_time As Long = DateTime.DateParse(\"2/4/";
Debug.ShouldStop(262144);
_event_time = calendarview.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("2/4/2026")));Debug.locals.put("event_time", _event_time);Debug.locals.put("event_time", _event_time);
 BA.debugLineNum = 212;BA.debugLine="Dim color As Int = Colors.ARGB(255,91, 35, 255)";
Debug.ShouldStop(524288);
_color = calendarview.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 91)),(Object)(BA.numberCast(int.class, 35)),(Object)(BA.numberCast(int.class, 255)));Debug.locals.put("color", _color);Debug.locals.put("color", _color);
 BA.debugLineNum = 214;BA.debugLine="AddEvent(color, \"Add event\", event_time)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.calendarview.class, "_addevent" /*RemoteObject*/ ,(Object)(_color),(Object)(BA.ObjectToString("Add event")),(Object)(_event_time));
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
calendarview._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",calendarview._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
calendarview._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",calendarview._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As Panel";
calendarview._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",calendarview._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
calendarview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",calendarview._xui);
 //BA.debugLineNum = 10;BA.debugLine="Public Tag As Object";
calendarview._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",calendarview._tag);
 //BA.debugLineNum = 12;BA.debugLine="Private pnlDays As Panel";
calendarview._pnldays = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnldays",calendarview._pnldays);
 //BA.debugLineNum = 13;BA.debugLine="Private pnlWeek As Panel";
calendarview._pnlweek = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlweek",calendarview._pnlweek);
 //BA.debugLineNum = 14;BA.debugLine="Private lblMonth As Label";
calendarview._lblmonth = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmonth",calendarview._lblmonth);
 //BA.debugLineNum = 15;BA.debugLine="Private pnlMonth As Panel";
calendarview._pnlmonth = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlmonth",calendarview._pnlmonth);
 //BA.debugLineNum = 16;BA.debugLine="Private lblDay(45) As CalendarBox";
calendarview._lblday = RemoteObject.createNewArray ("b4a.example.calendarbox", new int[] {45}, new Object[]{});__ref.setField("_lblday",calendarview._lblday);
 //BA.debugLineNum = 17;BA.debugLine="Private fDay As Int";
calendarview._fday = RemoteObject.createImmutable(0);__ref.setField("_fday",calendarview._fday);
 //BA.debugLineNum = 18;BA.debugLine="Private maxDay As Int";
calendarview._maxday = RemoteObject.createImmutable(0);__ref.setField("_maxday",calendarview._maxday);
 //BA.debugLineNum = 19;BA.debugLine="Private currentYear As Int";
calendarview._currentyear = RemoteObject.createImmutable(0);__ref.setField("_currentyear",calendarview._currentyear);
 //BA.debugLineNum = 20;BA.debugLine="Private currentMonth As Int";
calendarview._currentmonth = RemoteObject.createImmutable(0);__ref.setField("_currentmonth",calendarview._currentmonth);
 //BA.debugLineNum = 21;BA.debugLine="Private currentDay As Int";
calendarview._currentday = RemoteObject.createImmutable(0);__ref.setField("_currentday",calendarview._currentday);
 //BA.debugLineNum = 23;BA.debugLine="Private valueLong As Long";
calendarview._valuelong = RemoteObject.createImmutable(0L);__ref.setField("_valuelong",calendarview._valuelong);
 //BA.debugLineNum = 24;BA.debugLine="Private valueString As String";
calendarview._valuestring = RemoteObject.createImmutable("");__ref.setField("_valuestring",calendarview._valuestring);
 //BA.debugLineNum = 25;BA.debugLine="Private pnlBackground As Panel";
calendarview._pnlbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlbackground",calendarview._pnlbackground);
 //BA.debugLineNum = 27;BA.debugLine="Private color1 As Int = Colors.ARGB(255, 151, 94,";
calendarview._color1 = calendarview.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 94)),(Object)(BA.numberCast(int.class, 236)));__ref.setField("_color1",calendarview._color1);
 //BA.debugLineNum = 28;BA.debugLine="Private color2 As Int = Colors.ARGB(255, 242, 224";
calendarview._color2 = calendarview.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 242)),(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 253)));__ref.setField("_color2",calendarview._color2);
 //BA.debugLineNum = 29;BA.debugLine="Private lstBitmap As Map";
calendarview._lstbitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_lstbitmap",calendarview._lstbitmap);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "calendarview","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _clr = RemoteObject.createImmutable(0);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 43;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="mBase = Base";
Debug.ShouldStop(2048);
__ref.setField ("_mbase" /*RemoteObject*/ ,_base);
 BA.debugLineNum = 45;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(4096);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 46;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(8192);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 47;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.Ge";
Debug.ShouldStop(16384);
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 49;BA.debugLine="lblMonth.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 50;BA.debugLine="mBase.AddView(lblMonth, 0, 0, mBase.Width, 30dip)";
Debug.ShouldStop(131072);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 51;BA.debugLine="lblMonth.Color = Colors.Red";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).runVoidMethod ("setColor",calendarview.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 52;BA.debugLine="lblMonth.Text = \"April 2026\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("April 2026"));
 BA.debugLineNum = 53;BA.debugLine="lblMonth.Color = Colors.ARGB(255, 0, 27, 183)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).runVoidMethod ("setColor",calendarview.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 27)),(Object)(BA.numberCast(int.class, 183))));
 BA.debugLineNum = 54;BA.debugLine="lblMonth.TextColor = Colors.White";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setTextColor",calendarview.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 55;BA.debugLine="lblMonth.Gravity = Gravity.CENTER";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setGravity",calendarview.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 57;BA.debugLine="pnlWeek.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlweek" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 58;BA.debugLine="mBase.AddView(pnlWeek, 0, 30dip, mBase.Width, 30d";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlweek" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 59;BA.debugLine="pnlWeek.Color = Colors.ARGB(255, 245, 241, 220)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlweek" /*RemoteObject*/ ).runVoidMethod ("setColor",calendarview.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 245)),(Object)(BA.numberCast(int.class, 241)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 61;BA.debugLine="pnlDays.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnldays" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 62;BA.debugLine="mBase.AddView(pnlDays, 0, 70dip, mBase.Width, 260";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnldays" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 260)))));
 BA.debugLineNum = 63;BA.debugLine="pnlDays.Color = Colors.White";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnldays" /*RemoteObject*/ ).runVoidMethod ("setColor",calendarview.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 65;BA.debugLine="DrawCalendar(DateTime.Now)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.calendarview.class, "_drawcalendar" /*RemoteObject*/ ,(Object)(calendarview.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawcalendar(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("DrawCalendar (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("drawcalendar")) { return __ref.runUserSub(false, "calendarview","drawcalendar", __ref, _date);}
RemoteObject _widthofdaybox = RemoteObject.createImmutable(0);
RemoteObject _positiony = RemoteObject.createImmutable(0);
RemoteObject _positionx = RemoteObject.createImmutable(0);
RemoteObject _lblweek = null;
RemoteObject _weekname = null;
RemoteObject _nameofmonths = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cmonth = RemoteObject.createImmutable(0);
RemoteObject _cday = RemoteObject.createImmutable(0);
RemoteObject _cyear = RemoteObject.createImmutable(0);
RemoteObject _firstmonth = RemoteObject.createImmutable("");
RemoteObject _fmonth = RemoteObject.createImmutable(0L);
RemoteObject _countday = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _ldate = RemoteObject.createImmutable(0L);
Debug.locals.put("date", _date);
 BA.debugLineNum = 102;BA.debugLine="Public Sub DrawCalendar(date As Long)";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="Dim widthOfDayBox As Int = (mBase.Width / 7)";
Debug.ShouldStop(128);
_widthofdaybox = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0)));Debug.locals.put("widthOfDayBox", _widthofdaybox);Debug.locals.put("widthOfDayBox", _widthofdaybox);
 BA.debugLineNum = 105;BA.debugLine="Dim positionY As Int = 0dip";
Debug.ShouldStop(256);
_positiony = calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("positionY", _positiony);Debug.locals.put("positionY", _positiony);
 BA.debugLineNum = 106;BA.debugLine="Dim positionX As Int = 0dip";
Debug.ShouldStop(512);
_positionx = calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("positionX", _positionx);Debug.locals.put("positionX", _positionx);
 BA.debugLineNum = 108;BA.debugLine="Dim lblWeek(7) As Label";
Debug.ShouldStop(2048);
_lblweek = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {7}, new Object[]{});Debug.locals.put("lblWeek", _lblweek);
 BA.debugLineNum = 109;BA.debugLine="Dim weekName(7) As String = Array As String(\"Su\",";
Debug.ShouldStop(4096);
_weekname = RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("Su"),BA.ObjectToString("Mo"),BA.ObjectToString("Tu"),BA.ObjectToString("We"),BA.ObjectToString("Th"),BA.ObjectToString("Fr"),RemoteObject.createImmutable("Sa")});Debug.locals.put("weekName", _weekname);Debug.locals.put("weekName", _weekname);
 BA.debugLineNum = 110;BA.debugLine="Dim nameOfMonths As Map";
Debug.ShouldStop(8192);
_nameofmonths = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("nameOfMonths", _nameofmonths);
 BA.debugLineNum = 111;BA.debugLine="nameOfMonths.Initialize";
Debug.ShouldStop(16384);
_nameofmonths.runVoidMethod ("Initialize");
 BA.debugLineNum = 113;BA.debugLine="currentYear = DateTime.GetYear(date)";
Debug.ShouldStop(65536);
__ref.setField ("_currentyear" /*RemoteObject*/ ,calendarview.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date)));
 BA.debugLineNum = 114;BA.debugLine="currentDay = 1";
Debug.ShouldStop(131072);
__ref.setField ("_currentday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 115;BA.debugLine="currentMonth = 1";
Debug.ShouldStop(262144);
__ref.setField ("_currentmonth" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 117;BA.debugLine="nameOfMonths.Put(\"January\", 31)";
Debug.ShouldStop(1048576);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("January"))),(Object)(RemoteObject.createImmutable((31))));
 BA.debugLineNum = 118;BA.debugLine="If isLeapYear(currentYear) Then";
Debug.ShouldStop(2097152);
if (__ref.runClassMethod (b4a.example.calendarview.class, "_isleapyear" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentyear" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 119;BA.debugLine="nameOfMonths.Put(\"February\", 29)";
Debug.ShouldStop(4194304);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("February"))),(Object)(RemoteObject.createImmutable((29))));
 }else {
 BA.debugLineNum = 121;BA.debugLine="nameOfMonths.Put(\"February\", 28)";
Debug.ShouldStop(16777216);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("February"))),(Object)(RemoteObject.createImmutable((28))));
 };
 BA.debugLineNum = 124;BA.debugLine="nameOfMonths.Put(\"March\", 31)";
Debug.ShouldStop(134217728);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("March"))),(Object)(RemoteObject.createImmutable((31))));
 BA.debugLineNum = 125;BA.debugLine="nameOfMonths.Put(\"April\", 30)";
Debug.ShouldStop(268435456);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("April"))),(Object)(RemoteObject.createImmutable((30))));
 BA.debugLineNum = 126;BA.debugLine="nameOfMonths.Put(\"May\", 31)";
Debug.ShouldStop(536870912);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("May"))),(Object)(RemoteObject.createImmutable((31))));
 BA.debugLineNum = 127;BA.debugLine="nameOfMonths.Put(\"June\", 30)";
Debug.ShouldStop(1073741824);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("June"))),(Object)(RemoteObject.createImmutable((30))));
 BA.debugLineNum = 128;BA.debugLine="nameOfMonths.Put(\"July\", 31)";
Debug.ShouldStop(-2147483648);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("July"))),(Object)(RemoteObject.createImmutable((31))));
 BA.debugLineNum = 129;BA.debugLine="nameOfMonths.Put(\"August\", 31)";
Debug.ShouldStop(1);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("August"))),(Object)(RemoteObject.createImmutable((31))));
 BA.debugLineNum = 130;BA.debugLine="nameOfMonths.Put(\"September\", 30)";
Debug.ShouldStop(2);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("September"))),(Object)(RemoteObject.createImmutable((30))));
 BA.debugLineNum = 131;BA.debugLine="nameOfMonths.Put(\"October\", 31)";
Debug.ShouldStop(4);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("October"))),(Object)(RemoteObject.createImmutable((31))));
 BA.debugLineNum = 132;BA.debugLine="nameOfMonths.Put(\"November\",30 )";
Debug.ShouldStop(8);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("November"))),(Object)(RemoteObject.createImmutable((30))));
 BA.debugLineNum = 133;BA.debugLine="nameOfMonths.Put(\"December\", 31)";
Debug.ShouldStop(16);
_nameofmonths.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("December"))),(Object)(RemoteObject.createImmutable((31))));
 BA.debugLineNum = 135;BA.debugLine="Dim cMonth As Int = DateTime.GetMonth(date)";
Debug.ShouldStop(64);
_cmonth = calendarview.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_date));Debug.locals.put("cMonth", _cmonth);Debug.locals.put("cMonth", _cmonth);
 BA.debugLineNum = 136;BA.debugLine="currentMonth = cMonth";
Debug.ShouldStop(128);
__ref.setField ("_currentmonth" /*RemoteObject*/ ,_cmonth);
 BA.debugLineNum = 137;BA.debugLine="Dim cDay As Int = DateTime.GetDayOfMonth(date)";
Debug.ShouldStop(256);
_cday = calendarview.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_date));Debug.locals.put("cDay", _cday);Debug.locals.put("cDay", _cday);
 BA.debugLineNum = 138;BA.debugLine="Dim cYear As Int = DateTime.GetYear(date)";
Debug.ShouldStop(512);
_cyear = calendarview.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date));Debug.locals.put("cYear", _cyear);Debug.locals.put("cYear", _cyear);
 BA.debugLineNum = 140;BA.debugLine="lblMonth.Text = nameOfMonths.GetKeyAt(cMonth - 1)";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_nameofmonths.runMethod(false,"GetKeyAt",(Object)(RemoteObject.solve(new RemoteObject[] {_cmonth,RemoteObject.createImmutable(1)}, "-",1, 1))),RemoteObject.createImmutable(" "),_cyear)));
 BA.debugLineNum = 142;BA.debugLine="Dim firstMonth As String = $\"${cMonth}/1/${cYear}";
Debug.ShouldStop(8192);
_firstmonth = (RemoteObject.concat(RemoteObject.createImmutable(""),calendarview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cmonth))),RemoteObject.createImmutable("/1/"),calendarview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cyear))),RemoteObject.createImmutable("")));Debug.locals.put("firstMonth", _firstmonth);Debug.locals.put("firstMonth", _firstmonth);
 BA.debugLineNum = 143;BA.debugLine="Dim fMonth As Long = DateTime.DateParse(firstMont";
Debug.ShouldStop(16384);
_fmonth = calendarview.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_firstmonth));Debug.locals.put("fMonth", _fmonth);Debug.locals.put("fMonth", _fmonth);
 BA.debugLineNum = 144;BA.debugLine="fDay = DateTime.GetDayOfWeek(fMonth) - 1";
Debug.ShouldStop(32768);
__ref.setField ("_fday" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {calendarview.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_fmonth)),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 145;BA.debugLine="Dim countDay As Int = 1";
Debug.ShouldStop(65536);
_countday = BA.numberCast(int.class, 1);Debug.locals.put("countDay", _countday);Debug.locals.put("countDay", _countday);
 BA.debugLineNum = 146;BA.debugLine="maxDay = nameOfMonths.GetValueAt(cMonth - 1)";
Debug.ShouldStop(131072);
__ref.setField ("_maxday" /*RemoteObject*/ ,BA.numberCast(int.class, _nameofmonths.runMethod(false,"GetValueAt",(Object)(RemoteObject.solve(new RemoteObject[] {_cmonth,RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 149;BA.debugLine="For i=0 To 6";
Debug.ShouldStop(1048576);
{
final int step37 = 1;
final int limit37 = 6;
_i = 0 ;
for (;(step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37) ;_i = ((int)(0 + _i + step37))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 150;BA.debugLine="lblWeek(i).Initialize(\"week\")";
Debug.ShouldStop(2097152);
_lblweek.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("week")));
 BA.debugLineNum = 151;BA.debugLine="lblWeek(i).Text = weekName(i)";
Debug.ShouldStop(4194304);
_lblweek.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(_weekname.getArrayElement(true,BA.numberCast(int.class, _i))));
 BA.debugLineNum = 152;BA.debugLine="lblWeek(i).TextColor =Colors.ARGB(255, 84, 119,";
Debug.ShouldStop(8388608);
_lblweek.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setTextColor",calendarview.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 84)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 146))));
 BA.debugLineNum = 154;BA.debugLine="lblWeek(i).Gravity = Gravity.CENTER_HORIZONTAL +";
Debug.ShouldStop(33554432);
_lblweek.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {calendarview.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),calendarview.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 155;BA.debugLine="pnlWeek.AddView(lblWeek(i), positionX, 0,  width";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlweek" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_lblweek.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(_positionx),(Object)(BA.numberCast(int.class, 0)),(Object)(_widthofdaybox),(Object)(calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 156;BA.debugLine="positionX = positionX + widthOfDayBox";
Debug.ShouldStop(134217728);
_positionx = RemoteObject.solve(new RemoteObject[] {_positionx,_widthofdaybox}, "+",1, 1);Debug.locals.put("positionX", _positionx);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 159;BA.debugLine="If fDay = 7 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fday" /*RemoteObject*/ ),BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 160;BA.debugLine="positionY = -40dip";
Debug.ShouldStop(-2147483648);
_positiony = BA.numberCast(int.class, -(double) (0 + calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))).<Integer>get().intValue()));Debug.locals.put("positionY", _positiony);
 };
 BA.debugLineNum = 162;BA.debugLine="positionX = 0";
Debug.ShouldStop(2);
_positionx = BA.numberCast(int.class, 0);Debug.locals.put("positionX", _positionx);
 BA.debugLineNum = 164;BA.debugLine="pnlDays.RemoveAllViews";
Debug.ShouldStop(8);
__ref.getField(false,"_pnldays" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 166;BA.debugLine="For i=0 To lblDay.Length - 1";
Debug.ShouldStop(32);
{
final int step50 = 1;
final int limit50 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblday" /*RemoteObject*/ ).getField(true,"length" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50) ;_i = ((int)(0 + _i + step50))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 168;BA.debugLine="lblDay(i).Initialize(Me,\"lblDay\", widthOfDayBox,";
Debug.ShouldStop(128);
__ref.getField(false,"_lblday" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.calendarbox.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("lblDay")),(Object)(_widthofdaybox),(Object)(calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 BA.debugLineNum = 169;BA.debugLine="lblDay(i).Tag = i";
Debug.ShouldStop(256);
__ref.getField(false,"_lblday" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).setField ("_tag" /*RemoteObject*/ ,RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 170;BA.debugLine="If i >= fDay And countDay <= maxDay Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",RemoteObject.createImmutable(_i),BA.numberCast(double.class, __ref.getField(true,"_fday" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("k",_countday,BA.numberCast(double.class, __ref.getField(true,"_maxday" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 172;BA.debugLine="If HasBitmap(countDay) Then";
Debug.ShouldStop(2048);
if (__ref.runClassMethod (b4a.example.calendarview.class, "_hasbitmap" /*RemoteObject*/ ,(Object)(_countday)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 173;BA.debugLine="lblDay(i).BitMap = GetBitmap(countDay)";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblday" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.calendarbox.class, "_setbitmap",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), __ref.runClassMethod (b4a.example.calendarview.class, "_getbitmap" /*RemoteObject*/ ,(Object)(_countday)).getObject()));
 }else {
 BA.debugLineNum = 175;BA.debugLine="lblDay(i).SetText(countDay)";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblday" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.calendarbox.class, "_settext" /*RemoteObject*/ ,(Object)(BA.NumberToString(_countday)));
 };
 BA.debugLineNum = 178;BA.debugLine="Dim lDate As Long = DateTime.DateParse($\"${cMon";
Debug.ShouldStop(131072);
_ldate = calendarview.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),calendarview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cmonth))),RemoteObject.createImmutable("/"),calendarview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_countday))),RemoteObject.createImmutable("/"),calendarview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cyear))),RemoteObject.createImmutable("")))));Debug.locals.put("lDate", _ldate);Debug.locals.put("lDate", _ldate);
 BA.debugLineNum = 179;BA.debugLine="lblDay(i).Date = lDate";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblday" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.calendarbox.class, "_setdate" /*RemoteObject*/ ,_ldate);
 BA.debugLineNum = 181;BA.debugLine="countDay = countDay + 1";
Debug.ShouldStop(1048576);
_countday = RemoteObject.solve(new RemoteObject[] {_countday,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countDay", _countday);
 }else {
 BA.debugLineNum = 183;BA.debugLine="lblDay(i).SetText(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblday" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.calendarbox.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 187;BA.debugLine="pnlDays.AddView(lblDay(i).GetView, positionX + 4";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnldays" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblday" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.calendarbox.class, "_getview" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_positionx,calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(_positiony),(Object)(RemoteObject.solve(new RemoteObject[] {_widthofdaybox,calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_widthofdaybox,calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "-",1, 1)));
 BA.debugLineNum = 188;BA.debugLine="positionX = positionX + widthOfDayBox";
Debug.ShouldStop(134217728);
_positionx = RemoteObject.solve(new RemoteObject[] {_positionx,_widthofdaybox}, "+",1, 1);Debug.locals.put("positionX", _positionx);
 BA.debugLineNum = 190;BA.debugLine="If (i Mod 7) = 6 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(7)}, "%",0, 1)),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 191;BA.debugLine="positionY = positionY + 40dip";
Debug.ShouldStop(1073741824);
_positiony = RemoteObject.solve(new RemoteObject[] {_positiony,calendarview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 1);Debug.locals.put("positionY", _positiony);
 BA.debugLineNum = 192;BA.debugLine="positionX = 0";
Debug.ShouldStop(-2147483648);
_positionx = BA.numberCast(int.class, 0);Debug.locals.put("positionX", _positionx);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbitmap(RemoteObject __ref,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("GetBitmap (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("getbitmap")) { return __ref.runUserSub(false, "calendarview","getbitmap", __ref, _day);}
int _i = 0;
RemoteObject _kday = RemoteObject.createImmutable(0L);
RemoteObject _vday = RemoteObject.createImmutable(0);
Debug.locals.put("day", _day);
 BA.debugLineNum = 89;BA.debugLine="Private Sub GetBitmap(day As Int) As Bitmap";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="For i=0 To lstBitmap.Size - 1";
Debug.ShouldStop(67108864);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstbitmap" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 92;BA.debugLine="Dim kDay As Long = lstBitmap.GetKeyAt(i)";
Debug.ShouldStop(134217728);
_kday = BA.numberCast(long.class, __ref.getField(false,"_lstbitmap" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("kDay", _kday);Debug.locals.put("kDay", _kday);
 BA.debugLineNum = 93;BA.debugLine="Dim vDay As Int = DateTime.GetDayOfMonth(kDay)";
Debug.ShouldStop(268435456);
_vday = calendarview.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_kday));Debug.locals.put("vDay", _vday);Debug.locals.put("vDay", _vday);
 BA.debugLineNum = 94;BA.debugLine="If vDay = day Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_vday,BA.numberCast(double.class, _day))) { 
 BA.debugLineNum = 95;BA.debugLine="Return lstBitmap.GetValueAt(i)";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), __ref.getField(false,"_lstbitmap" /*RemoteObject*/ ).runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 98;BA.debugLine="Return Null";
Debug.ShouldStop(2);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), calendarview.__c.getField(false,"Null"));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasbitmap(RemoteObject __ref,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("HasBitmap (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("hasbitmap")) { return __ref.runUserSub(false, "calendarview","hasbitmap", __ref, _day);}
RemoteObject _result = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _kday = RemoteObject.createImmutable(0L);
RemoteObject _vday = RemoteObject.createImmutable(0);
Debug.locals.put("day", _day);
 BA.debugLineNum = 77;BA.debugLine="Private Sub HasBitmap(day As Int) As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Dim result As Boolean = False";
Debug.ShouldStop(8192);
_result = calendarview.__c.getField(true,"False");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 79;BA.debugLine="For i=0 To lstBitmap.Size - 1";
Debug.ShouldStop(16384);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstbitmap" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 80;BA.debugLine="Dim kDay As Long = lstBitmap.GetKeyAt(i)";
Debug.ShouldStop(32768);
_kday = BA.numberCast(long.class, __ref.getField(false,"_lstbitmap" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("kDay", _kday);Debug.locals.put("kDay", _kday);
 BA.debugLineNum = 81;BA.debugLine="Dim vDay As Int = DateTime.GetDayOfMonth(kDay)";
Debug.ShouldStop(65536);
_vday = calendarview.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_kday));Debug.locals.put("vDay", _vday);Debug.locals.put("vDay", _vday);
 BA.debugLineNum = 82;BA.debugLine="If vDay = day Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_vday,BA.numberCast(double.class, _day))) { 
 BA.debugLineNum = 83;BA.debugLine="result = True";
Debug.ShouldStop(262144);
_result = calendarview.__c.getField(true,"True");Debug.locals.put("result", _result);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 86;BA.debugLine="Return result";
Debug.ShouldStop(2097152);
if (true) return _result;
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "calendarview","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 34;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(2);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 35;BA.debugLine="lstBitmap.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_lstbitmap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isleapyear(RemoteObject __ref,RemoteObject _year) throws Exception{
try {
		Debug.PushSubsStack("isLeapYear (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("isleapyear")) { return __ref.runUserSub(false, "calendarview","isleapyear", __ref, _year);}
Debug.locals.put("year", _year);
 BA.debugLineNum = 197;BA.debugLine="Sub isLeapYear(year As Int) As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="Return (year Mod 4 = 0) And (year Mod 100 <> 0) O";
Debug.ShouldStop(32);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_year,RemoteObject.createImmutable(4)}, "%",0, 1),BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",RemoteObject.solve(new RemoteObject[] {_year,RemoteObject.createImmutable(100)}, "%",0, 1),BA.numberCast(double.class, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_year,RemoteObject.createImmutable(400)}, "%",0, 1),BA.numberCast(double.class, 0))))));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblday_click(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("lblDay_Click (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("lblday_click")) { return __ref.runUserSub(false, "calendarview","lblday_click", __ref, _date);}
Debug.locals.put("date", _date);
 BA.debugLineNum = 228;BA.debugLine="Sub lblDay_Click(date As Long)";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ItemClick\", da";
Debug.ShouldStop(16);
calendarview.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)((_date)));
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnewvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetNewValue (calendarview) ","calendarview",4,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("setnewvalue")) { return __ref.runUserSub(false, "calendarview","setnewvalue", __ref);}
 BA.debugLineNum = 202;BA.debugLine="Sub SetNewValue";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="valueString = $\"${currentMonth}/${currentDay}/${c";
Debug.ShouldStop(1024);
__ref.setField ("_valuestring" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),calendarview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentmonth" /*RemoteObject*/ )))),RemoteObject.createImmutable("/"),calendarview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentday" /*RemoteObject*/ )))),RemoteObject.createImmutable("/"),calendarview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_currentyear" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 205;BA.debugLine="valueLong = DateTime.DateParse(valueString)";
Debug.ShouldStop(4096);
__ref.setField ("_valuelong" /*RemoteObject*/ ,calendarview.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(true,"_valuestring" /*RemoteObject*/ ))));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
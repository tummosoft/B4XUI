package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class calendarbox_subs_0 {


public static RemoteObject  _addevent(RemoteObject __ref,RemoteObject _color,RemoteObject _eventname,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AddEvent (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("addevent")) { return __ref.runUserSub(false, "calendarbox","addevent", __ref, _color, _eventname, _date);}
RemoteObject _event = RemoteObject.declareNull("b4a.example.calendarbox._events");
Debug.locals.put("color", _color);
Debug.locals.put("eventName", _eventname);
Debug.locals.put("date", _date);
 BA.debugLineNum = 100;BA.debugLine="Public Sub AddEvent(color As Int, eventName As Str";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Dim event As Events";
Debug.ShouldStop(16);
_event = RemoteObject.createNew ("b4a.example.calendarbox._events");Debug.locals.put("event", _event);
 BA.debugLineNum = 102;BA.debugLine="event.Initialize";
Debug.ShouldStop(32);
_event.runVoidMethod ("Initialize");
 BA.debugLineNum = 103;BA.debugLine="event.color = color";
Debug.ShouldStop(64);
_event.setField ("color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 104;BA.debugLine="event.eventName = eventName";
Debug.ShouldStop(128);
_event.setField ("eventName" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 105;BA.debugLine="event.date = date";
Debug.ShouldStop(256);
_event.setField ("date" /*RemoteObject*/ ,_date);
 BA.debugLineNum = 106;BA.debugLine="lstEvent.Add(event)";
Debug.ShouldStop(512);
__ref.getField(false,"_lstevent" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_event)));
 BA.debugLineNum = 108;BA.debugLine="If (getText <> \"\") Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("!",__ref.runClassMethod (b4a.example.calendarbox.class, "_gettext" /*RemoteObject*/ ),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 109;BA.debugLine="DrawEventSymbol";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.calendarbox.class, "_draweventsymbol" /*RemoteObject*/ );
 };
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Base_Resize (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "calendarbox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 80;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
calendarbox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",calendarbox._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
calendarbox._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",calendarbox._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As Panel";
calendarbox._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",calendarbox._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
calendarbox._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",calendarbox._xui);
 //BA.debugLineNum = 10;BA.debugLine="Public Tag As Object";
calendarbox._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",calendarbox._tag);
 //BA.debugLineNum = 11;BA.debugLine="Private pnlWrapper As Panel";
calendarbox._pnlwrapper = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlwrapper",calendarbox._pnlwrapper);
 //BA.debugLineNum = 12;BA.debugLine="Private pnlBottom As Panel";
calendarbox._pnlbottom = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlbottom",calendarbox._pnlbottom);
 //BA.debugLineNum = 13;BA.debugLine="Private vBitmap As ImageView";
calendarbox._vbitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_vbitmap",calendarbox._vbitmap);
 //BA.debugLineNum = 14;BA.debugLine="Private lblText As Label";
calendarbox._lbltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltext",calendarbox._lbltext);
 //BA.debugLineNum = 15;BA.debugLine="Private lstEvent As List";
calendarbox._lstevent = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstevent",calendarbox._lstevent);
 //BA.debugLineNum = 16;BA.debugLine="Type Events (color As Int, eventName As String, d";
;
 //BA.debugLineNum = 17;BA.debugLine="Private hasEvent As Boolean = False";
calendarbox._hasevent = calendarbox.__c.getField(true,"False");__ref.setField("_hasevent",calendarbox._hasevent);
 //BA.debugLineNum = 18;BA.debugLine="Private lDate As Long";
calendarbox._ldate = RemoteObject.createImmutable(0L);__ref.setField("_ldate",calendarbox._ldate);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "calendarbox","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _clr = RemoteObject.createImmutable(0);
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 50;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="mBase = Base";
Debug.ShouldStop(262144);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 52;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(524288);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 53;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 54;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(2097152);
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draweventsymbol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawEventSymbol (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("draweventsymbol")) { return __ref.runUserSub(false, "calendarbox","draweventsymbol", __ref);}
RemoteObject _positionx = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _event = RemoteObject.declareNull("b4a.example.calendarbox._events");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 62;BA.debugLine="Sub DrawEventSymbol";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="pnlBottom.RemoveAllViews";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlbottom" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 65;BA.debugLine="Dim positionX As Int = 0";
Debug.ShouldStop(1);
_positionx = BA.numberCast(int.class, 0);Debug.locals.put("positionX", _positionx);Debug.locals.put("positionX", _positionx);
 BA.debugLineNum = 66;BA.debugLine="For i=0 To lstEvent.Size - 1";
Debug.ShouldStop(2);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstevent" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 67;BA.debugLine="Dim event As Events = lstEvent.Get(i)";
Debug.ShouldStop(4);
_event = (__ref.getField(false,"_lstevent" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("event", _event);Debug.locals.put("event", _event);
 BA.debugLineNum = 68;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(8);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 69;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(16);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 70;BA.debugLine="lbl.As(B4XView).SetColorAndBorder(event.color, 0";
Debug.ShouldStop(32);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject())).runVoidMethod ("SetColorAndBorder",(Object)(_event.getField(true,"color" /*RemoteObject*/ )),(Object)(calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(calendarbox.__c.getField(false,"Colors").getField(true,"White")),(Object)(calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 71;BA.debugLine="pnlBottom.AddView(lbl, positionX, 0, 6dip, 6dip)";
Debug.ShouldStop(64);
__ref.getField(false,"_pnlbottom" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(_positionx),(Object)(BA.numberCast(int.class, 0)),(Object)(calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6)))),(Object)(calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6)))));
 BA.debugLineNum = 72;BA.debugLine="positionX = positionX + 8dip";
Debug.ShouldStop(128);
_positionx = RemoteObject.solve(new RemoteObject[] {_positionx,calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 1);Debug.locals.put("positionX", _positionx);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 76;BA.debugLine="pnlBottom.Width = (5dip * lstEvent.Size) + (3dip";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlbottom" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),__ref.getField(false,"_lstevent" /*RemoteObject*/ ).runMethod(true,"getSize")}, "*",0, 1)),(RemoteObject.solve(new RemoteObject[] {calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))),__ref.getField(false,"_lstevent" /*RemoteObject*/ ).runMethod(true,"getSize")}, "*",0, 1))}, "+",1, 1));
 BA.debugLineNum = 77;BA.debugLine="pnlBottom.Left= (pnlWrapper.Width - pnlBottom.Wid";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlbottom" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_pnlbottom" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDate (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("getdate")) { return __ref.runUserSub(false, "calendarbox","getdate", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Public Sub getDate() As Long";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Return lDate";
Debug.ShouldStop(1);
if (true) return __ref.getField(true,"_ldate" /*RemoteObject*/ );
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "calendarbox","gettext", __ref);}
 BA.debugLineNum = 88;BA.debugLine="Public Sub getText() As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Return lblText.Text";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetView (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("getview")) { return __ref.runUserSub(false, "calendarbox","getview", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub GetView() As View";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Return mBase";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Initialize (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "calendarbox","initialize", __ref, _ba, _callback, _eventname, _width, _height);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _hbox = RemoteObject.createImmutable(0);
RemoteObject _ltext = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(2097152);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 23;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(4194304);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 24;BA.debugLine="mBase.Initialize(\"mBase\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase")));
 BA.debugLineNum = 25;BA.debugLine="lblText.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 26;BA.debugLine="lstEvent.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lstevent" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="vBitmap.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_vbitmap" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="pnlWrapper.Initialize(\"nplWrapper\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("nplWrapper")));
 BA.debugLineNum = 30;BA.debugLine="vBitmap.Gravity = Gravity.CENTER";
Debug.ShouldStop(536870912);
__ref.getField(false,"_vbitmap" /*RemoteObject*/ ).runMethod(true,"setGravity",calendarbox.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 31;BA.debugLine="mBase.AddView(pnlWrapper, 0,0,width,height)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 33;BA.debugLine="Dim hBox As Int = pnlWrapper.Height - 10dip";
Debug.ShouldStop(1);
_hbox = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getHeight"),calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1);Debug.locals.put("hBox", _hbox);Debug.locals.put("hBox", _hbox);
 BA.debugLineNum = 34;BA.debugLine="Dim lText As Int = (pnlWrapper.Width - hBox) / 2";
Debug.ShouldStop(2);
_ltext = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getWidth"),_hbox}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("lText", _ltext);Debug.locals.put("lText", _ltext);
 BA.debugLineNum = 36;BA.debugLine="pnlWrapper.AddView(lblText,  lText, 0, hBox, hBox";
Debug.ShouldStop(8);
__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbltext" /*RemoteObject*/ ).getObject())),(Object)(_ltext),(Object)(BA.numberCast(int.class, 0)),(Object)(_hbox),(Object)(_hbox));
 BA.debugLineNum = 37;BA.debugLine="lblText.Text = 15";
Debug.ShouldStop(16);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(15));
 BA.debugLineNum = 38;BA.debugLine="lblText.TextColor = Colors.Black";
Debug.ShouldStop(32);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",calendarbox.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 39;BA.debugLine="lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
Debug.ShouldStop(64);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {calendarbox.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),calendarbox.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 41;BA.debugLine="pnlWrapper.AddView(vBitmap, 0, 0, pnlWrapper.Widt";
Debug.ShouldStop(256);
__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_vbitmap" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getHeight"),calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)));
 BA.debugLineNum = 42;BA.debugLine="vBitmap.Visible = False";
Debug.ShouldStop(512);
__ref.getField(false,"_vbitmap" /*RemoteObject*/ ).runMethod(true,"setVisible",calendarbox.__c.getField(true,"False"));
 BA.debugLineNum = 44;BA.debugLine="pnlBottom.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlbottom" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="pnlWrapper.AddView(pnlBottom, 0,lblText.Height, p";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlbottom" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isselected(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("isSelected (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("isselected")) { return __ref.runUserSub(false, "calendarbox","isselected", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 120;BA.debugLine="Public Sub isSelected(value As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="If value = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_value,calendarbox.__c.getField(true,"True"))) { 
 BA.debugLineNum = 122;BA.debugLine="lblText.As(B4XView).SetColorAndBorder(Colors.ARG";
Debug.ShouldStop(33554432);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_lbltext" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(calendarbox.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 94)),(Object)(BA.numberCast(int.class, 236)))),(Object)(calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(calendarbox.__c.getField(false,"Colors").getField(true,"White")),(Object)(calendarbox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 123;BA.debugLine="lblText.TextColor = Colors.White";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",calendarbox.__c.getField(false,"Colors").getField(true,"White"));
 };
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mbase_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mBase_Click (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("mbase_click")) { __ref.runUserSub(false, "calendarbox","mbase_click", __ref); return;}
ResumableSub_mBase_Click rsub = new ResumableSub_mBase_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mBase_Click extends BA.ResumableSub {
public ResumableSub_mBase_Click(b4a.example.calendarbox parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.calendarbox parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mBase_Click (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,127);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 129;BA.debugLine="lblText.As(B4XView).SetColorAndBorder(Colors.ARGB";
Debug.ShouldStop(1);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_lbltext" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(parent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 94)),(Object)(BA.numberCast(int.class, 236)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 130;BA.debugLine="lblText.TextColor = Colors.White";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 131;BA.debugLine="Sleep(300)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "calendarbox", "mbase_click"),BA.numberCast(int.class, 300));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 132;BA.debugLine="lblText.As(B4XView).SetColorAndBorder(Colors.Whit";
Debug.ShouldStop(8);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_lbltext" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 133;BA.debugLine="lblText.TextColor = Colors.Black";
Debug.ShouldStop(16);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 135;BA.debugLine="CallSub2(mCallBack, mEventName & \"_Click\", getDat";
Debug.ShouldStop(64);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"))),(Object)((__ref.runClassMethod (b4a.example.calendarbox.class, "_getdate" /*RemoteObject*/ ))));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _setbitmap(RemoteObject __ref,RemoteObject _bitmap) throws Exception{
try {
		Debug.PushSubsStack("setBitMap (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setbitmap")) { return __ref.runUserSub(false, "calendarbox","setbitmap", __ref, _bitmap);}
Debug.locals.put("bitmap", _bitmap);
 BA.debugLineNum = 114;BA.debugLine="Public Sub setBitMap(bitmap As B4XBitmap)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="vBitmap.Visible = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_vbitmap" /*RemoteObject*/ ).runMethod(true,"setVisible",calendarbox.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="lblText.Visible = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setVisible",calendarbox.__c.getField(true,"False"));
 BA.debugLineNum = 117;BA.debugLine="vBitmap.Bitmap = bitmap";
Debug.ShouldStop(1048576);
__ref.getField(false,"_vbitmap" /*RemoteObject*/ ).runMethod(false,"setBitmap",(_bitmap.getObject()));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdate(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setDate (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setdate")) { return __ref.runUserSub(false, "calendarbox","setdate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 92;BA.debugLine="Public Sub setDate(value As Long)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="lDate = value";
Debug.ShouldStop(268435456);
__ref.setField ("_ldate" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setText (calendarbox) ","calendarbox",2,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "calendarbox","settext", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 84;BA.debugLine="Public Sub setText(value As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="lblText.Text = value";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
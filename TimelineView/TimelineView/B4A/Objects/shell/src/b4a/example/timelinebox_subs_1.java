package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class timelinebox_subs_1 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "timelinebox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 87;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
timelinebox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",timelinebox._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
timelinebox._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",timelinebox._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As Panel";
timelinebox._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",timelinebox._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
timelinebox._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",timelinebox._xui);
 //BA.debugLineNum = 9;BA.debugLine="Public Tag As Object";
timelinebox._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",timelinebox._tag);
 //BA.debugLineNum = 10;BA.debugLine="Private pnlWrapper As Panel";
timelinebox._pnlwrapper = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlwrapper",timelinebox._pnlwrapper);
 //BA.debugLineNum = 11;BA.debugLine="Private imvLine As ImageView";
timelinebox._imvline = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imvline",timelinebox._imvline);
 //BA.debugLineNum = 12;BA.debugLine="Private imvTop As ImageView";
timelinebox._imvtop = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imvtop",timelinebox._imvtop);
 //BA.debugLineNum = 13;BA.debugLine="Private pnlContent As Panel";
timelinebox._pnlcontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlcontent",timelinebox._pnlcontent);
 //BA.debugLineNum = 14;BA.debugLine="Private lineWidth As Int = 2dip";
timelinebox._linewidth = timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));__ref.setField("_linewidth",timelinebox._linewidth);
 //BA.debugLineNum = 15;BA.debugLine="Private lblTitle As Label";
timelinebox._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle",timelinebox._lbltitle);
 //BA.debugLineNum = 16;BA.debugLine="Private lblContent As Label";
timelinebox._lblcontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcontent",timelinebox._lblcontent);
 //BA.debugLineNum = 17;BA.debugLine="Private lblTime As Label";
timelinebox._lbltime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltime",timelinebox._lbltime);
 //BA.debugLineNum = 18;BA.debugLine="Private pnlButtonGroup As Panel";
timelinebox._pnlbuttongroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlbuttongroup",timelinebox._pnlbuttongroup);
 //BA.debugLineNum = 19;BA.debugLine="Private cv As Canvas";
timelinebox._cv = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cv",timelinebox._cv);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "timelinebox","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _clr = RemoteObject.createImmutable(0);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 55;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="mBase = Base";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 57;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(16777216);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 58;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 59;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(67108864);
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawdottedline(RemoteObject __ref,RemoteObject _x1,RemoteObject _y1,RemoteObject _x2,RemoteObject _y2,RemoteObject _forecolor,RemoteObject _segmentsize) throws Exception{
try {
		Debug.PushSubsStack("drawDottedLine (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("drawdottedline")) { return __ref.runUserSub(false, "timelinebox","drawdottedline", __ref, _x1, _y1, _x2, _y2, _forecolor, _segmentsize);}
RemoteObject _linelength = RemoteObject.createImmutable(0f);
RemoteObject _nsegments = RemoteObject.createImmutable(0);
RemoteObject _fract = RemoteObject.createImmutable(0f);
RemoteObject _xincr = RemoteObject.createImmutable(0f);
RemoteObject _xincrline = RemoteObject.createImmutable(0f);
RemoteObject _yincr = RemoteObject.createImmutable(0f);
RemoteObject _yincrline = RemoteObject.createImmutable(0f);
int _i = 0;
RemoteObject _xx1 = RemoteObject.createImmutable(0f);
RemoteObject _yy1 = RemoteObject.createImmutable(0f);
RemoteObject _xx2 = RemoteObject.createImmutable(0f);
RemoteObject _yy2 = RemoteObject.createImmutable(0f);
Debug.locals.put("x1", _x1);
Debug.locals.put("y1", _y1);
Debug.locals.put("x2", _x2);
Debug.locals.put("y2", _y2);
Debug.locals.put("foreColor", _forecolor);
Debug.locals.put("segmentSize", _segmentsize);
 BA.debugLineNum = 107;BA.debugLine="Private Sub drawDottedLine(x1 As Float, y1 As Floa";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Dim lineLength As Float = Sqrt((x1 - x2) * (x1 -";
Debug.ShouldStop(2048);
_linelength = BA.numberCast(float.class, timelinebox.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x1,_x2}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {_x1,_x2}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {_y1,_y2}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {_y1,_y2}, "-",1, 0))}, "*+*",1, 0))));Debug.locals.put("lineLength", _linelength);Debug.locals.put("lineLength", _linelength);
 BA.debugLineNum = 109;BA.debugLine="Dim nSegments As Int = (lineLength + .5 * segment";
Debug.ShouldStop(4096);
_nsegments = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_linelength,RemoteObject.createImmutable(.5),_segmentsize}, "+*",1, 0)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1.5),_segmentsize}, "*",0, 0))}, "/",0, 0));Debug.locals.put("nSegments", _nsegments);Debug.locals.put("nSegments", _nsegments);
 BA.debugLineNum = 110;BA.debugLine="Dim fract As Float = (lineLength + .5 * segmentSi";
Debug.ShouldStop(8192);
_fract = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_linelength,RemoteObject.createImmutable(.5),_segmentsize}, "+*",1, 0)),_linelength}, "/",0, 0));Debug.locals.put("fract", _fract);Debug.locals.put("fract", _fract);
 BA.debugLineNum = 112;BA.debugLine="Dim xIncr As Float = fract * (x2 - x1) / nSegment";
Debug.ShouldStop(32768);
_xincr = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_fract,(RemoteObject.solve(new RemoteObject[] {_x2,_x1}, "-",1, 0)),_nsegments}, "*/",0, 0));Debug.locals.put("xIncr", _xincr);Debug.locals.put("xIncr", _xincr);
 BA.debugLineNum = 113;BA.debugLine="Dim xIncrLine As Float = .6667 * xIncr";
Debug.ShouldStop(65536);
_xincrline = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(.6667),_xincr}, "*",0, 0));Debug.locals.put("xIncrLine", _xincrline);Debug.locals.put("xIncrLine", _xincrline);
 BA.debugLineNum = 114;BA.debugLine="Dim yIncr As Float = fract * (y2 - y1) / nSegment";
Debug.ShouldStop(131072);
_yincr = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_fract,(RemoteObject.solve(new RemoteObject[] {_y2,_y1}, "-",1, 0)),_nsegments}, "*/",0, 0));Debug.locals.put("yIncr", _yincr);Debug.locals.put("yIncr", _yincr);
 BA.debugLineNum = 115;BA.debugLine="Dim yIncrLine As Float =  .6667 * yIncr";
Debug.ShouldStop(262144);
_yincrline = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(.6667),_yincr}, "*",0, 0));Debug.locals.put("yIncrLine", _yincrline);Debug.locals.put("yIncrLine", _yincrline);
 BA.debugLineNum = 117;BA.debugLine="For i = 0 To nSegments - 1";
Debug.ShouldStop(1048576);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_nsegments,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 118;BA.debugLine="Dim xx1 As Float = x1 + i * xIncr";
Debug.ShouldStop(2097152);
_xx1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x1,RemoteObject.createImmutable(_i),_xincr}, "+*",1, 0));Debug.locals.put("xx1", _xx1);Debug.locals.put("xx1", _xx1);
 BA.debugLineNum = 119;BA.debugLine="Dim yy1 As Float = y1 + i * yIncr";
Debug.ShouldStop(4194304);
_yy1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y1,RemoteObject.createImmutable(_i),_yincr}, "+*",1, 0));Debug.locals.put("yy1", _yy1);Debug.locals.put("yy1", _yy1);
 BA.debugLineNum = 120;BA.debugLine="Dim xx2 As Float = xx1 + xIncrLine";
Debug.ShouldStop(8388608);
_xx2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xx1,_xincrline}, "+",1, 0));Debug.locals.put("xx2", _xx2);Debug.locals.put("xx2", _xx2);
 BA.debugLineNum = 121;BA.debugLine="Dim yy2 As Float = yy1 + yIncrLine";
Debug.ShouldStop(16777216);
_yy2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_yy1,_yincrline}, "+",1, 0));Debug.locals.put("yy2", _yy2);Debug.locals.put("yy2", _yy2);
 BA.debugLineNum = 122;BA.debugLine="If i = nSegments - 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_nsegments,RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 123;BA.debugLine="cv.DrawLine(xx1, yy1, x2, y2, foreColor, lineWi";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cv" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(_xx1),(Object)(_yy1),(Object)(_x2),(Object)(_y2),(Object)(_forecolor),(Object)(BA.numberCast(float.class, __ref.getField(true,"_linewidth" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 125;BA.debugLine="cv.DrawLine(xx1, yy1, xx2, yy2, foreColor, line";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cv" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(_xx1),(Object)(_yy1),(Object)(_xx2),(Object)(_yy2),(Object)(_forecolor),(Object)(BA.numberCast(float.class, __ref.getField(true,"_linewidth" /*RemoteObject*/ ))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("GetView (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("getview")) { return __ref.runUserSub(false, "timelinebox","getview", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Public Sub GetView() As Panel";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Return mBase";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidebutton(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideButton (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("hidebutton")) { return __ref.runUserSub(false, "timelinebox","hidebutton", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Public Sub HideButton()";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="pnlButtonGroup.Visible = False";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlbuttongroup" /*RemoteObject*/ ).runMethod(true,"setVisible",timelinebox.__c.getField(true,"False"));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Initialize (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "timelinebox","initialize", __ref, _ba, _callback, _eventname, _width, _height);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _brunning = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(4194304);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(8388608);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 25;BA.debugLine="mBase.Initialize(\"mBase\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase")));
 BA.debugLineNum = 26;BA.debugLine="pnlWrapper.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="imvLine.Initialize(\"\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_imvline" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 29;BA.debugLine="imvTop.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_imvtop" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 31;BA.debugLine="mBase.AddView(imvTop, 0dip,0dip,20dip,20dip)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imvtop" /*RemoteObject*/ ).getObject())),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 32;BA.debugLine="mBase.AddView(imvLine, 10dip, 20dip,lineWidth,hei";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imvline" /*RemoteObject*/ ).getObject())),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(__ref.getField(true,"_linewidth" /*RemoteObject*/ )),(Object)(_height));
 BA.debugLineNum = 33;BA.debugLine="imvTop.Color = Colors.Magenta";
Debug.ShouldStop(1);
__ref.getField(false,"_imvtop" /*RemoteObject*/ ).runVoidMethod ("setColor",timelinebox.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 34;BA.debugLine="imvLine.Color = Colors.Red";
Debug.ShouldStop(2);
__ref.getField(false,"_imvline" /*RemoteObject*/ ).runVoidMethod ("setColor",timelinebox.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 36;BA.debugLine="cv.Initialize(imvLine)";
Debug.ShouldStop(8);
__ref.getField(false,"_cv" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_imvline" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 39;BA.debugLine="Dim bRunning As B4XBitmap=LoadBitmapResize(File.D";
Debug.ShouldStop(64);
_brunning = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_brunning = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), timelinebox.__c.runMethod(false,"LoadBitmapResize",(Object)(timelinebox.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("running.png")),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))),(Object)(timelinebox.__c.getField(true,"True"))).getObject());Debug.locals.put("bRunning", _brunning);Debug.locals.put("bRunning", _brunning);
 BA.debugLineNum = 40;BA.debugLine="imvTop.Bitmap = bRunning";
Debug.ShouldStop(128);
__ref.getField(false,"_imvtop" /*RemoteObject*/ ).runMethod(false,"setBitmap",(_brunning.getObject()));
 BA.debugLineNum = 42;BA.debugLine="drawDottedLine(0, 0, 0, imvLine.Height, Colors.Li";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.timelinebox.class, "_drawdottedline" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(false,"_imvline" /*RemoteObject*/ ).runMethod(true,"getHeight"))),(Object)(timelinebox.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 BA.debugLineNum = 44;BA.debugLine="pnlContent.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlcontent" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="mBase.AddView(pnlContent, 20dip, 20dip, width - 3";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlcontent" /*RemoteObject*/ ).getObject())),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(RemoteObject.solve(new RemoteObject[] {_width,timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_height,timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)));
 BA.debugLineNum = 46;BA.debugLine="pnlContent.Color = Colors.Gray";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnlcontent" /*RemoteObject*/ ).runVoidMethod ("setColor",timelinebox.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 50;BA.debugLine="pnlContent.LoadLayout(\"timeline_item\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlcontent" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("timeline_item")),__ref.getField(false, "ba"));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadlayout(RemoteObject __ref,RemoteObject _layoutfile) throws Exception{
try {
		Debug.PushSubsStack("LoadLayout (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("loadlayout")) { return __ref.runUserSub(false, "timelinebox","loadlayout", __ref, _layoutfile);}
Debug.locals.put("LayoutFile", _layoutfile);
 BA.debugLineNum = 95;BA.debugLine="Public Sub LoadLayout(LayoutFile As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbitmap(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setBitmap (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setbitmap")) { return __ref.runUserSub(false, "timelinebox","setbitmap", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 99;BA.debugLine="Public Sub setBitmap(value As Bitmap)";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="imvTop.Bitmap = value";
Debug.ShouldStop(8);
__ref.getField(false,"_imvtop" /*RemoteObject*/ ).runMethod(false,"setBitmap",(_value.getObject()));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setColor (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "timelinebox","setcolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 62;BA.debugLine="Public Sub setColor(value As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="pnlContent.As(B4XView).SetColorAndBorder(value, 0";
Debug.ShouldStop(-2147483648);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_pnlcontent" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(_value),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(timelinebox.__c.getField(false,"Colors").getField(true,"White")),(Object)(timelinebox.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdescription(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setDescription (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setdescription")) { return __ref.runUserSub(false, "timelinebox","setdescription", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 71;BA.debugLine="Public Sub setDescription(value As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="lblContent.Text = value";
Debug.ShouldStop(128);
__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlinecolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setLineColor (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("setlinecolor")) { return __ref.runUserSub(false, "timelinebox","setlinecolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 79;BA.debugLine="Public Sub setLineColor(color As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="imvLine.Color = color";
Debug.ShouldStop(32768);
__ref.getField(false,"_imvline" /*RemoteObject*/ ).runVoidMethod ("setColor",_color);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlinewidth(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setLineWidth (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("setlinewidth")) { return __ref.runUserSub(false, "timelinebox","setlinewidth", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 83;BA.debugLine="Public Sub setLineWidth(value As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="lineWidth = value";
Debug.ShouldStop(524288);
__ref.setField ("_linewidth" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settime(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setTime (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("settime")) { return __ref.runUserSub(false, "timelinebox","settime", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 75;BA.debugLine="Public Sub setTime(value As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="lblTime.Text = value";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbltime" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setTitle (timelinebox) ","timelinebox",2,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "timelinebox","settitle", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 67;BA.debugLine="Public Sub setTitle(value As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="lblTitle.Text = value";
Debug.ShouldStop(8);
__ref.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
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
}
package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bitmapbutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (bitmapbutton) ","bitmapbutton",3,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "bitmapbutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 56;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
bitmapbutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",bitmapbutton._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
bitmapbutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",bitmapbutton._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As B4XView";
bitmapbutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",bitmapbutton._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
bitmapbutton._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bitmapbutton._xui);
 //BA.debugLineNum = 10;BA.debugLine="Public Tag As Object";
bitmapbutton._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",bitmapbutton._tag);
 //BA.debugLineNum = 11;BA.debugLine="Private pnlBgButton As Panel";
bitmapbutton._pnlbgbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlbgbutton",bitmapbutton._pnlbgbutton);
 //BA.debugLineNum = 12;BA.debugLine="Private imvIcon As Label";
bitmapbutton._imvicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imvicon",bitmapbutton._imvicon);
 //BA.debugLineNum = 13;BA.debugLine="Dim mWidth As Int";
bitmapbutton._mwidth = RemoteObject.createImmutable(0);__ref.setField("_mwidth",bitmapbutton._mwidth);
 //BA.debugLineNum = 14;BA.debugLine="Dim mHeight As Int";
bitmapbutton._mheight = RemoteObject.createImmutable(0);__ref.setField("_mheight",bitmapbutton._mheight);
 //BA.debugLineNum = 15;BA.debugLine="Private lblText As Label";
bitmapbutton._lbltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltext",bitmapbutton._lbltext);
 //BA.debugLineNum = 16;BA.debugLine="Private mRadius As Int";
bitmapbutton._mradius = RemoteObject.createImmutable(0);__ref.setField("_mradius",bitmapbutton._mradius);
 //BA.debugLineNum = 17;BA.debugLine="Private bgColor As Int = Colors.ARGB(255,156, 207";
bitmapbutton._bgcolor = bitmapbutton.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 156)),(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 255)));__ref.setField("_bgcolor",bitmapbutton._bgcolor);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (bitmapbutton) ","bitmapbutton",3,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "bitmapbutton","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="mBase = Base";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 28;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(134217728);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 29;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 30;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(536870912);
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 32;BA.debugLine="pnlBgButton.Initialize(\"pnlBgButton\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlbgbutton" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlBgButton")));
 BA.debugLineNum = 34;BA.debugLine="mWidth = mBase.Width";
Debug.ShouldStop(2);
__ref.setField ("_mwidth" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 35;BA.debugLine="mHeight = mWidth";
Debug.ShouldStop(4);
__ref.setField ("_mheight" /*RemoteObject*/ ,__ref.getField(true,"_mwidth" /*RemoteObject*/ ));
 BA.debugLineNum = 36;BA.debugLine="Dim left As Int = (mBase.Width - mWidth) / 2";
Debug.ShouldStop(8);
_left = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mwidth" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 37;BA.debugLine="mRadius = (mBase.Width / 2) - 5dip";
Debug.ShouldStop(16);
__ref.setField ("_mradius" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0)));
 BA.debugLineNum = 39;BA.debugLine="mBase.AddView(pnlBgButton, left, 0dip, mWidth, mH";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlbgbutton" /*RemoteObject*/ ).getObject())),(Object)(_left),(Object)(bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(true,"_mwidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mheight" /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="pnlBgButton.As(B4XView).SetColorAndBorder(bgColor";
Debug.ShouldStop(128);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_pnlbgbutton" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_bgcolor" /*RemoteObject*/ )),(Object)(bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(bitmapbutton.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(__ref.getField(true,"_mradius" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="imvIcon.Initialize(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 43;BA.debugLine="pnlBgButton.AddView(imvIcon, 5dip, 5dip, mWidth -";
Debug.ShouldStop(1024);
__ref.getField(false,"_pnlbgbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imvicon" /*RemoteObject*/ ).getObject())),(Object)(bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mwidth" /*RemoteObject*/ ),bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mheight" /*RemoteObject*/ ),bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)));
 BA.debugLineNum = 45;BA.debugLine="SetBitmap(File.DirAssets, \"icons8-photo-94.png\")";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.bitmapbutton.class, "_setbitmap" /*RemoteObject*/ ,(Object)(bitmapbutton.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icons8-photo-94.png")));
 BA.debugLineNum = 47;BA.debugLine="lblText.Initialize(\"\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 48;BA.debugLine="lblText.Text = \"Colors\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Colors"));
 BA.debugLineNum = 49;BA.debugLine="mBase.AddView(lblText, 0, mHeight + 3dip, mWidth,";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbltext" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mheight" /*RemoteObject*/ ),bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "+",1, 1)),(Object)(__ref.getField(true,"_mwidth" /*RemoteObject*/ )),(Object)(bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 50;BA.debugLine="lblText.TextSize = 11";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 11));
 BA.debugLineNum = 51;BA.debugLine="lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {bitmapbutton.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),bitmapbutton.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 53;BA.debugLine="mBase.Height = mHeight + 25dip";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mheight" /*RemoteObject*/ ),bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))}, "+",1, 1));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bitmapbutton) ","bitmapbutton",3,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bitmapbutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1048576);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(2097152);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlbgbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlBgButton_Click (bitmapbutton) ","bitmapbutton",3,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("pnlbgbutton_click")) { return __ref.runUserSub(false, "bitmapbutton","pnlbgbutton_click", __ref);}
 BA.debugLineNum = 84;BA.debugLine="Sub pnlBgButton_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="CallSub(mCallBack, mEventName & \"_Click\")";
Debug.ShouldStop(1048576);
bitmapbutton.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"))));
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
public static RemoteObject  _setbackgroundcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBackgroundColor (bitmapbutton) ","bitmapbutton",3,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "bitmapbutton","setbackgroundcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 68;BA.debugLine="Public Sub setBackgroundColor(color As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="pnlBgButton.As(B4XView).SetColorAndBorder(color,";
Debug.ShouldStop(16);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_pnlbgbutton" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(_color),(Object)(bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(bitmapbutton.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(__ref.getField(true,"_mradius" /*RemoteObject*/ )));
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
public static RemoteObject  _setbitmap(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SetBitmap (bitmapbutton) ","bitmapbutton",3,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("setbitmap")) { return __ref.runUserSub(false, "bitmapbutton","setbitmap", __ref, _dir, _filename);}
RemoteObject _ico = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _bm = RemoteObject.declareNull("b4a.example.bitmapcreator");
Debug.locals.put("Dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 60;BA.debugLine="Public Sub SetBitmap(Dir As String, fileName As St";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim ico As B4XBitmap = LoadBitmapResize(Dir, file";
Debug.ShouldStop(268435456);
_ico = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_ico = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), bitmapbutton.__c.runMethod(false,"LoadBitmapResize",(Object)(_dir),(Object)(_filename),(Object)(bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(bitmapbutton.__c.getField(true,"False"))).getObject());Debug.locals.put("ico", _ico);Debug.locals.put("ico", _ico);
 BA.debugLineNum = 62;BA.debugLine="Dim bm As BitmapCreator";
Debug.ShouldStop(536870912);
_bm = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 63;BA.debugLine="bm.Initialize( mWidth - 10dip, mHeight - 10dip)";
Debug.ShouldStop(1073741824);
_bm.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mwidth" /*RemoteObject*/ ),bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mheight" /*RemoteObject*/ ),bitmapbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)));
 BA.debugLineNum = 64;BA.debugLine="bm.DrawBitmap(ico, bm.TargetRect, False)";
Debug.ShouldStop(-2147483648);
_bm.runVoidMethod ("_drawbitmap",(Object)(_ico),(Object)(_bm.getField(false,"_targetrect")),(Object)(bitmapbutton.__c.getField(true,"False")));
 BA.debugLineNum = 65;BA.debugLine="imvIcon.SetBackgroundImage(bm.Bitmap)";
Debug.ShouldStop(1);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((_bm.runMethod(false,"_getbitmap").getObject())));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setText (bitmapbutton) ","bitmapbutton",3,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "bitmapbutton","settext", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 72;BA.debugLine="Public Sub setText(value As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="lblText.Text = value";
Debug.ShouldStop(256);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
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
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (bitmapbutton) ","bitmapbutton",3,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "bitmapbutton","settextcolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 80;BA.debugLine="Public Sub setTextColor(value As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="lblText.TextColor = value";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",_value);
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
public static RemoteObject  _settextsize(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setTextSize (bitmapbutton) ","bitmapbutton",3,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("settextsize")) { return __ref.runUserSub(false, "bitmapbutton","settextsize", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 76;BA.debugLine="Public Sub setTextSize(value As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="lblText.TextSize = value";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, _value));
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
}
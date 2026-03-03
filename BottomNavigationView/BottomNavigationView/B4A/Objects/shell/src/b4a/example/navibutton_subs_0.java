package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class navibutton_subs_0 {


public static RemoteObject  _active(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Active (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("active")) { return __ref.runUserSub(false, "navibutton","active", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 138;BA.debugLine="Public Sub Active(value As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="If value = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_value,navibutton.__c.getField(true,"True"))) { 
 BA.debugLineNum = 140;BA.debugLine="imvLine.Visible = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_imvline" /*RemoteObject*/ ).runMethod(true,"setVisible",navibutton.__c.getField(true,"True"));
 BA.debugLineNum = 141;BA.debugLine="imvIcon.TextColor = selectedColor";
Debug.ShouldStop(4096);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_selectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 142;BA.debugLine="lblText.TextColor = selectedColor";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_selectedcolor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 144;BA.debugLine="imvLine.Visible = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_imvline" /*RemoteObject*/ ).runMethod(true,"setVisible",navibutton.__c.getField(true,"False"));
 BA.debugLineNum = 145;BA.debugLine="imvIcon.TextColor = colorIcon";
Debug.ShouldStop(65536);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_coloricon" /*RemoteObject*/ ));
 BA.debugLineNum = 146;BA.debugLine="lblText.TextColor = colorIcon";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_coloricon" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Base_Resize (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "navibutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 94;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
navibutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",navibutton._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
navibutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",navibutton._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As Panel";
navibutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",navibutton._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
navibutton._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",navibutton._xui);
 //BA.debugLineNum = 10;BA.debugLine="Public Tag As Object";
navibutton._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",navibutton._tag);
 //BA.debugLineNum = 11;BA.debugLine="Private imvIcon As Label";
navibutton._imvicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imvicon",navibutton._imvicon);
 //BA.debugLineNum = 12;BA.debugLine="Private lblText As Label";
navibutton._lbltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltext",navibutton._lbltext);
 //BA.debugLineNum = 13;BA.debugLine="Private baseWidth As Int = 50dip";
navibutton._basewidth = navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)));__ref.setField("_basewidth",navibutton._basewidth);
 //BA.debugLineNum = 14;BA.debugLine="Private imvWidth As Int = 25dip";
navibutton._imvwidth = navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)));__ref.setField("_imvwidth",navibutton._imvwidth);
 //BA.debugLineNum = 15;BA.debugLine="Private fontsize As Int = 10";
navibutton._fontsize = BA.numberCast(int.class, 10);__ref.setField("_fontsize",navibutton._fontsize);
 //BA.debugLineNum = 16;BA.debugLine="Private index As Int = 0";
navibutton._index = BA.numberCast(int.class, 0);__ref.setField("_index",navibutton._index);
 //BA.debugLineNum = 17;BA.debugLine="Dim imvLine As Label";
navibutton._imvline = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imvline",navibutton._imvline);
 //BA.debugLineNum = 18;BA.debugLine="Dim lblBadge As Label";
navibutton._lblbadge = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblbadge",navibutton._lblbadge);
 //BA.debugLineNum = 19;BA.debugLine="Private colorIcon As Int = Colors.ARGB(255, 141,";
navibutton._coloricon = navibutton.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 141)),(Object)(BA.numberCast(int.class, 152)),(Object)(BA.numberCast(int.class, 166)));__ref.setField("_coloricon",navibutton._coloricon);
 //BA.debugLineNum = 20;BA.debugLine="Private selectedColor As Int = Colors.ARGB(255, 8";
navibutton._selectedcolor = navibutton.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 250)));__ref.setField("_selectedcolor",navibutton._selectedcolor);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "navibutton","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _clr = RemoteObject.createImmutable(0);
Debug.locals.put("base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 69;BA.debugLine="Public Sub DesignerCreateView (base As Object, lbl";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="mBase = base";
Debug.ShouldStop(32);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 71;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(64);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 72;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(128);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 73;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(256);
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
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
public static RemoteObject  _font(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Font (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("font")) { return __ref.runUserSub(false, "navibutton","font", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 105;BA.debugLine="Public Sub Font(value As Typeface)";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="imvIcon.Typeface = value";
Debug.ShouldStop(512);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(false,"setTypeface",(_value.getObject()));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getposition(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPosition (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("getposition")) { return __ref.runUserSub(false, "navibutton","getposition", __ref);}
 BA.debugLineNum = 126;BA.debugLine="Public Sub getPosition() As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="return index";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(true,"_index" /*RemoteObject*/ );
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetView (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("getview")) { return __ref.runUserSub(false, "navibutton","getview", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Public Sub GetView() As Panel";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Return mBase";
Debug.ShouldStop(64);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _icon(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Icon (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("icon")) { return __ref.runUserSub(false, "navibutton","icon", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 130;BA.debugLine="Public Sub Icon(value As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="imvIcon.Text = value";
Debug.ShouldStop(4);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("Initialize (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "navibutton","initialize", __ref, _ba, _callback, _eventname, _width);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _mleft = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("width", _width);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="baseWidth = width";
Debug.ShouldStop(8388608);
__ref.setField ("_basewidth" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16777216);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(33554432);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 27;BA.debugLine="mBase.Initialize(\"mBase\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase")));
 BA.debugLineNum = 32;BA.debugLine="imvLine.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_imvline" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 33;BA.debugLine="imvLine.Color = selectedColor";
Debug.ShouldStop(1);
__ref.getField(false,"_imvline" /*RemoteObject*/ ).runVoidMethod ("setColor",__ref.getField(true,"_selectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 34;BA.debugLine="mBase.AddView(imvLine, 0, 0, baseWidth, 2dip)";
Debug.ShouldStop(2);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imvline" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_basewidth" /*RemoteObject*/ )),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 35;BA.debugLine="imvLine.Visible = False";
Debug.ShouldStop(4);
__ref.getField(false,"_imvline" /*RemoteObject*/ ).runMethod(true,"setVisible",navibutton.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="imvIcon.Initialize(\"\")";
Debug.ShouldStop(16);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 38;BA.debugLine="Dim mLeft As Int = (width - imvWidth) / 2";
Debug.ShouldStop(32);
_mleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(true,"_imvwidth" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("mLeft", _mleft);Debug.locals.put("mLeft", _mleft);
 BA.debugLineNum = 39;BA.debugLine="mBase.AddView(imvIcon, mLeft, 5dip, baseWidth, im";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imvicon" /*RemoteObject*/ ).getObject())),(Object)(_mleft),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(__ref.getField(true,"_basewidth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_imvwidth" /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="imvIcon.Typeface = Typeface.FONTAWESOME";
Debug.ShouldStop(128);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(false,"setTypeface",navibutton.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 41;BA.debugLine="imvIcon.TextSize = 18";
Debug.ShouldStop(256);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 42;BA.debugLine="imvIcon.TextColor = colorIcon";
Debug.ShouldStop(512);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_coloricon" /*RemoteObject*/ ));
 BA.debugLineNum = 43;BA.debugLine="imvIcon.Gravity = Gravity.CENTER";
Debug.ShouldStop(1024);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setGravity",navibutton.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 45;BA.debugLine="lblBadge.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblbadge" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 46;BA.debugLine="mBase.AddView(lblBadge, imvIcon.Width / 2, 5dip,";
Debug.ShouldStop(8192);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblbadge" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))));
 BA.debugLineNum = 47;BA.debugLine="lblBadge.As(B4XView).SetColorAndBorder(Colors.ARG";
Debug.ShouldStop(16384);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_lblbadge" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(navibutton.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 235)),(Object)(BA.numberCast(int.class, 76)),(Object)(BA.numberCast(int.class, 76)))),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(navibutton.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6)))));
 BA.debugLineNum = 48;BA.debugLine="lblBadge.Text = \"5\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblbadge" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("5"));
 BA.debugLineNum = 49;BA.debugLine="lblBadge.TextSize = 8";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblbadge" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 8));
 BA.debugLineNum = 50;BA.debugLine="lblBadge.TextColor = Colors.White";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblbadge" /*RemoteObject*/ ).runMethod(true,"setTextColor",navibutton.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 51;BA.debugLine="lblBadge.Gravity = Gravity.CENTER_HORIZONTAL + Gr";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblbadge" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {navibutton.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),navibutton.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 52;BA.debugLine="lblBadge.Visible = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblbadge" /*RemoteObject*/ ).runMethod(true,"setVisible",navibutton.__c.getField(true,"False"));
 BA.debugLineNum = 55;BA.debugLine="lblText.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 56;BA.debugLine="lblText.TextColor = colorIcon";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_coloricon" /*RemoteObject*/ ));
 BA.debugLineNum = 57;BA.debugLine="mBase.AddView(lblText, 0dip, 25dip, baseWidth, 20";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbltext" /*RemoteObject*/ ).getObject())),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(__ref.getField(true,"_basewidth" /*RemoteObject*/ )),(Object)(navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 59;BA.debugLine="lblText.Text = \"Navi Button\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Navi Button"));
 BA.debugLineNum = 60;BA.debugLine="lblText.Gravity = Gravity.CENTER";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setGravity",navibutton.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 61;BA.debugLine="lblText.TextSize = fontsize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, __ref.getField(true,"_fontsize" /*RemoteObject*/ )));
 BA.debugLineNum = 65;BA.debugLine="mBase.Invalidate";
Debug.ShouldStop(1);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
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
public static void  _mbase_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mBase_Click (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("mbase_click")) { __ref.runUserSub(false, "navibutton","mbase_click", __ref); return;}
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
public ResumableSub_mBase_Click(b4a.example.navibutton parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.navibutton parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mBase_Click (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,150);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 153;BA.debugLine="imvIcon.TextColor = selectedColor";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_selectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 154;BA.debugLine="lblText.TextColor = selectedColor";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_selectedcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 155;BA.debugLine="Sleep(300)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "navibutton", "mbase_click"),BA.numberCast(int.class, 300));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 157;BA.debugLine="imvIcon.TextColor = colorIcon";
Debug.ShouldStop(268435456);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_coloricon" /*RemoteObject*/ ));
 BA.debugLineNum = 158;BA.debugLine="lblText.TextColor = colorIcon";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_coloricon" /*RemoteObject*/ ));
 BA.debugLineNum = 161;BA.debugLine="CallSub(mCallBack, mEventName & \"_Click\")";
Debug.ShouldStop(1);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"))));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static RemoteObject  _resize(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Resize (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "navibutton","resize", __ref, _value);}
RemoteObject _cvs1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("value", _value);
 BA.debugLineNum = 80;BA.debugLine="Public Sub Resize(value As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Dim cvs1 As B4XCanvas";
Debug.ShouldStop(65536);
_cvs1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs1", _cvs1);
 BA.debugLineNum = 82;BA.debugLine="cvs1.Initialize(lblText)";
Debug.ShouldStop(131072);
_cvs1.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_lbltext" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 83;BA.debugLine="Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFA";
Debug.ShouldStop(262144);
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)(navibutton.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(BA.numberCast(float.class, __ref.getField(true,"_fontsize" /*RemoteObject*/ ))));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 84;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(value, fnt)";
Debug.ShouldStop(524288);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_value),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 85;BA.debugLine="lblText.Width = r.Width + 10dip";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),navibutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0)));
 BA.debugLineNum = 87;BA.debugLine="imvIcon.Left = (mBase.Width - imvIcon.Width) / 2";
Debug.ShouldStop(4194304);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 89;BA.debugLine="imvLine.Width = mBase.Width";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imvline" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 90;BA.debugLine="lblText.Width = mBase.Width";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 91;BA.debugLine="mBase.Invalidate";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbadge(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setBadge (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setbadge")) { return __ref.runUserSub(false, "navibutton","setbadge", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 98;BA.debugLine="public Sub setBadge(value As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="If value <> \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_value,BA.ObjectToString(""))) { 
 BA.debugLineNum = 100;BA.debugLine="lblBadge.Text = value";
Debug.ShouldStop(8);
__ref.getField(false,"_lblbadge" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 101;BA.debugLine="lblBadge.Visible = True";
Debug.ShouldStop(16);
__ref.getField(false,"_lblbadge" /*RemoteObject*/ ).runMethod(true,"setVisible",navibutton.__c.getField(true,"True"));
 };
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbasecolor(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetBaseColor (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setbasecolor")) { return __ref.runUserSub(false, "navibutton","setbasecolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 76;BA.debugLine="Public Sub SetBaseColor(value As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="mBase.Color = value";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("setColor",_value);
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
public static RemoteObject  _setposition(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setPosition (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("setposition")) { return __ref.runUserSub(false, "navibutton","setposition", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 122;BA.debugLine="Public Sub setPosition(value As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="index = value";
Debug.ShouldStop(67108864);
__ref.setField ("_index" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("setTextColor (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "navibutton","settextcolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 118;BA.debugLine="Public Sub setTextColor(value As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="lblText.TextColor = value";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",_value);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("setTextSize (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("settextsize")) { return __ref.runUserSub(false, "navibutton","settextsize", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 114;BA.debugLine="Public Sub setTextSize(value As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="lblText.TextSize = value";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, _value));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _text(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Text (navibutton) ","navibutton",2,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("text")) { return __ref.runUserSub(false, "navibutton","text", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 109;BA.debugLine="Public Sub Text(value As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Resize(value)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.navibutton.class, "_resize" /*RemoteObject*/ ,(Object)(_value));
 BA.debugLineNum = 111;BA.debugLine="lblText.Text = value";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
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
}
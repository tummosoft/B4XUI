package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class toastmessage_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (toastmessage) ","toastmessage",2,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "toastmessage","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
toastmessage._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",toastmessage._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
toastmessage._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",toastmessage._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As Panel";
toastmessage._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",toastmessage._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
toastmessage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",toastmessage._xui);
 //BA.debugLineNum = 9;BA.debugLine="Public Tag As Object";
toastmessage._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",toastmessage._tag);
 //BA.debugLineNum = 11;BA.debugLine="Public TYPE_SUCCESS As Int = 0";
toastmessage._type_success = BA.numberCast(int.class, 0);__ref.setField("_type_success",toastmessage._type_success);
 //BA.debugLineNum = 12;BA.debugLine="Public TYPE_WARNING As Int = 1";
toastmessage._type_warning = BA.numberCast(int.class, 1);__ref.setField("_type_warning",toastmessage._type_warning);
 //BA.debugLineNum = 13;BA.debugLine="Public TYPE_INFO As Int = 2";
toastmessage._type_info = BA.numberCast(int.class, 2);__ref.setField("_type_info",toastmessage._type_info);
 //BA.debugLineNum = 14;BA.debugLine="Public TYPE_ERROR As Int = 3";
toastmessage._type_error = BA.numberCast(int.class, 3);__ref.setField("_type_error",toastmessage._type_error);
 //BA.debugLineNum = 15;BA.debugLine="Private imvIcon As ImageView";
toastmessage._imvicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imvicon",toastmessage._imvicon);
 //BA.debugLineNum = 16;BA.debugLine="Private lblContent As Label";
toastmessage._lblcontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcontent",toastmessage._lblcontent);
 //BA.debugLineNum = 17;BA.debugLine="Private fontsize As Int = 12";
toastmessage._fontsize = BA.numberCast(int.class, 12);__ref.setField("_fontsize",toastmessage._fontsize);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (toastmessage) ","toastmessage",2,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "toastmessage","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _clr = RemoteObject.createImmutable(0);
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 41;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="mBase = Base";
Debug.ShouldStop(512);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 43;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(1024);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 44;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(2048);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 45;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(4096);
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnewsize(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("getNewSize (toastmessage) ","toastmessage",2,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("getnewsize")) { return __ref.runUserSub(false, "toastmessage","getnewsize", __ref, _value);}
RemoteObject _cvs1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("value", _value);
 BA.debugLineNum = 109;BA.debugLine="private Sub getNewSize(value As String) As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Dim cvs1 As B4XCanvas";
Debug.ShouldStop(8192);
_cvs1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs1", _cvs1);
 BA.debugLineNum = 111;BA.debugLine="cvs1.Initialize(imvIcon)";
Debug.ShouldStop(16384);
_cvs1.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imvicon" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 112;BA.debugLine="Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFA";
Debug.ShouldStop(32768);
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)(toastmessage.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(BA.numberCast(float.class, __ref.getField(true,"_fontsize" /*RemoteObject*/ ))));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 113;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(value, fnt)";
Debug.ShouldStop(65536);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_value),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 115;BA.debugLine="Return r.Width";
Debug.ShouldStop(262144);
if (true) return BA.numberCast(int.class, _r.runMethod(true,"getWidth"));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _parentview) throws Exception{
try {
		Debug.PushSubsStack("Initialize (toastmessage) ","toastmessage",2,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "toastmessage","initialize", __ref, _ba, _callback, _eventname, _parentview);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("ParentView", _parentview);
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
 BA.debugLineNum = 25;BA.debugLine="imvIcon.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 26;BA.debugLine="lblContent.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 27;BA.debugLine="lblContent.TextSize = fontsize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, __ref.getField(true,"_fontsize" /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="ParentView.AddView(mBase, 0, 70%y, 60%x, 30dip)";
Debug.ShouldStop(134217728);
_parentview.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(toastmessage.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(toastmessage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 29;BA.debugLine="mBase.AddView(imvIcon, 5dip, 5dip, 30dip, 30dip)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imvicon" /*RemoteObject*/ ).getObject())),(Object)(toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 30;BA.debugLine="mBase.AddView(lblContent, 45dip, 5dip, mBase.Widt";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).getObject())),(Object)(toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 32;BA.debugLine="lblContent.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).runMethod(true,"setGravity",toastmessage.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 33;BA.debugLine="lblContent.TextColor = Colors.White";
Debug.ShouldStop(1);
__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).runMethod(true,"setTextColor",toastmessage.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 35;BA.debugLine="mBase.Elevation = 3dip";
Debug.ShouldStop(4);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setElevation",BA.numberCast(float.class, toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 36;BA.debugLine="mBase.As(B4XView).SetColorAndBorder(Colors.ARGB(2";
Debug.ShouldStop(8);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(toastmessage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 56)),(Object)(BA.numberCast(int.class, 142)),(Object)(BA.numberCast(int.class, 60)))),(Object)(toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(toastmessage.__c.getField(false,"Colors").getField(true,"White")),(Object)(toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 37;BA.debugLine="mBase.Visible = False";
Debug.ShouldStop(16);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",toastmessage.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketext(RemoteObject __ref,RemoteObject _text,RemoteObject _toasttype) throws Exception{
try {
		Debug.PushSubsStack("MakeText (toastmessage) ","toastmessage",2,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("maketext")) { return __ref.runUserSub(false, "toastmessage","maketext", __ref, _text, _toasttype);}
RemoteObject _s_label = RemoteObject.createImmutable(0);
RemoteObject _m_size = RemoteObject.createImmutable(0);
Debug.locals.put("Text", _text);
Debug.locals.put("ToastType", _toasttype);
 BA.debugLineNum = 52;BA.debugLine="Public Sub MakeText(Text As String, ToastType As I";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="Dim s_label As Int = getNewSize(Text)";
Debug.ShouldStop(2097152);
_s_label = __ref.runClassMethod (b4a.example.toastmessage.class, "_getnewsize" /*RemoteObject*/ ,(Object)(_text));Debug.locals.put("s_label", _s_label);Debug.locals.put("s_label", _s_label);
 BA.debugLineNum = 55;BA.debugLine="Dim m_size As Int = 70%x";
Debug.ShouldStop(4194304);
_m_size = toastmessage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"));Debug.locals.put("m_size", _m_size);Debug.locals.put("m_size", _m_size);
 BA.debugLineNum = 56;BA.debugLine="If s_label > m_size Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_s_label,BA.numberCast(double.class, _m_size))) { 
 BA.debugLineNum = 57;BA.debugLine="mBase.Width = m_size";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",_m_size);
 BA.debugLineNum = 58;BA.debugLine="mBase.Height = 42dip";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setHeight",toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42))));
 BA.debugLineNum = 59;BA.debugLine="lblContent.Top = 5dip";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).runMethod(true,"setTop",toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 60;BA.debugLine="imvIcon.Top = 6dip";
Debug.ShouldStop(134217728);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTop",toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6))));
 }else {
 BA.debugLineNum = 62;BA.debugLine="mBase.Width = s_label + 50dip";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_s_label,toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "+",1, 1));
 BA.debugLineNum = 63;BA.debugLine="mBase.Height = 30dip";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setHeight",toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))));
 BA.debugLineNum = 64;BA.debugLine="imvIcon.Height = 25dip";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setHeight",toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))));
 BA.debugLineNum = 65;BA.debugLine="imvIcon.Width = 25dip";
Debug.ShouldStop(1);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setWidth",toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))));
 BA.debugLineNum = 66;BA.debugLine="imvIcon.Top = 3dip";
Debug.ShouldStop(2);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTop",toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 67;BA.debugLine="lblContent.Top = 0dip";
Debug.ShouldStop(4);
__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).runMethod(true,"setTop",toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 68;BA.debugLine="lblContent.Left = 35dip";
Debug.ShouldStop(8);
__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).runMethod(true,"setLeft",toastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))));
 };
 BA.debugLineNum = 71;BA.debugLine="mBase.Left = (100%x - mBase.Width) / 2";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {toastmessage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 73;BA.debugLine="lblContent.Text = Text";
Debug.ShouldStop(256);
__ref.getField(false,"_lblcontent" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 75;BA.debugLine="If ToastType = TYPE_SUCCESS Then ' TYPE_SUCCESS";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_toasttype,BA.numberCast(double.class, __ref.getField(true,"_type_success" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 76;BA.debugLine="mBase.Color = Colors.ARGB(255, 102, 188, 106)";
Debug.ShouldStop(2048);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("setColor",toastmessage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 188)),(Object)(BA.numberCast(int.class, 106))));
 BA.debugLineNum = 77;BA.debugLine="imvIcon.Bitmap = LoadBitmap(File.DirAssets, \"suc";
Debug.ShouldStop(4096);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(false,"setBitmap",(toastmessage.__c.runMethod(false,"LoadBitmap",(Object)(toastmessage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("success.png"))).getObject()));
 }else 
{ BA.debugLineNum = 78;BA.debugLine="else if ToastType = TYPE_WARNING Then 'TYPE_WARNI";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_toasttype,BA.numberCast(double.class, __ref.getField(true,"_type_warning" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 79;BA.debugLine="mBase.Color = Colors.ARGB(255, 255, 168, 33)";
Debug.ShouldStop(16384);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("setColor",toastmessage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 168)),(Object)(BA.numberCast(int.class, 33))));
 BA.debugLineNum = 80;BA.debugLine="imvIcon.Bitmap = LoadBitmap(File.DirAssets, \"war";
Debug.ShouldStop(32768);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(false,"setBitmap",(toastmessage.__c.runMethod(false,"LoadBitmap",(Object)(toastmessage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("waring.png"))).getObject()));
 }else 
{ BA.debugLineNum = 81;BA.debugLine="else if ToastType = TYPE_INFO Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_toasttype,BA.numberCast(double.class, __ref.getField(true,"_type_info" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 82;BA.debugLine="mBase.Color = Colors.ARGB(255, 36, 186, 246)";
Debug.ShouldStop(131072);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("setColor",toastmessage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 36)),(Object)(BA.numberCast(int.class, 186)),(Object)(BA.numberCast(int.class, 246))));
 BA.debugLineNum = 83;BA.debugLine="imvIcon.Bitmap = LoadBitmap(File.DirAssets, \"inf";
Debug.ShouldStop(262144);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(false,"setBitmap",(toastmessage.__c.runMethod(false,"LoadBitmap",(Object)(toastmessage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("info.png"))).getObject()));
 }else 
{ BA.debugLineNum = 84;BA.debugLine="else if ToastType = TYPE_ERROR Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_toasttype,BA.numberCast(double.class, __ref.getField(true,"_type_error" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 85;BA.debugLine="mBase.Color = Colors.ARGB(255, 239, 82, 79)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("setColor",toastmessage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 239)),(Object)(BA.numberCast(int.class, 82)),(Object)(BA.numberCast(int.class, 79))));
 BA.debugLineNum = 86;BA.debugLine="imvIcon.Bitmap = LoadBitmap(File.DirAssets, \"err";
Debug.ShouldStop(2097152);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(false,"setBitmap",(toastmessage.__c.runMethod(false,"LoadBitmap",(Object)(toastmessage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("error.png"))).getObject()));
 }}}}
;
 BA.debugLineNum = 89;BA.debugLine="mBase.Visible = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",toastmessage.__c.getField(true,"False"));
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
public static void  _show(RemoteObject __ref,RemoteObject _duration) throws Exception{
try {
		Debug.PushSubsStack("Show (toastmessage) ","toastmessage",2,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "toastmessage","show", __ref, _duration); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref,_duration);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.toastmessage parent,RemoteObject __ref,RemoteObject _duration) {
this.parent = parent;
this.__ref = __ref;
this._duration = _duration;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.toastmessage parent;
RemoteObject _duration;
RemoteObject _anim = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (toastmessage) ","toastmessage",2,__ref.getField(false, "ba"),__ref,92);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Duration", _duration);
 BA.debugLineNum = 93;BA.debugLine="mBase.Visible = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="Dim anim As Animation";
Debug.ShouldStop(536870912);
_anim = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("anim", _anim);
 BA.debugLineNum = 95;BA.debugLine="anim.InitializeAlpha(\"\", 0, 1)";
Debug.ShouldStop(1073741824);
_anim.runVoidMethod ("InitializeAlpha",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 97;BA.debugLine="mBase.Visible = True";
Debug.ShouldStop(1);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 99;BA.debugLine="anim.Duration = Duration";
Debug.ShouldStop(4);
_anim.runMethod(true,"setDuration",BA.numberCast(long.class, _duration));
 BA.debugLineNum = 100;BA.debugLine="anim.Start(mBase)";
Debug.ShouldStop(8);
_anim.runVoidMethod ("Start",(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 102;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "toastmessage", "show"),BA.numberCast(int.class, 2000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 103;BA.debugLine="anim.InitializeAlpha(\"\", 1, 0)";
Debug.ShouldStop(64);
_anim.runVoidMethod ("InitializeAlpha",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 104;BA.debugLine="anim.Duration = Duration";
Debug.ShouldStop(128);
_anim.runMethod(true,"setDuration",BA.numberCast(long.class, _duration));
 BA.debugLineNum = 105;BA.debugLine="anim.Start(mBase)";
Debug.ShouldStop(256);
_anim.runVoidMethod ("Start",(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 106;BA.debugLine="mBase.Visible = False";
Debug.ShouldStop(512);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
}
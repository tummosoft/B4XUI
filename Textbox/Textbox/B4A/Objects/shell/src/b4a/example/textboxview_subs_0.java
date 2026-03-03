package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class textboxview_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (textboxview) ","textboxview",3,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "textboxview","base_resize", __ref, _width, _height);}
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
textboxview._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",textboxview._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
textboxview._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",textboxview._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView";
textboxview._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",textboxview._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
textboxview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",textboxview._xui);
 //BA.debugLineNum = 9;BA.debugLine="Public Tag As Object";
textboxview._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",textboxview._tag);
 //BA.debugLineNum = 10;BA.debugLine="Private txtInput As EditText";
textboxview._txtinput = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtinput",textboxview._txtinput);
 //BA.debugLineNum = 11;BA.debugLine="Private imvIcon As Label";
textboxview._imvicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imvicon",textboxview._imvicon);
 //BA.debugLineNum = 12;BA.debugLine="Private mBorderColor As Int = Colors.ARGB(255,246";
textboxview._mbordercolor = textboxview.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 246)),(Object)(BA.numberCast(int.class, 246)),(Object)(BA.numberCast(int.class, 246)));__ref.setField("_mbordercolor",textboxview._mbordercolor);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (textboxview) ","textboxview",3,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "textboxview","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _clr = RemoteObject.createImmutable(0);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 21;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="mBase = Base";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 23;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(4194304);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 24;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 25;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(16777216);
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 27;BA.debugLine="txtInput.Initialize(\"txtInput\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtinput" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("txtInput")));
 BA.debugLineNum = 29;BA.debugLine="mBase.Color = Colors.White";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",textboxview.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 31;BA.debugLine="txtInput.Color = Colors.Red";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtinput" /*RemoteObject*/ ).runVoidMethod ("setColor",textboxview.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 32;BA.debugLine="mBase.AddView(txtInput, 10dip, 2dip, mBase.Width";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_txtinput" /*RemoteObject*/ ).getObject())),(Object)(textboxview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(textboxview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),textboxview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),textboxview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)));
 BA.debugLineNum = 33;BA.debugLine="txtInput.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(1);
__ref.getField(false,"_txtinput" /*RemoteObject*/ ).runMethod(true,"setGravity",textboxview.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 34;BA.debugLine="txtInput.Text = \"Hello world\"";
Debug.ShouldStop(2);
__ref.getField(false,"_txtinput" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence("Hello world"));
 BA.debugLineNum = 36;BA.debugLine="imvIcon.Initialize(\"\")";
Debug.ShouldStop(8);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 37;BA.debugLine="mBase.AddView(imvIcon, txtInput.Width, 2dip, 25di";
Debug.ShouldStop(16);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imvicon" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(false,"_txtinput" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(textboxview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(textboxview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(__ref.getField(false,"_txtinput" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 38;BA.debugLine="imvIcon.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
Debug.ShouldStop(32);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {textboxview.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),textboxview.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 40;BA.debugLine="txtInput.Color = Colors.Transparent";
Debug.ShouldStop(128);
__ref.getField(false,"_txtinput" /*RemoteObject*/ ).runVoidMethod ("setColor",textboxview.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 41;BA.debugLine="mBase.SetColorAndBorder(Colors.White, 1dip, mBord";
Debug.ShouldStop(256);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(textboxview.__c.getField(false,"Colors").getField(true,"White")),(Object)(textboxview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(__ref.getField(true,"_mbordercolor" /*RemoteObject*/ )),(Object)(textboxview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 43;BA.debugLine="imvIcon.Typeface = Typeface.MATERIALICONS";
Debug.ShouldStop(1024);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(false,"setTypeface",textboxview.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 44;BA.debugLine="imvIcon.Text = Chr(0xE5DB)";
Debug.ShouldStop(2048);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(textboxview.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe5db))))));
 BA.debugLineNum = 45;BA.debugLine="imvIcon.Color = Colors.Transparent";
Debug.ShouldStop(4096);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runVoidMethod ("setColor",textboxview.__c.getField(false,"Colors").getField(true,"Transparent"));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (textboxview) ","textboxview",3,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "textboxview","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(32768);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 17;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(65536);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setIcon (textboxview) ","textboxview",3,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "textboxview","seticon", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 56;BA.debugLine="Public Sub setIcon(value As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="imvIcon.Text = value";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
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
public static RemoteObject  _seticontypeface(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setIconTypeface (textboxview) ","textboxview",3,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("seticontypeface")) { return __ref.runUserSub(false, "textboxview","seticontypeface", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 52;BA.debugLine="Public Sub setIconTypeface(value As Typeface)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="imvIcon.Typeface = value";
Debug.ShouldStop(1048576);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(false,"setTypeface",(_value.getObject()));
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
}
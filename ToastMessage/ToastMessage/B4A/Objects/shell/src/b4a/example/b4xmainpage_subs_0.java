package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 28;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Root = Root1";
Debug.ShouldStop(268435456);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 30;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="Tmsg.Initialize(Me, \"Tmsg\", Root)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tmsg" /*RemoteObject*/ ).runClassMethod (b4a.example.toastmessage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("Tmsg")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_root" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Tmsg.MakeText(\"This event will be called once\", T";
Debug.ShouldStop(16);
__ref.getField(false,"_tmsg" /*RemoteObject*/ ).runClassMethod (b4a.example.toastmessage.class, "_maketext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("This event will be called once")),(Object)(__ref.getField(false,"_tmsg" /*RemoteObject*/ ).getField(true,"_type_error" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="Tmsg.Show(500)";
Debug.ShouldStop(32);
__ref.getField(false,"_tmsg" /*RemoteObject*/ ).runClassMethod (b4a.example.toastmessage.class, "_show" /*void*/ ,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("button2_click")) { return __ref.runUserSub(false, "b4xmainpage","button2_click", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Private Sub Button2_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Tmsg.MakeText(\"Design Toast is a custom Toast Lib";
Debug.ShouldStop(512);
__ref.getField(false,"_tmsg" /*RemoteObject*/ ).runClassMethod (b4a.example.toastmessage.class, "_maketext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Design Toast is a custom Toast Library in Android using B4X")),(Object)(__ref.getField(false,"_tmsg" /*RemoteObject*/ ).getField(true,"_type_info" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="Tmsg.Show(500)";
Debug.ShouldStop(1024);
__ref.getField(false,"_tmsg" /*RemoteObject*/ ).runClassMethod (b4a.example.toastmessage.class, "_show" /*void*/ ,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("button3_click")) { return __ref.runUserSub(false, "b4xmainpage","button3_click", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Private Sub Button3_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Tmsg.MakeText(\"This is a SUCCESS Toast\", Tmsg.TYP";
Debug.ShouldStop(16384);
__ref.getField(false,"_tmsg" /*RemoteObject*/ ).runClassMethod (b4a.example.toastmessage.class, "_maketext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("This is a SUCCESS Toast")),(Object)(__ref.getField(false,"_tmsg" /*RemoteObject*/ ).getField(true,"_type_success" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="Tmsg.Show(500)";
Debug.ShouldStop(32768);
__ref.getField(false,"_tmsg" /*RemoteObject*/ ).runClassMethod (b4a.example.toastmessage.class, "_show" /*void*/ ,(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("button4_click")) { return __ref.runUserSub(false, "b4xmainpage","button4_click", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Private Sub Button4_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Tmsg.MakeText(\"This is a WARNING Toast\", Tmsg.TYP";
Debug.ShouldStop(524288);
__ref.getField(false,"_tmsg" /*RemoteObject*/ ).runClassMethod (b4a.example.toastmessage.class, "_maketext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("This is a WARNING Toast")),(Object)(__ref.getField(false,"_tmsg" /*RemoteObject*/ ).getField(true,"_type_warning" /*RemoteObject*/ )));
 BA.debugLineNum = 53;BA.debugLine="Tmsg.Show(500)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tmsg" /*RemoteObject*/ ).runClassMethod (b4a.example.toastmessage.class, "_show" /*void*/ ,(Object)(BA.numberCast(int.class, 500)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 12;BA.debugLine="Private mPanel As B4XView";
b4xmainpage._mpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mpanel",b4xmainpage._mpanel);
 //BA.debugLineNum = 13;BA.debugLine="Private mLabel As B4XView";
b4xmainpage._mlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mlabel",b4xmainpage._mlabel);
 //BA.debugLineNum = 14;BA.debugLine="Private mTarget As B4XView";
b4xmainpage._mtarget = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mtarget",b4xmainpage._mtarget);
 //BA.debugLineNum = 15;BA.debugLine="Private DurationMs As Int = 3000";
b4xmainpage._durationms = BA.numberCast(int.class, 3000);__ref.setField("_durationms",b4xmainpage._durationms);
 //BA.debugLineNum = 16;BA.debugLine="Private Panel1 As Panel";
b4xmainpage._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",b4xmainpage._panel1);
 //BA.debugLineNum = 17;BA.debugLine="Private Tmsg As ToastMessage";
b4xmainpage._tmsg = RemoteObject.createNew ("b4a.example.toastmessage");__ref.setField("_tmsg",b4xmainpage._tmsg);
 //BA.debugLineNum = 18;BA.debugLine="Private Button2 As Button";
b4xmainpage._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button2",b4xmainpage._button2);
 //BA.debugLineNum = 19;BA.debugLine="Private Button3 As Button";
b4xmainpage._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button3",b4xmainpage._button3);
 //BA.debugLineNum = 20;BA.debugLine="Private Button4 As Button";
b4xmainpage._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button4",b4xmainpage._button4);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
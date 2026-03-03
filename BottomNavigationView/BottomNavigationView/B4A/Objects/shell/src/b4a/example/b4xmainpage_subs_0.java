package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _nvbutton = null;
RemoteObject _basewidth = RemoteObject.createImmutable(0);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="Dim nvButton(5) As clsNaviButton";
Debug.ShouldStop(2097152);
_nvbutton = RemoteObject.createNewArray ("b4a.example.bottomnavigationview._clsnavibutton", new int[] {5}, new Object[]{});Debug.locals.put("nvButton", _nvbutton);
 BA.debugLineNum = 23;BA.debugLine="Dim baseWidth As Int = 100%x / nvButton.Length";
Debug.ShouldStop(4194304);
_basewidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),_nvbutton.getField(true,"length" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("baseWidth", _basewidth);Debug.locals.put("baseWidth", _basewidth);
 BA.debugLineNum = 26;BA.debugLine="nvButton(0).Initialize";
Debug.ShouldStop(33554432);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="nvButton(0).Icon = Chr(0xF015)";
Debug.ShouldStop(67108864);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).setField ("Icon" /*RemoteObject*/ ,BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf015))))));
 BA.debugLineNum = 28;BA.debugLine="nvButton(0).Font = Typeface.FONTAWESOME";
Debug.ShouldStop(134217728);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).getField(false,"Font" /*RemoteObject*/ ).setObject (b4xmainpage.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 29;BA.debugLine="nvButton(0).Text = \"Home\"";
Debug.ShouldStop(268435456);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).setField ("Text" /*RemoteObject*/ ,BA.ObjectToString("Home"));
 BA.debugLineNum = 30;BA.debugLine="BottomNavigationView1.AddButton(nvButton(0))";
Debug.ShouldStop(536870912);
__ref.getField(false,"_bottomnavigationview1" /*RemoteObject*/ ).runClassMethod (b4a.example.bottomnavigationview.class, "_addbutton" /*RemoteObject*/ ,(Object)(_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0))));
 BA.debugLineNum = 32;BA.debugLine="nvButton(1).Initialize";
Debug.ShouldStop(-2147483648);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="nvButton(1).Icon =Chr(0xF073)";
Debug.ShouldStop(1);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).setField ("Icon" /*RemoteObject*/ ,BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf073))))));
 BA.debugLineNum = 34;BA.debugLine="nvButton(1).Font = Typeface.FONTAWESOME";
Debug.ShouldStop(2);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).getField(false,"Font" /*RemoteObject*/ ).setObject (b4xmainpage.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 35;BA.debugLine="nvButton(1).Text =\"Calendar\"";
Debug.ShouldStop(4);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).setField ("Text" /*RemoteObject*/ ,BA.ObjectToString("Calendar"));
 BA.debugLineNum = 36;BA.debugLine="BottomNavigationView1.AddButton(nvButton(1))";
Debug.ShouldStop(8);
__ref.getField(false,"_bottomnavigationview1" /*RemoteObject*/ ).runClassMethod (b4a.example.bottomnavigationview.class, "_addbutton" /*RemoteObject*/ ,(Object)(_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1))));
 BA.debugLineNum = 38;BA.debugLine="nvButton(2).Initialize";
Debug.ShouldStop(32);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 2)).runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="nvButton(2).Font = Typeface.FONTAWESOME";
Debug.ShouldStop(64);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 2)).getField(false,"Font" /*RemoteObject*/ ).setObject (b4xmainpage.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 40;BA.debugLine="nvButton(2).Icon = Chr(0xF02B)";
Debug.ShouldStop(128);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 2)).setField ("Icon" /*RemoteObject*/ ,BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf02b))))));
 BA.debugLineNum = 41;BA.debugLine="nvButton(2).Text =\"Category\"";
Debug.ShouldStop(256);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 2)).setField ("Text" /*RemoteObject*/ ,BA.ObjectToString("Category"));
 BA.debugLineNum = 42;BA.debugLine="BottomNavigationView1.AddButton(nvButton(2))";
Debug.ShouldStop(512);
__ref.getField(false,"_bottomnavigationview1" /*RemoteObject*/ ).runClassMethod (b4a.example.bottomnavigationview.class, "_addbutton" /*RemoteObject*/ ,(Object)(_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 2))));
 BA.debugLineNum = 44;BA.debugLine="nvButton(3).Initialize";
Debug.ShouldStop(2048);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 3)).runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="nvButton(3).Font = Typeface.MATERIALICONS";
Debug.ShouldStop(4096);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 3)).getField(false,"Font" /*RemoteObject*/ ).setObject (b4xmainpage.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 46;BA.debugLine="nvButton(3).Icon = Chr(0xE0C8)";
Debug.ShouldStop(8192);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 3)).setField ("Icon" /*RemoteObject*/ ,BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe0c8))))));
 BA.debugLineNum = 47;BA.debugLine="nvButton(3).Text =\"Location\"";
Debug.ShouldStop(16384);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 3)).setField ("Text" /*RemoteObject*/ ,BA.ObjectToString("Location"));
 BA.debugLineNum = 48;BA.debugLine="BottomNavigationView1.AddButton(nvButton(3))";
Debug.ShouldStop(32768);
__ref.getField(false,"_bottomnavigationview1" /*RemoteObject*/ ).runClassMethod (b4a.example.bottomnavigationview.class, "_addbutton" /*RemoteObject*/ ,(Object)(_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 3))));
 BA.debugLineNum = 50;BA.debugLine="nvButton(4).Initialize";
Debug.ShouldStop(131072);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 4)).runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="nvButton(4).Font = Typeface.MATERIALICONS";
Debug.ShouldStop(262144);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 4)).getField(false,"Font" /*RemoteObject*/ ).setObject (b4xmainpage.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 52;BA.debugLine="nvButton(4).Icon =Chr(0xE7F4)";
Debug.ShouldStop(524288);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 4)).setField ("Icon" /*RemoteObject*/ ,BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe7f4))))));
 BA.debugLineNum = 53;BA.debugLine="nvButton(4).Text =\"Notification\"";
Debug.ShouldStop(1048576);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 4)).setField ("Text" /*RemoteObject*/ ,BA.ObjectToString("Notification"));
 BA.debugLineNum = 54;BA.debugLine="nvButton(4).Badge = \"5\"";
Debug.ShouldStop(2097152);
_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 4)).setField ("Badge" /*RemoteObject*/ ,BA.ObjectToString("5"));
 BA.debugLineNum = 56;BA.debugLine="BottomNavigationView1.AddButton(nvButton(4))";
Debug.ShouldStop(8388608);
__ref.getField(false,"_bottomnavigationview1" /*RemoteObject*/ ).runClassMethod (b4a.example.bottomnavigationview.class, "_addbutton" /*RemoteObject*/ ,(Object)(_nvbutton.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 4))));
 BA.debugLineNum = 58;BA.debugLine="BottomNavigationView1.Build";
Debug.ShouldStop(33554432);
__ref.getField(false,"_bottomnavigationview1" /*RemoteObject*/ ).runClassMethod (b4a.example.bottomnavigationview.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 60;BA.debugLine="BottomNavigationView1.Acticve(1, True)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_bottomnavigationview1" /*RemoteObject*/ ).runClassMethod (b4a.example.bottomnavigationview.class, "_acticve" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bottomnavigationview1_itemclick(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("BottomNavigationView1_ItemClick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("bottomnavigationview1_itemclick")) { return __ref.runUserSub(false, "b4xmainpage","bottomnavigationview1_itemclick", __ref, _position);}
Debug.locals.put("position", _position);
 BA.debugLineNum = 69;BA.debugLine="Sub BottomNavigationView1_ItemClick(position As In";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Log(\"position=\" & position)";
Debug.ShouldStop(32);
b4xmainpage.__c.runVoidMethod ("LogImpl","2851969",RemoteObject.concat(RemoteObject.createImmutable("position="),_position),0);
 BA.debugLineNum = 71;BA.debugLine="BottomNavigationView1.Acticve(position, True)";
Debug.ShouldStop(64);
__ref.getField(false,"_bottomnavigationview1" /*RemoteObject*/ ).runClassMethod (b4a.example.bottomnavigationview.class, "_acticve" /*RemoteObject*/ ,(Object)(_position),(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 11;BA.debugLine="Private BottomNavigationView1 As BottomNavigation";
b4xmainpage._bottomnavigationview1 = RemoteObject.createNew ("b4a.example.bottomnavigationview");__ref.setField("_bottomnavigationview1",b4xmainpage._bottomnavigationview1);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nvbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("nvButton_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("nvbutton_click")) { return __ref.runUserSub(false, "b4xmainpage","nvbutton_click", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Private Sub nvButton_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
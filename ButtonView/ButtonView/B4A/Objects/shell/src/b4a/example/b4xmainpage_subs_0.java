package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Root = Root1";
Debug.ShouldStop(16777216);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="RoundButton1.SetIcon(\"\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_roundbutton1" /*RemoteObject*/ ).runClassMethod (b4a.example.roundbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 30;BA.debugLine="RoundButton2.SetFont(Typeface.MATERIALICONS)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_roundbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.roundbutton.class, "_setfont" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), b4xmainpage.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS")));
 BA.debugLineNum = 31;BA.debugLine="RoundButton2.SetIcon(Chr(0xE145))";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_roundbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.roundbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe145)))))));
 BA.debugLineNum = 32;BA.debugLine="RoundButton2.SetColor(Colors.ARGB(255,40, 69, 214";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_roundbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.roundbutton.class, "_setcolor" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 40)),(Object)(BA.numberCast(int.class, 69)),(Object)(BA.numberCast(int.class, 214)))));
 BA.debugLineNum = 33;BA.debugLine="RoundButton2.SetTextColor(Colors.White)";
Debug.ShouldStop(1);
__ref.getField(false,"_roundbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.roundbutton.class, "_settextcolor" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 34;BA.debugLine="RoundButton2.SetIconColor(Colors.White)";
Debug.ShouldStop(2);
__ref.getField(false,"_roundbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.roundbutton.class, "_seticoncolor" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 36;BA.debugLine="RoundButton3.SetColor(Colors.ARGB(255,199, 234, 1";
Debug.ShouldStop(8);
__ref.getField(false,"_roundbutton3" /*RemoteObject*/ ).runClassMethod (b4a.example.roundbutton.class, "_setcolor" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 199)),(Object)(BA.numberCast(int.class, 234)),(Object)(BA.numberCast(int.class, 187)))));
 BA.debugLineNum = 37;BA.debugLine="RoundButton3.SetTextColor(Colors.White)";
Debug.ShouldStop(16);
__ref.getField(false,"_roundbutton3" /*RemoteObject*/ ).runClassMethod (b4a.example.roundbutton.class, "_settextcolor" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 38;BA.debugLine="RoundButton3.Disabled = True";
Debug.ShouldStop(32);
__ref.getField(false,"_roundbutton3" /*RemoteObject*/ ).runClassMethod (b4a.example.roundbutton.class, "_setdisabled" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="BitmapButton1.Text = \"Photos\"";
Debug.ShouldStop(128);
__ref.getField(false,"_bitmapbutton1" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_settext",BA.ObjectToString("Photos"));
 BA.debugLineNum = 41;BA.debugLine="BitmapButton1.TextSize = 10";
Debug.ShouldStop(256);
__ref.getField(false,"_bitmapbutton1" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_settextsize",BA.numberCast(int.class, 10));
 BA.debugLineNum = 42;BA.debugLine="BitmapButton1.TextColor = Colors.Gray";
Debug.ShouldStop(512);
__ref.getField(false,"_bitmapbutton1" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_settextcolor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 44;BA.debugLine="BitmapButton2.SetBitmap(File.DirAssets, \"icons8-p";
Debug.ShouldStop(2048);
__ref.getField(false,"_bitmapbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_setbitmap" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icons8-pdf-48.png")));
 BA.debugLineNum = 45;BA.debugLine="BitmapButton2.BackgroundColor = Colors.ARGB(255,2";
Debug.ShouldStop(4096);
__ref.getField(false,"_bitmapbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_setbackgroundcolor",b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 240)),(Object)(BA.numberCast(int.class, 228))));
 BA.debugLineNum = 46;BA.debugLine="BitmapButton2.Text = \"PDF Files\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_bitmapbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_settext",BA.ObjectToString("PDF Files"));
 BA.debugLineNum = 47;BA.debugLine="BitmapButton2.TextSize = 10";
Debug.ShouldStop(16384);
__ref.getField(false,"_bitmapbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_settextsize",BA.numberCast(int.class, 10));
 BA.debugLineNum = 48;BA.debugLine="BitmapButton2.TextColor = Colors.Gray";
Debug.ShouldStop(32768);
__ref.getField(false,"_bitmapbutton2" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_settextcolor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 50;BA.debugLine="BitmapButton3.SetBitmap(File.DirAssets, \"cloud-se";
Debug.ShouldStop(131072);
__ref.getField(false,"_bitmapbutton3" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_setbitmap" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("cloud-server.png")));
 BA.debugLineNum = 51;BA.debugLine="BitmapButton3.BackgroundColor = Colors.ARGB(255,2";
Debug.ShouldStop(262144);
__ref.getField(false,"_bitmapbutton3" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_setbackgroundcolor",b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 240)),(Object)(BA.numberCast(int.class, 117)),(Object)(BA.numberCast(int.class, 174))));
 BA.debugLineNum = 52;BA.debugLine="BitmapButton3.Text = \"Clouds\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_bitmapbutton3" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_settext",BA.ObjectToString("Clouds"));
 BA.debugLineNum = 53;BA.debugLine="BitmapButton3.TextSize = 10";
Debug.ShouldStop(1048576);
__ref.getField(false,"_bitmapbutton3" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_settextsize",BA.numberCast(int.class, 10));
 BA.debugLineNum = 54;BA.debugLine="BitmapButton3.TextColor = Colors.Gray";
Debug.ShouldStop(2097152);
__ref.getField(false,"_bitmapbutton3" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapbutton.class, "_settextcolor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bitmapbutton3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BitmapButton3_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("bitmapbutton3_click")) { return __ref.runUserSub(false, "b4xmainpage","bitmapbutton3_click", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Private Sub BitmapButton3_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private RoundButton1 As RoundButton";
b4xmainpage._roundbutton1 = RemoteObject.createNew ("b4a.example.roundbutton");__ref.setField("_roundbutton1",b4xmainpage._roundbutton1);
 //BA.debugLineNum = 12;BA.debugLine="Private RoundButton2 As RoundButton";
b4xmainpage._roundbutton2 = RemoteObject.createNew ("b4a.example.roundbutton");__ref.setField("_roundbutton2",b4xmainpage._roundbutton2);
 //BA.debugLineNum = 13;BA.debugLine="Private BitmapButton2 As BitmapButton";
b4xmainpage._bitmapbutton2 = RemoteObject.createNew ("b4a.example.bitmapbutton");__ref.setField("_bitmapbutton2",b4xmainpage._bitmapbutton2);
 //BA.debugLineNum = 14;BA.debugLine="Private RoundButton3 As RoundButton";
b4xmainpage._roundbutton3 = RemoteObject.createNew ("b4a.example.roundbutton");__ref.setField("_roundbutton3",b4xmainpage._roundbutton3);
 //BA.debugLineNum = 15;BA.debugLine="Private BitmapButton1 As BitmapButton";
b4xmainpage._bitmapbutton1 = RemoteObject.createNew ("b4a.example.bitmapbutton");__ref.setField("_bitmapbutton1",b4xmainpage._bitmapbutton1);
 //BA.debugLineNum = 16;BA.debugLine="Private BitmapButton3 As BitmapButton";
b4xmainpage._bitmapbutton3 = RemoteObject.createNew ("b4a.example.bitmapbutton");__ref.setField("_bitmapbutton3",b4xmainpage._bitmapbutton3);
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
public static RemoteObject  _roundbutton2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RoundButton2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("roundbutton2_click")) { return __ref.runUserSub(false, "b4xmainpage","roundbutton2_click", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Private Sub RoundButton2_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
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
}
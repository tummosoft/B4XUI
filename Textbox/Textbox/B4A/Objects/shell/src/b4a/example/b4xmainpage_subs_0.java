package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _progress = RemoteObject.createImmutable(0);
RemoteObject _sweepangle = RemoteObject.createImmutable(0f);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="Dim progress As Int = 80";
Debug.ShouldStop(268435456);
_progress = BA.numberCast(int.class, 80);Debug.locals.put("progress", _progress);Debug.locals.put("progress", _progress);
 BA.debugLineNum = 30;BA.debugLine="Dim sweepAngle As Float = 360 * progress / 100";
Debug.ShouldStop(536870912);
_sweepangle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_progress,RemoteObject.createImmutable(100)}, "*/",0, 0));Debug.locals.put("sweepAngle", _sweepangle);Debug.locals.put("sweepAngle", _sweepangle);
 BA.debugLineNum = 40;BA.debugLine="bc.Initialize(ImageView1.Width, ImageView1.Height";
Debug.ShouldStop(128);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 42;BA.debugLine="DrawProgress(45)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_drawprogress" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 45)));
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
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 50;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private ImageView1 As ImageView";
b4xmainpage._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageview1",b4xmainpage._imageview1);
 //BA.debugLineNum = 12;BA.debugLine="Dim bc As BitmapCreator";
b4xmainpage._bc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_bc",b4xmainpage._bc);
 //BA.debugLineNum = 13;BA.debugLine="Dim lblStatus As Label";
b4xmainpage._lblstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblstatus",b4xmainpage._lblstatus);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _drawprogress(RemoteObject __ref,RemoteObject _percent) throws Exception{
try {
		Debug.PushSubsStack("DrawProgress (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("drawprogress")) { return __ref.runUserSub(false, "b4xmainpage","drawprogress", __ref, _percent);}
RemoteObject _centerx = RemoteObject.createImmutable(0);
RemoteObject _centery = RemoteObject.createImmutable(0);
RemoteObject _radius = RemoteObject.createImmutable(0);
RemoteObject _sweepangle = RemoteObject.createImmutable(0f);
Debug.locals.put("Percent", _percent);
 BA.debugLineNum = 54;BA.debugLine="Sub DrawProgress(Percent As Float)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="bc.FillRect(Colors.White, bc.TargetRect)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_fillrect",(Object)(b4xmainpage.__c.getField(false,"Colors").getField(true,"White")),(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")));
 BA.debugLineNum = 60;BA.debugLine="Dim centerX As Int = bc.mWidth / 2";
Debug.ShouldStop(134217728);
_centerx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("centerX", _centerx);Debug.locals.put("centerX", _centerx);
 BA.debugLineNum = 61;BA.debugLine="Dim centerY As Int = bc.mHeight / 2";
Debug.ShouldStop(268435456);
_centery = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("centerY", _centery);Debug.locals.put("centerY", _centery);
 BA.debugLineNum = 62;BA.debugLine="Dim radius As Int =  bc.mWidth / 2";
Debug.ShouldStop(536870912);
_radius = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("radius", _radius);Debug.locals.put("radius", _radius);
 BA.debugLineNum = 65;BA.debugLine="bc.DrawCircle(centerX, centerY, radius, Colors.AR";
Debug.ShouldStop(1);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawcircle",(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _centery)),(Object)(BA.numberCast(float.class, _radius)),(Object)(b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 214)),(Object)(BA.numberCast(int.class, 214)),(Object)(BA.numberCast(int.class, 214)))),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 66;BA.debugLine="bc.DrawCircle(centerX, centerY, radius, Colors.AR";
Debug.ShouldStop(2);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawcircle",(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _centery)),(Object)(BA.numberCast(float.class, _radius)),(Object)(b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 238)),(Object)(BA.numberCast(int.class, 238)),(Object)(BA.numberCast(int.class, 238)))),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 18)));
 BA.debugLineNum = 68;BA.debugLine="Dim sweepAngle As Float = 360 * Percent / 100";
Debug.ShouldStop(8);
_sweepangle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_percent,RemoteObject.createImmutable(100)}, "*/",0, 0));Debug.locals.put("sweepAngle", _sweepangle);Debug.locals.put("sweepAngle", _sweepangle);
 BA.debugLineNum = 71;BA.debugLine="bc.DrawArc(centerX, centerY, radius, Colors.ARGB(";
Debug.ShouldStop(64);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawarc",(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _centery)),(Object)(BA.numberCast(float.class, _radius)),(Object)(b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 245)),(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 74)))),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 18)),(Object)(BA.numberCast(float.class, 50)),(Object)(_sweepangle));
 BA.debugLineNum = 73;BA.debugLine="ImageView1.Bitmap = bc.Bitmap";
Debug.ShouldStop(256);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(false,"setBitmap",(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_getbitmap").getObject()));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
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
}
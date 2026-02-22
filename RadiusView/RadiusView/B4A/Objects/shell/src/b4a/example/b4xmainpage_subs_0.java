package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _targetsize = RemoteObject.createImmutable(0);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Root = Root1";
Debug.ShouldStop(16777216);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="imgCheckBox.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_imgcheckbox" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="Root.AddView(imgCheckBox, 50dip, 150dip, 220dip,";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgcheckbox" /*RemoteObject*/ ).getObject())),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 220)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 30;BA.debugLine="Dim TargetSize As Int = 50dip";
Debug.ShouldStop(536870912);
_targetsize = b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)));Debug.locals.put("TargetSize", _targetsize);Debug.locals.put("TargetSize", _targetsize);
 BA.debugLineNum = 31;BA.debugLine="bc.Initialize(TargetSize / xui.Scale, TargetSize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_targetsize,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale")}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_targetsize,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale")}, "/",0, 0))));
 BA.debugLineNum = 34;BA.debugLine="DrawCheckBox";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_drawcheckbox" /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, imgCheckBox)";
Debug.ShouldStop(32);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_setbitmaptoimageview",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_getbitmap")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imgcheckbox" /*RemoteObject*/ ).getObject()));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private pnlButton As B4XView";
b4xmainpage._pnlbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlbutton",b4xmainpage._pnlbutton);
 //BA.debugLineNum = 12;BA.debugLine="Private CheckBoxState As Boolean = False ' False:";
b4xmainpage._checkboxstate = b4xmainpage.__c.getField(true,"False");__ref.setField("_checkboxstate",b4xmainpage._checkboxstate);
 //BA.debugLineNum = 13;BA.debugLine="Private bc As BitmapCreator";
b4xmainpage._bc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_bc",b4xmainpage._bc);
 //BA.debugLineNum = 14;BA.debugLine="Private imgCheckBox As ImageView";
b4xmainpage._imgcheckbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgcheckbox",b4xmainpage._imgcheckbox);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createradiusbutton(RemoteObject __ref,RemoteObject _target,RemoteObject _radius,RemoteObject _btncolor,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CreateRadiusButton (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("createradiusbutton")) { return __ref.runUserSub(false, "b4xmainpage","createradiusbutton", __ref, _target, _radius, _btncolor, _text);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Target", _target);
Debug.locals.put("Radius", _radius);
Debug.locals.put("BtnColor", _btncolor);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 43;BA.debugLine="Sub CreateRadiusButton(Target As B4XView, Radius A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="Dim bc As BitmapCreator";
Debug.ShouldStop(4096);
b4xmainpage._bc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_bc",b4xmainpage._bc);
 BA.debugLineNum = 46;BA.debugLine="bc.Initialize(Target.Width, Target.Height)";
Debug.ShouldStop(8192);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(_target.runMethod(true,"getWidth")),(Object)(_target.runMethod(true,"getHeight")));
 BA.debugLineNum = 49;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BtnColor, True,";
Debug.ShouldStop(65536);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrectrounded",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(_btncolor),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)),(Object)(_radius));
 BA.debugLineNum = 52;BA.debugLine="Dim bmp As B4XBitmap = bc.Bitmap";
Debug.ShouldStop(524288);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = __ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_getbitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 55;BA.debugLine="Target.SetBitmap(bmp)";
Debug.ShouldStop(4194304);
_target.runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 BA.debugLineNum = 58;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(33554432);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 59;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(67108864);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 60;BA.debugLine="lbl.Text = Text";
Debug.ShouldStop(134217728);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 61;BA.debugLine="lbl.TextColor = Colors.White";
Debug.ShouldStop(268435456);
_lbl.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 62;BA.debugLine="lbl.TextSize = 18";
Debug.ShouldStop(536870912);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 63;BA.debugLine="lbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(1073741824);
_lbl.runMethod(true,"setGravity",b4xmainpage.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 64;BA.debugLine="Target.AddView(lbl, 0, 0, Target.Width, Target.He";
Debug.ShouldStop(-2147483648);
_target.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_target.runMethod(true,"getWidth")),(Object)(_target.runMethod(true,"getHeight")));
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
public static RemoteObject  _drawcheckbox(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawCheckBox (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("drawcheckbox")) { return __ref.runUserSub(false, "b4xmainpage","drawcheckbox", __ref);}
RemoteObject _bordercolor = RemoteObject.createImmutable(0);
RemoteObject _borderwidth = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0f);
RemoteObject _top = RemoteObject.createImmutable(0f);
RemoteObject _right = RemoteObject.createImmutable(0f);
RemoteObject _bottom = RemoteObject.createImmutable(0f);
RemoteObject _tickbrush = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
 BA.debugLineNum = 68;BA.debugLine="Private Sub DrawCheckBox";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="bc.DrawRect(bc.TargetRect, xui.Color_Transparent,";
Debug.ShouldStop(32);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrect",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 74;BA.debugLine="Dim BorderColor As Int = xui.Color_Black";
Debug.ShouldStop(512);
_bordercolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black");Debug.locals.put("BorderColor", _bordercolor);Debug.locals.put("BorderColor", _bordercolor);
 BA.debugLineNum = 75;BA.debugLine="Dim BorderWidth As Int = 2";
Debug.ShouldStop(1024);
_borderwidth = BA.numberCast(int.class, 2);Debug.locals.put("BorderWidth", _borderwidth);Debug.locals.put("BorderWidth", _borderwidth);
 BA.debugLineNum = 77;BA.debugLine="bc.DrawRect(bc.TargetRect, BorderColor, False, Bo";
Debug.ShouldStop(4096);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrect",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(_bordercolor),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(_borderwidth));
 BA.debugLineNum = 80;BA.debugLine="If CheckBoxState Then";
Debug.ShouldStop(32768);
if (__ref.getField(true,"_checkboxstate" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 83;BA.debugLine="Dim Left As Float = 0";
Debug.ShouldStop(262144);
_left = BA.numberCast(float.class, 0);Debug.locals.put("Left", _left);Debug.locals.put("Left", _left);
 BA.debugLineNum = 84;BA.debugLine="Dim Top As Float = 0";
Debug.ShouldStop(524288);
_top = BA.numberCast(float.class, 0);Debug.locals.put("Top", _top);Debug.locals.put("Top", _top);
 BA.debugLineNum = 85;BA.debugLine="Dim Right As Float = bc.TargetRect.Width";
Debug.ShouldStop(1048576);
_right = __ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect").runMethod(true,"getWidth");Debug.locals.put("Right", _right);Debug.locals.put("Right", _right);
 BA.debugLineNum = 86;BA.debugLine="Dim Bottom As Float = bc.TargetRect.Height";
Debug.ShouldStop(2097152);
_bottom = __ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect").runMethod(true,"getHeight");Debug.locals.put("Bottom", _bottom);Debug.locals.put("Bottom", _bottom);
 BA.debugLineNum = 89;BA.debugLine="Dim TickBrush As BCBrush = bc.CreateBrushFromCol";
Debug.ShouldStop(16777216);
_tickbrush = __ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")));Debug.locals.put("TickBrush", _tickbrush);Debug.locals.put("TickBrush", _tickbrush);
 BA.debugLineNum = 92;BA.debugLine="bc.DrawLine2(Left + (Right - Left) * 0.2, Top +";
Debug.ShouldStop(134217728);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawline2",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,(RemoteObject.solve(new RemoteObject[] {_right,_left}, "-",1, 0)),RemoteObject.createImmutable(0.2)}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,(RemoteObject.solve(new RemoteObject[] {_bottom,_top}, "-",1, 0)),RemoteObject.createImmutable(0.4)}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,(RemoteObject.solve(new RemoteObject[] {_right,_left}, "-",1, 0)),RemoteObject.createImmutable(0.45)}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,(RemoteObject.solve(new RemoteObject[] {_bottom,_top}, "-",1, 0)),RemoteObject.createImmutable(0.7)}, "+*",1, 0))),(Object)(_tickbrush),(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 97;BA.debugLine="bc.DrawLine2(Left + (Right - Left) * 0.45, Top +";
Debug.ShouldStop(1);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawline2",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,(RemoteObject.solve(new RemoteObject[] {_right,_left}, "-",1, 0)),RemoteObject.createImmutable(0.45)}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,(RemoteObject.solve(new RemoteObject[] {_bottom,_top}, "-",1, 0)),RemoteObject.createImmutable(0.7)}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,(RemoteObject.solve(new RemoteObject[] {_right,_left}, "-",1, 0)),RemoteObject.createImmutable(0.8)}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,(RemoteObject.solve(new RemoteObject[] {_bottom,_top}, "-",1, 0)),RemoteObject.createImmutable(0.3)}, "+*",1, 0))),(Object)(_tickbrush),(Object)(BA.numberCast(int.class, 3)));
 };
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="pnlButton = xui.CreatePanel(\"pnlButton_Click\")";
Debug.ShouldStop(262144);
__ref.setField ("_pnlbutton" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlButton_Click"))));
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
public static RemoteObject  _pnlbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlButton_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("pnlbutton_click")) { return __ref.runUserSub(false, "b4xmainpage","pnlbutton_click", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Sub pnlButton_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="ToastMessageShow(\"Button clicked!\", False)";
Debug.ShouldStop(128);
b4xmainpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Button clicked!")),(Object)(b4xmainpage.__c.getField(true,"False")));
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
}
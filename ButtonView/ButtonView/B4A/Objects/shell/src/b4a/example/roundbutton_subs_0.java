package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class roundbutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "roundbutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 55;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
roundbutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",roundbutton._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
roundbutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",roundbutton._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As B4XView";
roundbutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",roundbutton._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
roundbutton._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",roundbutton._xui);
 //BA.debugLineNum = 10;BA.debugLine="Public Tag As Object";
roundbutton._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",roundbutton._tag);
 //BA.debugLineNum = 11;BA.debugLine="Private imvIcon As Label";
roundbutton._imvicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imvicon",roundbutton._imvicon);
 //BA.debugLineNum = 12;BA.debugLine="Private lblText As Label";
roundbutton._lbltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltext",roundbutton._lbltext);
 //BA.debugLineNum = 13;BA.debugLine="Private pnlWrapper As Panel";
roundbutton._pnlwrapper = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlwrapper",roundbutton._pnlwrapper);
 //BA.debugLineNum = 14;BA.debugLine="Private baseColor As Int = Colors.ARGB(255,40, 69";
roundbutton._basecolor = roundbutton.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 40)),(Object)(BA.numberCast(int.class, 69)),(Object)(BA.numberCast(int.class, 214)));__ref.setField("_basecolor",roundbutton._basecolor);
 //BA.debugLineNum = 15;BA.debugLine="Private baseBackground As Int = Colors.White";
roundbutton._basebackground = roundbutton.__c.getField(false,"Colors").getField(true,"White");__ref.setField("_basebackground",roundbutton._basebackground);
 //BA.debugLineNum = 16;BA.debugLine="Private iconColor As Int = Colors.White";
roundbutton._iconcolor = roundbutton.__c.getField(false,"Colors").getField(true,"White");__ref.setField("_iconcolor",roundbutton._iconcolor);
 //BA.debugLineNum = 17;BA.debugLine="Private mDisabled As Boolean = False";
roundbutton._mdisabled = roundbutton.__c.getField(true,"False");__ref.setField("_mdisabled",roundbutton._mdisabled);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "roundbutton","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (base As Object, lbl";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="mBase = base";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 28;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(134217728);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 29;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 30;BA.debugLine="baseBackground = xui.PaintOrColorToColor(Props.Ge";
Debug.ShouldStop(536870912);
__ref.setField ("_basebackground" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor")))))));
 BA.debugLineNum = 32;BA.debugLine="mBase.Color = Colors.Transparent";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",roundbutton.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 33;BA.debugLine="pnlWrapper.Initialize(\"pnlWrapper\")";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlWrapper")));
 BA.debugLineNum = 34;BA.debugLine="mBase.AddView(pnlWrapper, 2dip, 2dip, mBase.Width";
Debug.ShouldStop(2);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).getObject())),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1)));
 BA.debugLineNum = 36;BA.debugLine="imvIcon.Initialize(\"\")";
Debug.ShouldStop(8);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 37;BA.debugLine="pnlWrapper.AddView(imvIcon, 2dip, 0, 20dip, pnlWr";
Debug.ShouldStop(16);
__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imvicon" /*RemoteObject*/ ).getObject())),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, 0)),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 38;BA.debugLine="imvIcon.TextSize = 22";
Debug.ShouldStop(32);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
 BA.debugLineNum = 39;BA.debugLine="imvIcon.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
Debug.ShouldStop(64);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {roundbutton.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),roundbutton.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 40;BA.debugLine="imvIcon.TextColor = iconColor";
Debug.ShouldStop(128);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_iconcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 41;BA.debugLine="imvIcon.Visible = True";
Debug.ShouldStop(256);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setVisible",roundbutton.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="lblText.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 44;BA.debugLine="pnlWrapper.AddView(lblText, 0dip, 0dip, pnlWrappe";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbltext" /*RemoteObject*/ ).getObject())),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 45;BA.debugLine="lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {roundbutton.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),roundbutton.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 47;BA.debugLine="pnlWrapper.As(B4XView).SetColorAndBorder(baseBack";
Debug.ShouldStop(16384);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_basebackground" /*RemoteObject*/ )),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(__ref.getField(true,"_basecolor" /*RemoteObject*/ )),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 49;BA.debugLine="lblText.TextSize = 14";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 50;BA.debugLine="lblText.Text = \"Round Button\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Round Button"));
 BA.debugLineNum = 52;BA.debugLine="lblText.TextColor = baseColor";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_basecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdisabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDisabled (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("getdisabled")) { return __ref.runUserSub(false, "roundbutton","getdisabled", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Public Sub getDisabled() As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Return mDisabled";
Debug.ShouldStop(32);
if (true) return __ref.getField(true,"_mdisabled" /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "roundbutton","initialize", __ref, _ba, _callback, _eventname);}
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
public static void  _pnlwrapper_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlWrapper_Click (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("pnlwrapper_click")) { __ref.runUserSub(false, "roundbutton","pnlwrapper_click", __ref); return;}
ResumableSub_pnlWrapper_Click rsub = new ResumableSub_pnlWrapper_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_pnlWrapper_Click extends BA.ResumableSub {
public ResumableSub_pnlWrapper_Click(b4a.example.roundbutton parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.roundbutton parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("pnlWrapper_Click (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,118);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 120;BA.debugLine="If mDisabled = False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mdisabled" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 121;BA.debugLine="mBase.SetColorAndBorder(baseBackground, 2dip, Co";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_basebackground" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(parent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 220)),(Object)(BA.numberCast(int.class, 242)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 122;BA.debugLine="Sleep(300)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "roundbutton", "pnlwrapper_click"),BA.numberCast(int.class, 300));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 BA.debugLineNum = 123;BA.debugLine="mBase.SetColorAndBorder(Colors.Transparent, 0dip";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(parent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(parent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 220)),(Object)(BA.numberCast(int.class, 242)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 124;BA.debugLine="CallSub(mCallBack, mEventName & \"_Click\")";
Debug.ShouldStop(134217728);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _redrawcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RedrawColor (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("redrawcolor")) { return __ref.runUserSub(false, "roundbutton","redrawcolor", __ref);}
 BA.debugLineNum = 73;BA.debugLine="Sub RedrawColor()";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="pnlWrapper.As(B4XView).SetColorAndBorder(baseBack";
Debug.ShouldStop(512);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_basebackground" /*RemoteObject*/ )),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(true,"_basecolor" /*RemoteObject*/ )),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 75;BA.debugLine="lblText.TextColor = baseColor";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_basecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("SetColor (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "roundbutton","setcolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 78;BA.debugLine="Public Sub SetColor(value As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="baseBackground = value";
Debug.ShouldStop(16384);
__ref.setField ("_basebackground" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 80;BA.debugLine="RedrawColor";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.roundbutton.class, "_redrawcolor" /*RemoteObject*/ );
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setDisabled (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "roundbutton","setdisabled", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 59;BA.debugLine="Public Sub setDisabled(value As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="mDisabled = value";
Debug.ShouldStop(134217728);
__ref.setField ("_mdisabled" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 61;BA.debugLine="If mDisabled = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mdisabled" /*RemoteObject*/ ),roundbutton.__c.getField(true,"True"))) { 
 BA.debugLineNum = 62;BA.debugLine="pnlWrapper.As(B4XView).SetColorAndBorder(Colors.";
Debug.ShouldStop(536870912);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(roundbutton.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 204)),(Object)(BA.numberCast(int.class, 204)),(Object)(BA.numberCast(int.class, 204)))),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(roundbutton.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 204)),(Object)(BA.numberCast(int.class, 204)),(Object)(BA.numberCast(int.class, 204)))),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 }else {
 BA.debugLineNum = 64;BA.debugLine="pnlWrapper.As(B4XView).SetColorAndBorder(baseBac";
Debug.ShouldStop(-2147483648);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_basebackground" /*RemoteObject*/ )),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(__ref.getField(true,"_basecolor" /*RemoteObject*/ )),(Object)(roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 };
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
public static RemoteObject  _setfont(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetFont (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setfont")) { return __ref.runUserSub(false, "roundbutton","setfont", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 92;BA.debugLine="Public Sub SetFont(value As Typeface)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="imvIcon.Typeface = value";
Debug.ShouldStop(268435456);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(false,"setTypeface",(_value.getObject()));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("SetIcon (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "roundbutton","seticon", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 102;BA.debugLine="Public Sub SetIcon(value As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="If value = \"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
 BA.debugLineNum = 104;BA.debugLine="imvIcon.Visible = False";
Debug.ShouldStop(128);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setVisible",roundbutton.__c.getField(true,"False"));
 BA.debugLineNum = 105;BA.debugLine="imvIcon.Text = value";
Debug.ShouldStop(256);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 106;BA.debugLine="lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gr";
Debug.ShouldStop(512);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {roundbutton.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),roundbutton.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 107;BA.debugLine="lblText.Width = pnlWrapper.Width";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_pnlwrapper" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 108;BA.debugLine="lblText.Left = 0";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 110;BA.debugLine="imvIcon.Visible = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setVisible",roundbutton.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="imvIcon.TextColor = baseColor";
Debug.ShouldStop(16384);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_basecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 112;BA.debugLine="imvIcon.Text = value";
Debug.ShouldStop(32768);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 113;BA.debugLine="lblText.Gravity = Gravity.LEFT + Gravity.CENTER";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {roundbutton.__c.getField(false,"Gravity").getField(true,"LEFT"),roundbutton.__c.getField(false,"Gravity").getField(true,"CENTER")}, "+",1, 1));
 BA.debugLineNum = 114;BA.debugLine="lblText.Left = 25dip";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setLeft",roundbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))));
 };
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
public static RemoteObject  _seticoncolor(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetIconColor (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("seticoncolor")) { return __ref.runUserSub(false, "roundbutton","seticoncolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 88;BA.debugLine="Public Sub SetIconColor(value As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="imvIcon.TextColor = value";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imvicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",_value);
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
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetTextColor (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "roundbutton","settextcolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 83;BA.debugLine="Public Sub SetTextColor(value As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="baseColor = value";
Debug.ShouldStop(524288);
__ref.setField ("_basecolor" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 85;BA.debugLine="RedrawColor";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.roundbutton.class, "_redrawcolor" /*RemoteObject*/ );
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
public static RemoteObject  _settextsize(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setTextSize (roundbutton) ","roundbutton",2,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("settextsize")) { return __ref.runUserSub(false, "roundbutton","settextsize", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 96;BA.debugLine="Public Sub setTextSize(value As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="lblText.TextSize = value";
Debug.ShouldStop(1);
__ref.getField(false,"_lbltext" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, _value));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
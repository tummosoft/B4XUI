package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bottomnavigationview_subs_0 {


public static RemoteObject  _acticve(RemoteObject __ref,RemoteObject _index,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("Acticve (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("acticve")) { return __ref.runUserSub(false, "bottomnavigationview","acticve", __ref, _index, _enable);}
int _i = 0;
Debug.locals.put("index", _index);
Debug.locals.put("enable", _enable);
 BA.debugLineNum = 65;BA.debugLine="Public Sub Acticve(index As Int, enable As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="If enable = True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_enable,bottomnavigationview.__c.getField(true,"True"))) { 
 BA.debugLineNum = 67;BA.debugLine="For i=0 To lstNaviButton.Size - 1";
Debug.ShouldStop(4);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstnavibutton" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 68;BA.debugLine="nvButton(i).Active(False)";
Debug.ShouldStop(8);
__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.navibutton.class, "_active" /*RemoteObject*/ ,(Object)(bottomnavigationview.__c.getField(true,"False")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 70;BA.debugLine="nvButton(index).Active(True)";
Debug.ShouldStop(32);
__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ _index).runClassMethod (b4a.example.navibutton.class, "_active" /*RemoteObject*/ ,(Object)(bottomnavigationview.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 72;BA.debugLine="nvButton(index).Active(False)";
Debug.ShouldStop(128);
__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ _index).runClassMethod (b4a.example.navibutton.class, "_active" /*RemoteObject*/ ,(Object)(bottomnavigationview.__c.getField(true,"False")));
 };
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbutton(RemoteObject __ref,RemoteObject _btnnavi) throws Exception{
try {
		Debug.PushSubsStack("AddButton (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("addbutton")) { return __ref.runUserSub(false, "bottomnavigationview","addbutton", __ref, _btnnavi);}
Debug.locals.put("btnNavi", _btnnavi);
 BA.debugLineNum = 41;BA.debugLine="Public Sub AddButton(btnNavi As clsNaviButton)";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="lstNaviButton.Add(btnNavi)";
Debug.ShouldStop(512);
__ref.getField(false,"_lstnavibutton" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_btnnavi)));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Base_Resize (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "bottomnavigationview","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 37;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(16);
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
public static RemoteObject  _build(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Build (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("build")) { return __ref.runUserSub(false, "bottomnavigationview","build", __ref);}
RemoteObject _positionx = RemoteObject.createImmutable(0);
RemoteObject _basewidth = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("b4a.example.bottomnavigationview._clsnavibutton");
 BA.debugLineNum = 45;BA.debugLine="Public Sub Build";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Dim	positionX As Int = 0";
Debug.ShouldStop(8192);
_positionx = BA.numberCast(int.class, 0);Debug.locals.put("positionX", _positionx);Debug.locals.put("positionX", _positionx);
 BA.debugLineNum = 47;BA.debugLine="Dim nvButton(lstNaviButton.Size) As NaviButton";
Debug.ShouldStop(16384);
bottomnavigationview._nvbutton = RemoteObject.createNewArray ("b4a.example.navibutton", new int[] {__ref.getField(false,"_lstnavibutton" /*RemoteObject*/ ).runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});__ref.setField("_nvbutton",bottomnavigationview._nvbutton);
 BA.debugLineNum = 48;BA.debugLine="Dim baseWidth As Int = 100%x / lstNaviButton.Size";
Debug.ShouldStop(32768);
_basewidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {bottomnavigationview.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),__ref.getField(false,"_lstnavibutton" /*RemoteObject*/ ).runMethod(true,"getSize")}, "/",0, 0));Debug.locals.put("baseWidth", _basewidth);Debug.locals.put("baseWidth", _basewidth);
 BA.debugLineNum = 50;BA.debugLine="For i=0 To lstNaviButton.Size - 1";
Debug.ShouldStop(131072);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstnavibutton" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 51;BA.debugLine="Dim item As clsNaviButton = lstNaviButton.Get(i)";
Debug.ShouldStop(262144);
_item = (__ref.getField(false,"_lstnavibutton" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 52;BA.debugLine="nvButton(i).Initialize(Me, \"nvButton\", baseWidth";
Debug.ShouldStop(524288);
__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.navibutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("nvButton")),(Object)(_basewidth));
 BA.debugLineNum = 53;BA.debugLine="mBase.AddView(nvButton(i).GetView, positionX, 0d";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.navibutton.class, "_getview" /*RemoteObject*/ ).getObject())),(Object)(_positionx),(Object)(bottomnavigationview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(_basewidth),(Object)(bottomnavigationview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 54;BA.debugLine="positionX = positionX + baseWidth";
Debug.ShouldStop(2097152);
_positionx = RemoteObject.solve(new RemoteObject[] {_positionx,_basewidth}, "+",1, 1);Debug.locals.put("positionX", _positionx);
 BA.debugLineNum = 55;BA.debugLine="nvButton(i).Icon(item.icon)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.navibutton.class, "_icon" /*RemoteObject*/ ,(Object)(_item.getField(true,"Icon" /*RemoteObject*/ )));
 BA.debugLineNum = 56;BA.debugLine="nvButton(i).Font(item.font)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.navibutton.class, "_font" /*RemoteObject*/ ,(Object)(_item.getField(false,"Font" /*RemoteObject*/ )));
 BA.debugLineNum = 57;BA.debugLine="nvButton(i).Text(item.text)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.navibutton.class, "_text" /*RemoteObject*/ ,(Object)(_item.getField(true,"Text" /*RemoteObject*/ )));
 BA.debugLineNum = 58;BA.debugLine="nvButton(i).Position = i";
Debug.ShouldStop(33554432);
__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.navibutton.class, "_setposition" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 59;BA.debugLine="If item.Badge <> Null Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("N",_item.getField(true,"Badge" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 60;BA.debugLine="nvButton(i).Badge = item.Badge";
Debug.ShouldStop(134217728);
__ref.getField(false,"_nvbutton" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runClassMethod (b4a.example.navibutton.class, "_setbadge",_item.getField(true,"Badge" /*RemoteObject*/ ));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Type clsNaviButton(Font As Typeface, Icon As Stri";
;
 //BA.debugLineNum = 8;BA.debugLine="Private mEventName As String 'ignore";
bottomnavigationview._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",bottomnavigationview._meventname);
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object 'ignore";
bottomnavigationview._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",bottomnavigationview._mcallback);
 //BA.debugLineNum = 10;BA.debugLine="Public mBase As B4XView";
bottomnavigationview._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",bottomnavigationview._mbase);
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
bottomnavigationview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bottomnavigationview._xui);
 //BA.debugLineNum = 12;BA.debugLine="Public Tag As Object";
bottomnavigationview._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",bottomnavigationview._tag);
 //BA.debugLineNum = 13;BA.debugLine="Private background As Int = Colors.White";
bottomnavigationview._background = bottomnavigationview.__c.getField(false,"Colors").getField(true,"White");__ref.setField("_background",bottomnavigationview._background);
 //BA.debugLineNum = 14;BA.debugLine="Private colorIcon As Int = Colors.ARGB(255, 141,";
bottomnavigationview._coloricon = bottomnavigationview.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 141)),(Object)(BA.numberCast(int.class, 152)),(Object)(BA.numberCast(int.class, 166)));__ref.setField("_coloricon",bottomnavigationview._coloricon);
 //BA.debugLineNum = 15;BA.debugLine="Private selectedColor As Int = Colors.ARGB(255, 8";
bottomnavigationview._selectedcolor = bottomnavigationview.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 250)));__ref.setField("_selectedcolor",bottomnavigationview._selectedcolor);
 //BA.debugLineNum = 16;BA.debugLine="Private lstNaviButton As List";
bottomnavigationview._lstnavibutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstnavibutton",bottomnavigationview._lstnavibutton);
 //BA.debugLineNum = 17;BA.debugLine="Private nvButton(4) As NaviButton";
bottomnavigationview._nvbutton = RemoteObject.createNewArray ("b4a.example.navibutton", new int[] {4}, new Object[]{});__ref.setField("_nvbutton",bottomnavigationview._nvbutton);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "bottomnavigationview","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _bgclr = RemoteObject.createImmutable(0);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 27;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="mBase = Base";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 30;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(536870912);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 31;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 32;BA.debugLine="Dim bgclr As Int = xui.PaintOrColorToColor(Prop";
Debug.ShouldStop(-2147483648);
_bgclr = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Color"))))));Debug.locals.put("bgclr", _bgclr);Debug.locals.put("bgclr", _bgclr);
 BA.debugLineNum = 33;BA.debugLine="mBase.Color = bgclr";
Debug.ShouldStop(1);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",_bgclr);
 BA.debugLineNum = 34;BA.debugLine="lstNaviButton.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_lstnavibutton" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Initialize (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bottomnavigationview","initialize", __ref, _ba, _callback, _eventname);}
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
 BA.debugLineNum = 23;BA.debugLine="lstNaviButton.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lstnavibutton" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("nvButton_Click (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("nvbutton_click")) { return __ref.runUserSub(false, "bottomnavigationview","nvbutton_click", __ref);}
RemoteObject _v = RemoteObject.declareNull("b4a.example.navibutton");
 BA.debugLineNum = 95;BA.debugLine="Sub nvButton_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Dim v As NaviButton = Sender";
Debug.ShouldStop(-2147483648);
_v = (bottomnavigationview.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 97;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ItemClick\", v.";
Debug.ShouldStop(1);
bottomnavigationview.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)((_v.runClassMethod (b4a.example.navibutton.class, "_getposition" /*RemoteObject*/ ))));
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
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setColor (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "bottomnavigationview","setcolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 77;BA.debugLine="Public Sub setColor(value As Int)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="background = value";
Debug.ShouldStop(8192);
__ref.setField ("_background" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 79;BA.debugLine="mBase.Color = background";
Debug.ShouldStop(16384);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_background" /*RemoteObject*/ ));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("setIconColor (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("seticoncolor")) { return __ref.runUserSub(false, "bottomnavigationview","seticoncolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 87;BA.debugLine="Public Sub setIconColor(value As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="colorIcon = value";
Debug.ShouldStop(8388608);
__ref.setField ("_coloricon" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedcolor(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setSelectedColor (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setselectedcolor")) { return __ref.runUserSub(false, "bottomnavigationview","setselectedcolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 91;BA.debugLine="Public Sub setSelectedColor(value As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="selectedColor = value";
Debug.ShouldStop(134217728);
__ref.setField ("_selectedcolor" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("setTextColor (bottomnavigationview) ","bottomnavigationview",3,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "bottomnavigationview","settextcolor", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 82;BA.debugLine="Public Sub setTextColor(value As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="background = value";
Debug.ShouldStop(262144);
__ref.setField ("_background" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 84;BA.debugLine="mBase.Color = background";
Debug.ShouldStop(524288);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_background" /*RemoteObject*/ ));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
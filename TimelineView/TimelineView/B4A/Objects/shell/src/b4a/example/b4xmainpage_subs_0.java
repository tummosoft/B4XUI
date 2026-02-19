package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _bmeeting = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _brunning = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _bround = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _bcircle = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _time_line_content = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("b4a.example.b4xmainpage._timelineitem");
RemoteObject _box_height = RemoteObject.createImmutable(0);
RemoteObject _positiony = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _item1 = RemoteObject.declareNull("b4a.example.b4xmainpage._timelineitem");
RemoteObject _boxtimeline = RemoteObject.declareNull("b4a.example.timelinebox");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Root = Root1";
Debug.ShouldStop(67108864);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 31;BA.debugLine="Dim bMeeting As B4XBitmap=LoadBitmapResize(File.D";
Debug.ShouldStop(1073741824);
_bmeeting = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmeeting = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), b4xmainpage.__c.runMethod(false,"LoadBitmapResize",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("icons8-meeting-50.png")),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.getField(true,"True"))).getObject());Debug.locals.put("bMeeting", _bmeeting);Debug.locals.put("bMeeting", _bmeeting);
 BA.debugLineNum = 32;BA.debugLine="Dim bRunning As B4XBitmap=LoadBitmapResize(File.D";
Debug.ShouldStop(-2147483648);
_brunning = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_brunning = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), b4xmainpage.__c.runMethod(false,"LoadBitmapResize",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("running.png")),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.getField(true,"True"))).getObject());Debug.locals.put("bRunning", _brunning);Debug.locals.put("bRunning", _brunning);
 BA.debugLineNum = 33;BA.debugLine="Dim bRound As B4XBitmap=LoadBitmapResize(File.Dir";
Debug.ShouldStop(1);
_bround = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bround = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), b4xmainpage.__c.runMethod(false,"LoadBitmapResize",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("round.png")),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.getField(true,"True"))).getObject());Debug.locals.put("bRound", _bround);Debug.locals.put("bRound", _bround);
 BA.debugLineNum = 34;BA.debugLine="Dim bCircle As B4XBitmap=LoadBitmapResize(File.Di";
Debug.ShouldStop(2);
_bcircle = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bcircle = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), b4xmainpage.__c.runMethod(false,"LoadBitmapResize",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("circle.png")),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.getField(true,"True"))).getObject());Debug.locals.put("bCircle", _bcircle);Debug.locals.put("bCircle", _bcircle);
 BA.debugLineNum = 37;BA.debugLine="Dim time_line_content As List";
Debug.ShouldStop(16);
_time_line_content = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("time_line_content", _time_line_content);
 BA.debugLineNum = 38;BA.debugLine="time_line_content.Initialize";
Debug.ShouldStop(32);
_time_line_content.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="Dim item As TimelineItem";
Debug.ShouldStop(128);
_item = RemoteObject.createNew ("b4a.example.b4xmainpage._timelineitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 41;BA.debugLine="item.Initialize";
Debug.ShouldStop(256);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="item.icon = bRound";
Debug.ShouldStop(512);
_item.setField ("icon" /*RemoteObject*/ ,_bround);
 BA.debugLineNum = 43;BA.debugLine="item.title = \"Project Kickoff\"";
Debug.ShouldStop(1024);
_item.setField ("title" /*RemoteObject*/ ,BA.ObjectToString("Project Kickoff"));
 BA.debugLineNum = 44;BA.debugLine="item.des = \"Meeting with stakeholders completed.\"";
Debug.ShouldStop(2048);
_item.setField ("des" /*RemoteObject*/ ,BA.ObjectToString("Meeting with stakeholders completed."));
 BA.debugLineNum = 45;BA.debugLine="item.approve = False";
Debug.ShouldStop(4096);
_item.setField ("approve" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="item.time = DateTime.Now";
Debug.ShouldStop(8192);
_item.setField ("time" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 47;BA.debugLine="item.color = Colors.ARGB(255, 237, 247, 86)";
Debug.ShouldStop(16384);
_item.setField ("color" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 237)),(Object)(BA.numberCast(int.class, 247)),(Object)(BA.numberCast(int.class, 86))));
 BA.debugLineNum = 48;BA.debugLine="time_line_content.Add(item)";
Debug.ShouldStop(32768);
_time_line_content.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 50;BA.debugLine="Dim item As TimelineItem";
Debug.ShouldStop(131072);
_item = RemoteObject.createNew ("b4a.example.b4xmainpage._timelineitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 51;BA.debugLine="item.Initialize";
Debug.ShouldStop(262144);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="item.icon = bCircle";
Debug.ShouldStop(524288);
_item.setField ("icon" /*RemoteObject*/ ,_bcircle);
 BA.debugLineNum = 53;BA.debugLine="item.title = \"Design System Approval\"";
Debug.ShouldStop(1048576);
_item.setField ("title" /*RemoteObject*/ ,BA.ObjectToString("Design System Approval"));
 BA.debugLineNum = 54;BA.debugLine="item.des = \"Final review of typography, color pal";
Debug.ShouldStop(2097152);
_item.setField ("des" /*RemoteObject*/ ,BA.ObjectToString("Final review of typography, color palette And compoment library."));
 BA.debugLineNum = 55;BA.debugLine="item.approve = True";
Debug.ShouldStop(4194304);
_item.setField ("approve" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="item.time = DateTime.Now + 3600000";
Debug.ShouldStop(8388608);
_item.setField ("time" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(3600000)}, "+",1, 2));
 BA.debugLineNum = 57;BA.debugLine="item.color = Colors.ARGB(255, 157, 249, 239)";
Debug.ShouldStop(16777216);
_item.setField ("color" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 157)),(Object)(BA.numberCast(int.class, 249)),(Object)(BA.numberCast(int.class, 239))));
 BA.debugLineNum = 58;BA.debugLine="time_line_content.Add(item)";
Debug.ShouldStop(33554432);
_time_line_content.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 60;BA.debugLine="Dim item As TimelineItem";
Debug.ShouldStop(134217728);
_item = RemoteObject.createNew ("b4a.example.b4xmainpage._timelineitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 61;BA.debugLine="item.Initialize";
Debug.ShouldStop(268435456);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="item.icon = bCircle";
Debug.ShouldStop(536870912);
_item.setField ("icon" /*RemoteObject*/ ,_bcircle);
 BA.debugLineNum = 63;BA.debugLine="item.title = \"Alpha release\"";
Debug.ShouldStop(1073741824);
_item.setField ("title" /*RemoteObject*/ ,BA.ObjectToString("Alpha release"));
 BA.debugLineNum = 64;BA.debugLine="item.des = \"Deployment To staging server.\"";
Debug.ShouldStop(-2147483648);
_item.setField ("des" /*RemoteObject*/ ,BA.ObjectToString("Deployment To staging server."));
 BA.debugLineNum = 65;BA.debugLine="item.approve = False";
Debug.ShouldStop(1);
_item.setField ("approve" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 66;BA.debugLine="item.time = DateTime.Now + 4600000";
Debug.ShouldStop(2);
_item.setField ("time" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(4600000)}, "+",1, 2));
 BA.debugLineNum = 67;BA.debugLine="item.color = Colors.ARGB(255, 255, 246, 133)";
Debug.ShouldStop(4);
_item.setField ("color" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 246)),(Object)(BA.numberCast(int.class, 133))));
 BA.debugLineNum = 68;BA.debugLine="time_line_content.Add(item)";
Debug.ShouldStop(8);
_time_line_content.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 70;BA.debugLine="Dim item As TimelineItem";
Debug.ShouldStop(32);
_item = RemoteObject.createNew ("b4a.example.b4xmainpage._timelineitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 71;BA.debugLine="item.Initialize";
Debug.ShouldStop(64);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="item.icon = bCircle";
Debug.ShouldStop(128);
_item.setField ("icon" /*RemoteObject*/ ,_bcircle);
 BA.debugLineNum = 73;BA.debugLine="item.title = \"Testing And review\"";
Debug.ShouldStop(256);
_item.setField ("title" /*RemoteObject*/ ,BA.ObjectToString("Testing And review"));
 BA.debugLineNum = 74;BA.debugLine="item.des = \"Send project To teste team.\"";
Debug.ShouldStop(512);
_item.setField ("des" /*RemoteObject*/ ,BA.ObjectToString("Send project To teste team."));
 BA.debugLineNum = 75;BA.debugLine="item.approve = False";
Debug.ShouldStop(1024);
_item.setField ("approve" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="item.time = DateTime.Now + 7600000";
Debug.ShouldStop(2048);
_item.setField ("time" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(7600000)}, "+",1, 2));
 BA.debugLineNum = 77;BA.debugLine="item.color = Colors.ARGB(255, 0, 221, 255)";
Debug.ShouldStop(4096);
_item.setField ("color" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 221)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 78;BA.debugLine="time_line_content.Add(item)";
Debug.ShouldStop(8192);
_time_line_content.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 80;BA.debugLine="Dim box_height As Int = 90dip";
Debug.ShouldStop(32768);
_box_height = b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)));Debug.locals.put("box_height", _box_height);Debug.locals.put("box_height", _box_height);
 BA.debugLineNum = 81;BA.debugLine="Dim positionY As Int = 0";
Debug.ShouldStop(65536);
_positiony = BA.numberCast(int.class, 0);Debug.locals.put("positionY", _positiony);Debug.locals.put("positionY", _positiony);
 BA.debugLineNum = 83;BA.debugLine="For i=0 To time_line_content.Size - 1";
Debug.ShouldStop(262144);
{
final int step47 = 1;
final int limit47 = RemoteObject.solve(new RemoteObject[] {_time_line_content.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47) ;_i = ((int)(0 + _i + step47))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 84;BA.debugLine="Dim item1 As TimelineItem = time_line_content.Ge";
Debug.ShouldStop(524288);
_item1 = (_time_line_content.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item1", _item1);Debug.locals.put("item1", _item1);
 BA.debugLineNum = 86;BA.debugLine="Dim boxTimeLine As TimelineBox";
Debug.ShouldStop(2097152);
_boxtimeline = RemoteObject.createNew ("b4a.example.timelinebox");Debug.locals.put("boxTimeLine", _boxtimeline);
 BA.debugLineNum = 88;BA.debugLine="If item1.approve = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_item1.getField(true,"approve" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"True"))) { 
 BA.debugLineNum = 89;BA.debugLine="box_height = 140dip";
Debug.ShouldStop(16777216);
_box_height = b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)));Debug.locals.put("box_height", _box_height);
 }else {
 BA.debugLineNum = 91;BA.debugLine="box_height = 90dip";
Debug.ShouldStop(67108864);
_box_height = b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)));Debug.locals.put("box_height", _box_height);
 };
 BA.debugLineNum = 94;BA.debugLine="boxTimeLine.Initialize(Me, \"TimeLine\", scrollLv.";
Debug.ShouldStop(536870912);
_boxtimeline.runClassMethod (b4a.example.timelinebox.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("TimeLine")),(Object)(__ref.getField(false,"_scrolllv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_box_height));
 BA.debugLineNum = 95;BA.debugLine="scrollLv.Panel.AddView(boxTimeLine.GetView,0,pos";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_scrolllv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_boxtimeline.runClassMethod (b4a.example.timelinebox.class, "_getview" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_positiony),(Object)(__ref.getField(false,"_scrolllv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_box_height));
 BA.debugLineNum = 96;BA.debugLine="positionY = positionY + box_height";
Debug.ShouldStop(-2147483648);
_positiony = RemoteObject.solve(new RemoteObject[] {_positiony,_box_height}, "+",1, 1);Debug.locals.put("positionY", _positiony);
 BA.debugLineNum = 98;BA.debugLine="boxTimeLine.Title = item1.title";
Debug.ShouldStop(2);
_boxtimeline.runClassMethod (b4a.example.timelinebox.class, "_settitle",_item1.getField(true,"title" /*RemoteObject*/ ));
 BA.debugLineNum = 99;BA.debugLine="boxTimeLine.Time = DateTime.Time(item1.time)";
Debug.ShouldStop(4);
_boxtimeline.runClassMethod (b4a.example.timelinebox.class, "_settime",b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_item1.getField(true,"time" /*RemoteObject*/ ))));
 BA.debugLineNum = 100;BA.debugLine="boxTimeLine.Description = item1.des";
Debug.ShouldStop(8);
_boxtimeline.runClassMethod (b4a.example.timelinebox.class, "_setdescription",_item1.getField(true,"des" /*RemoteObject*/ ));
 BA.debugLineNum = 101;BA.debugLine="boxTimeLine.Bitmap = item1.icon";
Debug.ShouldStop(16);
_boxtimeline.runClassMethod (b4a.example.timelinebox.class, "_setbitmap",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _item1.getField(false,"icon" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 102;BA.debugLine="boxTimeLine.Color = item1.color";
Debug.ShouldStop(32);
_boxtimeline.runClassMethod (b4a.example.timelinebox.class, "_setcolor",_item1.getField(true,"color" /*RemoteObject*/ ));
 BA.debugLineNum = 104;BA.debugLine="If item1.approve = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_item1.getField(true,"approve" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 105;BA.debugLine="boxTimeLine.HideButton";
Debug.ShouldStop(256);
_boxtimeline.runClassMethod (b4a.example.timelinebox.class, "_hidebutton" /*RemoteObject*/ );
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 109;BA.debugLine="scrollLv.Panel.Height = positionY";
Debug.ShouldStop(4096);
__ref.getField(false,"_scrolllv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",_positiony);
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 115;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 12;BA.debugLine="Private Panel1 As Panel";
b4xmainpage._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",b4xmainpage._panel1);
 //BA.debugLineNum = 13;BA.debugLine="Private Panel3 As Panel";
b4xmainpage._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3",b4xmainpage._panel3);
 //BA.debugLineNum = 14;BA.debugLine="Private scrollLv As ScrollView";
b4xmainpage._scrolllv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrolllv",b4xmainpage._scrolllv);
 //BA.debugLineNum = 15;BA.debugLine="Type TimelineItem(icon As B4XBitmap, title As Str";
;
 //BA.debugLineNum = 16;BA.debugLine="Private lblTitle As Label";
b4xmainpage._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle",b4xmainpage._lbltitle);
 //BA.debugLineNum = 17;BA.debugLine="Private lblTime As Label";
b4xmainpage._lbltime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltime",b4xmainpage._lbltime);
 //BA.debugLineNum = 18;BA.debugLine="Private lblContent As Label";
b4xmainpage._lblcontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblcontent",b4xmainpage._lblcontent);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1048576);
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
}
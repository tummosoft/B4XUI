package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _timelineitem{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper icon;
public String title;
public String des;
public boolean approve;
public long time;
public int color;
public void Initialize() {
IsInitialized = true;
icon = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
title = "";
des = "";
approve = false;
time = 0L;
color = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrolllv = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcontent = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmeeting = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _brunning = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bround = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bcircle = null;
anywheresoftware.b4a.objects.collections.List _time_line_content = null;
b4a.example.b4xmainpage._timelineitem _item = null;
int _box_height = 0;
int _positiony = 0;
int _i = 0;
b4a.example.b4xmainpage._timelineitem _item1 = null;
b4a.example.timelinebox _boxtimeline = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Dim bMeeting As B4XBitmap=LoadBitmapResize(File.D";
_bmeeting = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmeeting = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"icons8-meeting-50.png",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),__c.True).getObject()));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Dim bRunning As B4XBitmap=LoadBitmapResize(File.D";
_brunning = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_brunning = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"running.png",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),__c.True).getObject()));
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Dim bRound As B4XBitmap=LoadBitmapResize(File.Dir";
_bround = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bround = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"round.png",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),__c.True).getObject()));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Dim bCircle As B4XBitmap=LoadBitmapResize(File.Di";
_bcircle = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bcircle = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"circle.png",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),__c.True).getObject()));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="Dim time_line_content As List";
_time_line_content = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="time_line_content.Initialize";
_time_line_content.Initialize();
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="Dim item As TimelineItem";
_item = new b4a.example.b4xmainpage._timelineitem();
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="item.icon = bRound";
_item.icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bround;
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="item.title = \"Project Kickoff\"";
_item.title /*String*/  = "Project Kickoff";
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="item.des = \"Meeting with stakeholders completed.\"";
_item.des /*String*/  = "Meeting with stakeholders completed.";
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="item.approve = False";
_item.approve /*boolean*/  = __c.False;
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="item.time = DateTime.Now";
_item.time /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="item.color = Colors.ARGB(255, 237, 247, 86)";
_item.color /*int*/  = __c.Colors.ARGB((int) (255),(int) (237),(int) (247),(int) (86));
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="time_line_content.Add(item)";
_time_line_content.Add((Object)(_item));
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="Dim item As TimelineItem";
_item = new b4a.example.b4xmainpage._timelineitem();
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="item.icon = bCircle";
_item.icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bcircle;
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="item.title = \"Design System Approval\"";
_item.title /*String*/  = "Design System Approval";
RDebugUtils.currentLine=720924;
 //BA.debugLineNum = 720924;BA.debugLine="item.des = \"Final review of typography, color pal";
_item.des /*String*/  = "Final review of typography, color palette And compoment library.";
RDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="item.approve = True";
_item.approve /*boolean*/  = __c.True;
RDebugUtils.currentLine=720926;
 //BA.debugLineNum = 720926;BA.debugLine="item.time = DateTime.Now + 3600000";
_item.time /*long*/  = (long) (__c.DateTime.getNow()+3600000);
RDebugUtils.currentLine=720927;
 //BA.debugLineNum = 720927;BA.debugLine="item.color = Colors.ARGB(255, 157, 249, 239)";
_item.color /*int*/  = __c.Colors.ARGB((int) (255),(int) (157),(int) (249),(int) (239));
RDebugUtils.currentLine=720928;
 //BA.debugLineNum = 720928;BA.debugLine="time_line_content.Add(item)";
_time_line_content.Add((Object)(_item));
RDebugUtils.currentLine=720930;
 //BA.debugLineNum = 720930;BA.debugLine="Dim item As TimelineItem";
_item = new b4a.example.b4xmainpage._timelineitem();
RDebugUtils.currentLine=720931;
 //BA.debugLineNum = 720931;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=720932;
 //BA.debugLineNum = 720932;BA.debugLine="item.icon = bCircle";
_item.icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bcircle;
RDebugUtils.currentLine=720933;
 //BA.debugLineNum = 720933;BA.debugLine="item.title = \"Alpha release\"";
_item.title /*String*/  = "Alpha release";
RDebugUtils.currentLine=720934;
 //BA.debugLineNum = 720934;BA.debugLine="item.des = \"Deployment To staging server.\"";
_item.des /*String*/  = "Deployment To staging server.";
RDebugUtils.currentLine=720935;
 //BA.debugLineNum = 720935;BA.debugLine="item.approve = False";
_item.approve /*boolean*/  = __c.False;
RDebugUtils.currentLine=720936;
 //BA.debugLineNum = 720936;BA.debugLine="item.time = DateTime.Now + 4600000";
_item.time /*long*/  = (long) (__c.DateTime.getNow()+4600000);
RDebugUtils.currentLine=720937;
 //BA.debugLineNum = 720937;BA.debugLine="item.color = Colors.ARGB(255, 255, 246, 133)";
_item.color /*int*/  = __c.Colors.ARGB((int) (255),(int) (255),(int) (246),(int) (133));
RDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="time_line_content.Add(item)";
_time_line_content.Add((Object)(_item));
RDebugUtils.currentLine=720940;
 //BA.debugLineNum = 720940;BA.debugLine="Dim item As TimelineItem";
_item = new b4a.example.b4xmainpage._timelineitem();
RDebugUtils.currentLine=720941;
 //BA.debugLineNum = 720941;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=720942;
 //BA.debugLineNum = 720942;BA.debugLine="item.icon = bCircle";
_item.icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bcircle;
RDebugUtils.currentLine=720943;
 //BA.debugLineNum = 720943;BA.debugLine="item.title = \"Testing And review\"";
_item.title /*String*/  = "Testing And review";
RDebugUtils.currentLine=720944;
 //BA.debugLineNum = 720944;BA.debugLine="item.des = \"Send project To teste team.\"";
_item.des /*String*/  = "Send project To teste team.";
RDebugUtils.currentLine=720945;
 //BA.debugLineNum = 720945;BA.debugLine="item.approve = False";
_item.approve /*boolean*/  = __c.False;
RDebugUtils.currentLine=720946;
 //BA.debugLineNum = 720946;BA.debugLine="item.time = DateTime.Now + 7600000";
_item.time /*long*/  = (long) (__c.DateTime.getNow()+7600000);
RDebugUtils.currentLine=720947;
 //BA.debugLineNum = 720947;BA.debugLine="item.color = Colors.ARGB(255, 0, 221, 255)";
_item.color /*int*/  = __c.Colors.ARGB((int) (255),(int) (0),(int) (221),(int) (255));
RDebugUtils.currentLine=720948;
 //BA.debugLineNum = 720948;BA.debugLine="time_line_content.Add(item)";
_time_line_content.Add((Object)(_item));
RDebugUtils.currentLine=720950;
 //BA.debugLineNum = 720950;BA.debugLine="Dim box_height As Int = 90dip";
_box_height = __c.DipToCurrent((int) (90));
RDebugUtils.currentLine=720951;
 //BA.debugLineNum = 720951;BA.debugLine="Dim positionY As Int = 0";
_positiony = (int) (0);
RDebugUtils.currentLine=720953;
 //BA.debugLineNum = 720953;BA.debugLine="For i=0 To time_line_content.Size - 1";
{
final int step47 = 1;
final int limit47 = (int) (_time_line_content.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit47 ;_i = _i + step47 ) {
RDebugUtils.currentLine=720954;
 //BA.debugLineNum = 720954;BA.debugLine="Dim item1 As TimelineItem = time_line_content.Ge";
_item1 = (b4a.example.b4xmainpage._timelineitem)(_time_line_content.Get(_i));
RDebugUtils.currentLine=720956;
 //BA.debugLineNum = 720956;BA.debugLine="Dim boxTimeLine As TimelineBox";
_boxtimeline = new b4a.example.timelinebox();
RDebugUtils.currentLine=720958;
 //BA.debugLineNum = 720958;BA.debugLine="If item1.approve = True Then";
if (_item1.approve /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=720959;
 //BA.debugLineNum = 720959;BA.debugLine="box_height = 140dip";
_box_height = __c.DipToCurrent((int) (140));
 }else {
RDebugUtils.currentLine=720961;
 //BA.debugLineNum = 720961;BA.debugLine="box_height = 90dip";
_box_height = __c.DipToCurrent((int) (90));
 };
RDebugUtils.currentLine=720964;
 //BA.debugLineNum = 720964;BA.debugLine="boxTimeLine.Initialize(Me, \"TimeLine\", scrollLv.";
_boxtimeline._initialize /*String*/ (null,ba,this,"TimeLine",__ref._scrolllv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth(),_box_height);
RDebugUtils.currentLine=720965;
 //BA.debugLineNum = 720965;BA.debugLine="scrollLv.Panel.AddView(boxTimeLine.GetView,0,pos";
__ref._scrolllv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_boxtimeline._getview /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),_positiony,__ref._scrolllv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth(),_box_height);
RDebugUtils.currentLine=720966;
 //BA.debugLineNum = 720966;BA.debugLine="positionY = positionY + box_height";
_positiony = (int) (_positiony+_box_height);
RDebugUtils.currentLine=720968;
 //BA.debugLineNum = 720968;BA.debugLine="boxTimeLine.Title = item1.title";
_boxtimeline._settitle(null,_item1.title /*String*/ );
RDebugUtils.currentLine=720969;
 //BA.debugLineNum = 720969;BA.debugLine="boxTimeLine.Time = DateTime.Time(item1.time)";
_boxtimeline._settime(null,__c.DateTime.Time(_item1.time /*long*/ ));
RDebugUtils.currentLine=720970;
 //BA.debugLineNum = 720970;BA.debugLine="boxTimeLine.Description = item1.des";
_boxtimeline._setdescription(null,_item1.des /*String*/ );
RDebugUtils.currentLine=720971;
 //BA.debugLineNum = 720971;BA.debugLine="boxTimeLine.Bitmap = item1.icon";
_boxtimeline._setbitmap(null,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_item1.icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject())));
RDebugUtils.currentLine=720972;
 //BA.debugLineNum = 720972;BA.debugLine="boxTimeLine.Color = item1.color";
_boxtimeline._setcolor(null,_item1.color /*int*/ );
RDebugUtils.currentLine=720974;
 //BA.debugLineNum = 720974;BA.debugLine="If item1.approve = False Then";
if (_item1.approve /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=720975;
 //BA.debugLineNum = 720975;BA.debugLine="boxTimeLine.HideButton";
_boxtimeline._hidebutton /*String*/ (null);
 };
 }
};
RDebugUtils.currentLine=720979;
 //BA.debugLineNum = 720979;BA.debugLine="scrollLv.Panel.Height = positionY";
__ref._scrolllv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(_positiony);
RDebugUtils.currentLine=720981;
 //BA.debugLineNum = 720981;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Hello world!"),BA.ObjectToCharSequence("B4X"));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private scrollLv As ScrollView";
_scrolllv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Type TimelineItem(icon As B4XBitmap, title As Str";
;
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Private lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Private lblTime As Label";
_lbltime = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Private lblContent As Label";
_lblcontent = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
}
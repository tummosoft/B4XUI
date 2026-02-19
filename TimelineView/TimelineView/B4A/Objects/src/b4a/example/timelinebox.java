package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class timelinebox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.timelinebox");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.timelinebox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlwrapper = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imvline = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imvtop = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcontent = null;
public int _linewidth = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcontent = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbuttongroup = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cv = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4a.example.timelinebox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,int _width,int _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _brunning = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="mBase.Initialize(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBase");
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="pnlWrapper.Initialize(\"\")";
__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="imvLine.Initialize(\"\")";
__ref._imvline /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="imvTop.Initialize(\"\")";
__ref._imvtop /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="mBase.AddView(imvTop, 0dip,0dip,20dip,20dip)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._imvtop /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="mBase.AddView(imvLine, 10dip, 20dip,lineWidth,hei";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._imvline /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (20)),__ref._linewidth /*int*/ ,_height);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="imvTop.Color = Colors.Magenta";
__ref._imvtop /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setColor(__c.Colors.Magenta);
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="cv.Initialize(imvLine)";
__ref._cv /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._imvline /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()));
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="Dim bRunning As B4XBitmap=LoadBitmapResize(File.D";
_brunning = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_brunning = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"running.png",__c.DipToCurrent((int) (15)),__c.DipToCurrent((int) (15)),__c.True).getObject()));
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="imvTop.Bitmap = bRunning";
__ref._imvtop /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_brunning.getObject()));
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="drawDottedLine(0, 0, 0, imvLine.Height, Colors.Li";
__ref._drawdottedline /*String*/ (null,(float) (0),(float) (0),(float) (0),(float) (__ref._imvline /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight()),__c.Colors.LightGray,__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="pnlContent.Initialize(\"\")";
__ref._pnlcontent /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="mBase.AddView(pnlContent, 20dip, 20dip, width - 3";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlcontent /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),(int) (_width-__c.DipToCurrent((int) (30))),(int) (_height-__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="pnlContent.Color = Colors.Gray";
__ref._pnlcontent /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Gray);
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="pnlContent.LoadLayout(\"timeline_item\")";
__ref._pnlcontent /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("timeline_item",ba);
RDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getview(b4a.example.timelinebox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "getview", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getview", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub GetView() As Panel";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return null;
}
public String  _settitle(b4a.example.timelinebox __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "settitle", false))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_value}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub setTitle(value As String)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="lblTitle.Text = value";
__ref._lbltitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public String  _settime(b4a.example.timelinebox __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "settime", false))
	 {return ((String) Debug.delegate(ba, "settime", new Object[] {_value}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub setTime(value As String)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="lblTime.Text = value";
__ref._lbltime /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _setdescription(b4a.example.timelinebox __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "setdescription", false))
	 {return ((String) Debug.delegate(ba, "setdescription", new Object[] {_value}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub setDescription(value As String)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="lblContent.Text = value";
__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4a.example.timelinebox __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "setbitmap", false))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_value}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub setBitmap(value As Bitmap)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="imvTop.Bitmap = value";
__ref._imvtop /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_value.getObject()));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public String  _setcolor(b4a.example.timelinebox __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "setcolor", false))
	 {return ((String) Debug.delegate(ba, "setcolor", new Object[] {_value}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub setColor(value As Int)";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="pnlContent.As(B4XView).SetColorAndBorder(value, 0";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnlcontent /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()))).SetColorAndBorder(_value,__c.DipToCurrent((int) (0)),__c.Colors.White,__c.DipToCurrent((int) (8)));
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return "";
}
public String  _hidebutton(b4a.example.timelinebox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "hidebutton", false))
	 {return ((String) Debug.delegate(ba, "hidebutton", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub HideButton()";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="pnlButtonGroup.Visible = False";
__ref._pnlbuttongroup /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.timelinebox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.timelinebox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Public mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Private pnlWrapper As Panel";
_pnlwrapper = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Private imvLine As ImageView";
_imvline = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Private imvTop As ImageView";
_imvtop = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Private pnlContent As Panel";
_pnlcontent = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Private lineWidth As Int = 2dip";
_linewidth = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Private lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Private lblContent As Label";
_lblcontent = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Private lblTime As Label";
_lbltime = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Private pnlButtonGroup As Panel";
_pnlbuttongroup = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Private cv As Canvas";
_cv = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.timelinebox __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _clr = 0;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_base));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(this);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return "";
}
public String  _drawdottedline(b4a.example.timelinebox __ref,float _x1,float _y1,float _x2,float _y2,int _forecolor,int _segmentsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "drawdottedline", false))
	 {return ((String) Debug.delegate(ba, "drawdottedline", new Object[] {_x1,_y1,_x2,_y2,_forecolor,_segmentsize}));}
float _linelength = 0f;
int _nsegments = 0;
float _fract = 0f;
float _xincr = 0f;
float _xincrline = 0f;
float _yincr = 0f;
float _yincrline = 0f;
int _i = 0;
float _xx1 = 0f;
float _yy1 = 0f;
float _xx2 = 0f;
float _yy2 = 0f;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub drawDottedLine(x1 As Float, y1 As Floa";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim lineLength As Float = Sqrt((x1 - x2) * (x1 -";
_linelength = (float) (__c.Sqrt((_x1-_x2)*(_x1-_x2)+(_y1-_y2)*(_y1-_y2)));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim nSegments As Int = (lineLength + .5 * segment";
_nsegments = (int) ((_linelength+.5*_segmentsize)/(double)(1.5*_segmentsize));
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim fract As Float = (lineLength + .5 * segmentSi";
_fract = (float) ((_linelength+.5*_segmentsize)/(double)_linelength);
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Dim xIncr As Float = fract * (x2 - x1) / nSegment";
_xincr = (float) (_fract*(_x2-_x1)/(double)_nsegments);
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Dim xIncrLine As Float = .6667 * xIncr";
_xincrline = (float) (.6667*_xincr);
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="Dim yIncr As Float = fract * (y2 - y1) / nSegment";
_yincr = (float) (_fract*(_y2-_y1)/(double)_nsegments);
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="Dim yIncrLine As Float =  .6667 * yIncr";
_yincrline = (float) (.6667*_yincr);
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="For i = 0 To nSegments - 1";
{
final int step8 = 1;
final int limit8 = (int) (_nsegments-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Dim xx1 As Float = x1 + i * xIncr";
_xx1 = (float) (_x1+_i*_xincr);
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Dim yy1 As Float = y1 + i * yIncr";
_yy1 = (float) (_y1+_i*_yincr);
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Dim xx2 As Float = xx1 + xIncrLine";
_xx2 = (float) (_xx1+_xincrline);
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="Dim yy2 As Float = yy1 + yIncrLine";
_yy2 = (float) (_yy1+_yincrline);
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="If i = nSegments - 1 Then";
if (_i==_nsegments-1) { 
RDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="cv.DrawLine(xx1, yy1, x2, y2, foreColor, lineWi";
__ref._cv /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawLine(_xx1,_yy1,_x2,_y2,_forecolor,(float) (__ref._linewidth /*int*/ ));
 }else {
RDebugUtils.currentLine=1769490;
 //BA.debugLineNum = 1769490;BA.debugLine="cv.DrawLine(xx1, yy1, xx2, yy2, foreColor, line";
__ref._cv /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawLine(_xx1,_yy1,_xx2,_yy2,_forecolor,(float) (__ref._linewidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=1769493;
 //BA.debugLineNum = 1769493;BA.debugLine="End Sub";
return "";
}
public String  _loadlayout(b4a.example.timelinebox __ref,String _layoutfile) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "loadlayout", false))
	 {return ((String) Debug.delegate(ba, "loadlayout", new Object[] {_layoutfile}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub LoadLayout(LayoutFile As String)";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public String  _setlinecolor(b4a.example.timelinebox __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "setlinecolor", false))
	 {return ((String) Debug.delegate(ba, "setlinecolor", new Object[] {_color}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub setLineColor(color As Int)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="imvLine.Color = color";
__ref._imvline /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setColor(_color);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _setlinewidth(b4a.example.timelinebox __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="timelinebox";
if (Debug.shouldDelegate(ba, "setlinewidth", false))
	 {return ((String) Debug.delegate(ba, "setlinewidth", new Object[] {_value}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub setLineWidth(value As Int)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="lineWidth = value";
__ref._linewidth /*int*/  = _value;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
}
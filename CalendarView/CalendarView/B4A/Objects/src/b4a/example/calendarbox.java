package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class calendarbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.calendarbox");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.calendarbox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _events{
public boolean IsInitialized;
public int color;
public String eventName;
public long date;
public void Initialize() {
IsInitialized = true;
color = 0;
eventName = "";
date = 0L;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlwrapper = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbottom = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _vbitmap = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext = null;
public anywheresoftware.b4a.objects.collections.List _lstevent = null;
public boolean _hasevent = false;
public long _ldate = 0L;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _addevent(b4a.example.calendarbox __ref,int _color,String _eventname,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "addevent", false))
	 {return ((String) Debug.delegate(ba, "addevent", new Object[] {_color,_eventname,_date}));}
b4a.example.calendarbox._events _event = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub AddEvent(color As Int, eventName As Str";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim event As Events";
_event = new b4a.example.calendarbox._events();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="event.Initialize";
_event.Initialize();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="event.color = color";
_event.color /*int*/  = _color;
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="event.eventName = eventName";
_event.eventName /*String*/  = _eventname;
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="event.date = date";
_event.date /*long*/  = _date;
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="lstEvent.Add(event)";
__ref._lstevent /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_event));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="If (getText <> \"\") Then";
if (((__ref._gettext /*String*/ (null)).equals("") == false)) { 
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="DrawEventSymbol";
__ref._draweventsymbol /*String*/ (null);
 };
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="End Sub";
return "";
}
public String  _gettext(b4a.example.calendarbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "gettext", false))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub getText() As String";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Return lblText.Text";
if (true) return __ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _draweventsymbol(b4a.example.calendarbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "draweventsymbol", false))
	 {return ((String) Debug.delegate(ba, "draweventsymbol", null));}
int _positionx = 0;
int _i = 0;
b4a.example.calendarbox._events _event = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub DrawEventSymbol";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="pnlBottom.RemoveAllViews";
__ref._pnlbottom /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Dim positionX As Int = 0";
_positionx = (int) (0);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="For i=0 To lstEvent.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._lstevent /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim event As Events = lstEvent.Get(i)";
_event = (b4a.example.calendarbox._events)(__ref._lstevent /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="lbl.As(B4XView).SetColorAndBorder(event.color, 0";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()))).SetColorAndBorder(_event.color /*int*/ ,__c.DipToCurrent((int) (0)),__c.Colors.White,__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="pnlBottom.AddView(lbl, positionX, 0, 6dip, 6dip)";
__ref._pnlbottom /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_positionx,(int) (0),__c.DipToCurrent((int) (6)),__c.DipToCurrent((int) (6)));
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="positionX = positionX + 8dip";
_positionx = (int) (_positionx+__c.DipToCurrent((int) (8)));
 }
};
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="pnlBottom.Width = (5dip * lstEvent.Size) + (3dip";
__ref._pnlbottom /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) ((__c.DipToCurrent((int) (5))*__ref._lstevent /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+(__c.DipToCurrent((int) (3))*__ref._lstevent /*anywheresoftware.b4a.objects.collections.List*/ .getSize())));
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="pnlBottom.Left= (pnlWrapper.Width - pnlBottom.Wid";
__ref._pnlbottom /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) ((__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__ref._pnlbottom /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth())/(double)2));
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.calendarbox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.calendarbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Public mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Private pnlWrapper As Panel";
_pnlwrapper = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="Private pnlBottom As Panel";
_pnlbottom = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Private vBitmap As ImageView";
_vbitmap = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="Private lblText As Label";
_lbltext = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Private lstEvent As List";
_lstevent = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Type Events (color As Int, eventName As String, d";
;
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="Private hasEvent As Boolean = False";
_hasevent = __c.False;
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="Private lDate As Long";
_ldate = 0L;
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.calendarbox __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _clr = 0;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_base));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(this);
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="End Sub";
return "";
}
public long  _getdate(b4a.example.calendarbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "getdate", false))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub getDate() As Long";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return lDate";
if (true) return __ref._ldate /*long*/ ;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _getview(b4a.example.calendarbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "getview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "getview", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub GetView() As View";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return mBase";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.calendarbox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,int _width,int _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_width,_height}));}
int _hbox = 0;
int _ltext = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="mBase.Initialize(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBase");
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="lblText.Initialize(\"\")";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="lstEvent.Initialize";
__ref._lstevent /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="vBitmap.Initialize(\"\")";
__ref._vbitmap /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="pnlWrapper.Initialize(\"nplWrapper\")";
__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"nplWrapper");
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="vBitmap.Gravity = Gravity.CENTER";
__ref._vbitmap /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="mBase.AddView(pnlWrapper, 0,0,width,height)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Dim hBox As Int = pnlWrapper.Height - 10dip";
_hbox = (int) (__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="Dim lText As Int = (pnlWrapper.Width - hBox) / 2";
_ltext = (int) ((__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-_hbox)/(double)2);
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="pnlWrapper.AddView(lblText,  lText, 0, hBox, hBox";
__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),_ltext,(int) (0),_hbox,_hbox);
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="lblText.Text = 15";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(15));
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="lblText.TextColor = Colors.Black";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="pnlWrapper.AddView(vBitmap, 0, 0, pnlWrapper.Widt";
__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._vbitmap /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),(int) (__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="vBitmap.Visible = False";
__ref._vbitmap /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="pnlBottom.Initialize(\"\")";
__ref._pnlbottom /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="pnlWrapper.AddView(pnlBottom, 0,lblText.Height, p";
__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlbottom /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight(),__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="End Sub";
return "";
}
public String  _isselected(b4a.example.calendarbox __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "isselected", false))
	 {return ((String) Debug.delegate(ba, "isselected", new Object[] {_value}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub isSelected(value As Boolean)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If value = True Then";
if (_value==__c.True) { 
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="lblText.As(B4XView).SetColorAndBorder(Colors.ARG";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()))).SetColorAndBorder(__c.Colors.ARGB((int) (255),(int) (151),(int) (94),(int) (236)),__c.DipToCurrent((int) (1)),__c.Colors.White,__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="lblText.TextColor = Colors.White";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.White);
 };
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="End Sub";
return "";
}
public void  _mbase_click(b4a.example.calendarbox __ref) throws Exception{
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "mbase_click", false))
	 {Debug.delegate(ba, "mbase_click", null); return;}
ResumableSub_mBase_Click rsub = new ResumableSub_mBase_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_mBase_Click extends BA.ResumableSub {
public ResumableSub_mBase_Click(b4a.example.calendarbox parent,b4a.example.calendarbox __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.calendarbox __ref;
b4a.example.calendarbox parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="calendarbox";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="lblText.As(B4XView).SetColorAndBorder(Colors.ARGB";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()))).SetColorAndBorder(parent.__c.Colors.ARGB((int) (255),(int) (151),(int) (94),(int) (236)),parent.__c.DipToCurrent((int) (1)),parent.__c.Colors.White,parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="lblText.TextColor = Colors.White";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent.__c.Colors.White);
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Sleep(300)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "calendarbox", "mbase_click"),(int) (300));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="lblText.As(B4XView).SetColorAndBorder(Colors.Whit";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()))).SetColorAndBorder(parent.__c.Colors.White,parent.__c.DipToCurrent((int) (1)),parent.__c.Colors.White,parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="lblText.TextColor = Colors.Black";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent.__c.Colors.Black);
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="CallSub2(mCallBack, mEventName & \"_Click\", getDat";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click",(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setbitmap(b4a.example.calendarbox __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bitmap) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "setbitmap", false))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_bitmap}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub setBitMap(bitmap As B4XBitmap)";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="vBitmap.Visible = True";
__ref._vbitmap /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="lblText.Visible = False";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="vBitmap.Bitmap = bitmap";
__ref._vbitmap /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_bitmap.getObject()));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="End Sub";
return "";
}
public String  _setdate(b4a.example.calendarbox __ref,long _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "setdate", false))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_value}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub setDate(value As Long)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="lDate = value";
__ref._ldate /*long*/  = _value;
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.example.calendarbox __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarbox";
if (Debug.shouldDelegate(ba, "settext", false))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_value}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub setText(value As String)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="lblText.Text = value";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
}
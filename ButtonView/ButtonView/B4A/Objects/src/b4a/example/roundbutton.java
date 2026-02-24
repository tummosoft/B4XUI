package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class roundbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.roundbutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.roundbutton.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.LabelWrapper _imvicon = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlwrapper = null;
public int _basecolor = 0;
public int _basebackground = 0;
public int _iconcolor = 0;
public boolean _mdisabled = false;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _seticon(b4a.example.roundbutton __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "seticon", false))
	 {return ((String) Debug.delegate(ba, "seticon", new Object[] {_value}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub SetIcon(value As String)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If value = \"\" Then";
if ((_value).equals("")) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="imvIcon.Visible = False";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="imvIcon.Text = value";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gr";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="lblText.Width = pnlWrapper.Width";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="lblText.Left = 0";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
 }else {
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="imvIcon.Visible = True";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="imvIcon.TextColor = baseColor";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._basecolor /*int*/ );
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="imvIcon.Text = value";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="lblText.Gravity = Gravity.LEFT + Gravity.CENTER";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER));
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="lblText.Left = 25dip";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft(__c.DipToCurrent((int) (25)));
 };
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="End Sub";
return "";
}
public String  _setfont(b4a.example.roundbutton __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "setfont", false))
	 {return ((String) Debug.delegate(ba, "setfont", new Object[] {_value}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub SetFont(value As Typeface)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="imvIcon.Typeface = value";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface((android.graphics.Typeface)(_value.getObject()));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _setcolor(b4a.example.roundbutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "setcolor", false))
	 {return ((String) Debug.delegate(ba, "setcolor", new Object[] {_value}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub SetColor(value As Int)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="baseBackground = value";
__ref._basebackground /*int*/  = _value;
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="RedrawColor";
__ref._redrawcolor /*String*/ (null);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.roundbutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_value}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub SetTextColor(value As Int)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="baseColor = value";
__ref._basecolor /*int*/  = _value;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="RedrawColor";
__ref._redrawcolor /*String*/ (null);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return "";
}
public String  _seticoncolor(b4a.example.roundbutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "seticoncolor", false))
	 {return ((String) Debug.delegate(ba, "seticoncolor", new Object[] {_value}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub SetIconColor(value As Int)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="imvIcon.TextColor = value";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_value);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _setdisabled(b4a.example.roundbutton __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "setdisabled", false))
	 {return ((String) Debug.delegate(ba, "setdisabled", new Object[] {_value}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub setDisabled(value As Boolean)";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="mDisabled = value";
__ref._mdisabled /*boolean*/  = _value;
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="If mDisabled = True Then";
if (__ref._mdisabled /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="pnlWrapper.As(B4XView).SetColorAndBorder(Colors.";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()))).SetColorAndBorder(__c.Colors.ARGB((int) (255),(int) (204),(int) (204),(int) (204)),__c.DipToCurrent((int) (1)),__c.Colors.ARGB((int) (255),(int) (204),(int) (204),(int) (204)),__c.DipToCurrent((int) (4)));
 }else {
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="pnlWrapper.As(B4XView).SetColorAndBorder(baseBac";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()))).SetColorAndBorder(__ref._basebackground /*int*/ ,__c.DipToCurrent((int) (1)),__ref._basecolor /*int*/ ,__c.DipToCurrent((int) (4)));
 };
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.roundbutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.roundbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Private imvIcon As Label";
_imvicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Private lblText As Label";
_lbltext = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Private pnlWrapper As Panel";
_pnlwrapper = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Private baseColor As Int = Colors.ARGB(255,40, 69";
_basecolor = __c.Colors.ARGB((int) (255),(int) (40),(int) (69),(int) (214));
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Private baseBackground As Int = Colors.White";
_basebackground = __c.Colors.White;
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Private iconColor As Int = Colors.White";
_iconcolor = __c.Colors.White;
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Private mDisabled As Boolean = False";
_mdisabled = __c.False;
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.roundbutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub DesignerCreateView (base As Object, lbl";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="mBase = base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="baseBackground = xui.PaintOrColorToColor(Props.Ge";
__ref._basebackground /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="mBase.Color = Colors.Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="pnlWrapper.Initialize(\"pnlWrapper\")";
__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"pnlWrapper");
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="mBase.AddView(pnlWrapper, 2dip, 2dip, mBase.Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (4))),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="imvIcon.Initialize(\"\")";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="pnlWrapper.AddView(imvIcon, 2dip, 0, 20dip, pnlWr";
__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),__c.DipToCurrent((int) (2)),(int) (0),__c.DipToCurrent((int) (20)),__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="imvIcon.TextSize = 22";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (22));
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="imvIcon.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="imvIcon.TextColor = iconColor";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._iconcolor /*int*/ );
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="imvIcon.Visible = True";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="lblText.Initialize(\"\")";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="pnlWrapper.AddView(lblText, 0dip, 0dip, pnlWrappe";
__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="pnlWrapper.As(B4XView).SetColorAndBorder(baseBack";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()))).SetColorAndBorder(__ref._basebackground /*int*/ ,__c.DipToCurrent((int) (1)),__ref._basecolor /*int*/ ,__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="lblText.TextSize = 14";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (14));
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="lblText.Text = \"Round Button\"";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Round Button"));
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="lblText.TextColor = baseColor";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._basecolor /*int*/ );
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="End Sub";
return "";
}
public boolean  _getdisabled(b4a.example.roundbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "getdisabled", false))
	 {return ((Boolean) Debug.delegate(ba, "getdisabled", null));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Public Sub getDisabled() As Boolean";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Return mDisabled";
if (true) return __ref._mdisabled /*boolean*/ ;
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.roundbutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="End Sub";
return "";
}
public void  _pnlwrapper_click(b4a.example.roundbutton __ref) throws Exception{
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "pnlwrapper_click", false))
	 {Debug.delegate(ba, "pnlwrapper_click", null); return;}
ResumableSub_pnlWrapper_Click rsub = new ResumableSub_pnlWrapper_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_pnlWrapper_Click extends BA.ResumableSub {
public ResumableSub_pnlWrapper_Click(b4a.example.roundbutton parent,b4a.example.roundbutton __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.roundbutton __ref;
b4a.example.roundbutton parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="roundbutton";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If mDisabled = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._mdisabled /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="mBase.SetColorAndBorder(baseBackground, 2dip, Co";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._basebackground /*int*/ ,parent.__c.DipToCurrent((int) (2)),parent.__c.Colors.ARGB((int) (150),(int) (7),(int) (220),(int) (242)),parent.__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Sleep(300)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "roundbutton", "pnlwrapper_click"),(int) (300));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="mBase.SetColorAndBorder(Colors.Transparent, 0dip";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(parent.__c.Colors.Transparent,parent.__c.DipToCurrent((int) (0)),parent.__c.Colors.ARGB((int) (150),(int) (7),(int) (220),(int) (242)),parent.__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="CallSub(mCallBack, mEventName & \"_Click\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _redrawcolor(b4a.example.roundbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "redrawcolor", false))
	 {return ((String) Debug.delegate(ba, "redrawcolor", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub RedrawColor()";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="pnlWrapper.As(B4XView).SetColorAndBorder(baseBack";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnlwrapper /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()))).SetColorAndBorder(__ref._basebackground /*int*/ ,__c.DipToCurrent((int) (0)),__ref._basecolor /*int*/ ,__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="lblText.TextColor = baseColor";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._basecolor /*int*/ );
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(b4a.example.roundbutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundbutton";
if (Debug.shouldDelegate(ba, "settextsize", false))
	 {return ((String) Debug.delegate(ba, "settextsize", new Object[] {_value}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub setTextSize(value As Int)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="lblText.TextSize = value";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (_value));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
}
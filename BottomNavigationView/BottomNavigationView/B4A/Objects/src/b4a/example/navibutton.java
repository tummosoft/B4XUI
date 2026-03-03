package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class navibutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.navibutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.navibutton.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _imvicon = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext = null;
public int _basewidth = 0;
public int _imvwidth = 0;
public int _fontsize = 0;
public int _index = 0;
public anywheresoftware.b4a.objects.LabelWrapper _imvline = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbadge = null;
public int _coloricon = 0;
public int _selectedcolor = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _active(b4a.example.navibutton __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "active", false))
	 {return ((String) Debug.delegate(ba, "active", new Object[] {_value}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Active(value As Boolean)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If value = True Then";
if (_value==__c.True) { 
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="imvLine.Visible = True";
__ref._imvline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="imvIcon.TextColor = selectedColor";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._selectedcolor /*int*/ );
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="lblText.TextColor = selectedColor";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._selectedcolor /*int*/ );
 }else {
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="imvLine.Visible = False";
__ref._imvline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="imvIcon.TextColor = colorIcon";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._coloricon /*int*/ );
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="lblText.TextColor = colorIcon";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._coloricon /*int*/ );
 };
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.navibutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.navibutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Public mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Private imvIcon As Label";
_imvicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Private lblText As Label";
_lbltext = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Private baseWidth As Int = 50dip";
_basewidth = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Private imvWidth As Int = 25dip";
_imvwidth = __c.DipToCurrent((int) (25));
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Private fontsize As Int = 10";
_fontsize = (int) (10);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Private index As Int = 0";
_index = (int) (0);
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Dim imvLine As Label";
_imvline = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Dim lblBadge As Label";
_lblbadge = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="Private colorIcon As Int = Colors.ARGB(255, 141,";
_coloricon = __c.Colors.ARGB((int) (255),(int) (141),(int) (152),(int) (166));
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Private selectedColor As Int = Colors.ARGB(255, 8";
_selectedcolor = __c.Colors.ARGB((int) (255),(int) (83),(int) (2),(int) (250));
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.navibutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _clr = 0;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub DesignerCreateView (base As Object, lbl";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="mBase = base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_base));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(this);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="End Sub";
return "";
}
public String  _font(b4a.example.navibutton __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "font", false))
	 {return ((String) Debug.delegate(ba, "font", new Object[] {_value}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Font(value As Typeface)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="imvIcon.Typeface = value";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface((android.graphics.Typeface)(_value.getObject()));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public int  _getposition(b4a.example.navibutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "getposition", false))
	 {return ((Integer) Debug.delegate(ba, "getposition", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub getPosition() As Int";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="return index";
if (true) return __ref._index /*int*/ ;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getview(b4a.example.navibutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "getview", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getview", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub GetView() As Panel";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return null;
}
public String  _icon(b4a.example.navibutton __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "icon", false))
	 {return ((String) Debug.delegate(ba, "icon", new Object[] {_value}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Icon(value As String)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="imvIcon.Text = value";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.navibutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,int _width) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_width}));}
int _mleft = 0;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="baseWidth = width";
__ref._basewidth /*int*/  = _width;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="mBase.Initialize(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBase");
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="imvLine.Initialize(\"\")";
__ref._imvline /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="imvLine.Color = selectedColor";
__ref._imvline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__ref._selectedcolor /*int*/ );
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="mBase.AddView(imvLine, 0, 0, baseWidth, 2dip)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._imvline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._basewidth /*int*/ ,__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="imvLine.Visible = False";
__ref._imvline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="imvIcon.Initialize(\"\")";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="Dim mLeft As Int = (width - imvWidth) / 2";
_mleft = (int) ((_width-__ref._imvwidth /*int*/ )/(double)2);
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="mBase.AddView(imvIcon, mLeft, 5dip, baseWidth, im";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),_mleft,__c.DipToCurrent((int) (5)),__ref._basewidth /*int*/ ,__ref._imvwidth /*int*/ );
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="imvIcon.Typeface = Typeface.FONTAWESOME";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.getFONTAWESOME());
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="imvIcon.TextSize = 18";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (18));
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="imvIcon.TextColor = colorIcon";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._coloricon /*int*/ );
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="imvIcon.Gravity = Gravity.CENTER";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="lblBadge.Initialize(\"\")";
__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="mBase.AddView(lblBadge, imvIcon.Width / 2, 5dip,";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .getWidth()/(double)2),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="lblBadge.As(B4XView).SetColorAndBorder(Colors.ARG";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()))).SetColorAndBorder(__c.Colors.ARGB((int) (255),(int) (235),(int) (76),(int) (76)),__c.DipToCurrent((int) (0)),__c.Colors.Transparent,__c.DipToCurrent((int) (6)));
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="lblBadge.Text = \"5\"";
__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("5"));
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="lblBadge.TextSize = 8";
__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (8));
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="lblBadge.TextColor = Colors.White";
__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.White);
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="lblBadge.Gravity = Gravity.CENTER_HORIZONTAL + Gr";
__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="lblBadge.Visible = False";
__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="lblText.Initialize(\"\")";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="lblText.TextColor = colorIcon";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._coloricon /*int*/ );
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="mBase.AddView(lblText, 0dip, 25dip, baseWidth, 20";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (25)),__ref._basewidth /*int*/ ,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="lblText.Text = \"Navi Button\"";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Navi Button"));
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="lblText.Gravity = Gravity.CENTER";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="lblText.TextSize = fontsize";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (__ref._fontsize /*int*/ ));
RDebugUtils.currentLine=983082;
 //BA.debugLineNum = 983082;BA.debugLine="mBase.Invalidate";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="End Sub";
return "";
}
public void  _mbase_click(b4a.example.navibutton __ref) throws Exception{
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "mbase_click", false))
	 {Debug.delegate(ba, "mbase_click", null); return;}
ResumableSub_mBase_Click rsub = new ResumableSub_mBase_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_mBase_Click extends BA.ResumableSub {
public ResumableSub_mBase_Click(b4a.example.navibutton parent,b4a.example.navibutton __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.navibutton __ref;
b4a.example.navibutton parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="navibutton";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="imvIcon.TextColor = selectedColor";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._selectedcolor /*int*/ );
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="lblText.TextColor = selectedColor";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._selectedcolor /*int*/ );
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Sleep(300)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "navibutton", "mbase_click"),(int) (300));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="imvIcon.TextColor = colorIcon";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._coloricon /*int*/ );
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="lblText.TextColor = colorIcon";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__ref._coloricon /*int*/ );
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="CallSub(mCallBack, mEventName & \"_Click\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click");
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _resize(b4a.example.navibutton __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "resize", false))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_value}));}
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub Resize(value As String)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="cvs1.Initialize(lblText)";
_cvs1.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject())));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFA";
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont(__c.Typeface.DEFAULT,(float) (__ref._fontsize /*int*/ ));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(value, fnt)";
_r = _cvs1.MeasureText(_value,_fnt);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="lblText.Width = r.Width + 10dip";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (_r.getWidth()+__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="imvIcon.Left = (mBase.Width - imvIcon.Width) / 2";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) ((__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .getWidth())/(double)2));
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="imvLine.Width = mBase.Width";
__ref._imvline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="lblText.Width = mBase.Width";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="mBase.Invalidate";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="End Sub";
return "";
}
public String  _setbadge(b4a.example.navibutton __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "setbadge", false))
	 {return ((String) Debug.delegate(ba, "setbadge", new Object[] {_value}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="public Sub setBadge(value As String)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If value <> \"\" Then";
if ((_value).equals("") == false) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="lblBadge.Text = value";
__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="lblBadge.Visible = True";
__ref._lblbadge /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="End Sub";
return "";
}
public String  _setbasecolor(b4a.example.navibutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "setbasecolor", false))
	 {return ((String) Debug.delegate(ba, "setbasecolor", new Object[] {_value}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub SetBaseColor(value As Int)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="mBase.Color = value";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(_value);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public String  _setposition(b4a.example.navibutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "setposition", false))
	 {return ((String) Debug.delegate(ba, "setposition", new Object[] {_value}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub setPosition(value As Int)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="index = value";
__ref._index /*int*/  = _value;
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.navibutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_value}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub setTextColor(value As Int)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="lblText.TextColor = value";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_value);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(b4a.example.navibutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "settextsize", false))
	 {return ((String) Debug.delegate(ba, "settextsize", new Object[] {_value}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub setTextSize(value As Int)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="lblText.TextSize = value";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (_value));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public String  _text(b4a.example.navibutton __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="navibutton";
if (Debug.shouldDelegate(ba, "text", false))
	 {return ((String) Debug.delegate(ba, "text", new Object[] {_value}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Text(value As String)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Resize(value)";
__ref._resize /*String*/ (null,_value);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="lblText.Text = value";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="End Sub";
return "";
}
}
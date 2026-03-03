package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class textboxview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.textboxview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.textboxview.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtinput = null;
public anywheresoftware.b4a.objects.LabelWrapper _imvicon = null;
public int _mbordercolor = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _base_resize(b4a.example.textboxview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="textboxview";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.textboxview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="textboxview";
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="Private txtInput As EditText";
_txtinput = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="Private imvIcon As Label";
_imvicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="Private mBorderColor As Int = Colors.ARGB(255,246";
_mbordercolor = __c.Colors.ARGB((int) (255),(int) (246),(int) (246),(int) (246));
RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.textboxview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="textboxview";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _clr = 0;
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="txtInput.Initialize(\"txtInput\")";
__ref._txtinput /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"txtInput");
RDebugUtils.currentLine=12451848;
 //BA.debugLineNum = 12451848;BA.debugLine="mBase.Color = Colors.White";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=12451850;
 //BA.debugLineNum = 12451850;BA.debugLine="txtInput.Color = Colors.Red";
__ref._txtinput /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Red);
RDebugUtils.currentLine=12451851;
 //BA.debugLineNum = 12451851;BA.debugLine="mBase.AddView(txtInput, 10dip, 2dip, mBase.Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._txtinput /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (2)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (35))),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=12451852;
 //BA.debugLineNum = 12451852;BA.debugLine="txtInput.Gravity = Gravity.CENTER_VERTICAL";
__ref._txtinput /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=12451853;
 //BA.debugLineNum = 12451853;BA.debugLine="txtInput.Text = \"Hello world\"";
__ref._txtinput /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence("Hello world"));
RDebugUtils.currentLine=12451855;
 //BA.debugLineNum = 12451855;BA.debugLine="imvIcon.Initialize(\"\")";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=12451856;
 //BA.debugLineNum = 12451856;BA.debugLine="mBase.AddView(imvIcon, txtInput.Width, 2dip, 25di";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),__ref._txtinput /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth(),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (25)),__ref._txtinput /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getHeight());
RDebugUtils.currentLine=12451857;
 //BA.debugLineNum = 12451857;BA.debugLine="imvIcon.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=12451859;
 //BA.debugLineNum = 12451859;BA.debugLine="txtInput.Color = Colors.Transparent";
__ref._txtinput /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=12451860;
 //BA.debugLineNum = 12451860;BA.debugLine="mBase.SetColorAndBorder(Colors.White, 1dip, mBord";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__c.Colors.White,__c.DipToCurrent((int) (1)),__ref._mbordercolor /*int*/ ,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=12451862;
 //BA.debugLineNum = 12451862;BA.debugLine="imvIcon.Typeface = Typeface.MATERIALICONS";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.getMATERIALICONS());
RDebugUtils.currentLine=12451863;
 //BA.debugLineNum = 12451863;BA.debugLine="imvIcon.Text = Chr(0xE5DB)";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe5db))));
RDebugUtils.currentLine=12451864;
 //BA.debugLineNum = 12451864;BA.debugLine="imvIcon.Color = Colors.Transparent";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=12451865;
 //BA.debugLineNum = 12451865;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.textboxview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="textboxview";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="End Sub";
return "";
}
public String  _seticon(b4a.example.textboxview __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="textboxview";
if (Debug.shouldDelegate(ba, "seticon", false))
	 {return ((String) Debug.delegate(ba, "seticon", new Object[] {_value}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub setIcon(value As String)";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="imvIcon.Text = value";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="End Sub";
return "";
}
public String  _seticontypeface(b4a.example.textboxview __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="textboxview";
if (Debug.shouldDelegate(ba, "seticontypeface", false))
	 {return ((String) Debug.delegate(ba, "seticontypeface", new Object[] {_value}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub setIconTypeface(value As Typeface)";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="imvIcon.Typeface = value";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface((android.graphics.Typeface)(_value.getObject()));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return "";
}
}
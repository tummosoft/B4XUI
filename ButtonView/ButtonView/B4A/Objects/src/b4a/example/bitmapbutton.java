package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bitmapbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.bitmapbutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.bitmapbutton.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _pnlbgbutton = null;
public anywheresoftware.b4a.objects.LabelWrapper _imvicon = null;
public int _mwidth = 0;
public int _mheight = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext = null;
public int _mradius = 0;
public int _bgcolor = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _settext(b4a.example.bitmapbutton __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapbutton";
if (Debug.shouldDelegate(ba, "settext", false))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_value}));}
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Public Sub setText(value As String)";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="lblText.Text = value";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(b4a.example.bitmapbutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapbutton";
if (Debug.shouldDelegate(ba, "settextsize", false))
	 {return ((String) Debug.delegate(ba, "settextsize", new Object[] {_value}));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Public Sub setTextSize(value As Int)";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="lblText.TextSize = value";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (_value));
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.bitmapbutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapbutton";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_value}));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub setTextColor(value As Int)";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="lblText.TextColor = value";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_value);
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4a.example.bitmapbutton __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapbutton";
if (Debug.shouldDelegate(ba, "setbitmap", false))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_dir,_filename}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _ico = null;
b4a.example.bitmapcreator _bm = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub SetBitmap(Dir As String, fileName As St";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim ico As B4XBitmap = LoadBitmapResize(Dir, file";
_ico = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_ico = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(_dir,_filename,__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)),__c.False).getObject()));
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim bm As BitmapCreator";
_bm = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="bm.Initialize( mWidth - 10dip, mHeight - 10dip)";
_bm._initialize(ba,(int) (__ref._mwidth /*int*/ -__c.DipToCurrent((int) (10))),(int) (__ref._mheight /*int*/ -__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="bm.DrawBitmap(ico, bm.TargetRect, False)";
_bm._drawbitmap(_ico,_bm._targetrect,__c.False);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="imvIcon.SetBackgroundImage(bm.Bitmap)";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_bm._getbitmap().getObject()));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(b4a.example.bitmapbutton __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapbutton";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", false))
	 {return ((String) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_color}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub setBackgroundColor(color As Int)";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="pnlBgButton.As(B4XView).SetColorAndBorder(color,";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnlbgbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()))).SetColorAndBorder(_color,__c.DipToCurrent((int) (0)),__c.Colors.DarkGray,__ref._mradius /*int*/ );
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.bitmapbutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapbutton";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.bitmapbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapbutton";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Private pnlBgButton As Panel";
_pnlbgbutton = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="Private imvIcon As Label";
_imvicon = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Dim mWidth As Int";
_mwidth = 0;
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Dim mHeight As Int";
_mheight = 0;
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="Private lblText As Label";
_lbltext = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="Private mRadius As Int";
_mradius = 0;
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="Private bgColor As Int = Colors.ARGB(255,156, 207";
_bgcolor = __c.Colors.ARGB((int) (255),(int) (156),(int) (207),(int) (255));
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.bitmapbutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapbutton";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _clr = 0;
int _left = 0;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="pnlBgButton.Initialize(\"pnlBgButton\")";
__ref._pnlbgbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"pnlBgButton");
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="mWidth = mBase.Width";
__ref._mwidth /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="mHeight = mWidth";
__ref._mheight /*int*/  = __ref._mwidth /*int*/ ;
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Dim left As Int = (mBase.Width - mWidth) / 2";
_left = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._mwidth /*int*/ )/(double)2);
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="mRadius = (mBase.Width / 2) - 5dip";
__ref._mradius /*int*/  = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2)-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="mBase.AddView(pnlBgButton, left, 0dip, mWidth, mH";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnlbgbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_left,__c.DipToCurrent((int) (0)),__ref._mwidth /*int*/ ,__ref._mheight /*int*/ );
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="pnlBgButton.As(B4XView).SetColorAndBorder(bgColor";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnlbgbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()))).SetColorAndBorder(__ref._bgcolor /*int*/ ,__c.DipToCurrent((int) (0)),__c.Colors.DarkGray,__ref._mradius /*int*/ );
RDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="imvIcon.Initialize(\"\")";
__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="pnlBgButton.AddView(imvIcon, 5dip, 5dip, mWidth -";
__ref._pnlbgbutton /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._imvicon /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (__ref._mwidth /*int*/ -__c.DipToCurrent((int) (10))),(int) (__ref._mheight /*int*/ -__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="SetBitmap(File.DirAssets, \"icons8-photo-94.png\")";
__ref._setbitmap /*String*/ (null,__c.File.getDirAssets(),"icons8-photo-94.png");
RDebugUtils.currentLine=1769493;
 //BA.debugLineNum = 1769493;BA.debugLine="lblText.Initialize(\"\")";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=1769494;
 //BA.debugLineNum = 1769494;BA.debugLine="lblText.Text = \"Colors\"";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Colors"));
RDebugUtils.currentLine=1769495;
 //BA.debugLineNum = 1769495;BA.debugLine="mBase.AddView(lblText, 0, mHeight + 3dip, mWidth,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._mheight /*int*/ +__c.DipToCurrent((int) (3))),__ref._mwidth /*int*/ ,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1769496;
 //BA.debugLineNum = 1769496;BA.debugLine="lblText.TextSize = 11";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (11));
RDebugUtils.currentLine=1769497;
 //BA.debugLineNum = 1769497;BA.debugLine="lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gra";
__ref._lbltext /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1769499;
 //BA.debugLineNum = 1769499;BA.debugLine="mBase.Height = mHeight + 25dip";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (__ref._mheight /*int*/ +__c.DipToCurrent((int) (25))));
RDebugUtils.currentLine=1769500;
 //BA.debugLineNum = 1769500;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.bitmapbutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bitmapbutton";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public String  _pnlbgbutton_click(b4a.example.bitmapbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bitmapbutton";
if (Debug.shouldDelegate(ba, "pnlbgbutton_click", false))
	 {return ((String) Debug.delegate(ba, "pnlbgbutton_click", null));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub pnlBgButton_Click";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="CallSub(mCallBack, mEventName & \"_Click\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click");
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="End Sub";
return "";
}
}
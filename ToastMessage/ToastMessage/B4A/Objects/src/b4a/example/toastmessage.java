package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class toastmessage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.toastmessage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.toastmessage.class).invoke(this, new Object[] {null});
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
public int _type_success = 0;
public int _type_warning = 0;
public int _type_info = 0;
public int _type_error = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _imvicon = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcontent = null;
public int _fontsize = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4a.example.toastmessage __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,anywheresoftware.b4a.objects.PanelWrapper _parentview) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="toastmessage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_parentview}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="mBase.Initialize(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBase");
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="imvIcon.Initialize(\"\")";
__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="lblContent.Initialize(\"\")";
__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="lblContent.TextSize = fontsize";
__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (__ref._fontsize /*int*/ ));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="ParentView.AddView(mBase, 0, 70%y, 60%x, 30dip)";
_parentview.AddView((android.view.View)(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.PerYToCurrent((float) (70),ba),__c.PerXToCurrent((float) (60),ba),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="mBase.AddView(imvIcon, 5dip, 5dip, 30dip, 30dip)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="mBase.AddView(lblContent, 45dip, 5dip, mBase.Widt";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (5)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth()),__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="lblContent.Gravity = Gravity.CENTER_VERTICAL";
__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="lblContent.TextColor = Colors.White";
__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="mBase.Elevation = 3dip";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setElevation((float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="mBase.As(B4XView).SetColorAndBorder(Colors.ARGB(2";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()))).SetColorAndBorder(__c.Colors.ARGB((int) (255),(int) (56),(int) (142),(int) (60)),__c.DipToCurrent((int) (0)),__c.Colors.White,__c.DipToCurrent((int) (8)));
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="End Sub";
return "";
}
public String  _maketext(b4a.example.toastmessage __ref,String _text,int _toasttype) throws Exception{
__ref = this;
RDebugUtils.currentModule="toastmessage";
if (Debug.shouldDelegate(ba, "maketext", false))
	 {return ((String) Debug.delegate(ba, "maketext", new Object[] {_text,_toasttype}));}
int _s_label = 0;
int _m_size = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub MakeText(Text As String, ToastType As I";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim s_label As Int = getNewSize(Text)";
_s_label = __ref._getnewsize /*int*/ (null,_text);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Dim m_size As Int = 70%x";
_m_size = __c.PerXToCurrent((float) (70),ba);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="If s_label > m_size Then";
if (_s_label>_m_size) { 
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="mBase.Width = m_size";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_m_size);
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="mBase.Height = 42dip";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="lblContent.Top = 5dip";
__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop(__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="imvIcon.Top = 6dip";
__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setTop(__c.DipToCurrent((int) (6)));
 }else {
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="mBase.Width = s_label + 50dip";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (_s_label+__c.DipToCurrent((int) (50))));
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="mBase.Height = 30dip";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="imvIcon.Height = 25dip";
__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setHeight(__c.DipToCurrent((int) (25)));
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="imvIcon.Width = 25dip";
__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setWidth(__c.DipToCurrent((int) (25)));
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="imvIcon.Top = 3dip";
__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setTop(__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="lblContent.Top = 0dip";
__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop(__c.DipToCurrent((int) (0)));
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="lblContent.Left = 35dip";
__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft(__c.DipToCurrent((int) (35)));
 };
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="mBase.Left = (100%x - mBase.Width) / 2";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) ((__c.PerXToCurrent((float) (100),ba)-__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth())/(double)2));
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="lblContent.Text = Text";
__ref._lblcontent /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="If ToastType = TYPE_SUCCESS Then ' TYPE_SUCCESS";
if (_toasttype==__ref._type_success /*int*/ ) { 
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="mBase.Color = Colors.ARGB(255, 102, 188, 106)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.ARGB((int) (255),(int) (102),(int) (188),(int) (106)));
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="imvIcon.Bitmap = LoadBitmap(File.DirAssets, \"suc";
__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"success.png").getObject()));
 }else 
{RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="else if ToastType = TYPE_WARNING Then 'TYPE_WARNI";
if (_toasttype==__ref._type_warning /*int*/ ) { 
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="mBase.Color = Colors.ARGB(255, 255, 168, 33)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.ARGB((int) (255),(int) (255),(int) (168),(int) (33)));
RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="imvIcon.Bitmap = LoadBitmap(File.DirAssets, \"war";
__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"waring.png").getObject()));
 }else 
{RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="else if ToastType = TYPE_INFO Then";
if (_toasttype==__ref._type_info /*int*/ ) { 
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="mBase.Color = Colors.ARGB(255, 36, 186, 246)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.ARGB((int) (255),(int) (36),(int) (186),(int) (246)));
RDebugUtils.currentLine=1310751;
 //BA.debugLineNum = 1310751;BA.debugLine="imvIcon.Bitmap = LoadBitmap(File.DirAssets, \"inf";
__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"info.png").getObject()));
 }else 
{RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="else if ToastType = TYPE_ERROR Then";
if (_toasttype==__ref._type_error /*int*/ ) { 
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="mBase.Color = Colors.ARGB(255, 239, 82, 79)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.ARGB((int) (255),(int) (239),(int) (82),(int) (79)));
RDebugUtils.currentLine=1310754;
 //BA.debugLineNum = 1310754;BA.debugLine="imvIcon.Bitmap = LoadBitmap(File.DirAssets, \"err";
__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"error.png").getObject()));
 }}}}
;
RDebugUtils.currentLine=1310757;
 //BA.debugLineNum = 1310757;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1310758;
 //BA.debugLineNum = 1310758;BA.debugLine="End Sub";
return "";
}
public void  _show(b4a.example.toastmessage __ref,int _duration) throws Exception{
RDebugUtils.currentModule="toastmessage";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", new Object[] {_duration}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_duration);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.toastmessage parent,b4a.example.toastmessage __ref,int _duration) {
this.parent = parent;
this.__ref = __ref;
this._duration = _duration;
this.__ref = parent;
}
b4a.example.toastmessage __ref;
b4a.example.toastmessage parent;
int _duration;
anywheresoftware.b4a.objects.AnimationWrapper _anim = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="toastmessage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="mBase.Visible = True";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim anim As Animation";
_anim = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="anim.InitializeAlpha(\"\", 0, 1)";
_anim.InitializeAlpha(ba,"",(float) (0),(float) (1));
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="mBase.Visible = True";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="anim.Duration = Duration";
_anim.setDuration((long) (_duration));
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="anim.Start(mBase)";
_anim.Start((android.view.View)(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Sleep(2000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "toastmessage", "show"),(int) (2000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="anim.InitializeAlpha(\"\", 1, 0)";
_anim.InitializeAlpha(ba,"",(float) (1),(float) (0));
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="anim.Duration = Duration";
_anim.setDuration((long) (_duration));
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="anim.Start(mBase)";
_anim.Start((android.view.View)(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _base_resize(b4a.example.toastmessage __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="toastmessage";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.toastmessage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="toastmessage";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Public mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Public TYPE_SUCCESS As Int = 0";
_type_success = (int) (0);
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Public TYPE_WARNING As Int = 1";
_type_warning = (int) (1);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Public TYPE_INFO As Int = 2";
_type_info = (int) (2);
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Public TYPE_ERROR As Int = 3";
_type_error = (int) (3);
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Private imvIcon As ImageView";
_imvicon = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="Private lblContent As Label";
_lblcontent = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="Private fontsize As Int = 12";
_fontsize = (int) (12);
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.toastmessage __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="toastmessage";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _clr = 0;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_base));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(this);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.";
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="End Sub";
return "";
}
public int  _getnewsize(b4a.example.toastmessage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="toastmessage";
if (Debug.shouldDelegate(ba, "getnewsize", false))
	 {return ((Integer) Debug.delegate(ba, "getnewsize", new Object[] {_value}));}
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="private Sub getNewSize(value As String) As Int";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="cvs1.Initialize(imvIcon)";
_cvs1.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imvicon /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject())));
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFA";
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont(__c.Typeface.DEFAULT,(float) (__ref._fontsize /*int*/ ));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(value, fnt)";
_r = _cvs1.MeasureText(_value,_fnt);
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Return r.Width";
if (true) return (int) (_r.getWidth());
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="End Sub";
return 0;
}
}
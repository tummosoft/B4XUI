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
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlbutton = null;
public boolean _checkboxstate = false;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgcheckbox = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _targetsize = 0;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="imgCheckBox.Initialize(\"\")";
__ref._imgcheckbox /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Root.AddView(imgCheckBox, 50dip, 150dip, 220dip,";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._imgcheckbox /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (220)),__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Dim TargetSize As Int = 50dip";
_targetsize = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="bc.Initialize(TargetSize / xui.Scale, TargetSize";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (_targetsize/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(int) (_targetsize/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()));
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="DrawCheckBox";
__ref._drawcheckbox /*String*/ (null);
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, imgCheckBox)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imgcheckbox /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject())));
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="End Sub";
return "";
}
public String  _drawcheckbox(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "drawcheckbox", false))
	 {return ((String) Debug.delegate(ba, "drawcheckbox", null));}
int _bordercolor = 0;
int _borderwidth = 0;
float _left = 0f;
float _top = 0f;
float _right = 0f;
float _bottom = 0f;
b4a.example.bcpath._bcbrush _tickbrush = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub DrawCheckBox";
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="bc.DrawRect(bc.TargetRect, xui.Color_Transparent,";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrect(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.True,(int) (0));
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="Dim BorderColor As Int = xui.Color_Black";
_bordercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="Dim BorderWidth As Int = 2";
_borderwidth = (int) (2);
RDebugUtils.currentLine=12648457;
 //BA.debugLineNum = 12648457;BA.debugLine="bc.DrawRect(bc.TargetRect, BorderColor, False, Bo";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrect(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,_bordercolor,__c.False,_borderwidth);
RDebugUtils.currentLine=12648460;
 //BA.debugLineNum = 12648460;BA.debugLine="If CheckBoxState Then";
if (__ref._checkboxstate /*boolean*/ ) { 
RDebugUtils.currentLine=12648463;
 //BA.debugLineNum = 12648463;BA.debugLine="Dim Left As Float = 0";
_left = (float) (0);
RDebugUtils.currentLine=12648464;
 //BA.debugLineNum = 12648464;BA.debugLine="Dim Top As Float = 0";
_top = (float) (0);
RDebugUtils.currentLine=12648465;
 //BA.debugLineNum = 12648465;BA.debugLine="Dim Right As Float = bc.TargetRect.Width";
_right = __ref._bc /*b4a.example.bitmapcreator*/ ._targetrect.getWidth();
RDebugUtils.currentLine=12648466;
 //BA.debugLineNum = 12648466;BA.debugLine="Dim Bottom As Float = bc.TargetRect.Height";
_bottom = __ref._bc /*b4a.example.bitmapcreator*/ ._targetrect.getHeight();
RDebugUtils.currentLine=12648469;
 //BA.debugLineNum = 12648469;BA.debugLine="Dim TickBrush As BCBrush = bc.CreateBrushFromCol";
_tickbrush = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green);
RDebugUtils.currentLine=12648472;
 //BA.debugLineNum = 12648472;BA.debugLine="bc.DrawLine2(Left + (Right - Left) * 0.2, Top +";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawline2((float) (_left+(_right-_left)*0.2),(float) (_top+(_bottom-_top)*0.4),(float) (_left+(_right-_left)*0.45),(float) (_top+(_bottom-_top)*0.7),_tickbrush,(int) (3));
RDebugUtils.currentLine=12648477;
 //BA.debugLineNum = 12648477;BA.debugLine="bc.DrawLine2(Left + (Right - Left) * 0.45, Top +";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawline2((float) (_left+(_right-_left)*0.45),(float) (_top+(_bottom-_top)*0.7),(float) (_left+(_right-_left)*0.8),(float) (_top+(_bottom-_top)*0.3),_tickbrush,(int) (3));
 };
RDebugUtils.currentLine=12648481;
 //BA.debugLineNum = 12648481;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 589827;BA.debugLine="Private pnlButton As B4XView";
_pnlbutton = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private CheckBoxState As Boolean = False ' False:";
_checkboxstate = __c.False;
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private imgCheckBox As ImageView";
_imgcheckbox = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="End Sub";
return "";
}
public String  _createradiusbutton(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target,int _radius,int _btncolor,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createradiusbutton", false))
	 {return ((String) Debug.delegate(ba, "createradiusbutton", new Object[] {_target,_radius,_btncolor,_text}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub CreateRadiusButton(Target As B4XView, Radius A";
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="bc.Initialize(Target.Width, Target.Height)";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,_target.getWidth(),_target.getHeight());
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BtnColor, True,";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,_btncolor,__c.True,(int) (0),_radius);
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="Dim bmp As B4XBitmap = bc.Bitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap();
RDebugUtils.currentLine=12451852;
 //BA.debugLineNum = 12451852;BA.debugLine="Target.SetBitmap(bmp)";
_target.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=12451855;
 //BA.debugLineNum = 12451855;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12451856;
 //BA.debugLineNum = 12451856;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=12451857;
 //BA.debugLineNum = 12451857;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=12451858;
 //BA.debugLineNum = 12451858;BA.debugLine="lbl.TextColor = Colors.White";
_lbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=12451859;
 //BA.debugLineNum = 12451859;BA.debugLine="lbl.TextSize = 18";
_lbl.setTextSize((float) (18));
RDebugUtils.currentLine=12451860;
 //BA.debugLineNum = 12451860;BA.debugLine="lbl.Gravity = Gravity.CENTER";
_lbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=12451861;
 //BA.debugLineNum = 12451861;BA.debugLine="Target.AddView(lbl, 0, 0, Target.Width, Target.He";
_target.AddView((android.view.View)(_lbl.getObject()),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
RDebugUtils.currentLine=12451863;
 //BA.debugLineNum = 12451863;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 655362;BA.debugLine="pnlButton = xui.CreatePanel(\"pnlButton_Click\")";
__ref._pnlbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlButton_Click");
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="End Sub";
return "";
}
public String  _pnlbutton_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "pnlbutton_click", false))
	 {return ((String) Debug.delegate(ba, "pnlbutton_click", null));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Sub pnlButton_Click";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="ToastMessageShow(\"Button clicked!\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Button clicked!"),__c.False);
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="End Sub";
return "";
}
}
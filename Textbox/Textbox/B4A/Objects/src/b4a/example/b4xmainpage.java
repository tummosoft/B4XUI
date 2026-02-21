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
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblstatus = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _progress = 0;
float _sweepangle = 0f;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Dim progress As Int = 80";
_progress = (int) (80);
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Dim sweepAngle As Float = 360 * progress / 100";
_sweepangle = (float) (360*_progress/(double)100);
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="bc.Initialize(ImageView1.Width, ImageView1.Height";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,__ref._imageview1 /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight());
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="DrawProgress(45)";
__ref._drawprogress /*String*/ (null,(float) (45));
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="End Sub";
return "";
}
public String  _drawprogress(b4a.example.b4xmainpage __ref,float _percent) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "drawprogress", false))
	 {return ((String) Debug.delegate(ba, "drawprogress", new Object[] {_percent}));}
int _centerx = 0;
int _centery = 0;
int _radius = 0;
float _sweepangle = 0f;
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub DrawProgress(Percent As Float)";
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="bc.FillRect(Colors.White, bc.TargetRect)";
__ref._bc /*b4a.example.bitmapcreator*/ ._fillrect(__c.Colors.White,__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect);
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="Dim centerX As Int = bc.mWidth / 2";
_centerx = (int) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth/(double)2);
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="Dim centerY As Int = bc.mHeight / 2";
_centery = (int) (__ref._bc /*b4a.example.bitmapcreator*/ ._mheight/(double)2);
RDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="Dim radius As Int =  bc.mWidth / 2";
_radius = (int) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth/(double)2);
RDebugUtils.currentLine=12320779;
 //BA.debugLineNum = 12320779;BA.debugLine="bc.DrawCircle(centerX, centerY, radius, Colors.AR";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle((float) (_centerx),(float) (_centery),(float) (_radius),__c.Colors.ARGB((int) (255),(int) (214),(int) (214),(int) (214)),__c.False,(int) (20));
RDebugUtils.currentLine=12320780;
 //BA.debugLineNum = 12320780;BA.debugLine="bc.DrawCircle(centerX, centerY, radius, Colors.AR";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle((float) (_centerx),(float) (_centery),(float) (_radius),__c.Colors.ARGB((int) (255),(int) (238),(int) (238),(int) (238)),__c.False,(int) (18));
RDebugUtils.currentLine=12320782;
 //BA.debugLineNum = 12320782;BA.debugLine="Dim sweepAngle As Float = 360 * Percent / 100";
_sweepangle = (float) (360*_percent/(double)100);
RDebugUtils.currentLine=12320785;
 //BA.debugLineNum = 12320785;BA.debugLine="bc.DrawArc(centerX, centerY, radius, Colors.ARGB(";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawarc((float) (_centerx),(float) (_centery),(float) (_radius),__c.Colors.ARGB((int) (255),(int) (245),(int) (72),(int) (74)),__c.False,(int) (18),(float) (50),_sweepangle);
RDebugUtils.currentLine=12320787;
 //BA.debugLineNum = 12320787;BA.debugLine="ImageView1.Bitmap = bc.Bitmap";
__ref._imageview1 /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap().getObject()));
RDebugUtils.currentLine=12320788;
 //BA.debugLineNum = 12320788;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 589828;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Dim lblStatus As Label";
_lblstatus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="End Sub";
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
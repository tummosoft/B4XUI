package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class checkboxview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.checkboxview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.checkboxview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.LabelWrapper _imvcheckbox = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icocheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext = null;
public boolean _isselected = false;
public int _clrborder = 0;
public int _mtextcolor = 0;
public boolean _mdisabled = false;
public int _mhistorycolor = 0;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Private imvCheckbox As Label";
_imvcheckbox = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private icoCheck As B4XBitmap";
_icocheck = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private lblText As Label";
_lbltext = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private isSelected As Boolean = False";
_isselected = __c.False;
 //BA.debugLineNum = 16;BA.debugLine="Private clrBorder As Int = Colors.ARGB(255, 98,83";
_clrborder = __c.Colors.ARGB((int) (255),(int) (98),(int) (83),(int) (247));
 //BA.debugLineNum = 17;BA.debugLine="Private mTextColor As Int = Colors.Black";
_mtextcolor = __c.Colors.Black;
 //BA.debugLineNum = 18;BA.debugLine="Private mDisabled As Boolean = False";
_mdisabled = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Private mHistoryColor As Int";
_mhistorycolor = 0;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _color(int _value) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub Color(value As Int)";
 //BA.debugLineNum = 112;BA.debugLine="clrBorder = value";
_clrborder = _value;
 //BA.debugLineNum = 113;BA.debugLine="DrawCheckbox(isSelected)";
_drawcheckbox(_isselected);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
int _clrtext = 0;
 //BA.debugLineNum = 28;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 29;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 30;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 31;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 32;BA.debugLine="Dim clrText As Int = xui.PaintOrColorToColor(Prop";
_clrtext = _xui.PaintOrColorToColor(_props.Get((Object)("TextColor")));
 //BA.debugLineNum = 34;BA.debugLine="mBase.Color = Colors.Transparent";
_mbase.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 36;BA.debugLine="imvCheckbox.Initialize(\"imvCheckbox\")";
_imvcheckbox.Initialize(ba,"imvCheckbox");
 //BA.debugLineNum = 37;BA.debugLine="mBase.AddView(imvCheckbox, 0, 0, 20dip, 20dip)";
_mbase.AddView((android.view.View)(_imvcheckbox.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 38;BA.debugLine="icoCheck = LoadBitmapResize(File.DirAssets, \"chec";
_icocheck = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"check.png",__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)),__c.True).getObject()));
 //BA.debugLineNum = 40;BA.debugLine="lblText.Initialize(\"\")";
_lbltext.Initialize(ba,"");
 //BA.debugLineNum = 41;BA.debugLine="mBase.AddView(lblText, 25dip, 0, mBase.Width - 25";
_mbase.AddView((android.view.View)(_lbltext.getObject()),__c.DipToCurrent((int) (25)),(int) (0),(int) (_mbase.getWidth()-__c.DipToCurrent((int) (25))),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 42;BA.debugLine="lblText.Text = \"Checkbox 1\"";
_lbltext.setText(BA.ObjectToCharSequence("Checkbox 1"));
 //BA.debugLineNum = 43;BA.debugLine="lblText.TextColor = mTextColor";
_lbltext.setTextColor(_mtextcolor);
 //BA.debugLineNum = 45;BA.debugLine="DrawCheckbox(False)";
_drawcheckbox(__c.False);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _drawcheckbox(boolean _value) throws Exception{
b4a.example.bitmapcreator _bm = null;
 //BA.debugLineNum = 52;BA.debugLine="Private Sub DrawCheckbox(value As Boolean)";
 //BA.debugLineNum = 53;BA.debugLine="Dim bm As BitmapCreator";
_bm = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 54;BA.debugLine="bm.Initialize(16dip, 16dip)";
_bm._initialize(ba,__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)));
 //BA.debugLineNum = 56;BA.debugLine="If value = True Then";
if (_value==__c.True) { 
 //BA.debugLineNum = 57;BA.debugLine="bm.DrawRectRounded(bm.TargetRect, clrBorder, Tru";
_bm._drawrectrounded(_bm._targetrect,_clrborder,__c.True,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)));
 //BA.debugLineNum = 58;BA.debugLine="bm.DrawBitmap(icoCheck, bm.TargetRect, False)";
_bm._drawbitmap(_icocheck,_bm._targetrect,__c.False);
 }else {
 //BA.debugLineNum = 60;BA.debugLine="bm.DrawRectRounded(bm.TargetRect, clrBorder, Fal";
_bm._drawrectrounded(_bm._targetrect,_clrborder,__c.False,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)));
 };
 //BA.debugLineNum = 63;BA.debugLine="lblText.TextColor = mTextColor";
_lbltext.setTextColor(_mtextcolor);
 //BA.debugLineNum = 64;BA.debugLine="imvCheckbox.SetBackgroundImage(bm.Bitmap)";
_imvcheckbox.SetBackgroundImageNew((android.graphics.Bitmap)(_bm._getbitmap().getObject()));
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public boolean  _getchecked() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub getChecked() As Boolean";
 //BA.debugLineNum = 87;BA.debugLine="Return isSelected";
if (true) return _isselected;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return false;
}
public boolean  _getdisabled() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub getDisabled() As Boolean";
 //BA.debugLineNum = 104;BA.debugLine="Return mDisabled";
if (true) return _mdisabled;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return false;
}
public String  _gettext(String _value) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Public Sub getText(value As String)";
 //BA.debugLineNum = 121;BA.debugLine="Return lblText.Text";
if (true) return _lbltext.getText();
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _imvcheckbox_click() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub imvCheckbox_Click";
 //BA.debugLineNum = 68;BA.debugLine="If isSelected = True Then";
if (_isselected==__c.True) { 
 //BA.debugLineNum = 69;BA.debugLine="isSelected = False";
_isselected = __c.False;
 }else {
 //BA.debugLineNum = 71;BA.debugLine="isSelected = True";
_isselected = __c.True;
 };
 //BA.debugLineNum = 74;BA.debugLine="If mDisabled = False Then";
if (_mdisabled==__c.False) { 
 //BA.debugLineNum = 75;BA.debugLine="DrawCheckbox(isSelected)";
_drawcheckbox(_isselected);
 //BA.debugLineNum = 76;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CheckedChange";
__c.CallSubNew2(ba,_mcallback,_meventname+"_CheckedChange",(Object)(_isselected));
 };
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _setchecked(boolean _value) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub setChecked(value As Boolean)";
 //BA.debugLineNum = 82;BA.debugLine="isSelected = True";
_isselected = __c.True;
 //BA.debugLineNum = 83;BA.debugLine="DrawCheckbox(isSelected)";
_drawcheckbox(_isselected);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _setdisabled(boolean _value) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub setDisabled(value As Boolean)";
 //BA.debugLineNum = 91;BA.debugLine="mDisabled = value";
_mdisabled = _value;
 //BA.debugLineNum = 92;BA.debugLine="If mDisabled = True Then";
if (_mdisabled==__c.True) { 
 //BA.debugLineNum = 93;BA.debugLine="mHistoryColor = clrBorder";
_mhistorycolor = _clrborder;
 //BA.debugLineNum = 94;BA.debugLine="clrBorder = Colors.ARGB(255, 204, 204, 204)";
_clrborder = __c.Colors.ARGB((int) (255),(int) (204),(int) (204),(int) (204));
 //BA.debugLineNum = 95;BA.debugLine="mTextColor = Colors.ARGB(255, 204, 204, 204)";
_mtextcolor = __c.Colors.ARGB((int) (255),(int) (204),(int) (204),(int) (204));
 }else {
 //BA.debugLineNum = 97;BA.debugLine="clrBorder = mHistoryColor";
_clrborder = _mhistorycolor;
 //BA.debugLineNum = 98;BA.debugLine="lblText.TextColor = mTextColor";
_lbltext.setTextColor(_mtextcolor);
 };
 //BA.debugLineNum = 100;BA.debugLine="DrawCheckbox(isSelected)";
_drawcheckbox(_isselected);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _settext(String _value) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub setText(value As String)";
 //BA.debugLineNum = 117;BA.debugLine="lblText.Text = value";
_lbltext.setText(BA.ObjectToCharSequence(_value));
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public boolean  _textcolor(int _value) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub TextColor(value As Int) As Boolean";
 //BA.debugLineNum = 108;BA.debugLine="lblText.TextColor = value";
_lbltext.setTextColor(_value);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return false;
}
public String  _textsize(int _value) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub TextSize(value As Int)";
 //BA.debugLineNum = 125;BA.debugLine="lblText.TextSize = value";
_lbltext.setTextSize((float) (_value));
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

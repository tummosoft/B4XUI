package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bottomnavigationview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.bottomnavigationview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.bottomnavigationview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _clsnavibutton{
public boolean IsInitialized;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper Font;
public String Icon;
public String Text;
public String Badge;
public void Initialize() {
IsInitialized = true;
Font = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
Icon = "";
Text = "";
Badge = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public int _background = 0;
public int _coloricon = 0;
public int _selectedcolor = 0;
public anywheresoftware.b4a.objects.collections.List _lstnavibutton = null;
public b4a.example.navibutton[] _nvbutton = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _addbutton(b4a.example.bottomnavigationview __ref,b4a.example.bottomnavigationview._clsnavibutton _btnnavi) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "addbutton", false))
	 {return ((String) Debug.delegate(ba, "addbutton", new Object[] {_btnnavi}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub AddButton(btnNavi As clsNaviButton)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="lstNaviButton.Add(btnNavi)";
__ref._lstnavibutton /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_btnnavi));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public String  _build(b4a.example.bottomnavigationview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "build", false))
	 {return ((String) Debug.delegate(ba, "build", null));}
int _positionx = 0;
int _basewidth = 0;
int _i = 0;
b4a.example.bottomnavigationview._clsnavibutton _item = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub Build";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim	positionX As Int = 0";
_positionx = (int) (0);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim nvButton(lstNaviButton.Size) As NaviButton";
_nvbutton = new b4a.example.navibutton[__ref._lstnavibutton /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
{
int d0 = _nvbutton.length;
for (int i0 = 0;i0 < d0;i0++) {
_nvbutton[i0] = new b4a.example.navibutton();
}
}
;
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim baseWidth As Int = 100%x / lstNaviButton.Size";
_basewidth = (int) (__c.PerXToCurrent((float) (100),ba)/(double)__ref._lstnavibutton /*anywheresoftware.b4a.objects.collections.List*/ .getSize());
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="For i=0 To lstNaviButton.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._lstnavibutton /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Dim item As clsNaviButton = lstNaviButton.Get(i)";
_item = (b4a.example.bottomnavigationview._clsnavibutton)(__ref._lstnavibutton /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="nvButton(i).Initialize(Me, \"nvButton\", baseWidth";
__ref._nvbutton /*b4a.example.navibutton[]*/ [_i]._initialize /*String*/ (null,ba,this,"nvButton",_basewidth);
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="mBase.AddView(nvButton(i).GetView, positionX, 0d";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._nvbutton /*b4a.example.navibutton[]*/ [_i]._getview /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),_positionx,__c.DipToCurrent((int) (0)),_basewidth,__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="positionX = positionX + baseWidth";
_positionx = (int) (_positionx+_basewidth);
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="nvButton(i).Icon(item.icon)";
__ref._nvbutton /*b4a.example.navibutton[]*/ [_i]._icon /*String*/ (null,_item.Icon /*String*/ );
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="nvButton(i).Font(item.font)";
__ref._nvbutton /*b4a.example.navibutton[]*/ [_i]._font /*String*/ (null,_item.Font /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ );
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="nvButton(i).Text(item.text)";
__ref._nvbutton /*b4a.example.navibutton[]*/ [_i]._text /*String*/ (null,_item.Text /*String*/ );
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="nvButton(i).Position = i";
__ref._nvbutton /*b4a.example.navibutton[]*/ [_i]._setposition /*int*/ (null,_i);
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="If item.Badge <> Null Then";
if (_item.Badge /*String*/ != null) { 
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="nvButton(i).Badge = item.Badge";
__ref._nvbutton /*b4a.example.navibutton[]*/ [_i]._setbadge(null,_item.Badge /*String*/ );
 };
 }
};
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="End Sub";
return "";
}
public String  _acticve(b4a.example.bottomnavigationview __ref,int _index,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "acticve", false))
	 {return ((String) Debug.delegate(ba, "acticve", new Object[] {_index,_enable}));}
int _i = 0;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub Acticve(index As Int, enable As Boolean";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If enable = True Then";
if (_enable==__c.True) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="For i=0 To lstNaviButton.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._lstnavibutton /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="nvButton(i).Active(False)";
__ref._nvbutton /*b4a.example.navibutton[]*/ [_i]._active /*String*/ (null,__c.False);
 }
};
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="nvButton(index).Active(True)";
__ref._nvbutton /*b4a.example.navibutton[]*/ [_index]._active /*String*/ (null,__c.True);
 }else {
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="nvButton(index).Active(False)";
__ref._nvbutton /*b4a.example.navibutton[]*/ [_index]._active /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.bottomnavigationview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.bottomnavigationview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Type clsNaviButton(Font As Typeface, Icon As Stri";
;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Private background As Int = Colors.White";
_background = __c.Colors.White;
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="Private colorIcon As Int = Colors.ARGB(255, 141,";
_coloricon = __c.Colors.ARGB((int) (255),(int) (141),(int) (152),(int) (166));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Private selectedColor As Int = Colors.ARGB(255, 8";
_selectedcolor = __c.Colors.ARGB((int) (255),(int) (83),(int) (2),(int) (250));
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="Private lstNaviButton As List";
_lstnavibutton = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Private nvButton(4) As NaviButton";
_nvbutton = new b4a.example.navibutton[(int) (4)];
{
int d0 = _nvbutton.length;
for (int i0 = 0;i0 < d0;i0++) {
_nvbutton[i0] = new b4a.example.navibutton();
}
}
;
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.bottomnavigationview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _bgclr = 0;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Dim bgclr As Int = xui.PaintOrColorToColor(Prop";
_bgclr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color")));
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="mBase.Color = bgclr";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bgclr);
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="lstNaviButton.Initialize";
__ref._lstnavibutton /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.bottomnavigationview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="lstNaviButton.Initialize";
__ref._lstnavibutton /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="End Sub";
return "";
}
public String  _nvbutton_click(b4a.example.bottomnavigationview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "nvbutton_click", false))
	 {return ((String) Debug.delegate(ba, "nvbutton_click", null));}
b4a.example.navibutton _v = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub nvButton_Click";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim v As NaviButton = Sender";
_v = (b4a.example.navibutton)(__c.Sender(ba));
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ItemClick\", v.";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ItemClick",(Object)(_v._getposition /*int*/ (null)));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="End Sub";
return "";
}
public String  _setcolor(b4a.example.bottomnavigationview __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "setcolor", false))
	 {return ((String) Debug.delegate(ba, "setcolor", new Object[] {_value}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub setColor(value As Int)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="background = value";
__ref._background /*int*/  = _value;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="mBase.Color = background";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._background /*int*/ );
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="End Sub";
return "";
}
public String  _seticoncolor(b4a.example.bottomnavigationview __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "seticoncolor", false))
	 {return ((String) Debug.delegate(ba, "seticoncolor", new Object[] {_value}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub setIconColor(value As Int)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="colorIcon = value";
__ref._coloricon /*int*/  = _value;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcolor(b4a.example.bottomnavigationview __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "setselectedcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcolor", new Object[] {_value}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub setSelectedColor(value As Int)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="selectedColor = value";
__ref._selectedcolor /*int*/  = _value;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.bottomnavigationview __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bottomnavigationview";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_value}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub setTextColor(value As Int)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="background = value";
__ref._background /*int*/  = _value;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="mBase.Color = background";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._background /*int*/ );
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="End Sub";
return "";
}
}
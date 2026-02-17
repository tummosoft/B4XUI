package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class calendarview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.calendarview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.calendarview.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _pnldays = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlweek = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmonth = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmonth = null;
public b4a.example.calendarbox[] _lblday = null;
public int _fday = 0;
public int _maxday = 0;
public int _currentyear = 0;
public int _currentmonth = 0;
public int _currentday = 0;
public long _valuelong = 0L;
public String _valuestring = "";
public anywheresoftware.b4a.objects.PanelWrapper _pnlbackground = null;
public int _color1 = 0;
public int _color2 = 0;
public anywheresoftware.b4a.objects.collections.Map _lstbitmap = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _addbitmap(b4a.example.calendarview __ref,long _date,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "addbitmap", false))
	 {return ((String) Debug.delegate(ba, "addbitmap", new Object[] {_date,_image}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Public Sub AddBitmap(date As Long, image As Bitmap";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="lstBitmap.Put(date, image)";
__ref._lstbitmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_date),(Object)(_image.getObject()));
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return "";
}
public String  _drawcalendar(b4a.example.calendarview __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "drawcalendar", false))
	 {return ((String) Debug.delegate(ba, "drawcalendar", new Object[] {_date}));}
int _widthofdaybox = 0;
int _positiony = 0;
int _positionx = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lblweek = null;
String[] _weekname = null;
anywheresoftware.b4a.objects.collections.Map _nameofmonths = null;
int _cmonth = 0;
int _cday = 0;
int _cyear = 0;
String _firstmonth = "";
long _fmonth = 0L;
int _countday = 0;
int _i = 0;
long _ldate = 0L;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Public Sub DrawCalendar(date As Long)";
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Dim widthOfDayBox As Int = (mBase.Width / 7)";
_widthofdaybox = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()/(double)7));
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="Dim positionY As Int = 0dip";
_positiony = __c.DipToCurrent((int) (0));
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Dim positionX As Int = 0dip";
_positionx = __c.DipToCurrent((int) (0));
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="Dim lblWeek(7) As Label";
_lblweek = new anywheresoftware.b4a.objects.LabelWrapper[(int) (7)];
{
int d0 = _lblweek.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblweek[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="Dim weekName(7) As String = Array As String(\"Su\",";
_weekname = new String[]{"Su","Mo","Tu","We","Th","Fr","Sa"};
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Dim nameOfMonths As Map";
_nameofmonths = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="nameOfMonths.Initialize";
_nameofmonths.Initialize();
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="currentYear = DateTime.GetYear(date)";
__ref._currentyear /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="currentDay = 1";
__ref._currentday /*int*/  = (int) (1);
RDebugUtils.currentLine=15138829;
 //BA.debugLineNum = 15138829;BA.debugLine="currentMonth = 1";
__ref._currentmonth /*int*/  = (int) (1);
RDebugUtils.currentLine=15138831;
 //BA.debugLineNum = 15138831;BA.debugLine="nameOfMonths.Put(\"January\", 31)";
_nameofmonths.Put((Object)("January"),(Object)(31));
RDebugUtils.currentLine=15138832;
 //BA.debugLineNum = 15138832;BA.debugLine="If isLeapYear(currentYear) Then";
if (__ref._isleapyear /*boolean*/ (null,__ref._currentyear /*int*/ )) { 
RDebugUtils.currentLine=15138833;
 //BA.debugLineNum = 15138833;BA.debugLine="nameOfMonths.Put(\"February\", 29)";
_nameofmonths.Put((Object)("February"),(Object)(29));
 }else {
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="nameOfMonths.Put(\"February\", 28)";
_nameofmonths.Put((Object)("February"),(Object)(28));
 };
RDebugUtils.currentLine=15138838;
 //BA.debugLineNum = 15138838;BA.debugLine="nameOfMonths.Put(\"March\", 31)";
_nameofmonths.Put((Object)("March"),(Object)(31));
RDebugUtils.currentLine=15138839;
 //BA.debugLineNum = 15138839;BA.debugLine="nameOfMonths.Put(\"April\", 30)";
_nameofmonths.Put((Object)("April"),(Object)(30));
RDebugUtils.currentLine=15138840;
 //BA.debugLineNum = 15138840;BA.debugLine="nameOfMonths.Put(\"May\", 31)";
_nameofmonths.Put((Object)("May"),(Object)(31));
RDebugUtils.currentLine=15138841;
 //BA.debugLineNum = 15138841;BA.debugLine="nameOfMonths.Put(\"June\", 30)";
_nameofmonths.Put((Object)("June"),(Object)(30));
RDebugUtils.currentLine=15138842;
 //BA.debugLineNum = 15138842;BA.debugLine="nameOfMonths.Put(\"July\", 31)";
_nameofmonths.Put((Object)("July"),(Object)(31));
RDebugUtils.currentLine=15138843;
 //BA.debugLineNum = 15138843;BA.debugLine="nameOfMonths.Put(\"August\", 31)";
_nameofmonths.Put((Object)("August"),(Object)(31));
RDebugUtils.currentLine=15138844;
 //BA.debugLineNum = 15138844;BA.debugLine="nameOfMonths.Put(\"September\", 30)";
_nameofmonths.Put((Object)("September"),(Object)(30));
RDebugUtils.currentLine=15138845;
 //BA.debugLineNum = 15138845;BA.debugLine="nameOfMonths.Put(\"October\", 31)";
_nameofmonths.Put((Object)("October"),(Object)(31));
RDebugUtils.currentLine=15138846;
 //BA.debugLineNum = 15138846;BA.debugLine="nameOfMonths.Put(\"November\",30 )";
_nameofmonths.Put((Object)("November"),(Object)(30));
RDebugUtils.currentLine=15138847;
 //BA.debugLineNum = 15138847;BA.debugLine="nameOfMonths.Put(\"December\", 31)";
_nameofmonths.Put((Object)("December"),(Object)(31));
RDebugUtils.currentLine=15138849;
 //BA.debugLineNum = 15138849;BA.debugLine="Dim cMonth As Int = DateTime.GetMonth(date)";
_cmonth = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=15138850;
 //BA.debugLineNum = 15138850;BA.debugLine="currentMonth = cMonth";
__ref._currentmonth /*int*/  = _cmonth;
RDebugUtils.currentLine=15138851;
 //BA.debugLineNum = 15138851;BA.debugLine="Dim cDay As Int = DateTime.GetDayOfMonth(date)";
_cday = __c.DateTime.GetDayOfMonth(_date);
RDebugUtils.currentLine=15138852;
 //BA.debugLineNum = 15138852;BA.debugLine="Dim cYear As Int = DateTime.GetYear(date)";
_cyear = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=15138854;
 //BA.debugLineNum = 15138854;BA.debugLine="lblMonth.Text = nameOfMonths.GetKeyAt(cMonth - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.ObjectToString(_nameofmonths.GetKeyAt((int) (_cmonth-1)))+" "+BA.NumberToString(_cyear)));
RDebugUtils.currentLine=15138856;
 //BA.debugLineNum = 15138856;BA.debugLine="Dim firstMonth As String = $\"${cMonth}/1/${cYear}";
_firstmonth = (""+__c.SmartStringFormatter("",(Object)(_cmonth))+"/1/"+__c.SmartStringFormatter("",(Object)(_cyear))+"");
RDebugUtils.currentLine=15138857;
 //BA.debugLineNum = 15138857;BA.debugLine="Dim fMonth As Long = DateTime.DateParse(firstMont";
_fmonth = __c.DateTime.DateParse(_firstmonth);
RDebugUtils.currentLine=15138858;
 //BA.debugLineNum = 15138858;BA.debugLine="fDay = DateTime.GetDayOfWeek(fMonth) - 1";
__ref._fday /*int*/  = (int) (__c.DateTime.GetDayOfWeek(_fmonth)-1);
RDebugUtils.currentLine=15138859;
 //BA.debugLineNum = 15138859;BA.debugLine="Dim countDay As Int = 1";
_countday = (int) (1);
RDebugUtils.currentLine=15138860;
 //BA.debugLineNum = 15138860;BA.debugLine="maxDay = nameOfMonths.GetValueAt(cMonth - 1)";
__ref._maxday /*int*/  = (int)(BA.ObjectToNumber(_nameofmonths.GetValueAt((int) (_cmonth-1))));
RDebugUtils.currentLine=15138863;
 //BA.debugLineNum = 15138863;BA.debugLine="For i=0 To 6";
{
final int step37 = 1;
final int limit37 = (int) (6);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
RDebugUtils.currentLine=15138864;
 //BA.debugLineNum = 15138864;BA.debugLine="lblWeek(i).Initialize(\"week\")";
_lblweek[_i].Initialize(ba,"week");
RDebugUtils.currentLine=15138865;
 //BA.debugLineNum = 15138865;BA.debugLine="lblWeek(i).Text = weekName(i)";
_lblweek[_i].setText(BA.ObjectToCharSequence(_weekname[_i]));
RDebugUtils.currentLine=15138866;
 //BA.debugLineNum = 15138866;BA.debugLine="lblWeek(i).TextColor =Colors.ARGB(255, 84, 119,";
_lblweek[_i].setTextColor(__c.Colors.ARGB((int) (255),(int) (84),(int) (119),(int) (146)));
RDebugUtils.currentLine=15138868;
 //BA.debugLineNum = 15138868;BA.debugLine="lblWeek(i).Gravity = Gravity.CENTER_HORIZONTAL +";
_lblweek[_i].setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=15138869;
 //BA.debugLineNum = 15138869;BA.debugLine="pnlWeek.AddView(lblWeek(i), positionX, 0,  width";
__ref._pnlweek /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lblweek[_i].getObject()),_positionx,(int) (0),_widthofdaybox,__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=15138870;
 //BA.debugLineNum = 15138870;BA.debugLine="positionX = positionX + widthOfDayBox";
_positionx = (int) (_positionx+_widthofdaybox);
 }
};
RDebugUtils.currentLine=15138873;
 //BA.debugLineNum = 15138873;BA.debugLine="If fDay = 7 Then";
if (__ref._fday /*int*/ ==7) { 
RDebugUtils.currentLine=15138874;
 //BA.debugLineNum = 15138874;BA.debugLine="positionY = -40dip";
_positiony = (int) (-__c.DipToCurrent((int) (40)));
 };
RDebugUtils.currentLine=15138876;
 //BA.debugLineNum = 15138876;BA.debugLine="positionX = 0";
_positionx = (int) (0);
RDebugUtils.currentLine=15138878;
 //BA.debugLineNum = 15138878;BA.debugLine="pnlDays.RemoveAllViews";
__ref._pnldays /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=15138880;
 //BA.debugLineNum = 15138880;BA.debugLine="For i=0 To lblDay.Length - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._lblday /*b4a.example.calendarbox[]*/ .length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit50 ;_i = _i + step50 ) {
RDebugUtils.currentLine=15138882;
 //BA.debugLineNum = 15138882;BA.debugLine="lblDay(i).Initialize(Me,\"lblDay\", widthOfDayBox,";
__ref._lblday /*b4a.example.calendarbox[]*/ [_i]._initialize /*String*/ (null,ba,this,"lblDay",_widthofdaybox,__c.DipToCurrent((int) (35)));
RDebugUtils.currentLine=15138883;
 //BA.debugLineNum = 15138883;BA.debugLine="lblDay(i).Tag = i";
__ref._lblday /*b4a.example.calendarbox[]*/ [_i]._tag /*Object*/  = (Object)(_i);
RDebugUtils.currentLine=15138884;
 //BA.debugLineNum = 15138884;BA.debugLine="If i >= fDay And countDay <= maxDay Then";
if (_i>=__ref._fday /*int*/  && _countday<=__ref._maxday /*int*/ ) { 
RDebugUtils.currentLine=15138886;
 //BA.debugLineNum = 15138886;BA.debugLine="If HasBitmap(countDay) Then";
if (__ref._hasbitmap /*boolean*/ (null,_countday)) { 
RDebugUtils.currentLine=15138887;
 //BA.debugLineNum = 15138887;BA.debugLine="lblDay(i).BitMap = GetBitmap(countDay)";
__ref._lblday /*b4a.example.calendarbox[]*/ [_i]._setbitmap(null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__ref._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null,_countday).getObject())));
 }else {
RDebugUtils.currentLine=15138889;
 //BA.debugLineNum = 15138889;BA.debugLine="lblDay(i).SetText(countDay)";
__ref._lblday /*b4a.example.calendarbox[]*/ [_i]._settext /*String*/ (null,BA.NumberToString(_countday));
 };
RDebugUtils.currentLine=15138892;
 //BA.debugLineNum = 15138892;BA.debugLine="Dim lDate As Long = DateTime.DateParse($\"${cMon";
_ldate = __c.DateTime.DateParse((""+__c.SmartStringFormatter("",(Object)(_cmonth))+"/"+__c.SmartStringFormatter("",(Object)(_countday))+"/"+__c.SmartStringFormatter("",(Object)(_cyear))+""));
RDebugUtils.currentLine=15138893;
 //BA.debugLineNum = 15138893;BA.debugLine="lblDay(i).Date = lDate";
__ref._lblday /*b4a.example.calendarbox[]*/ [_i]._setdate /*long*/ (null,_ldate);
RDebugUtils.currentLine=15138895;
 //BA.debugLineNum = 15138895;BA.debugLine="countDay = countDay + 1";
_countday = (int) (_countday+1);
 }else {
RDebugUtils.currentLine=15138897;
 //BA.debugLineNum = 15138897;BA.debugLine="lblDay(i).SetText(\"\")";
__ref._lblday /*b4a.example.calendarbox[]*/ [_i]._settext /*String*/ (null,"");
 };
RDebugUtils.currentLine=15138901;
 //BA.debugLineNum = 15138901;BA.debugLine="pnlDays.AddView(lblDay(i).GetView, positionX + 4";
__ref._pnldays /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblday /*b4a.example.calendarbox[]*/ [_i]._getview /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null).getObject()),(int) (_positionx+__c.DipToCurrent((int) (4))),_positiony,(int) (_widthofdaybox-__c.DipToCurrent((int) (8))),(int) (_widthofdaybox-__c.DipToCurrent((int) (8))));
RDebugUtils.currentLine=15138902;
 //BA.debugLineNum = 15138902;BA.debugLine="positionX = positionX + widthOfDayBox";
_positionx = (int) (_positionx+_widthofdaybox);
RDebugUtils.currentLine=15138904;
 //BA.debugLineNum = 15138904;BA.debugLine="If (i Mod 7) = 6 Then";
if ((_i%7)==6) { 
RDebugUtils.currentLine=15138905;
 //BA.debugLineNum = 15138905;BA.debugLine="positionY = positionY + 40dip";
_positiony = (int) (_positiony+__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=15138906;
 //BA.debugLineNum = 15138906;BA.debugLine="positionX = 0";
_positionx = (int) (0);
 };
 }
};
RDebugUtils.currentLine=15138909;
 //BA.debugLineNum = 15138909;BA.debugLine="End Sub";
return "";
}
public String  _addevent(b4a.example.calendarview __ref,int _color,String _content,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "addevent", false))
	 {return ((String) Debug.delegate(ba, "addevent", new Object[] {_color,_content,_date}));}
int _i = 0;
long _ldt = 0L;
int _m1 = 0;
int _m2 = 0;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub AddEvent(color As Int, content As Strin";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="For i=0 To lblDay.Length - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._lblday /*b4a.example.calendarbox[]*/ .length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="Dim ldt As Long = lblDay(i).Date";
_ldt = __ref._lblday /*b4a.example.calendarbox[]*/ [_i]._getdate /*long*/ (null);
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Dim m1 As Int = DateTime.GetDayOfMonth(ldt)";
_m1 = __c.DateTime.GetDayOfMonth(_ldt);
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="Dim m2 As Int = DateTime.GetDayOfMonth(date)";
_m2 = __c.DateTime.GetDayOfMonth(_date);
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="If m1 = m2 Then";
if (_m1==_m2) { 
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="lblDay(i).AddEvent(color, content, date)";
__ref._lblday /*b4a.example.calendarbox[]*/ [_i]._addevent /*String*/ (null,_color,_content,_date);
 };
 }
};
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.calendarview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example.calendarview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
long _event_time = 0L;
int _color = 0;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Dim event_time As Long = DateTime.DateParse(\"2/4/";
_event_time = __c.DateTime.DateParse("2/4/2026");
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="Dim color As Int = Colors.ARGB(255,91, 35, 255)";
_color = __c.Colors.ARGB((int) (255),(int) (91),(int) (35),(int) (255));
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="AddEvent(color, \"Add event\", event_time)";
__ref._addevent /*String*/ (null,_color,"Add event",_event_time);
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.calendarview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="Public mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="Private pnlDays As Panel";
_pnldays = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14221320;
 //BA.debugLineNum = 14221320;BA.debugLine="Private pnlWeek As Panel";
_pnlweek = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14221321;
 //BA.debugLineNum = 14221321;BA.debugLine="Private lblMonth As Label";
_lblmonth = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14221322;
 //BA.debugLineNum = 14221322;BA.debugLine="Private pnlMonth As Panel";
_pnlmonth = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14221323;
 //BA.debugLineNum = 14221323;BA.debugLine="Private lblDay(45) As CalendarBox";
_lblday = new b4a.example.calendarbox[(int) (45)];
{
int d0 = _lblday.length;
for (int i0 = 0;i0 < d0;i0++) {
_lblday[i0] = new b4a.example.calendarbox();
}
}
;
RDebugUtils.currentLine=14221324;
 //BA.debugLineNum = 14221324;BA.debugLine="Private fDay As Int";
_fday = 0;
RDebugUtils.currentLine=14221325;
 //BA.debugLineNum = 14221325;BA.debugLine="Private maxDay As Int";
_maxday = 0;
RDebugUtils.currentLine=14221326;
 //BA.debugLineNum = 14221326;BA.debugLine="Private currentYear As Int";
_currentyear = 0;
RDebugUtils.currentLine=14221327;
 //BA.debugLineNum = 14221327;BA.debugLine="Private currentMonth As Int";
_currentmonth = 0;
RDebugUtils.currentLine=14221328;
 //BA.debugLineNum = 14221328;BA.debugLine="Private currentDay As Int";
_currentday = 0;
RDebugUtils.currentLine=14221330;
 //BA.debugLineNum = 14221330;BA.debugLine="Private valueLong As Long";
_valuelong = 0L;
RDebugUtils.currentLine=14221331;
 //BA.debugLineNum = 14221331;BA.debugLine="Private valueString As String";
_valuestring = "";
RDebugUtils.currentLine=14221332;
 //BA.debugLineNum = 14221332;BA.debugLine="Private pnlBackground As Panel";
_pnlbackground = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14221334;
 //BA.debugLineNum = 14221334;BA.debugLine="Private color1 As Int = Colors.ARGB(255, 151, 94,";
_color1 = __c.Colors.ARGB((int) (255),(int) (151),(int) (94),(int) (236));
RDebugUtils.currentLine=14221335;
 //BA.debugLineNum = 14221335;BA.debugLine="Private color2 As Int = Colors.ARGB(255, 242, 224";
_color2 = __c.Colors.ARGB((int) (255),(int) (242),(int) (224),(int) (253));
RDebugUtils.currentLine=14221336;
 //BA.debugLineNum = 14221336;BA.debugLine="Private lstBitmap As Map";
_lstbitmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14221337;
 //BA.debugLineNum = 14221337;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.calendarview __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _clr = 0;
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(this);
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="Dim clr As Int = xui.PaintOrColorToColor(Props.Ge";
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="lblMonth.Initialize(\"\")";
__ref._lblmonth /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=14352391;
 //BA.debugLineNum = 14352391;BA.debugLine="mBase.AddView(lblMonth, 0, 0, mBase.Width, 30dip)";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblmonth /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="lblMonth.Color = Colors.Red";
__ref._lblmonth /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.Red);
RDebugUtils.currentLine=14352393;
 //BA.debugLineNum = 14352393;BA.debugLine="lblMonth.Text = \"April 2026\"";
__ref._lblmonth /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("April 2026"));
RDebugUtils.currentLine=14352394;
 //BA.debugLineNum = 14352394;BA.debugLine="lblMonth.Color = Colors.ARGB(255, 0, 27, 183)";
__ref._lblmonth /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.ARGB((int) (255),(int) (0),(int) (27),(int) (183)));
RDebugUtils.currentLine=14352395;
 //BA.debugLineNum = 14352395;BA.debugLine="lblMonth.TextColor = Colors.White";
__ref._lblmonth /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.White);
RDebugUtils.currentLine=14352396;
 //BA.debugLineNum = 14352396;BA.debugLine="lblMonth.Gravity = Gravity.CENTER";
__ref._lblmonth /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=14352398;
 //BA.debugLineNum = 14352398;BA.debugLine="pnlWeek.Initialize(\"\")";
__ref._pnlweek /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=14352399;
 //BA.debugLineNum = 14352399;BA.debugLine="mBase.AddView(pnlWeek, 0, 30dip, mBase.Width, 30d";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlweek /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (30)),__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=14352400;
 //BA.debugLineNum = 14352400;BA.debugLine="pnlWeek.Color = Colors.ARGB(255, 245, 241, 220)";
__ref._pnlweek /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.ARGB((int) (255),(int) (245),(int) (241),(int) (220)));
RDebugUtils.currentLine=14352402;
 //BA.debugLineNum = 14352402;BA.debugLine="pnlDays.Initialize(\"\")";
__ref._pnldays /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=14352403;
 //BA.debugLineNum = 14352403;BA.debugLine="mBase.AddView(pnlDays, 0, 70dip, mBase.Width, 260";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnldays /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (70)),__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__c.DipToCurrent((int) (260)));
RDebugUtils.currentLine=14352404;
 //BA.debugLineNum = 14352404;BA.debugLine="pnlDays.Color = Colors.White";
__ref._pnldays /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=14352406;
 //BA.debugLineNum = 14352406;BA.debugLine="DrawCalendar(DateTime.Now)";
__ref._drawcalendar /*String*/ (null,__c.DateTime.getNow());
RDebugUtils.currentLine=14352407;
 //BA.debugLineNum = 14352407;BA.debugLine="End Sub";
return "";
}
public boolean  _isleapyear(b4a.example.calendarview __ref,int _year) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "isleapyear", false))
	 {return ((Boolean) Debug.delegate(ba, "isleapyear", new Object[] {_year}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub isLeapYear(year As Int) As Boolean";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Return (year Mod 4 = 0) And (year Mod 100 <> 0) O";
if (true) return (_year%4==0) && (_year%100!=0) || (_year%400==0);
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="End Sub";
return false;
}
public boolean  _hasbitmap(b4a.example.calendarview __ref,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "hasbitmap", false))
	 {return ((Boolean) Debug.delegate(ba, "hasbitmap", new Object[] {_day}));}
boolean _result = false;
int _i = 0;
long _kday = 0L;
int _vday = 0;
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub HasBitmap(day As Int) As Boolean";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Dim result As Boolean = False";
_result = __c.False;
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="For i=0 To lstBitmap.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._lstbitmap /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Dim kDay As Long = lstBitmap.GetKeyAt(i)";
_kday = BA.ObjectToLongNumber(__ref._lstbitmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i));
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="Dim vDay As Int = DateTime.GetDayOfMonth(kDay)";
_vday = __c.DateTime.GetDayOfMonth(_kday);
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="If vDay = day Then";
if (_vday==_day) { 
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="result = True";
_result = __c.True;
 };
 }
};
RDebugUtils.currentLine=15007753;
 //BA.debugLineNum = 15007753;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=15007754;
 //BA.debugLineNum = 15007754;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(b4a.example.calendarview __ref,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "getbitmap", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", new Object[] {_day}));}
int _i = 0;
long _kday = 0L;
int _vday = 0;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub GetBitmap(day As Int) As Bitmap";
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="For i=0 To lstBitmap.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._lstbitmap /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Dim kDay As Long = lstBitmap.GetKeyAt(i)";
_kday = BA.ObjectToLongNumber(__ref._lstbitmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i));
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Dim vDay As Int = DateTime.GetDayOfMonth(kDay)";
_vday = __c.DateTime.GetDayOfMonth(_kday);
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="If vDay = day Then";
if (_vday==_day) { 
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="Return lstBitmap.GetValueAt(i)";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(__ref._lstbitmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_i)));
 };
 }
};
RDebugUtils.currentLine=15073289;
 //BA.debugLineNum = 15073289;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.calendarview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="lstBitmap.Initialize";
__ref._lstbitmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="End Sub";
return "";
}
public String  _lblday_click(b4a.example.calendarview __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "lblday_click", false))
	 {return ((String) Debug.delegate(ba, "lblday_click", new Object[] {_date}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub lblDay_Click(date As Long)";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ItemClick\", da";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ItemClick",(Object)(_date));
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="End Sub";
return "";
}
public String  _setnewvalue(b4a.example.calendarview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="calendarview";
if (Debug.shouldDelegate(ba, "setnewvalue", false))
	 {return ((String) Debug.delegate(ba, "setnewvalue", null));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub SetNewValue";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="valueString = $\"${currentMonth}/${currentDay}/${c";
__ref._valuestring /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._currentmonth /*int*/ ))+"/"+__c.SmartStringFormatter("",(Object)(__ref._currentday /*int*/ ))+"/"+__c.SmartStringFormatter("",(Object)(__ref._currentyear /*int*/ ))+"");
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="valueLong = DateTime.DateParse(valueString)";
__ref._valuelong /*long*/  = __c.DateTime.DateParse(__ref._valuestring /*String*/ );
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="End Sub";
return "";
}
}